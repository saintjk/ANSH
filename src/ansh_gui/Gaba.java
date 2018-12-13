/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ansh_gui;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lab
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gaba.findAll", query = "SELECT g FROM Gaba g")
    , @NamedQuery(name = "Gaba.findByLookup", query = "SELECT g FROM Gaba g WHERE g.lookup = :lookup")
    , @NamedQuery(name = "Gaba.findByStatusRC", query = "SELECT g FROM Gaba g WHERE g.statusRC = :statusRC")})
public class Gaba implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer lookup;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String dos;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String subjectId;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String rfc;
    @Basic(optional = false)
    @Lob
    @Column(name = "Status_RFC", nullable = false, length = 65535)
    private String statusRFC;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String lfc;
    @Basic(optional = false)
    @Lob
    @Column(name = "Status_LFC", nullable = false, length = 65535)
    private String statusLFC;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String rh;
    @Basic(optional = false)
    @Lob
    @Column(name = "Status_RH", nullable = false, length = 65535)
    private String statusRH;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String lh;
    @Basic(optional = false)
    @Lob
    @Column(name = "Status_LH", nullable = false, length = 65535)
    private String statusLH;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String rpc;
    @Basic(optional = false)
    @Lob
    @Column(name = "Status_RPC", nullable = false, length = 65535)
    private String statusRPC;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String lpc;
    @Basic(optional = false)
    @Lob
    @Column(name = "Status_LPC", nullable = false, length = 65535)
    private String statusLPC;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String rvc;
    @Basic(optional = false)
    @Lob
    @Column(name = "Status_RVC", nullable = false, length = 65535)
    private String statusRVC;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String lvc;
    @Basic(optional = false)
    @Lob
    @Column(name = "Status_LVC", nullable = false, length = 65535)
    private String statusLVC;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String rc;
    @Basic(optional = false)
    @Column(name = "Status_RC", nullable = false)
    private int statusRC;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String lc;
    @Basic(optional = false)
    @Lob
    @Column(name = "Status_LC", nullable = false, length = 65535)
    private String statusLC;
    @Basic(optional = false)
    @Lob
    @Column(name = "3D", nullable = false, length = 65535)
    private String d;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false, length = 65535)
    private String comment;

    public Gaba() {
    }

    public Gaba(Integer lookup) {
        this.lookup = lookup;
    }

    public Gaba(Integer lookup, String dos, String subjectId, String rfc, String statusRFC, String lfc, String statusLFC, String rh, String statusRH, String lh, String statusLH, String rpc, String statusRPC, String lpc, String statusLPC, String rvc, String statusRVC, String lvc, String statusLVC, String rc, int statusRC, String lc, String statusLC, String d, String comment) {
        this.lookup = lookup;
        this.dos = dos;
        this.subjectId = subjectId;
        this.rfc = rfc;
        this.statusRFC = statusRFC;
        this.lfc = lfc;
        this.statusLFC = statusLFC;
        this.rh = rh;
        this.statusRH = statusRH;
        this.lh = lh;
        this.statusLH = statusLH;
        this.rpc = rpc;
        this.statusRPC = statusRPC;
        this.lpc = lpc;
        this.statusLPC = statusLPC;
        this.rvc = rvc;
        this.statusRVC = statusRVC;
        this.lvc = lvc;
        this.statusLVC = statusLVC;
        this.rc = rc;
        this.statusRC = statusRC;
        this.lc = lc;
        this.statusLC = statusLC;
        this.d = d;
        this.comment = comment;
    }

    public Integer getLookup() {
        return lookup;
    }

    public void setLookup(Integer lookup) {
        this.lookup = lookup;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getStatusRFC() {
        return statusRFC;
    }

    public void setStatusRFC(String statusRFC) {
        this.statusRFC = statusRFC;
    }

    public String getLfc() {
        return lfc;
    }

    public void setLfc(String lfc) {
        this.lfc = lfc;
    }

    public String getStatusLFC() {
        return statusLFC;
    }

    public void setStatusLFC(String statusLFC) {
        this.statusLFC = statusLFC;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getStatusRH() {
        return statusRH;
    }

    public void setStatusRH(String statusRH) {
        this.statusRH = statusRH;
    }

    public String getLh() {
        return lh;
    }

    public void setLh(String lh) {
        this.lh = lh;
    }

    public String getStatusLH() {
        return statusLH;
    }

    public void setStatusLH(String statusLH) {
        this.statusLH = statusLH;
    }

    public String getRpc() {
        return rpc;
    }

    public void setRpc(String rpc) {
        this.rpc = rpc;
    }

    public String getStatusRPC() {
        return statusRPC;
    }

    public void setStatusRPC(String statusRPC) {
        this.statusRPC = statusRPC;
    }

    public String getLpc() {
        return lpc;
    }

    public void setLpc(String lpc) {
        this.lpc = lpc;
    }

    public String getStatusLPC() {
        return statusLPC;
    }

    public void setStatusLPC(String statusLPC) {
        this.statusLPC = statusLPC;
    }

    public String getRvc() {
        return rvc;
    }

    public void setRvc(String rvc) {
        this.rvc = rvc;
    }

    public String getStatusRVC() {
        return statusRVC;
    }

    public void setStatusRVC(String statusRVC) {
        this.statusRVC = statusRVC;
    }

    public String getLvc() {
        return lvc;
    }

    public void setLvc(String lvc) {
        this.lvc = lvc;
    }

    public String getStatusLVC() {
        return statusLVC;
    }

    public void setStatusLVC(String statusLVC) {
        this.statusLVC = statusLVC;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public int getStatusRC() {
        return statusRC;
    }

    public void setStatusRC(int statusRC) {
        this.statusRC = statusRC;
    }

    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    public String getStatusLC() {
        return statusLC;
    }

    public void setStatusLC(String statusLC) {
        this.statusLC = statusLC;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lookup != null ? lookup.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gaba)) {
            return false;
        }
        Gaba other = (Gaba) object;
        if ((this.lookup == null && other.lookup != null) || (this.lookup != null && !this.lookup.equals(other.lookup))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ansh_gui.Gaba[ lookup=" + lookup + " ]";
    }
    
}
