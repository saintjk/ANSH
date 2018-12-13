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
@Table(name = "Personal_data", catalog = "ANSH", schema = "")
@NamedQueries({
    @NamedQuery(name = "Personaldata.findAll", query = "SELECT p FROM Personaldata p")
    , @NamedQuery(name = "Personaldata.findBySubjectId", query = "SELECT p FROM Personaldata p WHERE p.subjectId = :subjectId")
    , @NamedQuery(name = "Personaldata.findByGender", query = "SELECT p FROM Personaldata p WHERE p.gender = :gender")
    , @NamedQuery(name = "Personaldata.findByHandedness", query = "SELECT p FROM Personaldata p WHERE p.handedness = :handedness")
    , @NamedQuery(name = "Personaldata.findByMobno", query = "SELECT p FROM Personaldata p WHERE p.mobno = :mobno")})
public class Personaldata implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SubjectId")
    private String subjectId;
    @Basic(optional = false)
    @Lob
    @Column(name = "First_name")
    private String firstname;
    @Basic(optional = false)
    @Lob
    @Column(name = "Last_name")
    private String lastname;
    @Basic(optional = false)
    @Lob
    @Column(name = "DOB")
    private String dob;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "Handedness")
    private String handedness;
    @Basic(optional = false)
    @Column(name = "Mob_no")
    private long mobno;
    @Basic(optional = false)
    @Lob
    @Column(name = "email_id")
    private String emailId;
    @Basic(optional = false)
    @Lob
    @Column(name = "Address")
    private String address;

    public Personaldata() {
    }

    public Personaldata(String subjectId) {
        this.subjectId = subjectId;
    }

    public Personaldata(String subjectId, String firstname, String lastname, String dob, String gender, String handedness, long mobno, String emailId, String address) {
        this.subjectId = subjectId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.gender = gender;
        this.handedness = handedness;
        this.mobno = mobno;
        this.emailId = emailId;
        this.address = address;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        String oldSubjectId = this.subjectId;
        this.subjectId = subjectId;
        changeSupport.firePropertyChange("subjectId", oldSubjectId, subjectId);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        String oldFirstname = this.firstname;
        this.firstname = firstname;
        changeSupport.firePropertyChange("firstname", oldFirstname, firstname);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        String oldLastname = this.lastname;
        this.lastname = lastname;
        changeSupport.firePropertyChange("lastname", oldLastname, lastname);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        String oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getHandedness() {
        return handedness;
    }

    public void setHandedness(String handedness) {
        String oldHandedness = this.handedness;
        this.handedness = handedness;
        changeSupport.firePropertyChange("handedness", oldHandedness, handedness);
    }

    public long getMobno() {
        return mobno;
    }

    public void setMobno(long mobno) {
        long oldMobno = this.mobno;
        this.mobno = mobno;
        changeSupport.firePropertyChange("mobno", oldMobno, mobno);
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        String oldEmailId = this.emailId;
        this.emailId = emailId;
        changeSupport.firePropertyChange("emailId", oldEmailId, emailId);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
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
        if (!(object instanceof Personaldata)) {
            return false;
        }
        Personaldata other = (Personaldata) object;
        if ((this.subjectId == null && other.subjectId != null) || (this.subjectId != null && !this.subjectId.equals(other.subjectId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "subject.Personaldata[ subjectId=" + subjectId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
