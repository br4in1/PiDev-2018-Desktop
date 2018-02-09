/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournoi.entities;

import team.entities.Player;
import java.sql.Timestamp;

/**
 *
 * @author simo
 */
public class Goal {
    private int id;
    private Player player;
    private Game game;
    private int minute;
    private String video;

    public Goal(int id, Player player, Game game, int minute, String video) {
        this.id = id;
        this.player = player;
        this.game = game;
        this.minute = minute;
        this.video = video;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
     
    
    
    
}
