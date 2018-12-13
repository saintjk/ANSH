/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @author ninslab
 */
@Entity
@Table(name = "users_log", catalog = "ANSH", schema = "")
@NamedQueries({
    @NamedQuery(name = "UsersLog.findAll", query = "SELECT u FROM UsersLog u"),
    @NamedQuery(name = "UsersLog.findBySessionid", query = "SELECT u FROM UsersLog u WHERE u.sessionid = :sessionid"),
    @NamedQuery(name = "UsersLog.findByLogintime", query = "SELECT u FROM UsersLog u WHERE u.logintime = :logintime"),
    @NamedQuery(name = "UsersLog.findByLogouttime", query = "SELECT u FROM UsersLog u WHERE u.logouttime = :logouttime")})
public class UsersLog implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sessionid")
    private Integer sessionid;
    @Basic(optional = false)
    @Lob
    @Column(name = "u_id")
    private String uId;
    @Basic(optional = false)
    @Lob
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "logintime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logintime;
    @Column(name = "logouttime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logouttime;
    @Basic(optional = false)
    @Lob
    @Column(name = "ip")
    private String ip;

    public UsersLog() {
    }

    public UsersLog(Integer sessionid) {
        this.sessionid = sessionid;
    }

    public UsersLog(Integer sessionid, String uId, String name, Date logintime, String ip) {
        this.sessionid = sessionid;
        this.uId = uId;
        this.name = name;
        this.logintime = logintime;
        this.ip = ip;
    }

    public Integer getSessionid() {
        return sessionid;
    }

    public void setSessionid(Integer sessionid) {
        Integer oldSessionid = this.sessionid;
        this.sessionid = sessionid;
        changeSupport.firePropertyChange("sessionid", oldSessionid, sessionid);
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

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        Date oldLogintime = this.logintime;
        this.logintime = logintime;
        changeSupport.firePropertyChange("logintime", oldLogintime, logintime);
    }

    public Date getLogouttime() {
        return logouttime;
    }

    public void setLogouttime(Date logouttime) {
        Date oldLogouttime = this.logouttime;
        this.logouttime = logouttime;
        changeSupport.firePropertyChange("logouttime", oldLogouttime, logouttime);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        String oldIp = this.ip;
        this.ip = ip;
        changeSupport.firePropertyChange("ip", oldIp, ip);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sessionid != null ? sessionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersLog)) {
            return false;
        }
        UsersLog other = (UsersLog) object;
        if ((this.sessionid == null && other.sessionid != null) || (this.sessionid != null && !this.sessionid.equals(other.sessionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "user_view.UsersLog[ sessionid=" + sessionid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
