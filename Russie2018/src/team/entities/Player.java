/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.entities;

import team.entities.Team;

/**
 *
 * @author Moez
 */
public class Player {
    private int id ;//
    private String name ; //
    private String lastName ; //
    private int age ; //
    private String club ; //
    private Team nation ; //
    private double height ;//
    private double weight ;//
    private String position ; //
    private int goals ; //
    private String description ; //
    private String profilePhoto ;//
    private String blanketPhoto ;//
    private String descriptionPhoto ;
    private String fbLink ;
    private String twitterLink ;
    private int shirtNb ; 
    private String video ; 

    public Player(int id, String name, String lastName, int age, String club, Team nation, double height, double weight, String position, int goals, String description, String profilePhoto, String blanketPhoto, String descriptionPhoto, String fbLink, String twitterLink, int shirtNb, String video) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.club = club;
        this.nation = nation;
        this.height = height;
        this.weight = weight;
        this.position = position;
        this.goals = goals;
        this.description = description;
        this.profilePhoto = profilePhoto;
        this.blanketPhoto = blanketPhoto;
        this.descriptionPhoto = descriptionPhoto;
        this.fbLink = fbLink;
        this.twitterLink = twitterLink;
        this.shirtNb = shirtNb;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public Team getNation() {
        return nation;
    }

    public void setNation(Team nation) {
        this.nation = nation;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getBlanketPhoto() {
        return blanketPhoto;
    }

    public void setBlanketPhoto(String blanketPhoto) {
        this.blanketPhoto = blanketPhoto;
    }

    public String getDescriptionPhoto() {
        return descriptionPhoto;
    }

    public void setDescriptionPhoto(String descriptionPhoto) {
        this.descriptionPhoto = descriptionPhoto;
    }

    public String getFbLink() {
        return fbLink;
    }

    public void setFbLink(String fbLink) {
        this.fbLink = fbLink;
    }

    public String getTwitterLink() {
        return twitterLink;
    }

    public void setTwitterLink(String twitterLink) {
        this.twitterLink = twitterLink;
    }

    public int getShirtNb() {
        return shirtNb;
    }

    public void setShirtNb(int shirtNb) {
        this.shirtNb = shirtNb;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
    
    
}
