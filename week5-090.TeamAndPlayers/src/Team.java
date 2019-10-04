
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class Team {

    private final int defaultMaxSize = 16;
    private ArrayList<Player> Players;
    private String name;
    private int maxSize;

    public Team(String name) {
        this.maxSize=defaultMaxSize;
        this.Players = new ArrayList<Player>();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (this.size() != this.maxSize) {
            this.Players.add(player);
        }
    }

    public void printPlayers() {
        for (Player Player : Players) {
            System.out.println(Player.toString());
        }
    }

    public void setMaxSize(int maxSize) {
        if (maxSize != defaultMaxSize) {
            this.maxSize = maxSize;
        }
    }

    public int size() {
        return this.Players.size();
    }

    public int goals() {
        int goalsSum = 0;
        for (Player Player : Players) {
            goalsSum += Player.goals();
        }
        return goalsSum;
    }
}
