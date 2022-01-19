package com.pzfc.models;

import java.util.Objects;

public class Signed {

    private String playerFirstName;
    private String playerLastName;
    private String rookieTeam;
    private int superBowls;
    private int rookieNumber;


    public Signed(){

    }

    public Signed(String playerFirstName, String playerLastName, String rookieTeam, int superBowls, int rookieNumber) {
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.rookieTeam = rookieTeam;
        this.superBowls = superBowls;
        this.rookieNumber = rookieNumber;
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

    public String getRookieTeam() {
        return rookieTeam;
    }

    public void setRookieTeam(String rookieTeam) {
        this.rookieTeam = rookieTeam;
    }

    public int getSuperBowls() {
        return superBowls;
    }

    public void setSuperBowls(int superBowls) {
        this.superBowls = superBowls;
    }

    public int getRookieNumber() {
        return rookieNumber;
    }

    public void setRookieNumber(int rookieNumber) {
        this.rookieNumber = rookieNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Signed signed = (Signed) o;
        return superBowls == signed.superBowls && rookieNumber == signed.rookieNumber && Objects.equals(playerFirstName, signed.playerFirstName) && Objects.equals(playerLastName, signed.playerLastName) && Objects.equals(rookieTeam, signed.rookieTeam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerFirstName, playerLastName, rookieTeam, superBowls, rookieNumber);
    }

    @Override
    public String toString() {
        return "Signed{" +
                "playerFirstName='" + playerFirstName + '\'' +
                ", playerLastName='" + playerLastName + '\'' +
                ", rookieTeam='" + rookieTeam + '\'' +
                ", superBowls=" + superBowls +
                ", rookieNumber=" + rookieNumber +
                '}';
    }
}
