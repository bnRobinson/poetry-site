package com.practice.robinsonpoetry.models;

public abstract class Writing {

    public static int nextId= 1;

    public int id;

    public String title;

    public String genre;

    public int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
