package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Pedido;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-10T03:09:21")
@StaticMetamodel(Vendedor.class)
public class Vendedor_ { 

    public static volatile SingularAttribute<Vendedor, Date> createdAt;
    public static volatile SingularAttribute<Vendedor, String> telefone;
    public static volatile SingularAttribute<Vendedor, String> endereco;
    public static volatile SingularAttribute<Vendedor, String> cpf;
    public static volatile SingularAttribute<Vendedor, String> nome;
    public static volatile SingularAttribute<Vendedor, Integer> id;
    public static volatile CollectionAttribute<Vendedor, Pedido> pedidoCollection;
    public static volatile SingularAttribute<Vendedor, Date> updateOn;
    public static volatile SingularAttribute<Vendedor, String> email;

}