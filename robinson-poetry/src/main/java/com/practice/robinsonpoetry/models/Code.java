package com.practice.robinsonpoetry.models;


public class Code extends Writing{

    public String language;

    public Code (String language){
        this.language=language;
    }

    public Code(){

    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


}
