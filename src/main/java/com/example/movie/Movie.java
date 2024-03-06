// Write your code here

package com.example.movie;

public class Movie {
    private int movieId;
    private String movieName;
    private String leadActor;

    public Movie(int movieId, String movieName, String leadActor) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.leadActor = leadActor;
    }

    public void setId(int movieId) {
        this.movieId = movieId;
    }

    public int getId() {
        return this.movieId;
    }

    public void setName(String movieName) {
        this.movieName = movieName;
    }

    public String getName() {
        return this.movieName;
    }

    public void setActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public String getActor() {
        return this.leadActor;
    }
}