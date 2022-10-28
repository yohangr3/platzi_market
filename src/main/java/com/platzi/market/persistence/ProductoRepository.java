package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    //Método para obtner la lista de todos los productos
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll(); //castiamos o comvertimos a un tipo List de Producto
    }

    //Método para obtener una lista de productos por categoría
    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    //Método para obtener la cantidad de un producto
    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }

    //Método para obtener un producto
    public Optional<Producto> getProducto(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    //Método para guardar un producto
    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    //Método para borrar un producto por su idProducto
    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }


}
