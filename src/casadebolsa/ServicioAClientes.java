/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casadebolsa;

import casadebolsa.Exception.ClienteInexistenteException;

/**
 *
 * @author 180910_GPO_SALINAS
 */
public interface ServicioAClientes {
    public void altaCliente(Cliente cliente);
    public void bajaCliente(Cliente cliente) throws ClienteInexistenteException;
    public void cambiosDatosCliente(Cliente cliente) throws ClienteInexistenteException;
    public void consultaCliente(Cliente cliente) throws ClienteInexistenteException;
    public void listarClientes(Cliente cliente);
}
