package co.unbosque.clico4BackEndProductos.modelDao.interfaces;


import org.springframework.data.mongodb.repository.MongoRepository;

import co.unbosque.clico4BackEndProductos.model.Usuarios;

public interface IUsuariosDao extends MongoRepository<Usuarios, Long> {
	//Usuarios findByEmail_usuario(String email_usuario);

	Usuarios findByUsuario(String usuario);

	Usuarios findUsuarioByUsuarioAndPassword(String usuario, String password);

}
