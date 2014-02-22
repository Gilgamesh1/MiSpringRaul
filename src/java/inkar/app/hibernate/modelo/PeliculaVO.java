/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.hibernate.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Orus
 */
public class PeliculaVO {

    private int id;
    private String titulo;
    private String descripcion;
    private Date fecha;
    private CategoriaVO categoria;
    private Set<UsuarioVO> usuarios = new HashSet();

    public PeliculaVO() {
    }

    public PeliculaVO(int id, String titulo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public PeliculaVO(int id, String titulo, String descripcion, Date fecha) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the categoria
     */
    public CategoriaVO getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(CategoriaVO categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the usuarios
     */
    public Set<UsuarioVO> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(Set<UsuarioVO> usuarios) {
        this.usuarios = usuarios;
    }
}
