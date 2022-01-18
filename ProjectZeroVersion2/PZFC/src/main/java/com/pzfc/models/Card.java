package com.pzfc.models;

import java.util.Objects;

public class Card {

    private int id;
    private String playerFirstName;
    private String playerLastName;
    private String playerPostion;
    private int rookieYear;
    private boolean maddenCard;
    private boolean successCard;
    private boolean rookieCard;

    public Card() {

    }

    public Card(int id, String playerFirstName, String playerLastName, String playerPostion, int rookieYear, boolean maddenCard, boolean successCard, boolean rookieCard) {
        this.id = id;
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerLastName;
        this.playerPostion = playerPostion;
        this.rookieYear = rookieYear;
        this.maddenCard = maddenCard;
        this.successCard = successCard;
        this.rookieCard = rookieCard;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerFirstNamelayerFirstName() {
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

    public String getPlayerPostion() {
        return playerPostion;
    }

    public void setPlayerPostion(String playerPostion) {
        this.playerPostion = playerPostion;
    }

    public int getRookieYear() {
        return rookieYear;
    }

    public void setRookieYear(int rookieYear) {
        this.rookieYear = rookieYear;
    }

    public boolean isMaddenCard() {
        return maddenCard;
    }

    public void setMaddenCard(boolean maddenCard) {
        this.maddenCard = maddenCard;
    }

    public boolean isSuccessCard() {
        return successCard;
    }

    public void setSuccessCard(boolean successCard) {
        this.successCard = successCard;
    }

    public boolean isRookieCard() {
        return rookieCard;
    }

    public void setRookieCard(boolean rookieCard) {
        this.rookieCard = rookieCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return id == card.id && rookieYear == card.rookieYear && maddenCard == card.maddenCard && successCard == card.successCard && rookieCard == card.rookieCard && Objects.equals(playerFirstName, card.playerFirstName) && Objects.equals(playerLastName, card.playerLastName) && Objects.equals(playerPostion, card.playerPostion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, playerFirstName, playerFirstName, playerPostion, rookieYear, maddenCard, successCard, rookieCard);
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", playerFirstName ='" + playerFirstName + '\'' +
                ", playerLastName ='" + playerLastName + '\'' +
                ", playerPostion='" + playerPostion + '\'' +
                ", rookieYear=" + rookieYear +
                ", maddenCard=" + maddenCard +
                ", successCard=" + successCard +
                ", rookieCard=" + rookieCard +
                '}';

    }

}
