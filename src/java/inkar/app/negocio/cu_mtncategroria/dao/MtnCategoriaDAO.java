/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.negocio.cu_mtncategroria.dao;

import java.util.List;

/**
 *
 * @author Orus
 */
public interface MtnCategoriaDAO {
//
//    public void persist(Object entity);
//
//    public void persist(Object[] entities);
//
//    public <T> List<T> find();//Class<T> entityClass
//
//    public <T> T load(Class<T> entityClass, Serializable id);
//
//    public <T> List<T> find(String hql);

    public void insertar(Object entity);

    public List findAll(Class clazz);

    public void actualizar(Object entity);

    public void eliminar(Object entity);
    
    public Object getEntity(Class clazz,int id);
}
