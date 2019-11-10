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
@Table(name = "veiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Veiculo.findAll", query = "SELECT v FROM Veiculo v")
    , @NamedQuery(name = "Veiculo.findById", query = "SELECT v FROM Veiculo v WHERE v.id = :id")
    , @NamedQuery(name = "Veiculo.findByCor", query = "SELECT v FROM Veiculo v WHERE v.cor = :cor")
    , @NamedQuery(name = "Veiculo.findByPlaca", query = "SELECT v FROM Veiculo v WHERE v.placa = :placa")
    , @NamedQuery(name = "Veiculo.findByValor", query = "SELECT v FROM Veiculo v WHERE v.valor = :valor")
    , @NamedQuery(name = "Veiculo.findByAnoLancamento", query = "SELECT v FROM Veiculo v WHERE v.anoLancamento = :anoLancamento")
    , @NamedQuery(name = "Veiculo.findByCreatedIn", query = "SELECT v FROM Veiculo v WHERE v.createdIn = :createdIn")
    , @NamedQuery(name = "Veiculo.findByUpdateOn", query = "SELECT v FROM Veiculo v WHERE v.updateOn = :updateOn")})
public class Veiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cor")
    private String cor;
    @Basic(optional = false)
    @Column(name = "placa")
    private String placa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valor")
    private BigDecimal valor;
    @Basic(optional = false)
    @Column(name = "ano_lancamento")
    @Temporal(TemporalType.DATE)
    private Date anoLancamento;
    @Basic(optional = false)
    @Column(name = "created_in")
    @Temporal(TemporalType.DATE)
    private Date createdIn;
    @Basic(optional = false)
    @Column(name = "update_on")
    @Temporal(TemporalType.DATE)
    private Date updateOn;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkVeiculoId")
    private Collection<ItemPedido> itemPedidoCollection;
    @JoinColumn(name = "fk_marca", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Marca fkMarca;
    @JoinColumn(name = "fk_modelo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Modelo fkModelo;
    @JoinColumn(name = "fk_tipo_veiculo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoVeiculo fkTipoVeiculo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkCarro")
    private Collection<Estoque> estoqueCollection;

    public Veiculo() {
    }

    public Veiculo(Integer id) {
        this.id = id;
    }

    public Veiculo(Integer id, String cor, String placa, BigDecimal valor, Date anoLancamento, Date createdIn, Date updateOn) {
        this.id = id;
        this.cor = cor;
        this.placa = placa;
        this.valor = valor;
        this.anoLancamento = anoLancamento;
        this.createdIn = createdIn;
        this.updateOn = updateOn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Date anoLancamento) {
        this.anoLancamento = anoLancamento;
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

    public Marca getFkMarca() {
        return fkMarca;
    }

    public void setFkMarca(Marca fkMarca) {
        this.fkMarca = fkMarca;
    }

    public Modelo getFkModelo() {
        return fkModelo;
    }

    public void setFkModelo(Modelo fkModelo) {
        this.fkModelo = fkModelo;
    }

    public TipoVeiculo getFkTipoVeiculo() {
        return fkTipoVeiculo;
    }

    public void setFkTipoVeiculo(TipoVeiculo fkTipoVeiculo) {
        this.fkTipoVeiculo = fkTipoVeiculo;
    }

    @XmlTransient
    public Collection<Estoque> getEstoqueCollection() {
        return estoqueCollection;
    }

    public void setEstoqueCollection(Collection<Estoque> estoqueCollection) {
        this.estoqueCollection = estoqueCollection;
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
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Veiculo[ id=" + id + " ]";
    }
    
}
