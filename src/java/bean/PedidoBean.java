/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author renan
 */
@Named(value = "pedidoBean")
@SessionScoped
public class PedidoBean implements Serializable {

    /**
     * Creates a new instance of PedidoBean
     */
    public PedidoBean() {
    }
    
}
