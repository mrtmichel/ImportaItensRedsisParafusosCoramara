/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author mrtmi
 */
public class ManipuladorArquivosTexto {

    public List<String[]> lerArquivoTxtToList(String caminhoArquivo) throws IOException {
        List<String[]> lstLinhasArquivo = new ArrayList<>();
        if (new File(caminhoArquivo).exists()) {
            FileReader arq = new FileReader(caminhoArquivo);
            try {
                BufferedReader lerArq = new BufferedReader(arq);
                String[] linha = StringUtils.splitPreserveAllTokens(lerArq.readLine(), ";");
                lstLinhasArquivo.add(ajustaLinha(linha));
                while (linha != null) {
                    linha = StringUtils.splitPreserveAllTokens(lerArq.readLine(), ";");
                    lstLinhasArquivo.add(ajustaLinha(linha));
                }
            } catch (IOException e) {
                System.err.printf("Erro na abertura do arquivo: %s.\n",
                        e.getMessage());
            } finally {
                arq.close();
            }
        }
        return lstLinhasArquivo;
    }

    private String[] ajustaLinha(String[] linha) {
        if (linha != null) {
            for (int i = 0; i < linha.length; i++) {
                String campo = linha[i];
                switch (i) {
                    case 1:
                        try {
                            campo = campo.toUpperCase().trim();
                            campo = StringUtils.replace(campo, "  ", " ");
                            linha[i] = campo;
                        } catch (Exception e) {
                            linha[i] = "";
                        }
                        break;
                    case 2:
                    case 3:
                        try {
                            campo = StringUtils.replace(campo, ",", ".");
                            linha[i] = campo;

                        } catch (Exception e) {
                            linha[i] = "";
                        }
                        break;
                }
            }

            return linha;
        } else {
            return null;
        }
    }
}
