package com.robsonribeiroft.customlistview.model;

/**
 * Created by robso on 30/08/2017.
 */

public class User {

    private String name;
    private String email;
    private String picture;

    @Override
    public String toString() {
        return name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
