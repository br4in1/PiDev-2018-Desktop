/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournoi.entities;

import java.math.BigInteger;

/**
 *
 * @author simo
 */
public class Stadium {
    private int id;
    private String name;
    private String city;
    private BigInteger capacity;
    private double getLat;
    private double getLong;
    private String photo;

    public Stadium(int id, String name, String city, BigInteger capacity, double getLat, double getLong, String photo) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.capacity = capacity;
        this.getLat = getLat;
        this.getLong = getLong;
        this.photo = photo;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigInteger getCapacity() {
        return capacity;
    }

    public void setCapacity(BigInteger capacity) {
        this.capacity = capacity;
    }

    public double getGetLat() {
        return getLat;
    }

    public void setGetLat(double getLat) {
        this.getLat = getLat;
    }

    public double getGetLong() {
        return getLong;
    }

    public void setGetLong(double getLong) {
        this.getLong = getLong;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    
}
