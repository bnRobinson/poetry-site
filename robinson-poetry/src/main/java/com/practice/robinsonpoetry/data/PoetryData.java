package com.practice.robinsonpoetry.data;

import com.practice.robinsonpoetry.models.Poetry;

import java.util.HashMap;
import java.util.Map;

public class PoetryData {
    public static final Map<Integer, Poetry> poems = new HashMap<>();

    public static void add (Poetry poem) {
        poems.put( poem.getId(), poem);
    }

    public static Poetry findById (int id){
        return poems.getId();
    }
}
