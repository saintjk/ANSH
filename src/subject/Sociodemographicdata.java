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
@Table(name = "Sociodemographic_data", catalog = "ANSH", schema = "")
@NamedQueries({
    @NamedQuery(name = "Sociodemographicdata.findAll", query = "SELECT s FROM Sociodemographicdata s")
    , @NamedQuery(name = "Sociodemographicdata.findBySubjectId", query = "SELECT s FROM Sociodemographicdata s WHERE s.subjectId = :subjectId")})
public class Sociodemographicdata implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SubjectId")
    private String subjectId;
    @Basic(optional = false)
    @Lob
    @Column(name = "Education")
    private String education;
    @Basic(optional = false)
    @Lob
    @Column(name = "family_typ")
    private String familyTyp;
    @Basic(optional = false)
    @Lob
    @Column(name = "Maritial_status")
    private String maritialstatus;
    @Basic(optional = false)
    @Lob
    @Column(name = "Occupation")
    private String occupation;
    @Basic(optional = false)
    @Lob
    @Column(name = "Other_job")
    private String otherjob;
    @Basic(optional = false)
    @Lob
    @Column(name = "Habitat")
    private String habitat;
    @Basic(optional = false)
    @Lob
    @Column(name = "HOS")
    private String hos;
    @Basic(optional = false)
    @Lob
    @Column(name = "Remarks")
    private String remarks;

    public Sociodemographicdata() {
    }

    public Sociodemographicdata(String subjectId) {
        this.subjectId = subjectId;
    }

    public Sociodemographicdata(String subjectId, String education, String familyTyp, String maritialstatus, String occupation, String otherjob, String habitat, String hos, String remarks) {
        this.subjectId = subjectId;
        this.education = education;
        this.familyTyp = familyTyp;
        this.maritialstatus = maritialstatus;
        this.occupation = occupation;
        this.otherjob = otherjob;
        this.habitat = habitat;
        this.hos = hos;
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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        String oldEducation = this.education;
        this.education = education;
        changeSupport.firePropertyChange("education", oldEducation, education);
    }

    public String getFamilyTyp() {
        return familyTyp;
    }

    public void setFamilyTyp(String familyTyp) {
        String oldFamilyTyp = this.familyTyp;
        this.familyTyp = familyTyp;
        changeSupport.firePropertyChange("familyTyp", oldFamilyTyp, familyTyp);
    }

    public String getMaritialstatus() {
        return maritialstatus;
    }

    public void setMaritialstatus(String maritialstatus) {
        String oldMaritialstatus = this.maritialstatus;
        this.maritialstatus = maritialstatus;
        changeSupport.firePropertyChange("maritialstatus", oldMaritialstatus, maritialstatus);
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        String oldOccupation = this.occupation;
        this.occupation = occupation;
        changeSupport.firePropertyChange("occupation", oldOccupation, occupation);
    }

    public String getOtherjob() {
        return otherjob;
    }

    public void setOtherjob(String otherjob) {
        String oldOtherjob = this.otherjob;
        this.otherjob = otherjob;
        changeSupport.firePropertyChange("otherjob", oldOtherjob, otherjob);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        String oldHabitat = this.habitat;
        this.habitat = habitat;
        changeSupport.firePropertyChange("habitat", oldHabitat, habitat);
    }

    public String getHos() {
        return hos;
    }

    public void setHos(String hos) {
        String oldHos = this.hos;
        this.hos = hos;
        changeSupport.firePropertyChange("hos", oldHos, hos);
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
        if (!(object instanceof Sociodemographicdata)) {
            return false;
        }
        Sociodemographicdata other = (Sociodemographicdata) object;
        if ((this.subjectId == null && other.subjectId != null) || (this.subjectId != null && !this.subjectId.equals(other.subjectId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "subject.Sociodemographicdata[ subjectId=" + subjectId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
