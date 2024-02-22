package com.practice.robinsonpoetry.models;

import java.util.Objects;

public class Poetry {

    public static int nextId= 1;

    private final int id;
    private String title;
    private String topic;

    public Poetry (String title, String topic){
        this. title= title;
        this.topic= topic;
        this.id= nextId;
        nextId++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Topic: "+ topic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Poetry poetry)) return false;
        return getId() == poetry.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
