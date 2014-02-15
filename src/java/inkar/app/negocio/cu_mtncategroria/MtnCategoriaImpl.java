/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.negocio.cu_mtncategroria;

import inkar.app.hibernate.modelo.CategoriaVO;
import inkar.app.negocio.cu_mtncategroria.dao.MtnCategoriaDAO;
import inkar.app.negocio.cu_mtncategroria.dto.CategoriaDTO;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Orus
 */
@Service
public class MtnCategoriaImpl implements MtnCategoria {

    private static final Logger logger = Logger.getLogger(MtnCategoriaImpl.class);
    @Autowired
    private MtnCategoriaDAO dao;

    @Override
    public void insertarCategoria(CategoriaDTO dto) {
        logger.debug("insertarCategoria - INICIO");
        CategoriaVO vo = new CategoriaVO();
        vo.setDescripcion(dto.getDescripcion());
        dao.insertar(vo);
        logger.debug("insertarCategoria - FIN");
    }

    @Override
    public void actualizarCategoria(CategoriaDTO dto) {
        logger.debug("actualizarCategoria - INICIO");
        CategoriaVO vo = new CategoriaVO(dto.getId(), dto.getDescripcion());
        dao.actualizar(vo);
        logger.debug("actualizarCategoria - FIN");
    }

    @Override
    public void eliminarCategoria(int id) {
        logger.debug("eliminarCategoria - INICIO");
        CategoriaVO vo = (CategoriaVO) dao.getEntity(CategoriaVO.class, id);
        dao.eliminar(vo);
        logger.debug("eliminarCategoria - FIN");
    }

    @Override
    public List<CategoriaDTO> listaDeCategoria() {
        logger.debug("listaDeCategoria - INICIO");
        List<CategoriaVO> listVO = dao.findAll(CategoriaVO.class);
        List<CategoriaDTO> listDTO = new ArrayList<CategoriaDTO>();
        if (!listVO.isEmpty()) {
            for (CategoriaVO vo : listVO) {
                listDTO.add(new CategoriaDTO(vo.getId(), vo.getDescripcion()));
            }
        }
        logger.debug("listaDeCategoria - FIN");
        return listDTO;
    }

    @Override
    public CategoriaDTO cargarCategoria(int id) {
        logger.debug("cargarCategoria - INICIO");
        CategoriaVO vo = (CategoriaVO) dao.getEntity(CategoriaVO.class, id);
        CategoriaDTO dto = new CategoriaDTO(vo.getId(), vo.getDescripcion());
        logger.debug("cargarCategoria - FIN");
        return dto;
    }
}
