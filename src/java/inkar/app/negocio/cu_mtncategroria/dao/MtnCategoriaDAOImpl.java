/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.negocio.cu_mtncategroria.dao;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Orus
 */
@Repository
public class MtnCategoriaDAOImpl implements MtnCategoriaDAO {//extends BaseDAOImpl

    private static final Logger logger = Logger.getLogger(MtnCategoriaDAOImpl.class);
    @Autowired
    SessionFactory sessionFactory;

    public MtnCategoriaDAOImpl() {
//        sessionFactory=HibernateUtil.getSessionFactory();
    }

    @Override
    public void insertar(Object entity) {
        logger.debug("insertar - INICIO");
        Session session = this.sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        } catch (Exception ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                logger.warn("Falló al hacer un rollback", exc);
            }
        }
        logger.debug("insertar - FIN");
    }

    @Override
    public List findAll(Class clazz) {
        logger.debug("findAll - INICIO");
        Session session = this.sessionFactory.getCurrentSession();;
        List list = session.createCriteria(clazz)
                .addOrder(Order.asc("id")).list();
        logger.debug("findAll - FIN");
        return list;
    }

    @Override
    public void actualizar(Object entity) {
        logger.debug("actualizar - INICIO");
        Session session = this.sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        } catch (Exception ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                logger.warn("Falló al hacer un rollback", exc);
            }
        }
        logger.debug("actualizar - FIN");
    }

    @Override
    public void eliminar(Object entity) {
        logger.debug("actualizar - INICIO");
        Session session = this.sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
        } catch (Exception ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                logger.warn("Falló al hacer un rollback", exc);
            }
        }
        logger.debug("actualizar - FIN");
    }

    @Override
    public Object getEntity(Class clazz, int id) {
        logger.debug("getEntity - INICIO");
        Object object = this.sessionFactory.getCurrentSession().get(clazz, id);
        logger.debug("getEntity - FIN");
        return object;
    }
}
