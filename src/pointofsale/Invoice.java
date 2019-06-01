/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Irfan
 */
@Entity
@Table(name = "invoice", catalog = "posjava", schema = "")
@NamedQueries({
    @NamedQuery(name = "Invoice.findAll", query = "SELECT i FROM Invoice i")
    , @NamedQuery(name = "Invoice.findByInvoiceId", query = "SELECT i FROM Invoice i WHERE i.invoiceId = :invoiceId")
    , @NamedQuery(name = "Invoice.findByInvoiceDate", query = "SELECT i FROM Invoice i WHERE i.invoiceDate = :invoiceDate")
    , @NamedQuery(name = "Invoice.findByStaffId", query = "SELECT i FROM Invoice i WHERE i.staffId = :staffId")
    , @NamedQuery(name = "Invoice.findBySubtotal", query = "SELECT i FROM Invoice i WHERE i.subtotal = :subtotal")
    , @NamedQuery(name = "Invoice.findByCash", query = "SELECT i FROM Invoice i WHERE i.cash = :cash")
    , @NamedQuery(name = "Invoice.findByChangeCash", query = "SELECT i FROM Invoice i WHERE i.changeCash = :changeCash")})
public class Invoice implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "InvoiceId")
    private Integer invoiceId;
    @Basic(optional = false)
    @Column(name = "InvoiceDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date invoiceDate;
    @Basic(optional = false)
    @Column(name = "StaffId")
    private String staffId;
    @Basic(optional = false)
    @Column(name = "Subtotal")
    private int subtotal;
    @Basic(optional = false)
    @Column(name = "Cash")
    private String cash;
    @Basic(optional = false)
    @Column(name = "ChangeCash")
    private int changeCash;

    public Invoice() {
    }

    public Invoice(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Invoice(Integer invoiceId, Date invoiceDate, String staffId, int subtotal, String cash, int changeCash) {
        this.invoiceId = invoiceId;
        this.invoiceDate = invoiceDate;
        this.staffId = staffId;
        this.subtotal = subtotal;
        this.cash = cash;
        this.changeCash = changeCash;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        Integer oldInvoiceId = this.invoiceId;
        this.invoiceId = invoiceId;
        changeSupport.firePropertyChange("invoiceId", oldInvoiceId, invoiceId);
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        Date oldInvoiceDate = this.invoiceDate;
        this.invoiceDate = invoiceDate;
        changeSupport.firePropertyChange("invoiceDate", oldInvoiceDate, invoiceDate);
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        String oldStaffId = this.staffId;
        this.staffId = staffId;
        changeSupport.firePropertyChange("staffId", oldStaffId, staffId);
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        int oldSubtotal = this.subtotal;
        this.subtotal = subtotal;
        changeSupport.firePropertyChange("subtotal", oldSubtotal, subtotal);
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        String oldCash = this.cash;
        this.cash = cash;
        changeSupport.firePropertyChange("cash", oldCash, cash);
    }

    public int getChangeCash() {
        return changeCash;
    }

    public void setChangeCash(int changeCash) {
        int oldChangeCash = this.changeCash;
        this.changeCash = changeCash;
        changeSupport.firePropertyChange("changeCash", oldChangeCash, changeCash);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceId != null ? invoiceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoice)) {
            return false;
        }
        Invoice other = (Invoice) object;
        if ((this.invoiceId == null && other.invoiceId != null) || (this.invoiceId != null && !this.invoiceId.equals(other.invoiceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pointofsale.Invoice[ invoiceId=" + invoiceId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
