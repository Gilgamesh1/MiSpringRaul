/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.hibernate.modelo;

import java.util.Set;

/**
 *
 * @author Orus
 */
public class CategoriaVO {

    private int id;
    private String descripcion;
    private Set<PeliculaVO> peliculas;

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

    /**
     * @return the peliculas
     */
    public Set<PeliculaVO> getPeliculas() {
        return peliculas;
    }

    /**
     * @param peliculas the peliculas to set
     */
    public void setPeliculas(Set<PeliculaVO> peliculas) {
        this.peliculas = peliculas;
    }
}
