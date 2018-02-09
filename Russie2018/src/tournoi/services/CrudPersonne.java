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
import tournoi.entities.Personne;
import tournoi.utils.DataSource;

/**
 *
 * @author Sofien
 */
public class CrudPersonne {
    
    public static void insererPersonne(Personne P){
        Connection con = DataSource.getInstance().getCon();
        String query = "INSERT INTO Personne VALUES(?,?,?)";
        try {
            PreparedStatement ste = con.prepareStatement(query);
            ste.setString(1, P.getNom());
            ste.setString(2, P.getMail());
            ste.setString(3, P.getPassword());
            ste.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CrudPersonne.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
