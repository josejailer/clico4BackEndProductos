package co.unbosque.clico4BackEndProductos.modelDao.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.unbosque.clico4BackEndProductos.model.Productos;

public interface IProductosDao extends MongoRepository<Productos, Long>{

}
