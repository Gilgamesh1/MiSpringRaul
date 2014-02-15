/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inkar.app.negocio.cu_mtncategroria;

import inkar.app.negocio.cu_mtncategroria.dto.CategoriaDTO;
import java.util.List;

/**
 *
 * @author Orus
 */
public interface MtnCategoria {

    public void insertarCategoria(CategoriaDTO dto);

    public void actualizarCategoria(CategoriaDTO dto);
    
    public void eliminarCategoria(int id);
    
    public List<CategoriaDTO> listaDeCategoria();
    
    public CategoriaDTO cargarCategoria(int id);
}
