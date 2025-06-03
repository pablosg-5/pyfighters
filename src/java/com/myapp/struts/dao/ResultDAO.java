/**
 *
 * @author pablo
 */
package com.myapp.struts.dao;

import com.myapp.struts.model.Result;
import java.util.List;

public interface ResultDAO {

    // Crear resultado
    void createResult(Result result) throws Exception;

    // Modificar resultado
    void updateResult(Result result) throws Exception;

    // Eliminar resultado por ID
    void deleteResult(int resultId) throws Exception;

    // Obtener resultado por ID
    Result getResult(int resultId) throws Exception;

    // Listar todos los resultados
    List<Result> listResults() throws Exception;

    // Buscar resultados por luchador o arena
    List<Result> searchResults(Integer fighterId, Integer arenaId) throws Exception;
}
