package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Pedido;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-10T03:09:20")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Date> createdAt;
    public static volatile SingularAttribute<Cliente, Character> tipo;
    public static volatile SingularAttribute<Cliente, String> telefone;
    public static volatile SingularAttribute<Cliente, String> endereco;
    public static volatile SingularAttribute<Cliente, String> cpf;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, Integer> id;
    public static volatile SingularAttribute<Cliente, String> cnpj;
    public static volatile CollectionAttribute<Cliente, Pedido> pedidoCollection;
    public static volatile SingularAttribute<Cliente, Date> updateOn;
    public static volatile SingularAttribute<Cliente, String> email;

}