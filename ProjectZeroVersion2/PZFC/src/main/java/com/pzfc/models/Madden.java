package com.pzfc.models;

import java.util.Objects;

public class Madden {

    private String playerFirstName;
    private String playerLastName;
    private int yearsActive;

    public Madden() {

    }

    public Madden(String playerFirstName, String playerLastName, int yearsActive) {

        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.yearsActive = yearsActive;

    }

    public String getPlayerFirstName() {
        return playerFirstName;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public int getYearsActive() {
        return yearsActive;
    }

    public void setYearsActive(int yearsActive) {
        this.yearsActive = yearsActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Madden madden = (Madden) o;
        return yearsActive == madden.yearsActive && Objects.equals(playerFirstName, madden.playerFirstName) && Objects.equals(playerLastName, madden.playerLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerFirstName, playerLastName, yearsActive);
    }

    @Override
    public String toString() {
        return "Madden{" +
                "playerFirstName='" + playerFirstName + '\'' +
                ", playerLastName='" + playerLastName + '\'' +
                ", yearsActive=" + yearsActive +
                '}';
    }

}
