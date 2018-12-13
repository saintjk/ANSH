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
@Table(name = "GPE_data", catalog = "ANSH", schema = "")
@NamedQueries({
    @NamedQuery(name = "GPEdata.findAll", query = "SELECT g FROM GPEdata g")
    , @NamedQuery(name = "GPEdata.findBySubjectId", query = "SELECT g FROM GPEdata g WHERE g.subjectId = :subjectId")
    , @NamedQuery(name = "GPEdata.findByHeight", query = "SELECT g FROM GPEdata g WHERE g.height = :height")
    , @NamedQuery(name = "GPEdata.findByWeight", query = "SELECT g FROM GPEdata g WHERE g.weight = :weight")
    , @NamedQuery(name = "GPEdata.findByBmi", query = "SELECT g FROM GPEdata g WHERE g.bmi = :bmi")
    , @NamedQuery(name = "GPEdata.findByWhr", query = "SELECT g FROM GPEdata g WHERE g.whr = :whr")
    , @NamedQuery(name = "GPEdata.findByWaist", query = "SELECT g FROM GPEdata g WHERE g.waist = :waist")
    , @NamedQuery(name = "GPEdata.findByHip", query = "SELECT g FROM GPEdata g WHERE g.hip = :hip")
    , @NamedQuery(name = "GPEdata.findByPulse", query = "SELECT g FROM GPEdata g WHERE g.pulse = :pulse")
    , @NamedQuery(name = "GPEdata.findByPmn", query = "SELECT g FROM GPEdata g WHERE g.pmn = :pmn")
    , @NamedQuery(name = "GPEdata.findByFmn", query = "SELECT g FROM GPEdata g WHERE g.fmn = :fmn")})
public class GPEdata implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SubjectId")
    private String subjectId;
    @Basic(optional = false)
    @Column(name = "Height")
    private double height;
    @Basic(optional = false)
    @Column(name = "Weight")
    private double weight;
    @Basic(optional = false)
    @Column(name = "BMI")
    private int bmi;
    @Basic(optional = false)
    @Column(name = "WHR")
    private float whr;
    @Basic(optional = false)
    @Column(name = "waist")
    private int waist;
    @Basic(optional = false)
    @Column(name = "hip")
    private int hip;
    @Basic(optional = false)
    @Lob
    @Column(name = "BP")
    private String bp;
    @Basic(optional = false)
    @Column(name = "pulse")
    private int pulse;
    @Basic(optional = false)
    @Lob
    @Column(name = "illself")
    private String illself;
    @Basic(optional = false)
    @Column(name = "pmn")
    private boolean pmn;
    @Basic(optional = false)
    @Column(name = "fmn")
    private boolean fmn;
    @Basic(optional = false)
    @Lob
    @Column(name = "fmlill")
    private String fmlill;
    @Basic(optional = false)
    @Lob
    @Column(name = "remarks")
    private String remarks;

    public GPEdata() {
    }

    public GPEdata(String subjectId) {
        this.subjectId = subjectId;
    }

    public GPEdata(String subjectId, double height, double weight, int bmi, float whr, int waist, int hip, String bp, int pulse, String illself, boolean pmn, boolean fmn, String fmlill, String remarks) {
        this.subjectId = subjectId;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
        this.whr = whr;
        this.waist = waist;
        this.hip = hip;
        this.bp = bp;
        this.pulse = pulse;
        this.illself = illself;
        this.pmn = pmn;
        this.fmn = fmn;
        this.fmlill = fmlill;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        double oldHeight = this.height;
        this.height = height;
        changeSupport.firePropertyChange("height", oldHeight, height);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        double oldWeight = this.weight;
        this.weight = weight;
        changeSupport.firePropertyChange("weight", oldWeight, weight);
    }

    public int getBmi() {
        return bmi;
    }

    public void setBmi(int bmi) {
        int oldBmi = this.bmi;
        this.bmi = bmi;
        changeSupport.firePropertyChange("bmi", oldBmi, bmi);
    }

    public float getWhr() {
        return whr;
    }

    public void setWhr(float whr) {
        float oldWhr = this.whr;
        this.whr = whr;
        changeSupport.firePropertyChange("whr", oldWhr, whr);
    }

    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {
        int oldWaist = this.waist;
        this.waist = waist;
        changeSupport.firePropertyChange("waist", oldWaist, waist);
    }

    public int getHip() {
        return hip;
    }

    public void setHip(int hip) {
        int oldHip = this.hip;
        this.hip = hip;
        changeSupport.firePropertyChange("hip", oldHip, hip);
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        String oldBp = this.bp;
        this.bp = bp;
        changeSupport.firePropertyChange("bp", oldBp, bp);
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        int oldPulse = this.pulse;
        this.pulse = pulse;
        changeSupport.firePropertyChange("pulse", oldPulse, pulse);
    }

    public String getIllself() {
        return illself;
    }

    public void setIllself(String illself) {
        String oldIllself = this.illself;
        this.illself = illself;
        changeSupport.firePropertyChange("illself", oldIllself, illself);
    }

    public boolean getPmn() {
        return pmn;
    }

    public void setPmn(boolean pmn) {
        boolean oldPmn = this.pmn;
        this.pmn = pmn;
        changeSupport.firePropertyChange("pmn", oldPmn, pmn);
    }

    public boolean getFmn() {
        return fmn;
    }

    public void setFmn(boolean fmn) {
        boolean oldFmn = this.fmn;
        this.fmn = fmn;
        changeSupport.firePropertyChange("fmn", oldFmn, fmn);
    }

    public String getFmlill() {
        return fmlill;
    }

    public void setFmlill(String fmlill) {
        String oldFmlill = this.fmlill;
        this.fmlill = fmlill;
        changeSupport.firePropertyChange("fmlill", oldFmlill, fmlill);
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
        if (!(object instanceof GPEdata)) {
            return false;
        }
        GPEdata other = (GPEdata) object;
        if ((this.subjectId == null && other.subjectId != null) || (this.subjectId != null && !this.subjectId.equals(other.subjectId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "subject.GPEdata[ subjectId=" + subjectId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
