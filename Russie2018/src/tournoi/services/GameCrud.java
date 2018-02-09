/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournoi.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tournoi.entities.Game;
import tournoi.utils.DataSource;

/**
 *
 * @author simo
 */
public class GameCrud {
    
     public static void InsertGame(Game game){
        Connection con = DataSource.getInstance().getCon();
        
        String query = "INSERT INTO `Game`"
                + "(`Date`, `HomeTeam`, `AwayTeam`, `Result`, `Stadium`, `Summary`, `SummaryPhoto`, `Highlights`, `Referee`)"
                + " VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ste = con.prepareStatement(query);
            
            ste.setDate(1, game.getDate());
            ste.setInt(2, game.getHomeTeam().getId());
            ste.setInt(3, game.getAwayTeam().getId());
            ste.setString(4, game.getResult());
            ste.setInt(5, game.getStadium().getId());
            ste.setString(6, game.getSummary());
            ste.setString(7, game.getSummaryPhoto());
            ste.setString(8, game.getHighlights());
            ste.setString(9, game.getReferee());
            
            ste.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CrudPersonne.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
