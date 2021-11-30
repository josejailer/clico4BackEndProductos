package co.unbosque.clico4BackEndProductos.service.interfaces;

import java.util.List;
import java.util.Optional;

import co.unbosque.clico4BackEndProductos.model.Productos;

 
public interface IProductosService {


	public void saveProducto(Productos producto) throws Exception;
	
	public List<Productos> ListarProductos() throws Exception;
	
	public void deleteProductoById(long idProducto) throws Exception;
	
	public Optional<Productos> findProductoById(long idProducto) throws Exception;
	
	public void updateProducto(Productos producto) throws Exception;
}
