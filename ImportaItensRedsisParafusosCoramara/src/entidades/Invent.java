/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "INVENT")
@NamedQueries({
    @NamedQuery(name = "Invent.findAll", query = "SELECT i FROM Invent i")})
public class Invent implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InventPK inventPK;
    @Column(name = "COD_ESTAB")
    private Short codEstab;
    @Column(name = "CODBAR_PROD")
    private String codbarProd;
    @Column(name = "NOM_PROD")
    private String nomProd;
    @Column(name = "COD_MA")
    private Integer codMa;
    @Column(name = "UNSD_PROD")
    private String unsdProd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ESTQANT_PROD")
    private Double estqantProd;
    @Column(name = "QTDEE_PROD")
    private Double qtdeeProd;
    @Column(name = "QTDES_PROD")
    private Double qtdesProd;
    @Column(name = "COD_GRP")
    private Short codGrp;
    @Column(name = "NOMTERC_PESS")
    private String nomtercPess;
    @Column(name = "ESTQUNSD_PROD")
    private Double estqunsdProd;
    @Column(name = "CUSUNMED_PROD")
    private Double cusunmedProd;
    @Column(name = "PRVENDA_PROD")
    private Double prvendaProd;
    @Column(name = "PRTRF_PROD")
    private Double prtrfProd;
    @Column(name = "ESTQPC_PROD")
    private Integer estqpcProd;
    @Column(name = "ALIQIPI_PROD")
    private Double aliqipiProd;
    @Column(name = "ALIQICMS_PROD")
    private Double aliqicmsProd;
    @Column(name = "FLAGBCICMS_PROD")
    private String flagbcicmsProd;
    @Column(name = "REDBCICMS_PROD")
    private Double redbcicmsProd;
    @Column(name = "MARGBCICMSR_PROD")
    private Double margbcicmsrProd;
    @Column(name = "ALIQECF_PROD")
    private String aliqecfProd;
    @Column(name = "CST_PROD")
    private Short cstProd;
    @Column(name = "IDIPI_PROD")
    private Short idipiProd;
    @Column(name = "IDICMS_PROD")
    private Short idicmsProd;
    @Column(name = "NAT_ESTQ")
    private String natEstq;
    @Column(name = "PRINTINV_PROD")
    private String printinvProd;
    @Column(name = "DTINVANT_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtinvantProd;
    @Column(name = "TOTALINV_PROD")
    private Double totalinvProd;
    @Column(name = "CUSTOFAB_PROD")
    private Double custofabProd;
    @Column(name = "CUSTOLJ_PROD")
    private Double custoljProd;
    @Column(name = "CUSTOFBFX_PROD")
    private Double custofbfxProd;
    @Column(name = "ICMSINV_PROD")
    private Double icmsinvProd;
    @Column(name = "IPIINV_PROD")
    private Double ipiinvProd;
    @Column(name = "TIPOPRECO_INV")
    private Short tipoprecoInv;
    @Column(name = "INDCICMS_INV")
    private Double indcicmsInv;
    @Column(name = "INDCIPI_INV")
    private Double indcipiInv;
    @Column(name = "ESTQTC_INV")
    private String estqtcInv;
    @Column(name = "CNPJCPFTERC_PESS")
    private String cnpjcpftercPess;
    @Column(name = "ESTQTC_PROD")
    private Double estqtcProd;
    @Column(name = "OBS_INV")
    private String obsInv;
    @Column(name = "CONTFIS_INV")
    private String contfisInv;
    @Column(name = "COMPLQUNSD_PROD")
    private Double complqunsdProd;
    @Column(name = "LARGLQUNSD_PROD")
    private Double larglqunsdProd;
    @Column(name = "ALTESPLQUNSD_PROD")
    private Double altesplqunsdProd;
    @Column(name = "TIPI_PROD")
    private String tipiProd;
    @Column(name = "NOM_GRP")
    private String nomGrp;
    @Column(name = "PIS_INV")
    private Double pisInv;
    @Column(name = "COFINS_INV")
    private Double cofinsInv;
    @Column(name = "DEL_INV")
    private String delInv;
    @Column(name = "DTFIN_INV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtfinInv;
    @Column(name = "ESTQUNSDF_PROD")
    private Double estqunsdfProd;
    @Column(name = "LANCTO_INV")
    private String lanctoInv;

    public Invent() {
    }

    public Invent(InventPK inventPK) {
        this.inventPK = inventPK;
    }

    public Invent(Date dtinvProd, int codEstq, String codposseProd, int codtercPess) {
        this.inventPK = new InventPK(dtinvProd, codEstq, codposseProd, codtercPess);
    }

    public InventPK getInventPK() {
        return inventPK;
    }

    public void setInventPK(InventPK inventPK) {
        this.inventPK = inventPK;
    }

    public Short getCodEstab() {
        return codEstab;
    }

    public void setCodEstab(Short codEstab) {
        this.codEstab = codEstab;
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

    public Integer getCodMa() {
        return codMa;
    }

    public void setCodMa(Integer codMa) {
        this.codMa = codMa;
    }

    public String getUnsdProd() {
        return unsdProd;
    }

    public void setUnsdProd(String unsdProd) {
        this.unsdProd = unsdProd;
    }

    public Double getEstqantProd() {
        return estqantProd;
    }

    public void setEstqantProd(Double estqantProd) {
        this.estqantProd = estqantProd;
    }

    public Double getQtdeeProd() {
        return qtdeeProd;
    }

    public void setQtdeeProd(Double qtdeeProd) {
        this.qtdeeProd = qtdeeProd;
    }

    public Double getQtdesProd() {
        return qtdesProd;
    }

    public void setQtdesProd(Double qtdesProd) {
        this.qtdesProd = qtdesProd;
    }

    public Short getCodGrp() {
        return codGrp;
    }

    public void setCodGrp(Short codGrp) {
        this.codGrp = codGrp;
    }

    public String getNomtercPess() {
        return nomtercPess;
    }

    public void setNomtercPess(String nomtercPess) {
        this.nomtercPess = nomtercPess;
    }

    public Double getEstqunsdProd() {
        return estqunsdProd;
    }

    public void setEstqunsdProd(Double estqunsdProd) {
        this.estqunsdProd = estqunsdProd;
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

    public Double getPrtrfProd() {
        return prtrfProd;
    }

    public void setPrtrfProd(Double prtrfProd) {
        this.prtrfProd = prtrfProd;
    }

    public Integer getEstqpcProd() {
        return estqpcProd;
    }

    public void setEstqpcProd(Integer estqpcProd) {
        this.estqpcProd = estqpcProd;
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

    public String getFlagbcicmsProd() {
        return flagbcicmsProd;
    }

    public void setFlagbcicmsProd(String flagbcicmsProd) {
        this.flagbcicmsProd = flagbcicmsProd;
    }

    public Double getRedbcicmsProd() {
        return redbcicmsProd;
    }

    public void setRedbcicmsProd(Double redbcicmsProd) {
        this.redbcicmsProd = redbcicmsProd;
    }

    public Double getMargbcicmsrProd() {
        return margbcicmsrProd;
    }

    public void setMargbcicmsrProd(Double margbcicmsrProd) {
        this.margbcicmsrProd = margbcicmsrProd;
    }

    public String getAliqecfProd() {
        return aliqecfProd;
    }

    public void setAliqecfProd(String aliqecfProd) {
        this.aliqecfProd = aliqecfProd;
    }

    public Short getCstProd() {
        return cstProd;
    }

    public void setCstProd(Short cstProd) {
        this.cstProd = cstProd;
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

    public String getNatEstq() {
        return natEstq;
    }

    public void setNatEstq(String natEstq) {
        this.natEstq = natEstq;
    }

    public String getPrintinvProd() {
        return printinvProd;
    }

    public void setPrintinvProd(String printinvProd) {
        this.printinvProd = printinvProd;
    }

    public Date getDtinvantProd() {
        return dtinvantProd;
    }

    public void setDtinvantProd(Date dtinvantProd) {
        this.dtinvantProd = dtinvantProd;
    }

    public Double getTotalinvProd() {
        return totalinvProd;
    }

    public void setTotalinvProd(Double totalinvProd) {
        this.totalinvProd = totalinvProd;
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

    public Double getCustofbfxProd() {
        return custofbfxProd;
    }

    public void setCustofbfxProd(Double custofbfxProd) {
        this.custofbfxProd = custofbfxProd;
    }

    public Double getIcmsinvProd() {
        return icmsinvProd;
    }

    public void setIcmsinvProd(Double icmsinvProd) {
        this.icmsinvProd = icmsinvProd;
    }

    public Double getIpiinvProd() {
        return ipiinvProd;
    }

    public void setIpiinvProd(Double ipiinvProd) {
        this.ipiinvProd = ipiinvProd;
    }

    public Short getTipoprecoInv() {
        return tipoprecoInv;
    }

    public void setTipoprecoInv(Short tipoprecoInv) {
        this.tipoprecoInv = tipoprecoInv;
    }

    public Double getIndcicmsInv() {
        return indcicmsInv;
    }

    public void setIndcicmsInv(Double indcicmsInv) {
        this.indcicmsInv = indcicmsInv;
    }

    public Double getIndcipiInv() {
        return indcipiInv;
    }

    public void setIndcipiInv(Double indcipiInv) {
        this.indcipiInv = indcipiInv;
    }

    public String getEstqtcInv() {
        return estqtcInv;
    }

    public void setEstqtcInv(String estqtcInv) {
        this.estqtcInv = estqtcInv;
    }

    public String getCnpjcpftercPess() {
        return cnpjcpftercPess;
    }

    public void setCnpjcpftercPess(String cnpjcpftercPess) {
        this.cnpjcpftercPess = cnpjcpftercPess;
    }

    public Double getEstqtcProd() {
        return estqtcProd;
    }

    public void setEstqtcProd(Double estqtcProd) {
        this.estqtcProd = estqtcProd;
    }

    public String getObsInv() {
        return obsInv;
    }

    public void setObsInv(String obsInv) {
        this.obsInv = obsInv;
    }

    public String getContfisInv() {
        return contfisInv;
    }

    public void setContfisInv(String contfisInv) {
        this.contfisInv = contfisInv;
    }

    public Double getComplqunsdProd() {
        return complqunsdProd;
    }

    public void setComplqunsdProd(Double complqunsdProd) {
        this.complqunsdProd = complqunsdProd;
    }

    public Double getLarglqunsdProd() {
        return larglqunsdProd;
    }

    public void setLarglqunsdProd(Double larglqunsdProd) {
        this.larglqunsdProd = larglqunsdProd;
    }

    public Double getAltesplqunsdProd() {
        return altesplqunsdProd;
    }

    public void setAltesplqunsdProd(Double altesplqunsdProd) {
        this.altesplqunsdProd = altesplqunsdProd;
    }

    public String getTipiProd() {
        return tipiProd;
    }

    public void setTipiProd(String tipiProd) {
        this.tipiProd = tipiProd;
    }

    public String getNomGrp() {
        return nomGrp;
    }

    public void setNomGrp(String nomGrp) {
        this.nomGrp = nomGrp;
    }

    public Double getPisInv() {
        return pisInv;
    }

    public void setPisInv(Double pisInv) {
        this.pisInv = pisInv;
    }

    public Double getCofinsInv() {
        return cofinsInv;
    }

    public void setCofinsInv(Double cofinsInv) {
        this.cofinsInv = cofinsInv;
    }

    public String getDelInv() {
        return delInv;
    }

    public void setDelInv(String delInv) {
        this.delInv = delInv;
    }

    public Date getDtfinInv() {
        return dtfinInv;
    }

    public void setDtfinInv(Date dtfinInv) {
        this.dtfinInv = dtfinInv;
    }

    public Double getEstqunsdfProd() {
        return estqunsdfProd;
    }

    public void setEstqunsdfProd(Double estqunsdfProd) {
        this.estqunsdfProd = estqunsdfProd;
    }

    public String getLanctoInv() {
        return lanctoInv;
    }

    public void setLanctoInv(String lanctoInv) {
        this.lanctoInv = lanctoInv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventPK != null ? inventPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invent)) {
            return false;
        }
        Invent other = (Invent) object;
        if ((this.inventPK == null && other.inventPK != null) || (this.inventPK != null && !this.inventPK.equals(other.inventPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Invent[ inventPK=" + inventPK + " ]";
    }

}
