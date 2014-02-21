/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.negocio.cu_mtnpelicula.dto;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Orus
 */
public class PeliculaDTO implements Serializable{

    private int id;
    private String titulo;
    private String descripcion;
    private String fecha;
    private int idCategoria;
    private String desCategoria;
    private List<CategoriaDTO> lstCategorias;

    public PeliculaDTO() {
    }

    public PeliculaDTO(int id, String titulo, String descripcion, Date fecha) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        this.fecha = formato.format(fecha);
    }

    public PeliculaDTO(int id, String titulo, String descripcion, Date fecha, int idCategoria, String desCategoria) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        this.fecha = formato.format(fecha);
        this.idCategoria = idCategoria;
        this.desCategoria = desCategoria;
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
    public String getFecha() {
        return fecha;
    }

    /**
     * @return the fecha
     */
    public Date getFecha_StringToDate() {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(PeliculaDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        this.fecha = formato.format(fecha);
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the desCategoria
     */
    public String getDesCategoria() {
        return desCategoria;
    }

    /**
     * @param desCategoria the desCategoria to set
     */
    public void setDesCategoria(String desCategoria) {
        this.desCategoria = desCategoria;
    }

    /**
     * @return the lstCategorias
     */
    public List<CategoriaDTO> getLstCategorias() {
        return lstCategorias;
    }

    /**
     * @param lstCategorias the lstCategorias to set
     */
    public void setLstCategorias(List<CategoriaDTO> lstCategorias) {
        this.lstCategorias = lstCategorias;
    }

    /**
     * @return the idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
}
