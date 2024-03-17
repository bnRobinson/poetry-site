package com.practice.robinsonpoetry.models;

import java.util.Objects;

public class CreativeWriting {
    public static int nextId= 1;

    private final int id;
    private String title;

    private String genre;

    public CreativeWriting (String title, String genre){
        this. title= title;
        this.genre= genre;
        this.id= nextId;
        nextId++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId(){
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreativeWriting that)) return false;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
