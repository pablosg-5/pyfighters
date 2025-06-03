package com.myapp.struts.dao;


/**
 *
 * @author pablo
 */
import com.myapp.struts.model.Match;
import java.sql.*;
import java.util.*;

public class MatchDAO {

    private final String URL = "jdbc:mysql://localhost:3306/pyfighters_db";
    private final String USER = "root";
    private final String PASSWORD = ""; // cambia si tienes clave

    public List<Match> getAllMatches() {
        List<Match> matches = new ArrayList<>();

        String sql = "SELECT m.match_id, f1.username AS fighter1, f2.username AS fighter2,\n"
                + "                   a.name AS arena, m.result, m.date\n"
                + "            FROM Matches m\n"
                + "            JOIN Fighters f1 ON m.fighter1_id = f1.fighter_id\n"
                + "            JOIN Fighters f2 ON m.fighter2_id = f2.fighter_id\n"
                + "            JOIN Arenas a ON m.arena_id = a.arena_id\n"
                + "            ORDER BY m.date DESC";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Match match = new Match();
                match.setMatchId(rs.getInt("match_id"));
                match.setFighter1(rs.getString("fighter1"));
                match.setFighter2(rs.getString("fighter2"));
                match.setArena(rs.getString("arena"));
                match.setResult(rs.getString("result"));
                match.setDate(rs.getString("date"));
                matches.add(match);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return matches;
    }
}
