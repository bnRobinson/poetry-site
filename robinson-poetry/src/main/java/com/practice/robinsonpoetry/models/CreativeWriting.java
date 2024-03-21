package com.practice.robinsonpoetry.models;

import com.practice.robinsonpoetry.data.Writing;

import java.util.Objects;

public class CreativeWriting extends Writing{




    private String chapterNumber;

  public CreativeWriting (String title, String genre){
        this. title= title;
        this.genre= genre;
        this.id= nextId;
        nextId++;
    }



    public String getChapterNumber() {
      return chapterNumber;
    }

    public void setChapterNumber(String aChapterNumber) {
        this.chapterNumber = aChapterNumber;
    }


    @Override
    public String toString(){
        return "Title: "+ title + " Genre: "+ genre;
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
