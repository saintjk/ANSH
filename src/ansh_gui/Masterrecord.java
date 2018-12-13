/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ansh_gui;

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
@Table(name = "Master_record", catalog = "ANSH", schema = "")
@NamedQueries({
    @NamedQuery(name = "Masterrecord.findAll", query = "SELECT m FROM Master_record m")
    , @NamedQuery(name = "Masterrecord.findBySrno", query = "SELECT m FROM Master_record m WHERE m.srno = :srno")
    , @NamedQuery(name = "Masterrecord.findByGender", query = "SELECT m FROM Master_record m WHERE m.gender = :gender")
    , @NamedQuery(name = "Masterrecord.findByAge", query = "SELECT m FROM Master_record m WHERE m.age = :age")})
public class Masterrecord implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Srno")
    private Integer srno;
    @Basic(optional = false)
    @Lob
    @Column(name = "SubjectId")
    private String subjectId;
    @Basic(optional = false)
    @Lob
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @Lob
    @Column(name = "Status")
    private String status;
    @Basic(optional = false)
    @Lob
    @Column(name = "DOB")
    private String dob;
    @Basic(optional = false)
    @Column(name = "Age")
    private int age;
    @Basic(optional = false)
    @Lob
    @Column(name = "Comments")
    private String comments;
    @Basic(optional = false)
    @Lob
    @Column(name = "DOS")
    private String dos;

    public Masterrecord() {
    }

    public Masterrecord(Integer srno) {
        this.srno = srno;
    }

    public Masterrecord(Integer srno, String subjectId, String name, String gender, String status, String dob, int age, String comments, String dos) {
        this.srno = srno;
        this.subjectId = subjectId;
        this.name = name;
        this.gender = gender;
        this.status = status;
        this.dob = dob;
        this.age = age;
        this.comments = comments;
        this.dos = dos;
    }

    public Integer getSrno() {
        return srno;
    }

    public void setSrno(Integer srno) {
        Integer oldSrno = this.srno;
        this.srno = srno;
        changeSupport.firePropertyChange("srno", oldSrno, srno);
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        String oldSubjectId = this.subjectId;
        this.subjectId = subjectId;
        changeSupport.firePropertyChange("subjectId", oldSubjectId, subjectId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        String oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        String oldComments = this.comments;
        this.comments = comments;
        changeSupport.firePropertyChange("comments", oldComments, comments);
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        String oldDos = this.dos;
        this.dos = dos;
        changeSupport.firePropertyChange("dos", oldDos, dos);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (srno != null ? srno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Masterrecord)) {
            return false;
        }
        Masterrecord other = (Masterrecord) object;
        if ((this.srno == null && other.srno != null) || (this.srno != null && !this.srno.equals(other.srno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ansh_gui.Masterrecord[ srno=" + srno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
