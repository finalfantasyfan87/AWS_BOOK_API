package com.example.controller;

import com.example.model.BookDTO;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/featuredBook")
    public BookDTO getFeaturedBook(){
       Gson gson = new Gson();
        String jsonBook = "{\n" +
                "      \"isbn\": \"9781593275846\",\n" +
                "      \"title\": \"Eloquent JavaScript, Second Edition\",\n" +
                "      \"subtitle\": \"A Modern Introduction to Programming\",\n" +
                "      \"author\": \"Marijn Haverbeke\",\n" +
                "      \"published\": \"2014-12-14T00:00:00.000Z\",\n" +
                "      \"publisher\": \"No Starch Press\",\n" +
                "      \"pages\": 472,\n" +
                "      \"description\": \"JavaScript lies at the heart of almost every modern web application, from social apps to the newest browser-based games. Though simple for beginners to pick up and play with, JavaScript is a flexible, complex language that you can use to build full-scale applications.\",\n" +
                "      \"website\": \"http://eloquentjavascript.net/\"\n" +
                "    }";
        return gson.fromJson(jsonBook, BookDTO.class);
    }
}
