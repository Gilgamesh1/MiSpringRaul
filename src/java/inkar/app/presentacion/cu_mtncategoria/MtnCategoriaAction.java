
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.presentacion.cu_mtncategoria;

import inkar.app.negocio.cu_mtncategroria.MtnCategoria;
import inkar.app.negocio.cu_mtncategroria.dto.CategoriaDTO;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Orus
 */
@Controller
public class MtnCategoriaAction {

    private static final Logger logger = Logger.getLogger(MtnCategoriaAction.class);
    @Autowired
    private MtnCategoria mtnCategoria;

    public MtnCategoriaAction() {
    }

    @RequestMapping("/listarCategorias")
    public ModelAndView listarCategorias(HttpServletRequest request, HttpServletResponse response) {
        logger.debug("listarCategorias - INICIO");
        List<CategoriaDTO> lstCategorias = mtnCategoria.listaDeCategoria();
        ModelAndView model = new ModelAndView("cargarCategorias");
        model.addObject("lstCategorias", lstCategorias);
        logger.debug("listarCategorias - Fin");
        return model;
    }

    @RequestMapping(value = "/cargarMantenimientoCategoria", method = RequestMethod.GET)
    public ModelAndView cargarMantenimiento(@RequestParam("id") int id, HttpServletRequest request) {
        logger.debug("cargarMantenimiento - Inicio");
        ModelAndView model = new ModelAndView("mtnCategoria");
        if (id == 0) {
            model.addObject("categoria", new CategoriaDTO());
        } else {
            model.addObject("categoria", this.mtnCategoria.cargarCategoria(id));
        }
        logger.debug("cargarMantenimiento - Fin");
        return model;
    }

    @RequestMapping(value = "/insertar_Actualizar", method = RequestMethod.POST)
    public ModelAndView insertarOGuardar(@ModelAttribute("object") CategoriaDTO categoria, HttpServletRequest request) {
        logger.debug("insertarOGuardar - Inicio");
        List<CategoriaDTO> lstCategorias = (List<CategoriaDTO>) request.getSession().getAttribute("lstCategorias");
        ModelAndView model = new ModelAndView("cargarCategorias");
        if (categoria.getId() == 0) {
            mtnCategoria.insertarCategoria(categoria);
            lstCategorias = mtnCategoria.listaDeCategoria();
            model.addObject("lstCategorias", lstCategorias);
        } else {
            mtnCategoria.actualizarCategoria(categoria);
            lstCategorias = mtnCategoria.listaDeCategoria();
            model.addObject("lstCategorias", lstCategorias);
        }
        logger.debug("insertarOGuardar - Fin");
        return model;
    }

    @RequestMapping(value = "/eliminarCategoria", method = RequestMethod.GET)
    public ModelAndView eliminarCategoria(@RequestParam("id") int id, HttpServletRequest request) {
        logger.debug("eliminarCategoria - Inicio");
        mtnCategoria.eliminarCategoria(id);
        List<CategoriaDTO> lstCategorias = mtnCategoria.listaDeCategoria();
        ModelAndView model = new ModelAndView("cargarCategorias");
        model.addObject("lstCategorias", lstCategorias);
        logger.debug("eliminarCategoria - Fin");
        return model;
    }
}
