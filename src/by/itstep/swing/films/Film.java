package by.itstep.swing.films;

import java.util.Date;

public class Film
{
    private long uid;
    private double imdbRate;
    private String name;
    private String type;
    private Date releaseDate;
    private Actor[] actor;
    private double boxOffice;
    private String country;

    public Film(long uid, double imdbRate, String name, String type, Date releaseDate, Actor[] actor, double boxOffice, String country) {
        this.uid = uid;
        this.imdbRate = imdbRate;
        this.name = name;
        this.type = type;
        this.releaseDate = releaseDate;
        this.actor = actor;
        this.boxOffice = boxOffice;
        this.country = country;
    }
    public Film()
    {

    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public double getImdbRate() {
        return imdbRate;
    }

    public void setImdbRate(double imdbRate) {
        this.imdbRate = imdbRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    public double getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(double boxOffice) {
        this.boxOffice = boxOffice;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
