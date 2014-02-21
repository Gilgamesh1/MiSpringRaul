/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.negocio.cu_mtnpelicula.dao;

import java.util.List;

/**
 *
 * @author Orus
 */
public interface MtnPeliculaDAO {

    public void insertar(Object entity);

    public List findAll(Class clazz);

    public void actualizar(Object entity);

    public void eliminar(Object entity);

    public Object getEntity(Class clazz, int id);
}
