package co.unbosque.clico4BackEndProductos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unbosque.clico4BackEndProductos.model.Productos;
import co.unbosque.clico4BackEndProductos.model.Usuarios;
import co.unbosque.clico4BackEndProductos.modelDao.interfaces.IProductosDao;
import co.unbosque.clico4BackEndProductos.service.interfaces.IProductosService;

 @Service
public class ProductosService implements IProductosService {

	@Autowired
	private IProductosDao productosDao;
	
	@Override
	public void saveProducto(Productos producto) throws Exception {
		productosDao.save(producto)	;	
	}

	@Override
	public List<Productos> ListarProductos() throws Exception {
 		return productosDao.findAll();
	}

	@Override
	public void deleteProductoById(long idProducto) throws Exception {
		productosDao.deleteById(idProducto);		
	}

	@Override
	public Optional<Productos> findProductoById(long idProducto) throws Exception {
		return productosDao.findById(idProducto);	
	}

	@Override
	public void updateProducto(Productos producto) throws Exception {
		productosDao.save(producto)	;	
	}

}
