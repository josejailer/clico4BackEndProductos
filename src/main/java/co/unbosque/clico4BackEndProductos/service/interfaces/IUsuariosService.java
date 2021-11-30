package co.unbosque.clico4BackEndProductos.service.interfaces;

import java.util.List;
import java.util.Optional;

import co.unbosque.clico4BackEndProductos.model.Usuarios;

 
public interface IUsuariosService  {
	
	public void saveUsuario(Usuarios usuarios) throws Exception;
	
	public List<Usuarios> ListarUsuarios() throws Exception;
	
	public void deleteUsuarioById(long idUusuario) throws Exception;
	
	public Optional<Usuarios> findUsuariosById(long idUusuario) throws Exception;
	
	public void updateUsuario(Usuarios usuarios) throws Exception;
	
	//public Optional<Usuarios> findByEmail_usuario(String email_usuario);
	
	public Optional<Usuarios> findByUsuario(String usuario);
	
	public Optional<Usuarios> findUsuarioByUsuarioAndPassword(String usuario,String password);
}
