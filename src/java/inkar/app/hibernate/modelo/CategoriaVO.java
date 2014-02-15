/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.hibernate.modelo;

/**
 *
 * @author Orus
 */
public class CategoriaVO {

    private int id;
    private String descripcion;

    public CategoriaVO() {
    }

    public CategoriaVO(int id, String descripcion) {
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
