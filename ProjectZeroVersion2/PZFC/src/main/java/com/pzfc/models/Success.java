package com.pzfc.models;

import java.util.Objects;

public class Success {

    private String playerLastName;
    private String playerPostion;
    private String rookieTeam;
    private boolean active;
    private int superBowls;
    private int proBowls;
    private int hallOfFame;
    private int playerNumber;

    public Success() {

    }

    public Success(String playerLastName, String playerPostion, String rookieTeam, boolean active, int superBowls, int proBowls, int hallOfFame, int playerNumber) {

        this.playerLastName = playerLastName;
        this.playerPostion = playerPostion;
        this.rookieTeam = rookieTeam;
        this.active = active;
        this.superBowls = superBowls;
        this.proBowls = proBowls;
        this.hallOfFame = hallOfFame;
        this.playerNumber = playerNumber;

    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public String getPlayerPostion() {
        return playerPostion;
    }

    public void setPlayerPostion(String playerPostion) {
        this.playerPostion = playerPostion;
    }

    public String getRookieTeam() {
        return rookieTeam;
    }

    public void setRookieTeam(String rookieTeam) {
        this.rookieTeam = rookieTeam;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSuperBowls() {
        return superBowls;
    }

    public void setSuperBowls(int superBowls) {
        this.superBowls = superBowls;
    }

    public int getProBowls() {
        return proBowls;
    }

    public void setProBowls(int proBowls) {
        this.proBowls = proBowls;
    }

    public int getHallOfFame() {
        return hallOfFame;
    }

    public void setHallOfFame(int hallOfFame) {
        this.hallOfFame = hallOfFame;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Success success = (Success) o;
        return active == success.active && superBowls == success.superBowls && proBowls == success.proBowls && hallOfFame == success.hallOfFame && playerNumber == success.playerNumber && Objects.equals(playerLastName, success.playerLastName) && Objects.equals(playerPostion, success.playerPostion) && Objects.equals(rookieTeam, success.rookieTeam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerLastName, playerPostion, rookieTeam, active, superBowls, proBowls, hallOfFame, playerNumber);
    }

    @Override
    public String toString() {
        return "success{" +
                "playerLastName='" + playerLastName + '\'' +
                ", playerPostion='" + playerPostion + '\'' +
                ", rookieTeam='" + rookieTeam + '\'' +
                ", active=" + active +
                ", superBowls=" + superBowls +
                ", proBowls=" + proBowls +
                ", hallOfFame=" + hallOfFame +
                ", playerNumber=" + playerNumber +
                '}';
    }

}
