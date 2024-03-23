package com.practice.robinsonpoetry.models;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;



@Entity
public class Poetry extends Writing {



    private String topic;

    public Poetry (String title, String topic){
        this. title= title;
        this.topic= topic;
        //this.id= id;
    }

public Poetry() {
}

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }



    @Override
    public String toString() {
        return "Title: " + title + ", Topic: "+ topic;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Poetry poetry)) return false;
//        return getId() == poetry.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
}
