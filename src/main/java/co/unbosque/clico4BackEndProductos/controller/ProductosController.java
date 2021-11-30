package co.unbosque.clico4BackEndProductos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.unbosque.clico4BackEndProductos.model.Productos;
import co.unbosque.clico4BackEndProductos.model.Usuarios;
import co.unbosque.clico4BackEndProductos.service.interfaces.IProductosService;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/productos")
@Api(tags = "Productos", description = "EnPoints Para la Gestión de Productos" )
@CrossOrigin(origins = "*")
public class ProductosController {

	
	@Autowired
	private IProductosService iProductosService;
	
	
	@PostMapping()
	public void crearProducto(@RequestBody Productos producto) {
		try {

			iProductosService.saveProducto(producto);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@GetMapping()
	public List<Productos> listarProductos() {
		List<Productos> listaProductos = new ArrayList<Productos>();
		try {
			listaProductos = iProductosService.ListarProductos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaProductos;
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Productos> buscarProductosById(@PathVariable("id") long id) {
		Optional<Productos> producto= Optional.ofNullable(new Productos());
		try {
			producto=iProductosService.findProductoById(id);
		} catch (Exception e) {
 			e.printStackTrace();
		}
		return producto;
	}

	@DeleteMapping(path = "/{id}")
	public void eliminarProducto(@PathVariable("id") long id) {
		try {
			iProductosService.deleteProductoById(id);
		} catch (Exception e) {
 			e.printStackTrace();
		}
	}

	@PutMapping()
	public void actualizarProducto(@RequestBody Productos producto) {
		try {
			iProductosService.updateProducto(producto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
