/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casadebolsa;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public class Cliente extends Persona {

    private int claveCliente;
    private String rfc;
    private Portafolio portafolio;

    public Cliente(int claveCliente, String rfc, String nombres, String apellidoPaterno, String apellidoMaterno, String calle, String numero, String colonia, String localidad, String estado, int codigoPostal, int diaNac, int mesNac, int anioNac) {
        super(nombres, apellidoPaterno, apellidoMaterno, calle, numero, colonia, localidad, estado, codigoPostal);
        this.claveCliente = claveCliente;
        this.rfc = rfc;
        this.fechaNacimiento = LocalDate.of(anioNac, mesNac, diaNac);
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() + "claveCliente=" + claveCliente + ", rfc=" + rfc + ", portafolio=" + portafolio + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.rfc, other.rfc)) {
            return false;
        }
        return true;
    }
    
    

    /**
     * @return the claveCliente
     */
    public int getClaveCliente() {
        return claveCliente;
    }

    /**
     * @param claveCliente the claveCliente to set
     */
    public void setClaveCliente(int claveCliente) {
        this.claveCliente = claveCliente;
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
     * @return the portafolio
     */
    public Portafolio getPortafolio() {
        return portafolio;
    }

    /**
     * @param portafolio the portafolio to set
     */
    public void setPortafolio(Portafolio portafolio) {
        this.portafolio = portafolio;
    }

}
