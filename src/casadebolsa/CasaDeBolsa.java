/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casadebolsa;

import casadebolsa.dao.ClienteDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class CasaDeBolsa {
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cliente> clientes;

    public CasaDeBolsa(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "CasaDeBolsa{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", rfc=" + rfc + ", telefono=" + telefono + ", clientes=" + clientes.size() + '}';
    }
    
    public void listarTodasLasAccioneClientes(){
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        ClienteDao clienteDao = new ClienteDao();
//        try {
//            List<Cliente> consultaClientes = clienteDao.consultaClientes();
//            consultaClientes.forEach((c) -> {
//                System.out.println(c);
//            });
//            System.out.println("Clientes:" + consultaClientes.size());
//        } catch (SQLException ex) {
//            Logger.getLogger(CasaDeBolsa.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            Cliente nuevoCliente = new Cliente(4, "pagf900509", "ARMANDO", "PATRICIO", "GAYOSSO", "FLUORITA", "151", "PASEOS DE LA PLATA", "PACHUCA", "HIDALGO", 72194, 8, 5, 1990);
//            System.out.println(clienteDao.insertaCliente(nuevoCliente));
//        } catch (SQLException ex) {
//            Logger.getLogger(CasaDeBolsa.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//        try {
//            Cliente nuevoCliente = new Cliente(4, "pagf999999", "ARMANDO", "PATRICIO", "GAYOSSO", "FLUORITA", "151", "PASEOS DE LA PLATA", "PACHUCA", "HIDALGO", 72194, 8, 5, 1990);
//            System.out.println(clienteDao.actualizaCliente(nuevoCliente));
//        } catch (SQLException ex) {
//            Logger.getLogger(CasaDeBolsa.class.getName()).log(Level.SEVERE, null, ex);
//        }

        try {
            Cliente nuevoCliente = new Cliente(3, "pagf999999", "ARMANDO", "PATRICIO", "GAYOSSO", "FLUORITA", "151", "PASEOS DE LA PLATA", "PACHUCA", "HIDALGO", 72194, 8, 5, 1990);
            System.out.println(clienteDao.borraCliente(nuevoCliente));
        } catch (SQLException ex) {
            Logger.getLogger(CasaDeBolsa.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the domicilio
     */
    public Domicilio getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

}
