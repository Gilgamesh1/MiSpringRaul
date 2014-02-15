/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.negocio.cu_mtncategroria.dto;

import java.io.Serializable;

/**
 *
 * @author Orus
 */
public class CategoriaDTO implements Serializable{

    private int id;
    private String descripcion;

    public CategoriaDTO() {
    }

    public CategoriaDTO(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
