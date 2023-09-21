package com.awakelab.serviciotecnicoada.service;
import com.awakelab.serviciotecnicoada.entity.Cliente;
import java.util.List;

public interface IClienteService {
        public Cliente crearCliente(Cliente nuevoCliente);
        public Cliente actualizarCliente(Cliente cliente);
        public List<Cliente> listarClientes();
        public Cliente listarClienteID(int idCliente);
        public void eliminarCliente(int id);
}
