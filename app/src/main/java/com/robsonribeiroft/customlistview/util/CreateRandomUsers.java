package com.robsonribeiroft.customlistview.util;

import com.robsonribeiroft.customlistview.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateRandomUsers {

    private String[] firstName = {"Robert", "Chris", "Rachel", "Jonh", "Carl", "Ronald", "Katheryne", "Suzy", "Mary", "Rana", "Joane"};
    private String[] lastName = {"Smith", "Paker", "Ace", "Wayne", "Stark", "Snow"};

    public List<User> create(int qnt){
        List<User> list = new ArrayList<>();
        User user;
        for (int i=0; i<qnt; i++){
            user = new User();
            user.setName(firstName[new Random().nextInt(firstName.length)]+ " " +lastName[new Random().nextInt(lastName.length)]);
            user.setEmail(user.getName().replace(" ", "").toLowerCase()+"@email.com");
            user.setPicture("https://unsplash.it/200/200");
            list.add(user);
        }
        return list;
    }

}
