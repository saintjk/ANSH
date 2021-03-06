/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_ctrl;

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
@Table(name = "Project", catalog = "ANSH", schema = "")
@NamedQueries({
    @NamedQuery(name = "Project.findAll", query = "SELECT p FROM Project p")
    , @NamedQuery(name = "Project.findByPrjID", query = "SELECT p FROM Project p WHERE p.prjID = :prjID")
    , @NamedQuery(name = "Project.findByFlag", query = "SELECT p FROM Project p WHERE p.flag = :flag")})
public class Project implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Prj_ID")
    private Integer prjID;
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

    public Project() {
    }

    public Project(Integer prjID) {
        this.prjID = prjID;
    }

    public Project(Integer prjID, String name, String description, boolean flag) {
        this.prjID = prjID;
        this.name = name;
        this.description = description;
        this.flag = flag;
    }

    public Integer getPrjID() {
        return prjID;
    }

    public void setPrjID(Integer prjID) {
        Integer oldPrjID = this.prjID;
        this.prjID = prjID;
        changeSupport.firePropertyChange("prjID", oldPrjID, prjID);
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prjID != null ? prjID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project)) {
            return false;
        }
        Project other = (Project) object;
        if ((this.prjID == null && other.prjID != null) || (this.prjID != null && !this.prjID.equals(other.prjID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "user_ctrl.Project[ prjID=" + prjID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
