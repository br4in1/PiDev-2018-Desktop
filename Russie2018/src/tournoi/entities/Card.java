/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournoi.entities;

import team.entities.Player;

/**
 *
 * @author simo
 */
public class Card {
    private int id;
    private Game game;
    private Player player;
    private int yellow;
    private int red;

    public Card(int id, Game game, Player player, int yellow, int red) {
        this.id = id;
        this.game = game;
        this.player = player;
        this.yellow = yellow;
        this.red = red;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getYellow() {
        return yellow;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }
    
    
    
    
}
