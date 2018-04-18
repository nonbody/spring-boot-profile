package com.profile.service.impl;

import com.profile.service.Action;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("jp")
public class JapanesePeopleImpl implements Action {

    @Override
    public String speak() {
        return "jp lang !";
    }

}
