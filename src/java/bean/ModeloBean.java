package bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import model.Modelo;

@Named(value = "modeloBean")
@SessionScoped
public class ModeloBean implements Serializable {
    
    @PersistenceContext
    EntityManager em;
    @Inject
    UserTransaction utx;
    List<Modelo> modelos;
    Modelo modelo;

    public ModeloBean() {
        modelo = new Modelo();
    }
    
    @PostConstruct
    public void iniciar() {
        try {
            modelos = em.createNamedQuery("Modelo.findAll").getResultList();

        } catch (Throwable t) {
            t.printStackTrace();
            modelos = new LinkedList<>();
        }
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }
    
    
}
