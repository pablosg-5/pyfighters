/**
 *
 * @author pablo
 */
package action;

import model.Match;
import dao.MatchDAO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

public class MatchAction extends ActionSupport {

    private List<Match> matches;

    public String execute() {
        MatchDAO dao = new MatchDAO();
        matches = dao.getAllMatches();
        return SUCCESS;
    }

    public List<Match> getMatches() {
        return matches;
    }
}
