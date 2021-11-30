package co.unbosque.clico4BackEndProductos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.unbosque.clico4BackEndProductos.model.Usuarios;
import co.unbosque.clico4BackEndProductos.service.interfaces.IUsuariosService;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/usuarios")
@Api(tags = "Usuarios", description = "EnPoints Para la Gestión de usuarios" )
@CrossOrigin(origins = "*")


public class UsuariosController {

	@Autowired
	private IUsuariosService iUsuariosService;

	@PostMapping()
	public void crearUsuario(@RequestBody Usuarios usuarios,BindingResult bindingResult) {
		try {
			//Optional<Usuarios> usuariosExiste=iUsuariosService.findByUsuario(usuarios.getNombre_usuario());
		  
					iUsuariosService.saveUsuario(usuarios);
		      
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
 
	@PostMapping(path = "/login")
	public Optional<Usuarios> login(@RequestBody Usuarios usuarios) {
		Optional<Usuarios> usuario= Optional.ofNullable(new Usuarios());
		try { //@RequestParam("usuario") String nombreUsuario,@RequestParam("password") String password
			usuario=iUsuariosService.findUsuarioByUsuarioAndPassword(usuarios.getUsuario(),usuarios.getPassword());
		} catch (Exception e) {
 			e.printStackTrace();
		}
		return usuario;
	}
	
	@GetMapping()
	public List<Usuarios> listarUsuario() {
		List<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
		try {
			listaUsuarios = iUsuariosService.ListarUsuarios();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaUsuarios;
	}

	@DeleteMapping(path = "/{id}")
	public void eliminarUsuario(@PathVariable("id") long id) {
		try {
			iUsuariosService.deleteUsuarioById(id);
		} catch (Exception e) {
 			e.printStackTrace();
		}
	}

	@GetMapping(path = "/{id}")
	public Optional<Usuarios> buscarUsuarioById(@PathVariable("id") long id) {
		Optional<Usuarios> usuario= Optional.ofNullable(new Usuarios());
		try {
			usuario=iUsuariosService.findUsuariosById(id);
		} catch (Exception e) {
 			e.printStackTrace();
		}
		return usuario;
	}
	
	@PutMapping()
	public void actualizarUsuario(@RequestBody Usuarios usuarios) {
		try {
			iUsuariosService.updateUsuario(usuarios);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
