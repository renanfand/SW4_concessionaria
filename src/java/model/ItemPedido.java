/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author renan
 */
@Entity
@Table(name = "item_pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemPedido.findAll", query = "SELECT i FROM ItemPedido i")
    , @NamedQuery(name = "ItemPedido.findById", query = "SELECT i FROM ItemPedido i WHERE i.id = :id")
    , @NamedQuery(name = "ItemPedido.findByValorItem", query = "SELECT i FROM ItemPedido i WHERE i.valorItem = :valorItem")
    , @NamedQuery(name = "ItemPedido.findByCreatedIn", query = "SELECT i FROM ItemPedido i WHERE i.createdIn = :createdIn")
    , @NamedQuery(name = "ItemPedido.findByUpdateOn", query = "SELECT i FROM ItemPedido i WHERE i.updateOn = :updateOn")})
public class ItemPedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valor_item")
    private BigDecimal valorItem;
    @Basic(optional = false)
    @Column(name = "created_in")
    @Temporal(TemporalType.DATE)
    private Date createdIn;
    @Basic(optional = false)
    @Column(name = "update_on")
    @Temporal(TemporalType.DATE)
    private Date updateOn;
    @JoinColumn(name = "fk_pedido_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pedido fkPedidoId;
    @JoinColumn(name = "fk_veiculo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Veiculo fkVeiculoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkItemPedidoId")
    private Collection<Pedido> pedidoCollection;

    public ItemPedido() {
    }

    public ItemPedido(Integer id) {
        this.id = id;
    }

    public ItemPedido(Integer id, BigDecimal valorItem, Date createdIn, Date updateOn) {
        this.id = id;
        this.valorItem = valorItem;
        this.createdIn = createdIn;
        this.updateOn = updateOn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getValorItem() {
        return valorItem;
    }

    public void setValorItem(BigDecimal valorItem) {
        this.valorItem = valorItem;
    }

    public Date getCreatedIn() {
        return createdIn;
    }

    public void setCreatedIn(Date createdIn) {
        this.createdIn = createdIn;
    }

    public Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Date updateOn) {
        this.updateOn = updateOn;
    }

    public Pedido getFkPedidoId() {
        return fkPedidoId;
    }

    public void setFkPedidoId(Pedido fkPedidoId) {
        this.fkPedidoId = fkPedidoId;
    }

    public Veiculo getFkVeiculoId() {
        return fkVeiculoId;
    }

    public void setFkVeiculoId(Veiculo fkVeiculoId) {
        this.fkVeiculoId = fkVeiculoId;
    }

    @XmlTransient
    public Collection<Pedido> getPedidoCollection() {
        return pedidoCollection;
    }

    public void setPedidoCollection(Collection<Pedido> pedidoCollection) {
        this.pedidoCollection = pedidoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemPedido)) {
            return false;
        }
        ItemPedido other = (ItemPedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ItemPedido[ id=" + id + " ]";
    }
    
}
