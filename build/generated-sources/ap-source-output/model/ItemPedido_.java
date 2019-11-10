package model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Pedido;
import model.Veiculo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-10T03:09:21")
@StaticMetamodel(ItemPedido.class)
public class ItemPedido_ { 

    public static volatile SingularAttribute<ItemPedido, Date> createdAt;
    public static volatile SingularAttribute<ItemPedido, Veiculo> fkVeiculoId;
    public static volatile SingularAttribute<ItemPedido, BigDecimal> valorItem;
    public static volatile SingularAttribute<ItemPedido, Pedido> fkPedidoId;
    public static volatile SingularAttribute<ItemPedido, Integer> id;
    public static volatile CollectionAttribute<ItemPedido, Pedido> pedidoCollection;
    public static volatile SingularAttribute<ItemPedido, Date> updateOn;

}