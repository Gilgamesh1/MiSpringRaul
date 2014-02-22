/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.hibernate.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Orus
 */
public class UsuarioVO implements Serializable {

    private int id;
    private String nombre;
    private String apepaterno;
    private String apematerno;
    private Set<PeliculaVO> peliculas = new HashSet();

    public UsuarioVO() {
    }

    public UsuarioVO(int id, String nombre, String apepaterno, String apematerno) {
        this.id = id;
        this.nombre = nombre;
        this.apepaterno = apepaterno;
        this.apematerno = apematerno;
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apepaterno
     */
    public String getApepaterno() {
        return apepaterno;
    }

    /**
     * @param apepaterno the apepaterno to set
     */
    public void setApepaterno(String apepaterno) {
        this.apepaterno = apepaterno;
    }

    /**
     * @return the apematerno
     */
    public String getApematerno() {
        return apematerno;
    }

    /**
     * @param apematerno the apematerno to set
     */
    public void setApematerno(String apematerno) {
        this.apematerno = apematerno;
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
