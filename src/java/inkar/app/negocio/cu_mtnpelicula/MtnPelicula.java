/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.negocio.cu_mtnpelicula;

import inkar.app.negocio.cu_mtnpelicula.dto.PeliculaDTO;
import java.util.List;

/**
 *
 * @author Orus
 */
public interface MtnPelicula {

    public void insertarPelicula(PeliculaDTO dto);

    public void actualizarPelicula(PeliculaDTO dto);
    
    public void eliminarPelicula(int id);
    
    public List<PeliculaDTO> listaDePelicula();
    
    public PeliculaDTO cargarPelicula(int id);
    
}
