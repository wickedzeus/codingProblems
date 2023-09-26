import java.util.*;

public class TournamentWinner {
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
    ) {
        Map<String, Integer> teamTracker = new HashMap<String, Integer>();
        for(int n = 0; n < results.size(); n++) {
            ArrayList<String> teams = competitions.get(n);
            String winner = teams.get(Math.abs(results.get(n) - 1));
            if(teamTracker.containsKey(winner)) {
                Integer prevValue = teamTracker.get(winner);
                teamTracker.replace(winner, prevValue + 1);
            } else {
                teamTracker.put(winner, 1);
            }
        }

        Integer mostWins = 0;
        String winniestTeam = "";

        for (var entry : teamTracker.entrySet()) {
            System.out.println();
            if(entry.getValue() > mostWins) {
                winniestTeam = entry.getKey();
                mostWins = entry.getValue();
            }
        }

        return winniestTeam;
    }
}
