package com.pzfc.models;

import java.util.Objects;

public class Rookie {
    private String playerLastName;
    private int rookieNumber;
    private String rookieTeam;
    private int draftNumber;
    private int rookieYear;

    public Rookie() {

    }

    public Rookie(String playerLastName, int rookieNumber, String rookieTeam, int draftNumber, int rookieYear) {

        this.playerLastName = playerLastName;
        this.rookieNumber = rookieNumber;
        this.rookieTeam = rookieTeam;
        this.draftNumber = draftNumber;
        this.rookieYear = rookieYear;

    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public int getRookieNumber() {
        return rookieNumber;
    }

    public void setRookieNumber(int rookieNumber) {
        this.rookieNumber = rookieNumber;
    }

    public String getRookieTeam() {
        return rookieTeam;
    }

    public void setRookieTeam(String rookieTeam) {
        this.rookieTeam = rookieTeam;
    }

    public int getDraftNumber() {
        return draftNumber;
    }

    public void setDraftNumber(int draftNumber) {
        this.draftNumber = draftNumber;
    }

    public int getRookieYear() {
        return rookieYear;
    }

    public void setRookieYear(int rookieYear) {
        this.rookieYear = rookieYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rookie rookie = (Rookie) o;
        return rookieNumber == rookie.rookieNumber && draftNumber == rookie.draftNumber && rookieYear == rookie.rookieYear && Objects.equals(playerLastName, rookie.playerLastName) && Objects.equals(rookieTeam, rookie.rookieTeam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerLastName, rookieNumber, rookieTeam, draftNumber, rookieYear);
    }

    @Override
    public String toString() {
        return "Rookie{" +
                "playerLastName='" + playerLastName + '\'' +
                ", rookieNumber=" + rookieNumber +
                ", rookieTeam='" + rookieTeam + '\'' +
                ", draftNumber=" + draftNumber +
                ", rookieYear=" + rookieYear +
                '}';
    }
}
