/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author lab
 */
@Entity
@Table(name = "Clinical_data", catalog = "ANSH", schema = "")
@NamedQueries({
    @NamedQuery(name = "Clinicaldata.findAll", query = "SELECT c FROM Clinicaldata c")
    , @NamedQuery(name = "Clinicaldata.findBySubjectId", query = "SELECT c FROM Clinicaldata c WHERE c.subjectId = :subjectId")
    , @NamedQuery(name = "Clinicaldata.findByClinicalstatus", query = "SELECT c FROM Clinicaldata c WHERE c.clinicalstatus = :clinicalstatus")
    , @NamedQuery(name = "Clinicaldata.findByPrescriptionavlbl", query = "SELECT c FROM Clinicaldata c WHERE c.prescriptionavlbl = :prescriptionavlbl")
    , @NamedQuery(name = "Clinicaldata.findByMRIreportavailable", query = "SELECT c FROM Clinicaldata c WHERE c.mRIreportavailable = :mRIreportavailable")})
public class Clinicaldata implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SubjectId")
    private String subjectId;
    @Basic(optional = false)
    @Lob
    @Column(name = "DOS")
    private String dos;
    @Basic(optional = false)
    @Lob
    @Column(name = "Prescription_date")
    private String prescriptiondate;
    @Basic(optional = false)
    @Column(name = "Clinical_status")
    private boolean clinicalstatus;
    @Basic(optional = false)
    @Lob
    @Column(name = "Clinical_research")
    private String clinicalresearch;
    @Basic(optional = false)
    @Column(name = "Prescription_avlbl")
    private boolean prescriptionavlbl;
    @Basic(optional = false)
    @Lob
    @Column(name = "MRI_report_status")
    private String mRIreportstatus;
    @Basic(optional = false)
    @Column(name = "MRI_report_available")
    private boolean mRIreportavailable;
    @Basic(optional = false)
    @Lob
    @Column(name = "Comment")
    private String comment;
    @Basic(optional = false)
    @Lob
    @Column(name = "Remarks")
    private String remarks;

    public Clinicaldata() {
    }

    public Clinicaldata(String subjectId) {
        this.subjectId = subjectId;
    }

    public Clinicaldata(String subjectId, String dos, String prescriptiondate, boolean clinicalstatus, String clinicalresearch, boolean prescriptionavlbl, String mRIreportstatus, boolean mRIreportavailable, String comment, String remarks) {
        this.subjectId = subjectId;
        this.dos = dos;
        this.prescriptiondate = prescriptiondate;
        this.clinicalstatus = clinicalstatus;
        this.clinicalresearch = clinicalresearch;
        this.prescriptionavlbl = prescriptionavlbl;
        this.mRIreportstatus = mRIreportstatus;
        this.mRIreportavailable = mRIreportavailable;
        this.comment = comment;
        this.remarks = remarks;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        String oldSubjectId = this.subjectId;
        this.subjectId = subjectId;
        changeSupport.firePropertyChange("subjectId", oldSubjectId, subjectId);
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        String oldDos = this.dos;
        this.dos = dos;
        changeSupport.firePropertyChange("dos", oldDos, dos);
    }

    public String getPrescriptiondate() {
        return prescriptiondate;
    }

    public void setPrescriptiondate(String prescriptiondate) {
        String oldPrescriptiondate = this.prescriptiondate;
        this.prescriptiondate = prescriptiondate;
        changeSupport.firePropertyChange("prescriptiondate", oldPrescriptiondate, prescriptiondate);
    }

    public boolean getClinicalstatus() {
        return clinicalstatus;
    }

    public void setClinicalstatus(boolean clinicalstatus) {
        boolean oldClinicalstatus = this.clinicalstatus;
        this.clinicalstatus = clinicalstatus;
        changeSupport.firePropertyChange("clinicalstatus", oldClinicalstatus, clinicalstatus);
    }

    public String getClinicalresearch() {
        return clinicalresearch;
    }

    public void setClinicalresearch(String clinicalresearch) {
        String oldClinicalresearch = this.clinicalresearch;
        this.clinicalresearch = clinicalresearch;
        changeSupport.firePropertyChange("clinicalresearch", oldClinicalresearch, clinicalresearch);
    }

    public boolean getPrescriptionavlbl() {
        return prescriptionavlbl;
    }

    public void setPrescriptionavlbl(boolean prescriptionavlbl) {
        boolean oldPrescriptionavlbl = this.prescriptionavlbl;
        this.prescriptionavlbl = prescriptionavlbl;
        changeSupport.firePropertyChange("prescriptionavlbl", oldPrescriptionavlbl, prescriptionavlbl);
    }

    public String getMRIreportstatus() {
        return mRIreportstatus;
    }

    public void setMRIreportstatus(String mRIreportstatus) {
        String oldMRIreportstatus = this.mRIreportstatus;
        this.mRIreportstatus = mRIreportstatus;
        changeSupport.firePropertyChange("MRIreportstatus", oldMRIreportstatus, mRIreportstatus);
    }

    public boolean getMRIreportavailable() {
        return mRIreportavailable;
    }

    public void setMRIreportavailable(boolean mRIreportavailable) {
        boolean oldMRIreportavailable = this.mRIreportavailable;
        this.mRIreportavailable = mRIreportavailable;
        changeSupport.firePropertyChange("MRIreportavailable", oldMRIreportavailable, mRIreportavailable);
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        String oldComment = this.comment;
        this.comment = comment;
        changeSupport.firePropertyChange("comment", oldComment, comment);
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        String oldRemarks = this.remarks;
        this.remarks = remarks;
        changeSupport.firePropertyChange("remarks", oldRemarks, remarks);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subjectId != null ? subjectId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clinicaldata)) {
            return false;
        }
        Clinicaldata other = (Clinicaldata) object;
        if ((this.subjectId == null && other.subjectId != null) || (this.subjectId != null && !this.subjectId.equals(other.subjectId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "subject.Clinicaldata[ subjectId=" + subjectId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
