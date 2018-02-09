/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.entities;

import java.sql.Date;

/**
 *
 * @author Moez
 */
public class Team {
    private int id ; //
    private String name ; //
    private String coach ; //
    private String president  ; //
    private String area ; //
    private int gamesPlayed ;//
    private int goalScored ;//
    private int goalAgainst ; //
    private int participations ;//
    private Date fifaDate ; //
    private String wcGroup ; //
    private int win ;//
    private int loose ;// 
    private int draw ;//
    private int points ;//
    private Player bestScorer ;//
    private int fifaRank ;//
    private String flagPhoto ; //
    private String squadPhoto ;//
    private String descriptionPhoto ; //
    private String description ;//
    private String website ;//
    private String video ;//

    public Team(int id, String name, String coach, String president, String area, int gamesPlayed, int goalScored, int goalAgainst, int participations, Date fifaDate, String wcGroup, int win, int loose, int draw, int points, Player bestScorer, int fifaRank, String flagPhoto, String squadPhoto, String descriptionPhoto, String description, String website, String video) {
        this.id = id;
        this.name = name;
        this.coach = coach;
        this.president = president;
        this.area = area;
        this.gamesPlayed = gamesPlayed;
        this.goalScored = goalScored;
        this.goalAgainst = goalAgainst;
        this.participations = participations;
        this.fifaDate = fifaDate;
        this.wcGroup = wcGroup;
        this.win = win;
        this.loose = loose;
        this.draw = draw;
        this.points = points;
        this.bestScorer = bestScorer;
        this.fifaRank = fifaRank;
        this.flagPhoto = flagPhoto;
        this.squadPhoto = squadPhoto;
        this.descriptionPhoto = descriptionPhoto;
        this.description = description;
        this.website = website;
        this.video = video;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGoalScored() {
        return goalScored;
    }

    public void setGoalScored(int goalScored) {
        this.goalScored = goalScored;
    }

    public int getGoalAgainst() {
        return goalAgainst;
    }

    public void setGoalAgainst(int goalAgainst) {
        this.goalAgainst = goalAgainst;
    }

    public int getParticipations() {
        return participations;
    }

    public void setParticipations(int participations) {
        this.participations = participations;
    }

    public Date getFifaDate() {
        return fifaDate;
    }

    public void setFifaDate(Date fifaDate) {
        this.fifaDate = fifaDate;
    }

    public String getWcGroup() {
        return wcGroup;
    }

    public void setWcGroup(String wcGroup) {
        this.wcGroup = wcGroup;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLoose() {
        return loose;
    }

    public void setLoose(int loose) {
        this.loose = loose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Player getBestScorer() {
        return bestScorer;
    }

    public void setBestScorer(Player bestScorer) {
        this.bestScorer = bestScorer;
    }

    public int getFifaRank() {
        return fifaRank;
    }

    public void setFifaRank(int fifaRank) {
        this.fifaRank = fifaRank;
    }

    public String getFlagPhoto() {
        return flagPhoto;
    }

    public void setFlagPhoto(String flagPhoto) {
        this.flagPhoto = flagPhoto;
    }

    public String getSquadPhoto() {
        return squadPhoto;
    }

    public void setSquadPhoto(String squadPhoto) {
        this.squadPhoto = squadPhoto;
    }

    public String getDescriptionPhoto() {
        return descriptionPhoto;
    }

    public void setDescriptionPhoto(String descriptionPhoto) {
        this.descriptionPhoto = descriptionPhoto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
    
    
}
