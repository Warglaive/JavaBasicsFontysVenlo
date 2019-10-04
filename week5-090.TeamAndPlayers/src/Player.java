/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warglaive
 */
public class Player {

    private String name;
    private int goalsAmount;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int goalsAmount) {
        this.goalsAmount = goalsAmount;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int goals() {
        return this.goalsAmount;
    }

    public String toString() {
        return "Player: " + this.name + ", goals " + this.goalsAmount;
    }
}
