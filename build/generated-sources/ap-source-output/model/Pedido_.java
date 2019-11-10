package model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;
import model.ItemPedido;
import model.Vendedor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-10T03:09:20")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Date> createdAt;
    public static volatile CollectionAttribute<Pedido, ItemPedido> itemPedidoCollection;
    public static volatile SingularAttribute<Pedido, Cliente> fkClienteId;
    public static volatile SingularAttribute<Pedido, BigDecimal> valorTotal;
    public static volatile SingularAttribute<Pedido, Integer> id;
    public static volatile SingularAttribute<Pedido, Integer> quantidade;
    public static volatile SingularAttribute<Pedido, Date> updateOn;
    public static volatile SingularAttribute<Pedido, ItemPedido> fkItemPedidoId;
    public static volatile SingularAttribute<Pedido, Vendedor> fkVendedorId;
    public static volatile SingularAttribute<Pedido, Date> dtPedido;

}