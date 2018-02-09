/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournoi.entities;

import team.entities.Team;
import java.sql.Date;

/**
 *
 * @author simo
 */
public class Game {
    private int id;
    private Date date;
    private Team homeTeam;
    private Team awayTeam;
    private String result;
    private Stadium stadium;
    private String summary;
    private String summaryPhoto;
    private String Highlights;
    private String Referee;

    public Game(int id, Date date, Team homeTeam, Team awayTeam, String result, Stadium stadium, String summary, String summaryPhoto, String Highlights, String Referee) {
        this.id = id;
        this.date = date;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.result = result;
        this.stadium = stadium;
        this.summary = summary;
        this.summaryPhoto = summaryPhoto;
        this.Highlights = Highlights;
        this.Referee = Referee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummaryPhoto() {
        return summaryPhoto;
    }

    public void setSummaryPhoto(String summaryPhoto) {
        this.summaryPhoto = summaryPhoto;
    }

    public String getHighlights() {
        return Highlights;
    }

    public void setHighlights(String Highlights) {
        this.Highlights = Highlights;
    }

    public String getReferee() {
        return Referee;
    }

    public void setReferee(String Referee) {
        this.Referee = Referee;
    }
    
    
    
    
}

