package com.serenitydojo.flyinghigh.domain;

public enum FrequentFlyerAccount {
    Tracy("Tracy Traveller", "admin"),
    Bruce("Bruce Wayne","batmobile");

    private final String username;
    private final String password;

    FrequentFlyerAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
