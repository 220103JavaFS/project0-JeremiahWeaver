package com.pzfc.models;

import java.util.Objects;

public class Collections {

    private String collectorAllias;
    private boolean collectedMadden;
    private boolean collectedSuccess;
    private boolean collectedRookie;

    public Collections() {

    }

    public Collections(String collectorAllias, boolean collectedMadden, boolean collectedSuccess, boolean collectedRookie) {

        this.collectorAllias = collectorAllias;
        this.collectedMadden = collectedMadden;
        this.collectedSuccess = collectedSuccess;
        this.collectedRookie = collectedRookie;

    }

    public String getCollectorAllias() {
        return collectorAllias;
    }

    public void setCollectorAllias(String collectorAllias) {
        this.collectorAllias = collectorAllias;
    }

    public boolean isCollectedMadden() {
        return collectedMadden;
    }

    public void setCollectedMadden(boolean collectedMadden) {
        this.collectedMadden = collectedMadden;
    }

    public boolean isCollectedSuccess() {
        return collectedSuccess;
    }

    public void setCollectedSuccess(boolean collectedSuccess) {
        this.collectedSuccess = collectedSuccess;
    }

    public boolean isCollectedRookie() {
        return collectedRookie;
    }

    public void setCollectedRookie(boolean collectedRookie) {
        this.collectedRookie = collectedRookie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collections that = (Collections) o;
        return collectedMadden == that.collectedMadden && collectedSuccess == that.collectedSuccess && collectedRookie == that.collectedRookie && Objects.equals(collectorAllias, that.collectorAllias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectorAllias, collectedMadden, collectedSuccess, collectedRookie);
    }

    @Override
    public String toString() {
        return "Collections{" +
                "collectorAllias='" + collectorAllias + '\'' +
                ", collectedMadden=" + collectedMadden +
                ", collectedSuccess=" + collectedSuccess +
                ", collectedRookie=" + collectedRookie +
                '}';

    }

}
