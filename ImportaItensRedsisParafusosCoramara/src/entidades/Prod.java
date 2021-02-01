/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mrtmi
 */
@Entity
@Table(name = "PROD")
@NamedQueries({
    @NamedQuery(name = "Prod.findAll", query = "SELECT p FROM Prod p")})
public class Prod implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_ESTQ")
    private Integer codEstq;
    @Basic(optional = false)
    @Column(name = "COD_ESTAB")
    private short codEstab;
    @Column(name = "NAT_ESTQ")
    private String natEstq;
    @Column(name = "CODMAST_ESTQ")
    private Integer codmastEstq;
    @Basic(optional = false)
    @Column(name = "CODBAR_PROD")
    private String codbarProd;
    @Basic(optional = false)
    @Column(name = "NOM_PROD")
    private String nomProd;
    @Column(name = "NOM2_PROD")
    private String nom2Prod;
    @Column(name = "TPIND_PROD")
    private String tpindProd;
    @Column(name = "PADRAO_PROD")
    private String padraoProd;
    @Column(name = "NOMDEF_PROD")
    private String nomdefProd;
    @Column(name = "POSESTQ_PROD")
    private String posestqProd;
    @Column(name = "NUMLOTEFB_PROD")
    private String numlotefbProd;
    @Lob
    @Column(name = "OBS_PROD")
    private byte[] obsProd;
    @Column(name = "DTVENC_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtvencProd;
    @Lob
    @Column(name = "FOTO_PROD")
    private byte[] fotoProd;
    @Column(name = "BLOCO_PROD")
    private Integer blocoProd;
    @Column(name = "BLOCOTC_PROD")
    private String blocotcProd;
    @Column(name = "CHAPA_PROD")
    private Short chapaProd;
    @Column(name = "CHAPATC_PROD")
    private Short chapatcProd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COMPBRUNSD_PROD")
    private Double compbrunsdProd;
    @Column(name = "ALTESPBRUNSD_PROD")
    private Double altespbrunsdProd;
    @Column(name = "LARGBRUNSD_PROD")
    private Double largbrunsdProd;
    @Column(name = "COMPLQUNSD_PROD")
    private Double complqunsdProd;
    @Column(name = "ALTESPLQUNSD_PROD")
    private Double altesplqunsdProd;
    @Column(name = "LARGLQUNSD_PROD")
    private Double larglqunsdProd;
    @Column(name = "APLIC_PROD")
    private String aplicProd;
    @Column(name = "DTFABR_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtfabrProd;
    @Column(name = "DTENT_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtentProd;
    @Column(name = "DOC_PROD")
    private String docProd;
    @Column(name = "TOTALG_DOC")
    private Double totalgDoc;
    @Column(name = "FRETE_DOC")
    private Double freteDoc;
    @Column(name = "EMISS_DOC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date emissDoc;
    @Column(name = "CUSTO_DOC")
    private Double custoDoc;
    @Column(name = "COD_PESS")
    private Integer codPess;
    @Column(name = "NOM_PESS")
    private String nomPess;
    @Column(name = "TIPI_PROD")
    private String tipiProd;
    @Column(name = "EMBLG_PROD")
    private String emblgProd;
    @Column(name = "PCEMBLG_PROD")
    private Short pcemblgProd;
    @Column(name = "CST_PROD")
    private Short cstProd;
    @Column(name = "ESTQUNSD_PROD")
    private Double estqunsdProd;
    @Column(name = "ESTQPC_PROD")
    private Integer estqpcProd;
    @Column(name = "CUSUNMED_PROD")
    private Double cusunmedProd;
    @Column(name = "PRVENDA_PROD")
    private Double prvendaProd;
    @Column(name = "COD_DA")
    private Short codDa;
    @Column(name = "CODCF_ESTQ")
    private Integer codcfEstq;
    @Column(name = "ALIQIPI_PROD")
    private Double aliqipiProd;
    @Column(name = "ALIQICMS_PROD")
    private Double aliqicmsProd;
    @Column(name = "REDBCICMS_PROD")
    private Double redbcicmsProd;
    @Column(name = "ALIQISS_PROD")
    private Double aliqissProd;
    @Column(name = "SIT_PROD")
    private Short sitProd;
    @Column(name = "PESOBRKG_PROD")
    private Double pesobrkgProd;
    @Column(name = "PESOLQKG_PROD")
    private Double pesolqkgProd;
    @Column(name = "ESTQMAX_PROD")
    private Double estqmaxProd;
    @Column(name = "ESTQMIN_PROD")
    private Double estqminProd;
    @Column(name = "UNSD_PROD")
    private String unsdProd;
    @Column(name = "CODPOSSE_PROD")
    private String codposseProd;
    @Column(name = "CODTERC_PESS")
    private Integer codtercPess;
    @Column(name = "IDIPI_PROD")
    private Short idipiProd;
    @Column(name = "IDICMS_PROD")
    private Short idicmsProd;
    @Column(name = "MENFIS_PROD")
    private String menfisProd;
    @Column(name = "INDGR_PROD")
    private Double indgrProd;
    @Lob
    @Column(name = "DESEN_PROD")
    private byte[] desenProd;
    @Column(name = "PRVDEXP_PROD")
    private Double prvdexpProd;
    @Column(name = "COD_MA")
    private Short codMa;
    @Column(name = "MARGBCICMSR_PROD")
    private Double margbcicmsrProd;
    @Column(name = "FLAGBCICMS_PROD")
    private String flagbcicmsProd;
    @Column(name = "SERR_OPS")
    private Integer serrOps;
    @Column(name = "ACAB_OPS")
    private Integer acabOps;
    @Column(name = "CODFUNC_PROD")
    private Short codfuncProd;
    @Column(name = "NOMFUNC_PROD")
    private String nomfuncProd;
    @Column(name = "ALIQECF_PROD")
    private String aliqecfProd;
    @Column(name = "ECF_PROD")
    private String ecfProd;
    @Column(name = "NOMTERC_PESS")
    private String nomtercPess;
    @Column(name = "PRUNIT_DOC")
    private Double prunitDoc;
    @Column(name = "DTPROD_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtprodProd;
    @Column(name = "CODGERAL_PROD")
    private String codgeralProd;
    @Column(name = "COLETOR_PROD")
    private String coletorProd;
    @Column(name = "CMEDIO_PROD")
    private Double cmedioProd;
    @Column(name = "PRTRF_PROD")
    private Double prtrfProd;
    @Column(name = "PCOMI_PROD")
    private Double pcomiProd;
    @Column(name = "CUSTOFAB_PROD")
    private Double custofabProd;
    @Column(name = "CUSTOLJ_PROD")
    private Double custoljProd;
    @Column(name = "INDPR1_PROD")
    private Double indpr1Prod;
    @Column(name = "INDPR2_PROD")
    private Double indpr2Prod;
    @Column(name = "INDPR3_PROD")
    private Double indpr3Prod;
    @Column(name = "INDPR4_PROD")
    private Double indpr4Prod;
    @Column(name = "INDLUCRO_PROD")
    private Double indlucroProd;
    @Column(name = "INDTAB1_PROD")
    private Double indtab1Prod;
    @Column(name = "PRTAB1_PROD")
    private Double prtab1Prod;
    @Column(name = "INDTAB2_PROD")
    private Double indtab2Prod;
    @Column(name = "PRTAB2_PROD")
    private Double prtab2Prod;
    @Column(name = "INDTAB3_PROD")
    private Double indtab3Prod;
    @Column(name = "PRTAB3_PROD")
    private Double prtab3Prod;
    @Column(name = "ESTQ1_PROD")
    private Double estq1Prod;
    @Column(name = "ESTQ2_PROD")
    private Double estq2Prod;
    @Column(name = "DTMOV_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmovProd;
    @Column(name = "CODBAR2_PROD")
    private String codbar2Prod;
    @Column(name = "CODBAR3_PROD")
    private String codbar3Prod;
    @Column(name = "COD2_GRP")
    private Short cod2Grp;
    @Column(name = "CUSTOFBFX_PROD")
    private Double custofbfxProd;
    @Column(name = "TEAR_PROD")
    private String tearProd;
    @Column(name = "BANCADA_PROD")
    private String bancadaProd;
    @Column(name = "CTSERIES_PROD")
    private String ctseriesProd;
    @Column(name = "ESTQ3_PROD")
    private Double estq3Prod;
    @Column(name = "ESTQ4_PROD")
    private Double estq4Prod;
    @Column(name = "ESTQ5_PROD")
    private Double estq5Prod;
    @Column(name = "ESTQ6_PROD")
    private Double estq6Prod;
    @Column(name = "ESTQ7_PROD")
    private Double estq7Prod;
    @Column(name = "ESTQ8_PROD")
    private Double estq8Prod;
    @Column(name = "ESTQ9_PROD")
    private Double estq9Prod;
    @Column(name = "ESTQ10_PROD")
    private Double estq10Prod;
    @Column(name = "MVESTQES_PROD")
    private Short mvestqesProd;
    @Column(name = "PRPTICMSR_PROD")
    private Double prpticmsrProd;
    @Lob
    @Column(name = "OBS2_PROD")
    private String obs2Prod;
    @Column(name = "TIPO_PROD")
    private String tipoProd;
    @Column(name = "MODELO_PROD")
    private String modeloProd;
    @Column(name = "SERIE_PROD")
    private String serieProd;
    @Column(name = "COR_PROD")
    private String corProd;
    @Column(name = "PLACA_PROD")
    private String placaProd;
    @Column(name = "APOLICE_PROD")
    private String apoliceProd;
    @Column(name = "NOMSEG_PROD")
    private String nomsegProd;
    @Column(name = "RESTR_PROD")
    private String restrProd;
    @Column(name = "DTINISEG_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtinisegProd;
    @Column(name = "DTFIMSEG_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtfimsegProd;
    @Column(name = "PREMIOSEG_PROD")
    private Double premiosegProd;
    @Column(name = "VRCOBSEG_PROD")
    private Double vrcobsegProd;
    @Lob
    @Column(name = "OBSSEG_PROD")
    private String obssegProd;
    @Column(name = "COD2_PESS")
    private Integer cod2Pess;
    @Column(name = "NOM2_PESS")
    private String nom2Pess;
    @Column(name = "DOC2_PROD")
    private String doc2Prod;
    @Column(name = "EMISS2_DOC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date emiss2Doc;
    @Column(name = "TOTALG2_DOC")
    private Double totalg2Doc;
    @Column(name = "COD_CTA")
    private Short codCta;
    @Column(name = "NOM_CTA")
    private String nomCta;
    @Column(name = "COD_CC")
    private Short codCc;
    @Column(name = "NOM_CC")
    private String nomCc;
    @Column(name = "KWH_PROD")
    private Double kwhProd;
    @Column(name = "VRSERR_PROD")
    private Double vrserrProd;
    @Column(name = "VRACAB_PROD")
    private Double vracabProd;
    @Column(name = "VRCORTE_PROD")
    private Double vrcorteProd;
    @Column(name = "CORTE_OPS")
    private Integer corteOps;
    @Column(name = "VRSERV_PROD")
    private Double vrservProd;
    @Column(name = "VRPOL_PROD")
    private Double vrpolProd;
    @Column(name = "POL_OPS")
    private Integer polOps;
    @Column(name = "DTINIPROD_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtiniprodProd;
    @Column(name = "TXDEPA_PROD")
    private Double txdepaProd;
    @Column(name = "IAT_PROD")
    private String iatProd;
    @Column(name = "IPPT_PROD")
    private String ipptProd;
    @Column(name = "DESOPNEU_PROD")
    private String desopneuProd;
    @Column(name = "DESRPNEU_PROD")
    private String desrpneuProd;
    @Column(name = "KMOPNEU_PROD")
    private Double kmopneuProd;
    @Column(name = "KMRPNEU_PROD")
    private Double kmrpneuProd;
    @Column(name = "OUTDESP_DOC")
    private Double outdespDoc;
    @Column(name = "COD_DOC")
    private Integer codDoc;
    @Column(name = "VRESTC_PROD")
    private Double vrestcProd;
    @Column(name = "VRDA_PROD")
    private Double vrdaProd;
    @Column(name = "VRDC_PROD")
    private Double vrdcProd;
    @Column(name = "VRDF_PROD")
    private Double vrdfProd;
    @Column(name = "VRDN_PROD")
    private Double vrdnProd;
    @Column(name = "VRCOMI_PROD")
    private Double vrcomiProd;
    @Column(name = "VRCOMI2_PROD")
    private Double vrcomi2Prod;
    @Column(name = "VRDEDV_PROD")
    private Double vrdedvProd;
    @Column(name = "ORIGEM_PROD")
    private Short origemProd;
    @Column(name = "MDBCICMS_PROD")
    private Short mdbcicmsProd;
    @Column(name = "MDBCICMSR_PROD")
    private Short mdbcicmsrProd;
    @Column(name = "ALIQPIS_PROD")
    private Double aliqpisProd;
    @Column(name = "ALIQCOFINS_PROD")
    private Double aliqcofinsProd;
    @Column(name = "COD_SERV")
    private Short codServ;
    @Column(name = "TPALIQPIS_PROD")
    private String tpaliqpisProd;
    @Column(name = "TPALIQCOFINS_PROD")
    private String tpaliqcofinsProd;
    @Column(name = "EXTIPI_PROD")
    private String extipiProd;
    @Column(name = "GTIPI_PROD")
    private Short gtipiProd;
    @Column(name = "CSTPIS_PROD")
    private Short cstpisProd;
    @Column(name = "CSTCOFINS_PROD")
    private Short cstcofinsProd;
    @Column(name = "TPALIQSTPIS_PROD")
    private String tpaliqstpisProd;
    @Column(name = "TPALIQSTCOFINS_PROD")
    private String tpaliqstcofinsProd;
    @Column(name = "ALIQSTPIS_PROD")
    private Double aliqstpisProd;
    @Column(name = "ALIQSTCOFINS_PROD")
    private Double aliqstcofinsProd;
    @Column(name = "VRATUAL_PROD")
    private Double vratualProd;
    @Column(name = "DTPOST_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtpostProd;
    @Column(name = "DTINS_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtinsProd;
    @Column(name = "TIPIL_PROD")
    private String tipilProd;
    @Column(name = "ESTQPCR_PROD")
    private Integer estqpcrProd;
    @Column(name = "ESTQUNSDR_PROD")
    private Double estqunsdrProd;
    @Column(name = "CUSTO1_PROD")
    private Double custo1Prod;
    @Column(name = "CUSTO2_PROD")
    private Double custo2Prod;
    @Column(name = "CUSTO3_PROD")
    private Double custo3Prod;
    @Column(name = "CUSTO4_PROD")
    private Double custo4Prod;
    @Column(name = "CUSTO5_PROD")
    private Double custo5Prod;
    @Column(name = "CSOSN_PROD")
    private Short csosnProd;
    @Column(name = "COD_DOCIT")
    private Short codDocit;
    @Column(name = "CHAVE_PROD")
    private Integer chaveProd;
    @Column(name = "DTMOVECF_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmovecfProd;
    @Column(name = "PBCINSS_PROD")
    private Double pbcinssProd;
    @Column(name = "ALIQINSS_PROD")
    private Double aliqinssProd;
    @Column(name = "PBCIRRF_PROD")
    private Double pbcirrfProd;
    @Column(name = "ALIQIRRF_PROD")
    private Double aliqirrfProd;
    @Column(name = "PBCCSRF_PROD")
    private Double pbccsrfProd;
    @Column(name = "ALIQCSRF_PROD")
    private Double aliqcsrfProd;
    @Column(name = "PBCOUTRF_PROD")
    private Double pbcoutrfProd;
    @Column(name = "ALIQOUTRF_PROD")
    private Double aliqoutrfProd;
    @Column(name = "CHAVE2_PROD")
    private Integer chave2Prod;
    @Column(name = "PRTABP_PROD")
    private Double prtabpProd;
    @Column(name = "INDTABP_PROD")
    private Double indtabpProd;
    @Column(name = "LRCPE_PROD")
    private String lrcpeProd;
    @Column(name = "GTIN_PROD")
    private String gtinProd;
    @Column(name = "GTINTRIB_PROD")
    private String gtintribProd;
    @Column(name = "NATRECCS_PROD")
    private Short natreccsProd;
    @Column(name = "CDIPIS_PROD")
    private String cdipisProd;
    @Column(name = "CDRPIS_PROD")
    private String cdrpisProd;
    @Column(name = "CDICOFINS_PROD")
    private String cdicofinsProd;
    @Column(name = "CDRCOFINS_PROD")
    private String cdrcofinsProd;
    @Column(name = "ALIQICPPIS_PROD")
    private Double aliqicppisProd;
    @Column(name = "ALIQRCPPIS_PROD")
    private Double aliqrcppisProd;
    @Column(name = "ALIQICPCOFINS_PROD")
    private Double aliqicpcofinsProd;
    @Column(name = "ALIQRCPCOFINS_PROD")
    private Double aliqrcpcofinsProd;
    @Column(name = "ESTQNEG_PROD")
    private String estqnegProd;
    @Column(name = "PRPTICMS_PROD")
    private Double prpticmsProd;
    @Column(name = "FRCUSTO_PROD")
    private String frcustoProd;
    @Column(name = "CODIF_PROD")
    private String codifProd;
    @Column(name = "CODANP_PROD")
    private String codanpProd;
    @Column(name = "ALIQCIDE_PROD")
    private Double aliqcideProd;
    @Column(name = "CODSFC_GRP")
    private Short codsfcGrp;
    @Column(name = "CODSC_GRP")
    private Short codscGrp;
    @Column(name = "CODC_CTA")
    private Short codcCta;
    @Column(name = "CODV_CTA")
    private Short codvCta;
    @Column(name = "CODC_CC")
    private Short codcCc;
    @Column(name = "CODV_CC")
    private Short codvCc;
    @Column(name = "VIDAUTIL_PROD")
    private Short vidautilProd;
    @Column(name = "SERIE_DOC")
    private String serieDoc;
    @Column(name = "CODFRT_DOC")
    private Integer codfrtDoc;
    @Column(name = "MPRTAB1_PROD")
    private String mprtab1Prod;
    @Column(name = "MPRTAB2_PROD")
    private String mprtab2Prod;
    @Column(name = "MPRTAB3_PROD")
    private String mprtab3Prod;
    @Column(name = "RNTRC_PROD")
    private String rntrcProd;
    @Column(name = "BAL_PROD")
    private String balProd;
    @Column(name = "COMPTUNSD_PROD")
    private Double comptunsdProd;
    @Column(name = "ALTESPTUNSD_PROD")
    private Double altesptunsdProd;
    @Column(name = "LARGTUNSD_PROD")
    private Double largtunsdProd;
    @Column(name = "COD_MV")
    private Integer codMv;
    @Column(name = "COD_MVIT")
    private Short codMvit;
    @Column(name = "CODS_DOC")
    private Integer codsDoc;
    @Column(name = "CODS_DOCIT")
    private Short codsDocit;
    @Column(name = "CEST_PROD")
    private String cestProd;
    @Column(name = "CENQIPI_PROD")
    private Short cenqipiProd;
    @Column(name = "VALID_PROD")
    private Short validProd;
    @Column(name = "COMPCUNSD_PROD")
    private Double compcunsdProd;
    @Column(name = "ALTESPCUNSD_PROD")
    private Double altespcunsdProd;
    @Column(name = "LARGCUNSD_PROD")
    private Double largcunsdProd;
    @Column(name = "COMPBCUNSD_PROD")
    private Double compbcunsdProd;
    @Column(name = "ALTESPBCUNSD_PROD")
    private Double altespbcunsdProd;
    @Column(name = "LARGBCUNSD_PROD")
    private Double largbcunsdProd;
    @Column(name = "ALIQFCP_PROD")
    private Double aliqfcpProd;
    @Column(name = "DEL_PROD")
    private String delProd;
    @Column(name = "IL1_SIT_PROD")
    private Integer il1SitProd;
    @Column(name = "IL2_COD_GRP")
    private Integer il2CodGrp;
    @Column(name = "DTPOL_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtpolProd;
    @Column(name = "COD_JZD")
    private Integer codJzd;
    @Column(name = "UNTRB_PROD")
    private String untrbProd;
    @Column(name = "CONVTRB_PROD")
    private Double convtrbProd;
    @Column(name = "QTDEPDC_PROD")
    private Double qtdepdcProd;
    @Column(name = "CCOMPRAORIG_PROD")
    private Double ccompraorigProd;
    @Column(name = "DTINIPROMO_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtinipromoProd;
    @Column(name = "DTFIMPROMO_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtfimpromoProd;
    @Column(name = "TIPI2_PROD")
    private String tipi2Prod;
    @Column(name = "CSTIPI_PROD")
    private Short cstipiProd;
    @Column(name = "ESTQUNSDPT_PROD")
    private Double estqunsdptProd;
    @Column(name = "MAST_ESTQ")
    private Integer mastEstq;
    @Column(name = "CTRF_DOC")
    private Double ctrfDoc;
    @JoinColumn(name = "COD_GRP", referencedColumnName = "COD_GRP")
    @ManyToOne
    private Grp codGrp;

    private transient Double dist;

    public Double getDist() {
        return dist;
    }

    public void setDist(Double dist) {
        this.dist = dist;
    }

    public Prod() {
    }

    public Prod(Integer codEstq) {
        this.codEstq = codEstq;
    }

    public Prod(Integer codEstq, short codEstab, String codbarProd, String nomProd) {
        this.codEstq = codEstq;
        this.codEstab = codEstab;
        this.codbarProd = codbarProd;
        this.nomProd = nomProd;
    }

    public Integer getCodEstq() {
        return codEstq;
    }

    public void setCodEstq(Integer codEstq) {
        this.codEstq = codEstq;
    }

    public short getCodEstab() {
        return codEstab;
    }

    public void setCodEstab(short codEstab) {
        this.codEstab = codEstab;
    }

    public String getNatEstq() {
        return natEstq;
    }

    public void setNatEstq(String natEstq) {
        this.natEstq = natEstq;
    }

    public Integer getCodmastEstq() {
        return codmastEstq;
    }

    public void setCodmastEstq(Integer codmastEstq) {
        this.codmastEstq = codmastEstq;
    }

    public String getCodbarProd() {
        return codbarProd;
    }

    public void setCodbarProd(String codbarProd) {
        this.codbarProd = codbarProd;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getNom2Prod() {
        return nom2Prod;
    }

    public void setNom2Prod(String nom2Prod) {
        this.nom2Prod = nom2Prod;
    }

    public String getTpindProd() {
        return tpindProd;
    }

    public void setTpindProd(String tpindProd) {
        this.tpindProd = tpindProd;
    }

    public String getPadraoProd() {
        return padraoProd;
    }

    public void setPadraoProd(String padraoProd) {
        this.padraoProd = padraoProd;
    }

    public String getNomdefProd() {
        return nomdefProd;
    }

    public void setNomdefProd(String nomdefProd) {
        this.nomdefProd = nomdefProd;
    }

    public String getPosestqProd() {
        return posestqProd;
    }

    public void setPosestqProd(String posestqProd) {
        this.posestqProd = posestqProd;
    }

    public String getNumlotefbProd() {
        return numlotefbProd;
    }

    public void setNumlotefbProd(String numlotefbProd) {
        this.numlotefbProd = numlotefbProd;
    }

    public byte[] getObsProd() {
        return obsProd;
    }

    public void setObsProd(byte[] obsProd) {
        this.obsProd = obsProd;
    }

    public Date getDtvencProd() {
        return dtvencProd;
    }

    public void setDtvencProd(Date dtvencProd) {
        this.dtvencProd = dtvencProd;
    }

    public byte[] getFotoProd() {
        return fotoProd;
    }

    public void setFotoProd(byte[] fotoProd) {
        this.fotoProd = fotoProd;
    }

    public Integer getBlocoProd() {
        return blocoProd;
    }

    public void setBlocoProd(Integer blocoProd) {
        this.blocoProd = blocoProd;
    }

    public String getBlocotcProd() {
        return blocotcProd;
    }

    public void setBlocotcProd(String blocotcProd) {
        this.blocotcProd = blocotcProd;
    }

    public Short getChapaProd() {
        return chapaProd;
    }

    public void setChapaProd(Short chapaProd) {
        this.chapaProd = chapaProd;
    }

    public Short getChapatcProd() {
        return chapatcProd;
    }

    public void setChapatcProd(Short chapatcProd) {
        this.chapatcProd = chapatcProd;
    }

    public Double getCompbrunsdProd() {
        return compbrunsdProd;
    }

    public void setCompbrunsdProd(Double compbrunsdProd) {
        this.compbrunsdProd = compbrunsdProd;
    }

    public Double getAltespbrunsdProd() {
        return altespbrunsdProd;
    }

    public void setAltespbrunsdProd(Double altespbrunsdProd) {
        this.altespbrunsdProd = altespbrunsdProd;
    }

    public Double getLargbrunsdProd() {
        return largbrunsdProd;
    }

    public void setLargbrunsdProd(Double largbrunsdProd) {
        this.largbrunsdProd = largbrunsdProd;
    }

    public Double getComplqunsdProd() {
        return complqunsdProd;
    }

    public void setComplqunsdProd(Double complqunsdProd) {
        this.complqunsdProd = complqunsdProd;
    }

    public Double getAltesplqunsdProd() {
        return altesplqunsdProd;
    }

    public void setAltesplqunsdProd(Double altesplqunsdProd) {
        this.altesplqunsdProd = altesplqunsdProd;
    }

    public Double getLarglqunsdProd() {
        return larglqunsdProd;
    }

    public void setLarglqunsdProd(Double larglqunsdProd) {
        this.larglqunsdProd = larglqunsdProd;
    }

    public String getAplicProd() {
        return aplicProd;
    }

    public void setAplicProd(String aplicProd) {
        this.aplicProd = aplicProd;
    }

    public Date getDtfabrProd() {
        return dtfabrProd;
    }

    public void setDtfabrProd(Date dtfabrProd) {
        this.dtfabrProd = dtfabrProd;
    }

    public Date getDtentProd() {
        return dtentProd;
    }

    public void setDtentProd(Date dtentProd) {
        this.dtentProd = dtentProd;
    }

    public String getDocProd() {
        return docProd;
    }

    public void setDocProd(String docProd) {
        this.docProd = docProd;
    }

    public Double getTotalgDoc() {
        return totalgDoc;
    }

    public void setTotalgDoc(Double totalgDoc) {
        this.totalgDoc = totalgDoc;
    }

    public Double getFreteDoc() {
        return freteDoc;
    }

    public void setFreteDoc(Double freteDoc) {
        this.freteDoc = freteDoc;
    }

    public Date getEmissDoc() {
        return emissDoc;
    }

    public void setEmissDoc(Date emissDoc) {
        this.emissDoc = emissDoc;
    }

    public Double getCustoDoc() {
        return custoDoc;
    }

    public void setCustoDoc(Double custoDoc) {
        this.custoDoc = custoDoc;
    }

    public Integer getCodPess() {
        return codPess;
    }

    public void setCodPess(Integer codPess) {
        this.codPess = codPess;
    }

    public String getNomPess() {
        return nomPess;
    }

    public void setNomPess(String nomPess) {
        this.nomPess = nomPess;
    }

    public String getTipiProd() {
        return tipiProd;
    }

    public void setTipiProd(String tipiProd) {
        this.tipiProd = tipiProd;
    }

    public String getEmblgProd() {
        return emblgProd;
    }

    public void setEmblgProd(String emblgProd) {
        this.emblgProd = emblgProd;
    }

    public Short getPcemblgProd() {
        return pcemblgProd;
    }

    public void setPcemblgProd(Short pcemblgProd) {
        this.pcemblgProd = pcemblgProd;
    }

    public Short getCstProd() {
        return cstProd;
    }

    public void setCstProd(Short cstProd) {
        this.cstProd = cstProd;
    }

    public Double getEstqunsdProd() {
        return estqunsdProd;
    }

    public void setEstqunsdProd(Double estqunsdProd) {
        this.estqunsdProd = estqunsdProd;
    }

    public Integer getEstqpcProd() {
        return estqpcProd;
    }

    public void setEstqpcProd(Integer estqpcProd) {
        this.estqpcProd = estqpcProd;
    }

    public Double getCusunmedProd() {
        return cusunmedProd;
    }

    public void setCusunmedProd(Double cusunmedProd) {
        this.cusunmedProd = cusunmedProd;
    }

    public Double getPrvendaProd() {
        return prvendaProd;
    }

    public void setPrvendaProd(Double prvendaProd) {
        this.prvendaProd = prvendaProd;
    }

    public Short getCodDa() {
        return codDa;
    }

    public void setCodDa(Short codDa) {
        this.codDa = codDa;
    }

    public Integer getCodcfEstq() {
        return codcfEstq;
    }

    public void setCodcfEstq(Integer codcfEstq) {
        this.codcfEstq = codcfEstq;
    }

    public Double getAliqipiProd() {
        return aliqipiProd;
    }

    public void setAliqipiProd(Double aliqipiProd) {
        this.aliqipiProd = aliqipiProd;
    }

    public Double getAliqicmsProd() {
        return aliqicmsProd;
    }

    public void setAliqicmsProd(Double aliqicmsProd) {
        this.aliqicmsProd = aliqicmsProd;
    }

    public Double getRedbcicmsProd() {
        return redbcicmsProd;
    }

    public void setRedbcicmsProd(Double redbcicmsProd) {
        this.redbcicmsProd = redbcicmsProd;
    }

    public Double getAliqissProd() {
        return aliqissProd;
    }

    public void setAliqissProd(Double aliqissProd) {
        this.aliqissProd = aliqissProd;
    }

    public Short getSitProd() {
        return sitProd;
    }

    public void setSitProd(Short sitProd) {
        this.sitProd = sitProd;
    }

    public Double getPesobrkgProd() {
        return pesobrkgProd;
    }

    public void setPesobrkgProd(Double pesobrkgProd) {
        this.pesobrkgProd = pesobrkgProd;
    }

    public Double getPesolqkgProd() {
        return pesolqkgProd;
    }

    public void setPesolqkgProd(Double pesolqkgProd) {
        this.pesolqkgProd = pesolqkgProd;
    }

    public Double getEstqmaxProd() {
        return estqmaxProd;
    }

    public void setEstqmaxProd(Double estqmaxProd) {
        this.estqmaxProd = estqmaxProd;
    }

    public Double getEstqminProd() {
        return estqminProd;
    }

    public void setEstqminProd(Double estqminProd) {
        this.estqminProd = estqminProd;
    }

    public String getUnsdProd() {
        return unsdProd;
    }

    public void setUnsdProd(String unsdProd) {
        this.unsdProd = unsdProd;
    }

    public String getCodposseProd() {
        return codposseProd;
    }

    public void setCodposseProd(String codposseProd) {
        this.codposseProd = codposseProd;
    }

    public Integer getCodtercPess() {
        return codtercPess;
    }

    public void setCodtercPess(Integer codtercPess) {
        this.codtercPess = codtercPess;
    }

    public Short getIdipiProd() {
        return idipiProd;
    }

    public void setIdipiProd(Short idipiProd) {
        this.idipiProd = idipiProd;
    }

    public Short getIdicmsProd() {
        return idicmsProd;
    }

    public void setIdicmsProd(Short idicmsProd) {
        this.idicmsProd = idicmsProd;
    }

    public String getMenfisProd() {
        return menfisProd;
    }

    public void setMenfisProd(String menfisProd) {
        this.menfisProd = menfisProd;
    }

    public Double getIndgrProd() {
        return indgrProd;
    }

    public void setIndgrProd(Double indgrProd) {
        this.indgrProd = indgrProd;
    }

    public byte[] getDesenProd() {
        return desenProd;
    }

    public void setDesenProd(byte[] desenProd) {
        this.desenProd = desenProd;
    }

    public Double getPrvdexpProd() {
        return prvdexpProd;
    }

    public void setPrvdexpProd(Double prvdexpProd) {
        this.prvdexpProd = prvdexpProd;
    }

    public Short getCodMa() {
        return codMa;
    }

    public void setCodMa(Short codMa) {
        this.codMa = codMa;
    }

    public Double getMargbcicmsrProd() {
        return margbcicmsrProd;
    }

    public void setMargbcicmsrProd(Double margbcicmsrProd) {
        this.margbcicmsrProd = margbcicmsrProd;
    }

    public String getFlagbcicmsProd() {
        return flagbcicmsProd;
    }

    public void setFlagbcicmsProd(String flagbcicmsProd) {
        this.flagbcicmsProd = flagbcicmsProd;
    }

    public Integer getSerrOps() {
        return serrOps;
    }

    public void setSerrOps(Integer serrOps) {
        this.serrOps = serrOps;
    }

    public Integer getAcabOps() {
        return acabOps;
    }

    public void setAcabOps(Integer acabOps) {
        this.acabOps = acabOps;
    }

    public Short getCodfuncProd() {
        return codfuncProd;
    }

    public void setCodfuncProd(Short codfuncProd) {
        this.codfuncProd = codfuncProd;
    }

    public String getNomfuncProd() {
        return nomfuncProd;
    }

    public void setNomfuncProd(String nomfuncProd) {
        this.nomfuncProd = nomfuncProd;
    }

    public String getAliqecfProd() {
        return aliqecfProd;
    }

    public void setAliqecfProd(String aliqecfProd) {
        this.aliqecfProd = aliqecfProd;
    }

    public String getEcfProd() {
        return ecfProd;
    }

    public void setEcfProd(String ecfProd) {
        this.ecfProd = ecfProd;
    }

    public String getNomtercPess() {
        return nomtercPess;
    }

    public void setNomtercPess(String nomtercPess) {
        this.nomtercPess = nomtercPess;
    }

    public Double getPrunitDoc() {
        return prunitDoc;
    }

    public void setPrunitDoc(Double prunitDoc) {
        this.prunitDoc = prunitDoc;
    }

    public Date getDtprodProd() {
        return dtprodProd;
    }

    public void setDtprodProd(Date dtprodProd) {
        this.dtprodProd = dtprodProd;
    }

    public String getCodgeralProd() {
        return codgeralProd;
    }

    public void setCodgeralProd(String codgeralProd) {
        this.codgeralProd = codgeralProd;
    }

    public String getColetorProd() {
        return coletorProd;
    }

    public void setColetorProd(String coletorProd) {
        this.coletorProd = coletorProd;
    }

    public Double getCmedioProd() {
        return cmedioProd;
    }

    public void setCmedioProd(Double cmedioProd) {
        this.cmedioProd = cmedioProd;
    }

    public Double getPrtrfProd() {
        return prtrfProd;
    }

    public void setPrtrfProd(Double prtrfProd) {
        this.prtrfProd = prtrfProd;
    }

    public Double getPcomiProd() {
        return pcomiProd;
    }

    public void setPcomiProd(Double pcomiProd) {
        this.pcomiProd = pcomiProd;
    }

    public Double getCustofabProd() {
        return custofabProd;
    }

    public void setCustofabProd(Double custofabProd) {
        this.custofabProd = custofabProd;
    }

    public Double getCustoljProd() {
        return custoljProd;
    }

    public void setCustoljProd(Double custoljProd) {
        this.custoljProd = custoljProd;
    }

    public Double getIndpr1Prod() {
        return indpr1Prod;
    }

    public void setIndpr1Prod(Double indpr1Prod) {
        this.indpr1Prod = indpr1Prod;
    }

    public Double getIndpr2Prod() {
        return indpr2Prod;
    }

    public void setIndpr2Prod(Double indpr2Prod) {
        this.indpr2Prod = indpr2Prod;
    }

    public Double getIndpr3Prod() {
        return indpr3Prod;
    }

    public void setIndpr3Prod(Double indpr3Prod) {
        this.indpr3Prod = indpr3Prod;
    }

    public Double getIndpr4Prod() {
        return indpr4Prod;
    }

    public void setIndpr4Prod(Double indpr4Prod) {
        this.indpr4Prod = indpr4Prod;
    }

    public Double getIndlucroProd() {
        return indlucroProd;
    }

    public void setIndlucroProd(Double indlucroProd) {
        this.indlucroProd = indlucroProd;
    }

    public Double getIndtab1Prod() {
        return indtab1Prod;
    }

    public void setIndtab1Prod(Double indtab1Prod) {
        this.indtab1Prod = indtab1Prod;
    }

    public Double getPrtab1Prod() {
        return prtab1Prod;
    }

    public void setPrtab1Prod(Double prtab1Prod) {
        this.prtab1Prod = prtab1Prod;
    }

    public Double getIndtab2Prod() {
        return indtab2Prod;
    }

    public void setIndtab2Prod(Double indtab2Prod) {
        this.indtab2Prod = indtab2Prod;
    }

    public Double getPrtab2Prod() {
        return prtab2Prod;
    }

    public void setPrtab2Prod(Double prtab2Prod) {
        this.prtab2Prod = prtab2Prod;
    }

    public Double getIndtab3Prod() {
        return indtab3Prod;
    }

    public void setIndtab3Prod(Double indtab3Prod) {
        this.indtab3Prod = indtab3Prod;
    }

    public Double getPrtab3Prod() {
        return prtab3Prod;
    }

    public void setPrtab3Prod(Double prtab3Prod) {
        this.prtab3Prod = prtab3Prod;
    }

    public Double getEstq1Prod() {
        return estq1Prod;
    }

    public void setEstq1Prod(Double estq1Prod) {
        this.estq1Prod = estq1Prod;
    }

    public Double getEstq2Prod() {
        return estq2Prod;
    }

    public void setEstq2Prod(Double estq2Prod) {
        this.estq2Prod = estq2Prod;
    }

    public Date getDtmovProd() {
        return dtmovProd;
    }

    public void setDtmovProd(Date dtmovProd) {
        this.dtmovProd = dtmovProd;
    }

    public String getCodbar2Prod() {
        return codbar2Prod;
    }

    public void setCodbar2Prod(String codbar2Prod) {
        this.codbar2Prod = codbar2Prod;
    }

    public String getCodbar3Prod() {
        return codbar3Prod;
    }

    public void setCodbar3Prod(String codbar3Prod) {
        this.codbar3Prod = codbar3Prod;
    }

    public Short getCod2Grp() {
        return cod2Grp;
    }

    public void setCod2Grp(Short cod2Grp) {
        this.cod2Grp = cod2Grp;
    }

    public Double getCustofbfxProd() {
        return custofbfxProd;
    }

    public void setCustofbfxProd(Double custofbfxProd) {
        this.custofbfxProd = custofbfxProd;
    }

    public String getTearProd() {
        return tearProd;
    }

    public void setTearProd(String tearProd) {
        this.tearProd = tearProd;
    }

    public String getBancadaProd() {
        return bancadaProd;
    }

    public void setBancadaProd(String bancadaProd) {
        this.bancadaProd = bancadaProd;
    }

    public String getCtseriesProd() {
        return ctseriesProd;
    }

    public void setCtseriesProd(String ctseriesProd) {
        this.ctseriesProd = ctseriesProd;
    }

    public Double getEstq3Prod() {
        return estq3Prod;
    }

    public void setEstq3Prod(Double estq3Prod) {
        this.estq3Prod = estq3Prod;
    }

    public Double getEstq4Prod() {
        return estq4Prod;
    }

    public void setEstq4Prod(Double estq4Prod) {
        this.estq4Prod = estq4Prod;
    }

    public Double getEstq5Prod() {
        return estq5Prod;
    }

    public void setEstq5Prod(Double estq5Prod) {
        this.estq5Prod = estq5Prod;
    }

    public Double getEstq6Prod() {
        return estq6Prod;
    }

    public void setEstq6Prod(Double estq6Prod) {
        this.estq6Prod = estq6Prod;
    }

    public Double getEstq7Prod() {
        return estq7Prod;
    }

    public void setEstq7Prod(Double estq7Prod) {
        this.estq7Prod = estq7Prod;
    }

    public Double getEstq8Prod() {
        return estq8Prod;
    }

    public void setEstq8Prod(Double estq8Prod) {
        this.estq8Prod = estq8Prod;
    }

    public Double getEstq9Prod() {
        return estq9Prod;
    }

    public void setEstq9Prod(Double estq9Prod) {
        this.estq9Prod = estq9Prod;
    }

    public Double getEstq10Prod() {
        return estq10Prod;
    }

    public void setEstq10Prod(Double estq10Prod) {
        this.estq10Prod = estq10Prod;
    }

    public Short getMvestqesProd() {
        return mvestqesProd;
    }

    public void setMvestqesProd(Short mvestqesProd) {
        this.mvestqesProd = mvestqesProd;
    }

    public Double getPrpticmsrProd() {
        return prpticmsrProd;
    }

    public void setPrpticmsrProd(Double prpticmsrProd) {
        this.prpticmsrProd = prpticmsrProd;
    }

    public String getObs2Prod() {
        return obs2Prod;
    }

    public void setObs2Prod(String obs2Prod) {
        this.obs2Prod = obs2Prod;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

    public String getModeloProd() {
        return modeloProd;
    }

    public void setModeloProd(String modeloProd) {
        this.modeloProd = modeloProd;
    }

    public String getSerieProd() {
        return serieProd;
    }

    public void setSerieProd(String serieProd) {
        this.serieProd = serieProd;
    }

    public String getCorProd() {
        return corProd;
    }

    public void setCorProd(String corProd) {
        this.corProd = corProd;
    }

    public String getPlacaProd() {
        return placaProd;
    }

    public void setPlacaProd(String placaProd) {
        this.placaProd = placaProd;
    }

    public String getApoliceProd() {
        return apoliceProd;
    }

    public void setApoliceProd(String apoliceProd) {
        this.apoliceProd = apoliceProd;
    }

    public String getNomsegProd() {
        return nomsegProd;
    }

    public void setNomsegProd(String nomsegProd) {
        this.nomsegProd = nomsegProd;
    }

    public String getRestrProd() {
        return restrProd;
    }

    public void setRestrProd(String restrProd) {
        this.restrProd = restrProd;
    }

    public Date getDtinisegProd() {
        return dtinisegProd;
    }

    public void setDtinisegProd(Date dtinisegProd) {
        this.dtinisegProd = dtinisegProd;
    }

    public Date getDtfimsegProd() {
        return dtfimsegProd;
    }

    public void setDtfimsegProd(Date dtfimsegProd) {
        this.dtfimsegProd = dtfimsegProd;
    }

    public Double getPremiosegProd() {
        return premiosegProd;
    }

    public void setPremiosegProd(Double premiosegProd) {
        this.premiosegProd = premiosegProd;
    }

    public Double getVrcobsegProd() {
        return vrcobsegProd;
    }

    public void setVrcobsegProd(Double vrcobsegProd) {
        this.vrcobsegProd = vrcobsegProd;
    }

    public String getObssegProd() {
        return obssegProd;
    }

    public void setObssegProd(String obssegProd) {
        this.obssegProd = obssegProd;
    }

    public Integer getCod2Pess() {
        return cod2Pess;
    }

    public void setCod2Pess(Integer cod2Pess) {
        this.cod2Pess = cod2Pess;
    }

    public String getNom2Pess() {
        return nom2Pess;
    }

    public void setNom2Pess(String nom2Pess) {
        this.nom2Pess = nom2Pess;
    }

    public String getDoc2Prod() {
        return doc2Prod;
    }

    public void setDoc2Prod(String doc2Prod) {
        this.doc2Prod = doc2Prod;
    }

    public Date getEmiss2Doc() {
        return emiss2Doc;
    }

    public void setEmiss2Doc(Date emiss2Doc) {
        this.emiss2Doc = emiss2Doc;
    }

    public Double getTotalg2Doc() {
        return totalg2Doc;
    }

    public void setTotalg2Doc(Double totalg2Doc) {
        this.totalg2Doc = totalg2Doc;
    }

    public Short getCodCta() {
        return codCta;
    }

    public void setCodCta(Short codCta) {
        this.codCta = codCta;
    }

    public String getNomCta() {
        return nomCta;
    }

    public void setNomCta(String nomCta) {
        this.nomCta = nomCta;
    }

    public Short getCodCc() {
        return codCc;
    }

    public void setCodCc(Short codCc) {
        this.codCc = codCc;
    }

    public String getNomCc() {
        return nomCc;
    }

    public void setNomCc(String nomCc) {
        this.nomCc = nomCc;
    }

    public Double getKwhProd() {
        return kwhProd;
    }

    public void setKwhProd(Double kwhProd) {
        this.kwhProd = kwhProd;
    }

    public Double getVrserrProd() {
        return vrserrProd;
    }

    public void setVrserrProd(Double vrserrProd) {
        this.vrserrProd = vrserrProd;
    }

    public Double getVracabProd() {
        return vracabProd;
    }

    public void setVracabProd(Double vracabProd) {
        this.vracabProd = vracabProd;
    }

    public Double getVrcorteProd() {
        return vrcorteProd;
    }

    public void setVrcorteProd(Double vrcorteProd) {
        this.vrcorteProd = vrcorteProd;
    }

    public Integer getCorteOps() {
        return corteOps;
    }

    public void setCorteOps(Integer corteOps) {
        this.corteOps = corteOps;
    }

    public Double getVrservProd() {
        return vrservProd;
    }

    public void setVrservProd(Double vrservProd) {
        this.vrservProd = vrservProd;
    }

    public Double getVrpolProd() {
        return vrpolProd;
    }

    public void setVrpolProd(Double vrpolProd) {
        this.vrpolProd = vrpolProd;
    }

    public Integer getPolOps() {
        return polOps;
    }

    public void setPolOps(Integer polOps) {
        this.polOps = polOps;
    }

    public Date getDtiniprodProd() {
        return dtiniprodProd;
    }

    public void setDtiniprodProd(Date dtiniprodProd) {
        this.dtiniprodProd = dtiniprodProd;
    }

    public Double getTxdepaProd() {
        return txdepaProd;
    }

    public void setTxdepaProd(Double txdepaProd) {
        this.txdepaProd = txdepaProd;
    }

    public String getIatProd() {
        return iatProd;
    }

    public void setIatProd(String iatProd) {
        this.iatProd = iatProd;
    }

    public String getIpptProd() {
        return ipptProd;
    }

    public void setIpptProd(String ipptProd) {
        this.ipptProd = ipptProd;
    }

    public String getDesopneuProd() {
        return desopneuProd;
    }

    public void setDesopneuProd(String desopneuProd) {
        this.desopneuProd = desopneuProd;
    }

    public String getDesrpneuProd() {
        return desrpneuProd;
    }

    public void setDesrpneuProd(String desrpneuProd) {
        this.desrpneuProd = desrpneuProd;
    }

    public Double getKmopneuProd() {
        return kmopneuProd;
    }

    public void setKmopneuProd(Double kmopneuProd) {
        this.kmopneuProd = kmopneuProd;
    }

    public Double getKmrpneuProd() {
        return kmrpneuProd;
    }

    public void setKmrpneuProd(Double kmrpneuProd) {
        this.kmrpneuProd = kmrpneuProd;
    }

    public Double getOutdespDoc() {
        return outdespDoc;
    }

    public void setOutdespDoc(Double outdespDoc) {
        this.outdespDoc = outdespDoc;
    }

    public Integer getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(Integer codDoc) {
        this.codDoc = codDoc;
    }

    public Double getVrestcProd() {
        return vrestcProd;
    }

    public void setVrestcProd(Double vrestcProd) {
        this.vrestcProd = vrestcProd;
    }

    public Double getVrdaProd() {
        return vrdaProd;
    }

    public void setVrdaProd(Double vrdaProd) {
        this.vrdaProd = vrdaProd;
    }

    public Double getVrdcProd() {
        return vrdcProd;
    }

    public void setVrdcProd(Double vrdcProd) {
        this.vrdcProd = vrdcProd;
    }

    public Double getVrdfProd() {
        return vrdfProd;
    }

    public void setVrdfProd(Double vrdfProd) {
        this.vrdfProd = vrdfProd;
    }

    public Double getVrdnProd() {
        return vrdnProd;
    }

    public void setVrdnProd(Double vrdnProd) {
        this.vrdnProd = vrdnProd;
    }

    public Double getVrcomiProd() {
        return vrcomiProd;
    }

    public void setVrcomiProd(Double vrcomiProd) {
        this.vrcomiProd = vrcomiProd;
    }

    public Double getVrcomi2Prod() {
        return vrcomi2Prod;
    }

    public void setVrcomi2Prod(Double vrcomi2Prod) {
        this.vrcomi2Prod = vrcomi2Prod;
    }

    public Double getVrdedvProd() {
        return vrdedvProd;
    }

    public void setVrdedvProd(Double vrdedvProd) {
        this.vrdedvProd = vrdedvProd;
    }

    public Short getOrigemProd() {
        return origemProd;
    }

    public void setOrigemProd(Short origemProd) {
        this.origemProd = origemProd;
    }

    public Short getMdbcicmsProd() {
        return mdbcicmsProd;
    }

    public void setMdbcicmsProd(Short mdbcicmsProd) {
        this.mdbcicmsProd = mdbcicmsProd;
    }

    public Short getMdbcicmsrProd() {
        return mdbcicmsrProd;
    }

    public void setMdbcicmsrProd(Short mdbcicmsrProd) {
        this.mdbcicmsrProd = mdbcicmsrProd;
    }

    public Double getAliqpisProd() {
        return aliqpisProd;
    }

    public void setAliqpisProd(Double aliqpisProd) {
        this.aliqpisProd = aliqpisProd;
    }

    public Double getAliqcofinsProd() {
        return aliqcofinsProd;
    }

    public void setAliqcofinsProd(Double aliqcofinsProd) {
        this.aliqcofinsProd = aliqcofinsProd;
    }

    public Short getCodServ() {
        return codServ;
    }

    public void setCodServ(Short codServ) {
        this.codServ = codServ;
    }

    public String getTpaliqpisProd() {
        return tpaliqpisProd;
    }

    public void setTpaliqpisProd(String tpaliqpisProd) {
        this.tpaliqpisProd = tpaliqpisProd;
    }

    public String getTpaliqcofinsProd() {
        return tpaliqcofinsProd;
    }

    public void setTpaliqcofinsProd(String tpaliqcofinsProd) {
        this.tpaliqcofinsProd = tpaliqcofinsProd;
    }

    public String getExtipiProd() {
        return extipiProd;
    }

    public void setExtipiProd(String extipiProd) {
        this.extipiProd = extipiProd;
    }

    public Short getGtipiProd() {
        return gtipiProd;
    }

    public void setGtipiProd(Short gtipiProd) {
        this.gtipiProd = gtipiProd;
    }

    public Short getCstpisProd() {
        return cstpisProd;
    }

    public void setCstpisProd(Short cstpisProd) {
        this.cstpisProd = cstpisProd;
    }

    public Short getCstcofinsProd() {
        return cstcofinsProd;
    }

    public void setCstcofinsProd(Short cstcofinsProd) {
        this.cstcofinsProd = cstcofinsProd;
    }

    public String getTpaliqstpisProd() {
        return tpaliqstpisProd;
    }

    public void setTpaliqstpisProd(String tpaliqstpisProd) {
        this.tpaliqstpisProd = tpaliqstpisProd;
    }

    public String getTpaliqstcofinsProd() {
        return tpaliqstcofinsProd;
    }

    public void setTpaliqstcofinsProd(String tpaliqstcofinsProd) {
        this.tpaliqstcofinsProd = tpaliqstcofinsProd;
    }

    public Double getAliqstpisProd() {
        return aliqstpisProd;
    }

    public void setAliqstpisProd(Double aliqstpisProd) {
        this.aliqstpisProd = aliqstpisProd;
    }

    public Double getAliqstcofinsProd() {
        return aliqstcofinsProd;
    }

    public void setAliqstcofinsProd(Double aliqstcofinsProd) {
        this.aliqstcofinsProd = aliqstcofinsProd;
    }

    public Double getVratualProd() {
        return vratualProd;
    }

    public void setVratualProd(Double vratualProd) {
        this.vratualProd = vratualProd;
    }

    public Date getDtpostProd() {
        return dtpostProd;
    }

    public void setDtpostProd(Date dtpostProd) {
        this.dtpostProd = dtpostProd;
    }

    public Date getDtinsProd() {
        return dtinsProd;
    }

    public void setDtinsProd(Date dtinsProd) {
        this.dtinsProd = dtinsProd;
    }

    public String getTipilProd() {
        return tipilProd;
    }

    public void setTipilProd(String tipilProd) {
        this.tipilProd = tipilProd;
    }

    public Integer getEstqpcrProd() {
        return estqpcrProd;
    }

    public void setEstqpcrProd(Integer estqpcrProd) {
        this.estqpcrProd = estqpcrProd;
    }

    public Double getEstqunsdrProd() {
        return estqunsdrProd;
    }

    public void setEstqunsdrProd(Double estqunsdrProd) {
        this.estqunsdrProd = estqunsdrProd;
    }

    public Double getCusto1Prod() {
        return custo1Prod;
    }

    public void setCusto1Prod(Double custo1Prod) {
        this.custo1Prod = custo1Prod;
    }

    public Double getCusto2Prod() {
        return custo2Prod;
    }

    public void setCusto2Prod(Double custo2Prod) {
        this.custo2Prod = custo2Prod;
    }

    public Double getCusto3Prod() {
        return custo3Prod;
    }

    public void setCusto3Prod(Double custo3Prod) {
        this.custo3Prod = custo3Prod;
    }

    public Double getCusto4Prod() {
        return custo4Prod;
    }

    public void setCusto4Prod(Double custo4Prod) {
        this.custo4Prod = custo4Prod;
    }

    public Double getCusto5Prod() {
        return custo5Prod;
    }

    public void setCusto5Prod(Double custo5Prod) {
        this.custo5Prod = custo5Prod;
    }

    public Short getCsosnProd() {
        return csosnProd;
    }

    public void setCsosnProd(Short csosnProd) {
        this.csosnProd = csosnProd;
    }

    public Short getCodDocit() {
        return codDocit;
    }

    public void setCodDocit(Short codDocit) {
        this.codDocit = codDocit;
    }

    public Integer getChaveProd() {
        return chaveProd;
    }

    public void setChaveProd(Integer chaveProd) {
        this.chaveProd = chaveProd;
    }

    public Date getDtmovecfProd() {
        return dtmovecfProd;
    }

    public void setDtmovecfProd(Date dtmovecfProd) {
        this.dtmovecfProd = dtmovecfProd;
    }

    public Double getPbcinssProd() {
        return pbcinssProd;
    }

    public void setPbcinssProd(Double pbcinssProd) {
        this.pbcinssProd = pbcinssProd;
    }

    public Double getAliqinssProd() {
        return aliqinssProd;
    }

    public void setAliqinssProd(Double aliqinssProd) {
        this.aliqinssProd = aliqinssProd;
    }

    public Double getPbcirrfProd() {
        return pbcirrfProd;
    }

    public void setPbcirrfProd(Double pbcirrfProd) {
        this.pbcirrfProd = pbcirrfProd;
    }

    public Double getAliqirrfProd() {
        return aliqirrfProd;
    }

    public void setAliqirrfProd(Double aliqirrfProd) {
        this.aliqirrfProd = aliqirrfProd;
    }

    public Double getPbccsrfProd() {
        return pbccsrfProd;
    }

    public void setPbccsrfProd(Double pbccsrfProd) {
        this.pbccsrfProd = pbccsrfProd;
    }

    public Double getAliqcsrfProd() {
        return aliqcsrfProd;
    }

    public void setAliqcsrfProd(Double aliqcsrfProd) {
        this.aliqcsrfProd = aliqcsrfProd;
    }

    public Double getPbcoutrfProd() {
        return pbcoutrfProd;
    }

    public void setPbcoutrfProd(Double pbcoutrfProd) {
        this.pbcoutrfProd = pbcoutrfProd;
    }

    public Double getAliqoutrfProd() {
        return aliqoutrfProd;
    }

    public void setAliqoutrfProd(Double aliqoutrfProd) {
        this.aliqoutrfProd = aliqoutrfProd;
    }

    public Integer getChave2Prod() {
        return chave2Prod;
    }

    public void setChave2Prod(Integer chave2Prod) {
        this.chave2Prod = chave2Prod;
    }

    public Double getPrtabpProd() {
        return prtabpProd;
    }

    public void setPrtabpProd(Double prtabpProd) {
        this.prtabpProd = prtabpProd;
    }

    public Double getIndtabpProd() {
        return indtabpProd;
    }

    public void setIndtabpProd(Double indtabpProd) {
        this.indtabpProd = indtabpProd;
    }

    public String getLrcpeProd() {
        return lrcpeProd;
    }

    public void setLrcpeProd(String lrcpeProd) {
        this.lrcpeProd = lrcpeProd;
    }

    public String getGtinProd() {
        return gtinProd;
    }

    public void setGtinProd(String gtinProd) {
        this.gtinProd = gtinProd;
    }

    public String getGtintribProd() {
        return gtintribProd;
    }

    public void setGtintribProd(String gtintribProd) {
        this.gtintribProd = gtintribProd;
    }

    public Short getNatreccsProd() {
        return natreccsProd;
    }

    public void setNatreccsProd(Short natreccsProd) {
        this.natreccsProd = natreccsProd;
    }

    public String getCdipisProd() {
        return cdipisProd;
    }

    public void setCdipisProd(String cdipisProd) {
        this.cdipisProd = cdipisProd;
    }

    public String getCdrpisProd() {
        return cdrpisProd;
    }

    public void setCdrpisProd(String cdrpisProd) {
        this.cdrpisProd = cdrpisProd;
    }

    public String getCdicofinsProd() {
        return cdicofinsProd;
    }

    public void setCdicofinsProd(String cdicofinsProd) {
        this.cdicofinsProd = cdicofinsProd;
    }

    public String getCdrcofinsProd() {
        return cdrcofinsProd;
    }

    public void setCdrcofinsProd(String cdrcofinsProd) {
        this.cdrcofinsProd = cdrcofinsProd;
    }

    public Double getAliqicppisProd() {
        return aliqicppisProd;
    }

    public void setAliqicppisProd(Double aliqicppisProd) {
        this.aliqicppisProd = aliqicppisProd;
    }

    public Double getAliqrcppisProd() {
        return aliqrcppisProd;
    }

    public void setAliqrcppisProd(Double aliqrcppisProd) {
        this.aliqrcppisProd = aliqrcppisProd;
    }

    public Double getAliqicpcofinsProd() {
        return aliqicpcofinsProd;
    }

    public void setAliqicpcofinsProd(Double aliqicpcofinsProd) {
        this.aliqicpcofinsProd = aliqicpcofinsProd;
    }

    public Double getAliqrcpcofinsProd() {
        return aliqrcpcofinsProd;
    }

    public void setAliqrcpcofinsProd(Double aliqrcpcofinsProd) {
        this.aliqrcpcofinsProd = aliqrcpcofinsProd;
    }

    public String getEstqnegProd() {
        return estqnegProd;
    }

    public void setEstqnegProd(String estqnegProd) {
        this.estqnegProd = estqnegProd;
    }

    public Double getPrpticmsProd() {
        return prpticmsProd;
    }

    public void setPrpticmsProd(Double prpticmsProd) {
        this.prpticmsProd = prpticmsProd;
    }

    public String getFrcustoProd() {
        return frcustoProd;
    }

    public void setFrcustoProd(String frcustoProd) {
        this.frcustoProd = frcustoProd;
    }

    public String getCodifProd() {
        return codifProd;
    }

    public void setCodifProd(String codifProd) {
        this.codifProd = codifProd;
    }

    public String getCodanpProd() {
        return codanpProd;
    }

    public void setCodanpProd(String codanpProd) {
        this.codanpProd = codanpProd;
    }

    public Double getAliqcideProd() {
        return aliqcideProd;
    }

    public void setAliqcideProd(Double aliqcideProd) {
        this.aliqcideProd = aliqcideProd;
    }

    public Short getCodsfcGrp() {
        return codsfcGrp;
    }

    public void setCodsfcGrp(Short codsfcGrp) {
        this.codsfcGrp = codsfcGrp;
    }

    public Short getCodscGrp() {
        return codscGrp;
    }

    public void setCodscGrp(Short codscGrp) {
        this.codscGrp = codscGrp;
    }

    public Short getCodcCta() {
        return codcCta;
    }

    public void setCodcCta(Short codcCta) {
        this.codcCta = codcCta;
    }

    public Short getCodvCta() {
        return codvCta;
    }

    public void setCodvCta(Short codvCta) {
        this.codvCta = codvCta;
    }

    public Short getCodcCc() {
        return codcCc;
    }

    public void setCodcCc(Short codcCc) {
        this.codcCc = codcCc;
    }

    public Short getCodvCc() {
        return codvCc;
    }

    public void setCodvCc(Short codvCc) {
        this.codvCc = codvCc;
    }

    public Short getVidautilProd() {
        return vidautilProd;
    }

    public void setVidautilProd(Short vidautilProd) {
        this.vidautilProd = vidautilProd;
    }

    public String getSerieDoc() {
        return serieDoc;
    }

    public void setSerieDoc(String serieDoc) {
        this.serieDoc = serieDoc;
    }

    public Integer getCodfrtDoc() {
        return codfrtDoc;
    }

    public void setCodfrtDoc(Integer codfrtDoc) {
        this.codfrtDoc = codfrtDoc;
    }

    public String getMprtab1Prod() {
        return mprtab1Prod;
    }

    public void setMprtab1Prod(String mprtab1Prod) {
        this.mprtab1Prod = mprtab1Prod;
    }

    public String getMprtab2Prod() {
        return mprtab2Prod;
    }

    public void setMprtab2Prod(String mprtab2Prod) {
        this.mprtab2Prod = mprtab2Prod;
    }

    public String getMprtab3Prod() {
        return mprtab3Prod;
    }

    public void setMprtab3Prod(String mprtab3Prod) {
        this.mprtab3Prod = mprtab3Prod;
    }

    public String getRntrcProd() {
        return rntrcProd;
    }

    public void setRntrcProd(String rntrcProd) {
        this.rntrcProd = rntrcProd;
    }

    public String getBalProd() {
        return balProd;
    }

    public void setBalProd(String balProd) {
        this.balProd = balProd;
    }

    public Double getComptunsdProd() {
        return comptunsdProd;
    }

    public void setComptunsdProd(Double comptunsdProd) {
        this.comptunsdProd = comptunsdProd;
    }

    public Double getAltesptunsdProd() {
        return altesptunsdProd;
    }

    public void setAltesptunsdProd(Double altesptunsdProd) {
        this.altesptunsdProd = altesptunsdProd;
    }

    public Double getLargtunsdProd() {
        return largtunsdProd;
    }

    public void setLargtunsdProd(Double largtunsdProd) {
        this.largtunsdProd = largtunsdProd;
    }

    public Integer getCodMv() {
        return codMv;
    }

    public void setCodMv(Integer codMv) {
        this.codMv = codMv;
    }

    public Short getCodMvit() {
        return codMvit;
    }

    public void setCodMvit(Short codMvit) {
        this.codMvit = codMvit;
    }

    public Integer getCodsDoc() {
        return codsDoc;
    }

    public void setCodsDoc(Integer codsDoc) {
        this.codsDoc = codsDoc;
    }

    public Short getCodsDocit() {
        return codsDocit;
    }

    public void setCodsDocit(Short codsDocit) {
        this.codsDocit = codsDocit;
    }

    public String getCestProd() {
        return cestProd;
    }

    public void setCestProd(String cestProd) {
        this.cestProd = cestProd;
    }

    public Short getCenqipiProd() {
        return cenqipiProd;
    }

    public void setCenqipiProd(Short cenqipiProd) {
        this.cenqipiProd = cenqipiProd;
    }

    public Short getValidProd() {
        return validProd;
    }

    public void setValidProd(Short validProd) {
        this.validProd = validProd;
    }

    public Double getCompcunsdProd() {
        return compcunsdProd;
    }

    public void setCompcunsdProd(Double compcunsdProd) {
        this.compcunsdProd = compcunsdProd;
    }

    public Double getAltespcunsdProd() {
        return altespcunsdProd;
    }

    public void setAltespcunsdProd(Double altespcunsdProd) {
        this.altespcunsdProd = altespcunsdProd;
    }

    public Double getLargcunsdProd() {
        return largcunsdProd;
    }

    public void setLargcunsdProd(Double largcunsdProd) {
        this.largcunsdProd = largcunsdProd;
    }

    public Double getCompbcunsdProd() {
        return compbcunsdProd;
    }

    public void setCompbcunsdProd(Double compbcunsdProd) {
        this.compbcunsdProd = compbcunsdProd;
    }

    public Double getAltespbcunsdProd() {
        return altespbcunsdProd;
    }

    public void setAltespbcunsdProd(Double altespbcunsdProd) {
        this.altespbcunsdProd = altespbcunsdProd;
    }

    public Double getLargbcunsdProd() {
        return largbcunsdProd;
    }

    public void setLargbcunsdProd(Double largbcunsdProd) {
        this.largbcunsdProd = largbcunsdProd;
    }

    public Double getAliqfcpProd() {
        return aliqfcpProd;
    }

    public void setAliqfcpProd(Double aliqfcpProd) {
        this.aliqfcpProd = aliqfcpProd;
    }

    public String getDelProd() {
        return delProd;
    }

    public void setDelProd(String delProd) {
        this.delProd = delProd;
    }

    public Integer getIl1SitProd() {
        return il1SitProd;
    }

    public void setIl1SitProd(Integer il1SitProd) {
        this.il1SitProd = il1SitProd;
    }

    public Integer getIl2CodGrp() {
        return il2CodGrp;
    }

    public void setIl2CodGrp(Integer il2CodGrp) {
        this.il2CodGrp = il2CodGrp;
    }

    public Date getDtpolProd() {
        return dtpolProd;
    }

    public void setDtpolProd(Date dtpolProd) {
        this.dtpolProd = dtpolProd;
    }

    public Integer getCodJzd() {
        return codJzd;
    }

    public void setCodJzd(Integer codJzd) {
        this.codJzd = codJzd;
    }

    public String getUntrbProd() {
        return untrbProd;
    }

    public void setUntrbProd(String untrbProd) {
        this.untrbProd = untrbProd;
    }

    public Double getConvtrbProd() {
        return convtrbProd;
    }

    public void setConvtrbProd(Double convtrbProd) {
        this.convtrbProd = convtrbProd;
    }

    public Double getQtdepdcProd() {
        return qtdepdcProd;
    }

    public void setQtdepdcProd(Double qtdepdcProd) {
        this.qtdepdcProd = qtdepdcProd;
    }

    public Double getCcompraorigProd() {
        return ccompraorigProd;
    }

    public void setCcompraorigProd(Double ccompraorigProd) {
        this.ccompraorigProd = ccompraorigProd;
    }

    public Date getDtinipromoProd() {
        return dtinipromoProd;
    }

    public void setDtinipromoProd(Date dtinipromoProd) {
        this.dtinipromoProd = dtinipromoProd;
    }

    public Date getDtfimpromoProd() {
        return dtfimpromoProd;
    }

    public void setDtfimpromoProd(Date dtfimpromoProd) {
        this.dtfimpromoProd = dtfimpromoProd;
    }

    public String getTipi2Prod() {
        return tipi2Prod;
    }

    public void setTipi2Prod(String tipi2Prod) {
        this.tipi2Prod = tipi2Prod;
    }

    public Short getCstipiProd() {
        return cstipiProd;
    }

    public void setCstipiProd(Short cstipiProd) {
        this.cstipiProd = cstipiProd;
    }

    public Double getEstqunsdptProd() {
        return estqunsdptProd;
    }

    public void setEstqunsdptProd(Double estqunsdptProd) {
        this.estqunsdptProd = estqunsdptProd;
    }

    public Integer getMastEstq() {
        return mastEstq;
    }

    public void setMastEstq(Integer mastEstq) {
        this.mastEstq = mastEstq;
    }

    public Double getCtrfDoc() {
        return ctrfDoc;
    }

    public void setCtrfDoc(Double ctrfDoc) {
        this.ctrfDoc = ctrfDoc;
    }

    public Grp getCodGrp() {
        return codGrp;
    }

    public void setCodGrp(Grp codGrp) {
        this.codGrp = codGrp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEstq != null ? codEstq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prod)) {
            return false;
        }
        Prod other = (Prod) object;
        if ((this.codEstq == null && other.codEstq != null) || (this.codEstq != null && !this.codEstq.equals(other.codEstq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Prod[ codEstq=" + codEstq + " ]";
    }

}
