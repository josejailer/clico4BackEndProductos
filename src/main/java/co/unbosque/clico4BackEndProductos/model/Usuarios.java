package co.unbosque.clico4BackEndProductos.model;


 
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;

@Document(collection = "db_usuarios")
 @ApiModel("Modelo Usuario")
public class Usuarios {

	@Id
	private long cedula_usuario;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)

	private String nombre_usuario;
	private String email_usuario;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    
	private String usuario;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)

	private String password;
	private String ciudad_usuario;
	public long getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCiudad_usuario() {
		return ciudad_usuario;
	}
	public void setCiudad_usuario(String ciudad_usuario) {
		this.ciudad_usuario = ciudad_usuario;
	}
	
	
}
