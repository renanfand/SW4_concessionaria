package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Veiculo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-10T03:09:21")
@StaticMetamodel(Marca.class)
public class Marca_ { 

    public static volatile SingularAttribute<Marca, Date> createdAt;
    public static volatile SingularAttribute<Marca, Integer> id;
    public static volatile CollectionAttribute<Marca, Veiculo> veiculoCollection;
    public static volatile SingularAttribute<Marca, Date> updateOn;
    public static volatile SingularAttribute<Marca, String> descricao;

}