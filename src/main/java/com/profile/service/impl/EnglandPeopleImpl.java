package com.profile.service.impl;

import com.profile.service.Action;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("en")
public class EnglandPeopleImpl implements Action {

    @Override
    public String speak() {
        return "en lang !";
    }

}
