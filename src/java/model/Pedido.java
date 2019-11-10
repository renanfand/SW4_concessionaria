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
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findById", query = "SELECT p FROM Pedido p WHERE p.id = :id")
    , @NamedQuery(name = "Pedido.findByDtPedido", query = "SELECT p FROM Pedido p WHERE p.dtPedido = :dtPedido")
    , @NamedQuery(name = "Pedido.findByValorTotal", query = "SELECT p FROM Pedido p WHERE p.valorTotal = :valorTotal")
    , @NamedQuery(name = "Pedido.findByQuantidade", query = "SELECT p FROM Pedido p WHERE p.quantidade = :quantidade")
    , @NamedQuery(name = "Pedido.findByCreatedIn", query = "SELECT p FROM Pedido p WHERE p.createdIn = :createdIn")
    , @NamedQuery(name = "Pedido.findByUpdateOn", query = "SELECT p FROM Pedido p WHERE p.updateOn = :updateOn")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "dt_pedido")
    @Temporal(TemporalType.DATE)
    private Date dtPedido;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valor_total")
    private BigDecimal valorTotal;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @Basic(optional = false)
    @Column(name = "created_in")
    @Temporal(TemporalType.DATE)
    private Date createdIn;
    @Basic(optional = false)
    @Column(name = "update_on")
    @Temporal(TemporalType.DATE)
    private Date updateOn;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkPedidoId")
    private Collection<ItemPedido> itemPedidoCollection;
    @JoinColumn(name = "fk_cliente_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente fkClienteId;
    @JoinColumn(name = "fk_item_pedido_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ItemPedido fkItemPedidoId;
    @JoinColumn(name = "fk_vendedor_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Vendedor fkVendedorId;

    public Pedido() {
    }

    public Pedido(Integer id) {
        this.id = id;
    }

    public Pedido(Integer id, Date dtPedido, BigDecimal valorTotal, int quantidade, Date createdIn, Date updateOn) {
        this.id = id;
        this.dtPedido = dtPedido;
        this.valorTotal = valorTotal;
        this.quantidade = quantidade;
        this.createdIn = createdIn;
        this.updateOn = updateOn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(Date dtPedido) {
        this.dtPedido = dtPedido;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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

    @XmlTransient
    public Collection<ItemPedido> getItemPedidoCollection() {
        return itemPedidoCollection;
    }

    public void setItemPedidoCollection(Collection<ItemPedido> itemPedidoCollection) {
        this.itemPedidoCollection = itemPedidoCollection;
    }

    public Cliente getFkClienteId() {
        return fkClienteId;
    }

    public void setFkClienteId(Cliente fkClienteId) {
        this.fkClienteId = fkClienteId;
    }

    public ItemPedido getFkItemPedidoId() {
        return fkItemPedidoId;
    }

    public void setFkItemPedidoId(ItemPedido fkItemPedidoId) {
        this.fkItemPedidoId = fkItemPedidoId;
    }

    public Vendedor getFkVendedorId() {
        return fkVendedorId;
    }

    public void setFkVendedorId(Vendedor fkVendedorId) {
        this.fkVendedorId = fkVendedorId;
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
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Pedido[ id=" + id + " ]";
    }
    
}
