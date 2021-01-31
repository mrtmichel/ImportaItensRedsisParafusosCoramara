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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mrtmi
 */
@Embeddable
public class InventPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "DTINV_PROD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtinvProd;
    @Basic(optional = false)
    @Column(name = "COD_ESTQ")
    private int codEstq;
    @Basic(optional = false)
    @Column(name = "CODPOSSE_PROD")
    private String codposseProd;
    @Basic(optional = false)
    @Column(name = "CODTERC_PESS")
    private int codtercPess;

    public InventPK() {
    }

    public InventPK(Date dtinvProd, int codEstq, String codposseProd, int codtercPess) {
        this.dtinvProd = dtinvProd;
        this.codEstq = codEstq;
        this.codposseProd = codposseProd;
        this.codtercPess = codtercPess;
    }

    public Date getDtinvProd() {
        return dtinvProd;
    }

    public void setDtinvProd(Date dtinvProd) {
        this.dtinvProd = dtinvProd;
    }

    public int getCodEstq() {
        return codEstq;
    }

    public void setCodEstq(int codEstq) {
        this.codEstq = codEstq;
    }

    public String getCodposseProd() {
        return codposseProd;
    }

    public void setCodposseProd(String codposseProd) {
        this.codposseProd = codposseProd;
    }

    public int getCodtercPess() {
        return codtercPess;
    }

    public void setCodtercPess(int codtercPess) {
        this.codtercPess = codtercPess;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtinvProd != null ? dtinvProd.hashCode() : 0);
        hash += (int) codEstq;
        hash += (codposseProd != null ? codposseProd.hashCode() : 0);
        hash += (int) codtercPess;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventPK)) {
            return false;
        }
        InventPK other = (InventPK) object;
        if ((this.dtinvProd == null && other.dtinvProd != null) || (this.dtinvProd != null && !this.dtinvProd.equals(other.dtinvProd))) {
            return false;
        }
        if (this.codEstq != other.codEstq) {
            return false;
        }
        if ((this.codposseProd == null && other.codposseProd != null) || (this.codposseProd != null && !this.codposseProd.equals(other.codposseProd))) {
            return false;
        }
        if (this.codtercPess != other.codtercPess) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.InventPK[ dtinvProd=" + dtinvProd + ", codEstq=" + codEstq + ", codposseProd=" + codposseProd + ", codtercPess=" + codtercPess + " ]";
    }

}
