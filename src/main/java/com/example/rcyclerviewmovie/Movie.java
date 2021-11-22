package com.example.rcyclerviewmovie;

public class Movie {
    //Attributes
    private String Name, Year,Genre;
    //Constructor
    public Movie(String n, String g, String y)
    {
        this.Name = n;
        this.Year = y;
        this.Genre = g;
    }
    //Getters
    public String getName() {
        return Name;
    }
    public String getYear() {
        return Year;
    }
    public String getGenre() {
        return Genre;
    }
}
