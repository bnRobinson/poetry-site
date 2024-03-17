package com.practice.robinsonpoetry.controllers;

import com.practice.robinsonpoetry.models.Poetry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class AdministratorHomeController {


    private static int nextId = 1;

    public final static Map<Integer, Poetry> poems = new HashMap<>() {{
        put(1, new Poetry("Autumn", "Nature"));
        put(2, new Poetry("Baby Thoughts", "Family"));
        put(3, new Poetry("Dear Mama", "Family"));
        put(4, new Poetry("Frostbite", "Nature"));
    }};

    @GetMapping("/addPoem")
    @ResponseBody
    public String renderAddPoemPage(@RequestParam String title, String topic) {

        Poetry poem = new Poetry(title, topic);

        poems.put(nextId,poem);

        return "redirect";

//        poems.put(nextId, title, topic);
//        nextId ++;
//        return "<html>" +
//                "<body>" +
//                "<h2>" +
//                "Poem Successfully Added!"+
//                "<h2>" +
//                "<p> Your poem" + poem + "has been added to the poetry collection <p>" +
//                "</body>" +
//                "</html>";

    }
}
