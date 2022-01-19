package com.pzfc.models;

import java.util.Objects;

public class MaddenOverPriced{

    private String playerFirstName;
    private String playerLastName;
    private int yearsActive;

    public MaddenOverPriced(){

    }

    public MaddenOverPriced(String playerFirstName, String playerLastName, int yearsActive) {
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
        MaddenOverPriced that = (MaddenOverPriced) o;
        return yearsActive == that.yearsActive && Objects.equals(playerFirstName, that.playerFirstName) && Objects.equals(playerLastName, that.playerLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerFirstName, playerLastName, yearsActive);
    }

    @Override
    public String toString() {
        return "MaddenOverPriced{" +
                "playerFirstName='" + playerFirstName + '\'' +
                ", playerLastName='" + playerLastName + '\'' +
                ", yearsActive=" + yearsActive +
                '}';
    }
}
