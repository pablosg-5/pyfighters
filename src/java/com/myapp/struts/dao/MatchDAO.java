/**
 *
 * @author pablo
 */

package com.myapp.struts.dao;

import com.myapp.struts.model.Match;
import java.util.List;

public interface MatchDAO {

    // Crear combate
    void createMatch(Match match) throws Exception;

    // Modificar combate
    void updateMatch(Match match) throws Exception;

    // Eliminar combate por ID
    void deleteMatch(int matchId) throws Exception;

    // Obtener combate por ID
    Match getMatch(int matchId) throws Exception;

    // Listar todos los combates
    List<Match> listMatches() throws Exception;

    // Buscar combates por fecha o participantes
    List<Match> searchMatches(String fecha, Integer fighter1Id, Integer fighter2Id) throws Exception;
}
