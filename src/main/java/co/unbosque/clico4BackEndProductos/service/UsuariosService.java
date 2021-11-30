package co.unbosque.clico4BackEndProductos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unbosque.clico4BackEndProductos.model.Usuarios;
import co.unbosque.clico4BackEndProductos.modelDao.interfaces.IUsuariosDao;
import co.unbosque.clico4BackEndProductos.service.interfaces.IUsuariosService;

  
@Service
public class UsuariosService implements IUsuariosService {

	@Autowired
	private IUsuariosDao iUsuariosDao;

//@Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
	   
	@Override
	public void saveUsuario(Usuarios usuarios) throws Exception {
		iUsuariosDao.save(usuarios);

	}

	
	@Override
	public List<Usuarios> ListarUsuarios() throws Exception {
		return iUsuariosDao.findAll();
	}

	@Override
	public void deleteUsuarioById(long idUusuario) throws Exception {
		iUsuariosDao.deleteById(idUusuario);

	}

	@Override
	public Optional<Usuarios> findUsuariosById(long idUusuario) throws Exception {
		return iUsuariosDao.findById(idUusuario);

	}

	@Override
	public void updateUsuario(Usuarios usuarios) throws Exception {
		iUsuariosDao.save(usuarios);

	}

	/*@Override
	public Optional<Usuarios> findByEmail_usuario(String email_usuario) {
		return Optional.of(iUsuariosDao.findByEmail_usuario(email_usuario));
	}*/
 
	@Override
	public Optional<Usuarios> findByUsuario(String usuario) {
		return Optional.of(iUsuariosDao.findByUsuario(usuario));

	}

	@Override
	public Optional<Usuarios> findUsuarioByUsuarioAndPassword(String usuario, String password) {
		return Optional.of(iUsuariosDao.findUsuarioByUsuarioAndPassword(usuario,password));
 	}

}
