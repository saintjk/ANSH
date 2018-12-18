/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ansh_gui.status;

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
 * @author ninslab
 */
@Entity
@Table(name = "Paper", catalog = "ANSH", schema = "")
@NamedQueries({
    @NamedQuery(name = "Paper.findAll", query = "SELECT p FROM Paper p"),
    @NamedQuery(name = "Paper.findByPapID", query = "SELECT p FROM Paper p WHERE p.papID = :papID"),
    @NamedQuery(name = "Paper.findByFlag", query = "SELECT p FROM Paper p WHERE p.flag = :flag"),
    @NamedQuery(name = "Paper.findByYear", query = "SELECT p FROM Paper p WHERE p.year = :year")})
public class Paper implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Pap_ID")
    private Integer papID;
    @Basic(optional = false)
    @Lob
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Lob
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @Column(name = "flag")
    private boolean flag;
    @Basic(optional = false)
    @Column(name = "Year")
    private int year;

    public Paper() {
    }

    public Paper(Integer papID) {
        this.papID = papID;
    }

    public Paper(Integer papID, String name, String description, boolean flag, int year) {
        this.papID = papID;
        this.name = name;
        this.description = description;
        this.flag = flag;
        this.year = year;
    }

    public Integer getPapID() {
        return papID;
    }

    public void setPapID(Integer papID) {
        Integer oldPapID = this.papID;
        this.papID = papID;
        changeSupport.firePropertyChange("papID", oldPapID, papID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        boolean oldFlag = this.flag;
        this.flag = flag;
        changeSupport.firePropertyChange("flag", oldFlag, flag);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (papID != null ? papID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paper)) {
            return false;
        }
        Paper other = (Paper) object;
        if ((this.papID == null && other.papID != null) || (this.papID != null && !this.papID.equals(other.papID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ansh_gui.status.Paper[ papID=" + papID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
