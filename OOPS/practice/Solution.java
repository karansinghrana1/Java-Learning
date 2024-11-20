package practice;

import java.util.*;

class Player {
    int playerId, runs;
    String playerName, playerType, matchType;

    public Player(int id, String name, int runs, String ptype, String mtype) {
        this.playerId = id;
        this.playerName = name;
        this.runs = runs;
        this.playerType = ptype;
        this.matchType = mtype;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Player> players = new ArrayList<>();

        // Input players
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            String name = sc.nextLine();
            int run = sc.nextInt();
            sc.nextLine(); // consume newline
            String ptype = sc.nextLine();
            String mtype = sc.nextLine();
            Player player = new Player(id, name, run, ptype, mtype);
            players.add(player);
        }

        // Input types for queries
        String ptype = sc.nextLine();
        String mtype = sc.nextLine();

        // Finding player with lowest runs
        int lowestRun = findPlayerWithLowestRuns(players, ptype);

        if (lowestRun <= 0) {
            System.out.println("No Such player");
        } else {
            System.out.println(lowestRun);
        }

        // Finding players by match type
        List<Player> ans = findPlayerByMatchType(players, mtype);

        if (ans.isEmpty()) {
            System.out.println("No Player with given matchType");
        } else {
            for (Player player : ans) {
                System.out.println(player.playerId);
            }
        }
    }

    public static int findPlayerWithLowestRuns(List<Player> players, String type) {
        int lowestRun = Integer.MAX_VALUE; // Initialize with a very high value
        boolean found = false;

        for (Player player : players) {
            if (player.playerType.equalsIgnoreCase(type)) {
                if (player.runs < lowestRun) {
                    lowestRun = player.runs;
                    found = true;
                }
            }
        }

        return found ? lowestRun : -1; // Return -1 if no player found with the given type
    }

    public static List<Player> findPlayerByMatchType(List<Player> players, String type) {
        List<Player> ans = new ArrayList<>();

        for (Player player : players) {
            if (player.matchType.equalsIgnoreCase(type)) {
                ans.add(player);
            }
        }

        return ans;
    }
}
