/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.presentacion.cu_mtnpelicula;

import inkar.app.negocio.cu_mtnpelicula.MtnPelicula;
import inkar.app.negocio.cu_mtnpelicula.dto.PeliculaDTO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
public class MtnPeliculaAction {

    private static final Logger logger = Logger.getLogger(MtnPeliculaAction.class);
    @Autowired
    private MtnPelicula mtnPelicula;

    @RequestMapping("/listarPeliculas")
    public ModelAndView listarPeliculas(HttpServletRequest request, HttpServletResponse response) {
        logger.debug("listarPeliculas - Inicio");
        ModelAndView model = new ModelAndView("cargarPeliculas");
        model.addObject("lstPeliculas", this.mtnPelicula.listaDePelicula());
        logger.debug("listarPeliculas - Fin");
        return model;
    }

    @RequestMapping(value = "/cargarMantenimientoPelicula", method = RequestMethod.GET)
    public ModelAndView cargarMantenimiento(@RequestParam("id") int id, HttpServletRequest request) {
        logger.debug("cargarMantenimiento - Inicio");
        ModelAndView model = new ModelAndView("mtnPelicula");
        PeliculaDTO dto = this.mtnPelicula.cargarPelicula(id);
        model.addObject("pelicula", dto);
        if (id == 0) {
            model.addObject("categoria_id", 0);
        } else {
            model.addObject("categoria_id", dto.getIdCategoria());
        }
        logger.debug("cargarMantenimiento - Fin");
        return model;
    }

    @RequestMapping(value = "/guardarPelicula", method = RequestMethod.POST)
//    public String addPelicula(@ModelAttribute(value = "pelicula") PeliculaEntity pelicula, BindingResult result)
    public ModelAndView guardarPelicula(@ModelAttribute(value = "pelicula") PeliculaDTO pelicula, BindingResult result) {
        logger.debug("guardarPelicula - Inicio");
        if (pelicula.getId() == 0) {
            this.mtnPelicula.insertarPelicula(pelicula);
        } else {
            this.mtnPelicula.actualizarPelicula(pelicula);
        }
        ModelAndView model = new ModelAndView("cargarPeliculas");
        model.addObject("lstPeliculas", this.mtnPelicula.listaDePelicula());
        logger.debug("guardarPelicula - Fin");
        return model;
    }

    @RequestMapping(value = "/eliminarPelicula", method = RequestMethod.GET)
    public ModelAndView eliminarPelicula(@RequestParam("id") int id, HttpServletRequest request) {
        logger.debug("eliminarPelicula - Inicio");
        this.mtnPelicula.eliminarPelicula(id);
        ModelAndView model = new ModelAndView("cargarPeliculas");
        model.addObject("lstPeliculas", this.mtnPelicula.listaDePelicula());
        logger.debug("eliminarPelicula - Fin");
        return model;
    }
}
