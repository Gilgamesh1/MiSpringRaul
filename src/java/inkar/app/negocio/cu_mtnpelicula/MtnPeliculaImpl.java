/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.negocio.cu_mtnpelicula;

import inkar.app.hibernate.modelo.CategoriaVO;
import inkar.app.hibernate.modelo.PeliculaVO;
import inkar.app.negocio.cu_mtnpelicula.dao.MtnPeliculaDAO;
import inkar.app.negocio.cu_mtnpelicula.dto.CategoriaDTO;
import inkar.app.negocio.cu_mtnpelicula.dto.PeliculaDTO;
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
public class MtnPeliculaImpl implements MtnPelicula {

    private static final Logger logger = Logger.getLogger(MtnPeliculaImpl.class);
    @Autowired
    private MtnPeliculaDAO dao;

    @Override
    public List<PeliculaDTO> listaDePelicula() {
        logger.debug("listaDeCategoria - Inicio");
        List<PeliculaDTO> lstDto = new ArrayList<PeliculaDTO>();
        List<PeliculaVO> lstVo = dao.findAll(PeliculaVO.class);
        if (lstVo != null) {
            for (PeliculaVO vo : lstVo) {
                lstDto.add(new PeliculaDTO(vo.getId(), vo.getTitulo(),
                        vo.getDescripcion(), vo.getFecha(),
                        vo.getCategoria().getId(), vo.getCategoria().getDescripcion()));
            }
        }
        logger.debug("listaDeCategoria - Fin");
        return lstDto;
    }

    @Override
    public PeliculaDTO cargarPelicula(int id) {
        logger.debug("cargarPelicula - Inicio");
        PeliculaDTO dto = new PeliculaDTO();
        List<CategoriaVO> lstCategoriaVO = dao.findAll(CategoriaVO.class);
        dto.setLstCategorias(new ArrayList<CategoriaDTO>());
        if (lstCategoriaVO != null) {
            for (CategoriaVO vo : lstCategoriaVO) {
                dto.getLstCategorias().add(new CategoriaDTO(
                        vo.getId(), vo.getDescripcion()));
            }
        }
        if (id != 0) {
            PeliculaVO vo = (PeliculaVO) dao.getEntity(PeliculaVO.class, id);
            dto.setId(vo.getId());
            dto.setTitulo(vo.getTitulo());
            dto.setDescripcion(vo.getDescripcion());
            dto.setFecha(vo.getFecha());
            dto.setIdCategoria(vo.getCategoria().getId());
        }
        logger.debug("cargarPelicula - Fin");
        return dto;
    }

    @Override
    public void insertarPelicula(PeliculaDTO dto) {
        logger.debug("insertarPelicula - Inicio");
        PeliculaVO peliculaVo = new PeliculaVO(dto.getId(), dto.getTitulo(), dto.getDescripcion());
        peliculaVo.setFecha(dto.getFecha_StringToDate());
        CategoriaVO categoriaVo = (CategoriaVO) dao.getEntity(CategoriaVO.class, dto.getIdCategoria());
        peliculaVo.setCategoria(categoriaVo);
        dao.insertar(peliculaVo);
        logger.debug("insertarPelicula - Fin");
    }

    @Override
    public void actualizarPelicula(PeliculaDTO dto) {
        logger.debug("actualizarPelicula - Inicio");
        PeliculaVO peliculaVo = (PeliculaVO) dao.getEntity(PeliculaVO.class, dto.getId());
        peliculaVo.setTitulo(dto.getTitulo());
        peliculaVo.setDescripcion(dto.getDescripcion());
        peliculaVo.setFecha(dto.getFecha_StringToDate());
        CategoriaVO categoriaVo = (CategoriaVO) dao.getEntity(CategoriaVO.class, dto.getIdCategoria());
        peliculaVo.setCategoria(categoriaVo);
        dao.actualizar(peliculaVo);
        logger.debug("actualizarPelicula - Fin");
    }

    @Override
    public void eliminarPelicula(int id) {
        logger.debug("eliminarPelicula - Inicio");
        PeliculaVO peliculaVo = (PeliculaVO) dao.getEntity(PeliculaVO.class,id);
        dao.eliminar(peliculaVo);
        logger.debug("eliminarPelicula - Fin");
    }
}
