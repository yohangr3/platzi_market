/*Creamos esta clase para crear un sola primary key ya que en la tabla de compras_productos
  de nuestra base de datos hay dos primary keys
 */

package com.platzi.market.persistence.entity;

import javax.persistence.Column;
import java.io.Serializable;

public class ComprasProductoPK implements Serializable {

    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
    private Integer idProducto;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
