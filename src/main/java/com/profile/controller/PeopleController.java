package com.profile.controller;

import com.profile.service.Action;
import com.profile.service.impl.ThaiPeopleImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    @Autowired
    private ThaiPeopleImpl thaiPeople;

//    @Autowired
//    private Action action;

//    @GetMapping
//    public ResponseEntity<String> get(@RequestHeader(value = "Server") String server) {
//        //return action.speak() + " " + thaiPeople + " " + server;
//        MultiValueMap<String, String> headsss = new LinkedMultiValueMap<>();
////        headsss.add("Content-Type", "application/json");
////        headsss.add("Server", "x");
////        headsss.add("Date", "x");
////        headsss.add("Custom", "x");
//        return new ResponseEntity<String>(action.speak() + " " + server, headsss, HttpStatus.OK);
//    }

}

