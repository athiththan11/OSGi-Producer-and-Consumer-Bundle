package com.sample.athiththan.fabricator.model;

public class Fact {

    private String username;
    private String os;

    public Fact(String username, String os) {
        this.setUsername(username);
        this.setOs(os);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Fact [os=" + os + ", username=" + username + "]";
    }
}