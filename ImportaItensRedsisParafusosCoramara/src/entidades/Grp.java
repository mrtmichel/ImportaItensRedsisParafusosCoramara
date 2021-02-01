/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author mrtmi
 */
@Entity
@Table(name = "GRP")
@NamedQueries({
    @NamedQuery(name = "Grp.findAll", query = "SELECT g FROM Grp g")})
public class Grp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_GRP")
    private Short codGrp;
    @Column(name = "NOM_GRP")
    private String nomGrp;
    @Column(name = "NOM2_GRP")
    private String nom2Grp;
    @Column(name = "UNSDPD_GRP")
    private String unsdpdGrp;
    @Column(name = "UNMDPD_GRP")
    private String unmdpdGrp;
    @Column(name = "CALCESTQ_GRP")
    private String calcestqGrp;
    @Column(name = "VERSAO_SYS")
    private String versaoSys;
    @Column(name = "CODKEY_ESTQ")
    private String codkeyEstq;
    @Lob
    @Column(name = "DESEN_GRP")
    private byte[] desenGrp;
    @Column(name = "TIT_GRP")
    private String titGrp;
    @Column(name = "CODE_CTA")
    private Short codeCta;
    @Column(name = "NOME_CTA")
    private String nomeCta;
    @Column(name = "CODS_CTA")
    private Short codsCta;
    @Column(name = "NOMS_CTA")
    private String nomsCta;
    @Column(name = "INVENT_GRP")
    private String inventGrp;
    @Column(name = "CLASSE_GRP")
    private Short classeGrp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DIFMED_GRP")
    private Double difmedGrp;
    @Column(name = "OBS_GRP")
    private String obsGrp;
    @Column(name = "CLTRIB_GRP")
    private String cltribGrp;
    @Column(name = "BALCAO_GRP")
    private String balcaoGrp;
    @Column(name = "DESCAD_GRP")
    private String descadGrp;
    @Column(name = "CLASSECTB_GRP")
    private String classectbGrp;
    @Column(name = "CONTRL_GRP")
    private String contrlGrp;
    @Column(name = "GRADEL_GRP")
    private String gradelGrp;
    @Column(name = "GRADEC_GRP")
    private String gradecGrp;
    @Column(name = "SPED_GRP")
    private String spedGrp;
    @Column(name = "CODSREF_GRP")
    private String codsrefGrp;
    @Column(name = "PC_GRP")
    private String pcGrp;
    @Column(name = "PRODAG_GRP")
    private String prodagGrp;
    @Column(name = "CODCTB_CTA")
    private String codctbCta;
    @Column(name = "DEL_GRP")
    private String delGrp;
    @Column(name = "INTCFOP_GRP")
    private String intcfopGrp;
    @Column(name = "CODANP_GRP")
    private String codanpGrp;
    @Column(name = "DESCANP_GRP")
    private String descanpGrp;
    @OneToMany(mappedBy = "codGrp")
    private List<Prod> prodList;

    public Grp() {
    }

    public Grp(Short codGrp) {
        this.codGrp = codGrp;
    }

    public Short getCodGrp() {
        return codGrp;
    }

    public void setCodGrp(Short codGrp) {
        this.codGrp = codGrp;
    }

    public String getNomGrp() {
        return nomGrp;
    }

    public void setNomGrp(String nomGrp) {
        this.nomGrp = nomGrp;
    }

    public String getNom2Grp() {
        return nom2Grp;
    }

    public void setNom2Grp(String nom2Grp) {
        this.nom2Grp = nom2Grp;
    }

    public String getUnsdpdGrp() {
        return unsdpdGrp;
    }

    public void setUnsdpdGrp(String unsdpdGrp) {
        this.unsdpdGrp = unsdpdGrp;
    }

    public String getUnmdpdGrp() {
        return unmdpdGrp;
    }

    public void setUnmdpdGrp(String unmdpdGrp) {
        this.unmdpdGrp = unmdpdGrp;
    }

    public String getCalcestqGrp() {
        return calcestqGrp;
    }

    public void setCalcestqGrp(String calcestqGrp) {
        this.calcestqGrp = calcestqGrp;
    }

    public String getVersaoSys() {
        return versaoSys;
    }

    public void setVersaoSys(String versaoSys) {
        this.versaoSys = versaoSys;
    }

    public String getCodkeyEstq() {
        return codkeyEstq;
    }

    public void setCodkeyEstq(String codkeyEstq) {
        this.codkeyEstq = codkeyEstq;
    }

    public byte[] getDesenGrp() {
        return desenGrp;
    }

    public void setDesenGrp(byte[] desenGrp) {
        this.desenGrp = desenGrp;
    }

    public String getTitGrp() {
        return titGrp;
    }

    public void setTitGrp(String titGrp) {
        this.titGrp = titGrp;
    }

    public Short getCodeCta() {
        return codeCta;
    }

    public void setCodeCta(Short codeCta) {
        this.codeCta = codeCta;
    }

    public String getNomeCta() {
        return nomeCta;
    }

    public void setNomeCta(String nomeCta) {
        this.nomeCta = nomeCta;
    }

    public Short getCodsCta() {
        return codsCta;
    }

    public void setCodsCta(Short codsCta) {
        this.codsCta = codsCta;
    }

    public String getNomsCta() {
        return nomsCta;
    }

    public void setNomsCta(String nomsCta) {
        this.nomsCta = nomsCta;
    }

    public String getInventGrp() {
        return inventGrp;
    }

    public void setInventGrp(String inventGrp) {
        this.inventGrp = inventGrp;
    }

    public Short getClasseGrp() {
        return classeGrp;
    }

    public void setClasseGrp(Short classeGrp) {
        this.classeGrp = classeGrp;
    }

    public Double getDifmedGrp() {
        return difmedGrp;
    }

    public void setDifmedGrp(Double difmedGrp) {
        this.difmedGrp = difmedGrp;
    }

    public String getObsGrp() {
        return obsGrp;
    }

    public void setObsGrp(String obsGrp) {
        this.obsGrp = obsGrp;
    }

    public String getCltribGrp() {
        return cltribGrp;
    }

    public void setCltribGrp(String cltribGrp) {
        this.cltribGrp = cltribGrp;
    }

    public String getBalcaoGrp() {
        return balcaoGrp;
    }

    public void setBalcaoGrp(String balcaoGrp) {
        this.balcaoGrp = balcaoGrp;
    }

    public String getDescadGrp() {
        return descadGrp;
    }

    public void setDescadGrp(String descadGrp) {
        this.descadGrp = descadGrp;
    }

    public String getClassectbGrp() {
        return classectbGrp;
    }

    public void setClassectbGrp(String classectbGrp) {
        this.classectbGrp = classectbGrp;
    }

    public String getContrlGrp() {
        return contrlGrp;
    }

    public void setContrlGrp(String contrlGrp) {
        this.contrlGrp = contrlGrp;
    }

    public String getGradelGrp() {
        return gradelGrp;
    }

    public void setGradelGrp(String gradelGrp) {
        this.gradelGrp = gradelGrp;
    }

    public String getGradecGrp() {
        return gradecGrp;
    }

    public void setGradecGrp(String gradecGrp) {
        this.gradecGrp = gradecGrp;
    }

    public String getSpedGrp() {
        return spedGrp;
    }

    public void setSpedGrp(String spedGrp) {
        this.spedGrp = spedGrp;
    }

    public String getCodsrefGrp() {
        return codsrefGrp;
    }

    public void setCodsrefGrp(String codsrefGrp) {
        this.codsrefGrp = codsrefGrp;
    }

    public String getPcGrp() {
        return pcGrp;
    }

    public void setPcGrp(String pcGrp) {
        this.pcGrp = pcGrp;
    }

    public String getProdagGrp() {
        return prodagGrp;
    }

    public void setProdagGrp(String prodagGrp) {
        this.prodagGrp = prodagGrp;
    }

    public String getCodctbCta() {
        return codctbCta;
    }

    public void setCodctbCta(String codctbCta) {
        this.codctbCta = codctbCta;
    }

    public String getDelGrp() {
        return delGrp;
    }

    public void setDelGrp(String delGrp) {
        this.delGrp = delGrp;
    }

    public String getIntcfopGrp() {
        return intcfopGrp;
    }

    public void setIntcfopGrp(String intcfopGrp) {
        this.intcfopGrp = intcfopGrp;
    }

    public String getCodanpGrp() {
        return codanpGrp;
    }

    public void setCodanpGrp(String codanpGrp) {
        this.codanpGrp = codanpGrp;
    }

    public String getDescanpGrp() {
        return descanpGrp;
    }

    public void setDescanpGrp(String descanpGrp) {
        this.descanpGrp = descanpGrp;
    }

    public List<Prod> getProdList() {
        return prodList;
    }

    public void setProdList(List<Prod> prodList) {
        this.prodList = prodList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codGrp != null ? codGrp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grp)) {
            return false;
        }
        Grp other = (Grp) object;
        if ((this.codGrp == null && other.codGrp != null) || (this.codGrp != null && !this.codGrp.equals(other.codGrp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Grp[ codGrp=" + codGrp + " ]";
    }

}
