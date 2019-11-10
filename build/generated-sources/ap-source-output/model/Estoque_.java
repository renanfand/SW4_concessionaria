package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Veiculo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-10T03:09:21")
@StaticMetamodel(Estoque.class)
public class Estoque_ { 

    public static volatile SingularAttribute<Estoque, Date> createdAt;
    public static volatile SingularAttribute<Estoque, Integer> id;
    public static volatile SingularAttribute<Estoque, Veiculo> fkCarro;
    public static volatile SingularAttribute<Estoque, Integer> quantidade;
    public static volatile SingularAttribute<Estoque, Date> updateOn;

}