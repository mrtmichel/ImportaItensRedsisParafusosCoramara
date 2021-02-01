/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.GrpJpaController;
import dao.InventJpaController;
import dao.ProdJpaController;
import entidades.Prod;
import io.ManipuladorArquivosTexto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mrtmi
 */
public class Principal {

    //conexao banco
    public static EntityManagerFactory emfDbcomAntes;
    public static EntityManagerFactory emfDbcomDepois;
    private static final String CAMINHO_BANCO_ANTES = "D:\\Bancos_Teste\\Parafusos_Coramara\\DBCOM_ANTES.RED", USUARIO_ANTES = "SYSDBA", SENHA_ANTES = "masterkey";
    private static final String CAMINHO_BANCO_DEPOIS = "D:\\Bancos_Teste\\Parafusos_Coramara\\DBCOM_DEPOIS.RED", USUARIO_DEPOIS = "SYSDBA", SENHA_DEPOIS = "masterkey";
    private static GrpJpaController grpJpaControllerAntes;
    private static ProdJpaController prodJpaControllerAntes;
    private static InventJpaController inventJpaControllerAntes;
    private static GrpJpaController grpJpaControllerDepois;
    private static ProdJpaController prodJpaControllerDepois;
    private static InventJpaController inventJpaControllerDepois;

    //Prod padrão
    private static Prod prodPadrao;

    //arquivo texto
    private static String caminhoArquivoTexto = "D:\\Bancos_Teste\\Parafusos_Coramara\\PRODUTO-PAGANI.csv";
    private static List<String[]> linhasArquvoTexto = new ArrayList<>();

    public static void main(String[] args) {
        try {
            //conexao banco
            Map<Object, Object> propPuAntes = new HashMap<>();
            propPuAntes.put("javax.persistence.jdbc.url", "jdbc:firebirdsql:" + "localhost" + "/" + "3050" + ":" + CAMINHO_BANCO_ANTES + "?encoding=ISO8859_1");
            propPuAntes.put("javax.persistence.jdbc.driver", "org.firebirdsql.jdbc.FBDriver");
            propPuAntes.put("javax.persistence.jdbc.user", USUARIO_ANTES);
            propPuAntes.put("javax.persistence.jdbc.password", SENHA_ANTES);
            emfDbcomAntes = Persistence.createEntityManagerFactory("ImportaItensRedsisParafusosCoramaraPU", propPuAntes);

            grpJpaControllerAntes = new GrpJpaController(emfDbcomAntes);
            prodJpaControllerAntes = new ProdJpaController(emfDbcomAntes);
            inventJpaControllerAntes = new InventJpaController(emfDbcomAntes);

            Map<Object, Object> propPuDepois = new HashMap<>();
            propPuDepois.put("javax.persistence.jdbc.url", "jdbc:firebirdsql:" + "localhost" + "/" + "3050" + ":" + CAMINHO_BANCO_DEPOIS + "?encoding=ISO8859_1");
            propPuDepois.put("javax.persistence.jdbc.driver", "org.firebirdsql.jdbc.FBDriver");
            propPuDepois.put("javax.persistence.jdbc.user", USUARIO_DEPOIS);
            propPuDepois.put("javax.persistence.jdbc.password", SENHA_DEPOIS);
            emfDbcomDepois = Persistence.createEntityManagerFactory("ImportaItensRedsisParafusosCoramaraPU", propPuDepois);

            grpJpaControllerDepois = new GrpJpaController(emfDbcomDepois);
            prodJpaControllerDepois = new ProdJpaController(emfDbcomDepois);
            inventJpaControllerDepois = new InventJpaController(emfDbcomDepois);

            prodPadrao = prodJpaControllerAntes.findProd(12454);

            prodJpaControllerDepois.zeraEstoque();

            //leitura do arquivo texto
            linhasArquvoTexto = new ManipuladorArquivosTexto().lerArquivoTxtToList(caminhoArquivoTexto);

            if (linhasArquvoTexto.size() > 0) {
                for (int i = 0; i < linhasArquvoTexto.size() - 1; i++) {
                    String[] linha = linhasArquvoTexto.get(i);
                    if (linha[1].equals("SOQUETE ESTRIADO 1/2\" SATA 9/16")) {
                        System.out.println("");
                    }
                    if (!linha[0].equals("")) {
                        prodJpaControllerDepois.createNewProd(prodPadrao, linha);
                    } else {
                        Prod prod = prodJpaControllerAntes.findProdByNome(linha);
                        if (prod != null) {
                            prodJpaControllerDepois.updateProduto(prod, linha);
                        } else {
                            Prod prodSimilar = prodJpaControllerAntes.findProdByNomeSimiliar(linha);
                            if (prodSimilar != null) {
                                prodJpaControllerDepois.createNewProdBySilimar(prodSimilar, linha);
                            } else {
                                prodJpaControllerDepois.createNewProdBySilimar(prodPadrao, linha);
                            }
                        }
                    }
                }
            }

            //inventJpaControllerDepois.criarInventario(prodJpaControllerDepois.findProdEntities());
        } catch (IOException e) {
        } finally {
            emfDbcomAntes.close();
            emfDbcomDepois.close();
        }

    }
}
