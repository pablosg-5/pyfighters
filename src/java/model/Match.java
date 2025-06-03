/**
 *
 * @author pablo
 */
package model;

public class Match {

    private int matchId;
    private String fighter1;
    private String fighter2;
    private String arena;
    private String result;
    private String date;

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getFighter1() {
        return fighter1;
    }

    public void setFighter1(String fighter1) {
        this.fighter1 = fighter1;
    }

    public String getFighter2() {
        return fighter2;
    }

    public void setFighter2(String fighter2) {
        this.fighter2 = fighter2;
    }

    public String getArena() {
        return arena;
    }

    public void setArena(String arena) {
        this.arena = arena;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
