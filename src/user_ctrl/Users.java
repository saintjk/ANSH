/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_ctrl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author lab
 */
@Entity
@Table(name = "Users", catalog = "ANSH", schema = "")
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findByUId", query = "SELECT u FROM Users u WHERE u.uId = :uId")
    , @NamedQuery(name = "Users.findByCreated", query = "SELECT u FROM Users u WHERE u.created = :created")
    , @NamedQuery(name = "Users.findByProj", query = "SELECT u FROM Users u WHERE u.proj = :proj")})
public class Users implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "u_id")
    private String uId;
    @Basic(optional = false)
    @Lob
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Lob
    @Column(name = "pswd")
    private String pswd;
    @Basic(optional = false)
    @Lob
    @Column(name = "Desig")
    private String desig;
    @Basic(optional = false)
    @Column(name = "Created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @Column(name = "Proj")
    private int proj;

    public Users() {
    }

    public Users(String uId) {
        this.uId = uId;
    }

    public Users(String uId, String name, String pswd, String desig, Date created, int proj) {
        this.uId = uId;
        this.name = name;
        this.pswd = pswd;
        this.desig = desig;
        this.created = created;
        this.proj = proj;
    }

    public String getUId() {
        return uId;
    }

    public void setUId(String uId) {
        String oldUId = this.uId;
        this.uId = uId;
        changeSupport.firePropertyChange("UId", oldUId, uId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        String oldPswd = this.pswd;
        this.pswd = pswd;
        changeSupport.firePropertyChange("pswd", oldPswd, pswd);
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        String oldDesig = this.desig;
        this.desig = desig;
        changeSupport.firePropertyChange("desig", oldDesig, desig);
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        Date oldCreated = this.created;
        this.created = created;
        changeSupport.firePropertyChange("created", oldCreated, created);
    }

    public int getProj() {
        return proj;
    }

    public void setProj(int proj) {
        int oldProj = this.proj;
        this.proj = proj;
        changeSupport.firePropertyChange("proj", oldProj, proj);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uId != null ? uId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.uId == null && other.uId != null) || (this.uId != null && !this.uId.equals(other.uId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "user_ctrl.Users[ uId=" + uId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
