package com.practice.robinsonpoetry.models;

import java.util.Objects;

public class CreativeWriting extends Writing{




    private int chapterNumber;

  public CreativeWriting (String title, String genre, int chapterNumber){
        this. title= title;
        this.genre= genre;
        this.chapterNumber= chapterNumber;
        this.id= nextId;
        nextId++;
    }



    public int getChapterNumber() {
      return chapterNumber;
    }

    public void setChapterNumber(int aChapterNumber) {
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
