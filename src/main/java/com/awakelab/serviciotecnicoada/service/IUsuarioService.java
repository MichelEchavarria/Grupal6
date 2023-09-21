package com.awakelab.serviciotecnicoada.service;
import com.awakelab.serviciotecnicoada.entity.Usuario;
import java.util.List;

public interface IUsuarioService {
    Usuario crearUsuario(Usuario nuevoUsuario);
    Usuario actualizarUsuario(Usuario usuario);
    List<Usuario> listarUsuario();
    Usuario listarUsuarioID(int idUsuario);
    void eliminarUsuario(int id);
}