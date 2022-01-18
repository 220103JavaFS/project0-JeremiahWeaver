package com.pzfc.models;

import java.util.Objects;

public class Collector {

    private String collectorAllias;
    private String collectorStlye;
    private int collectorCollection;

    public Collector() {

    }

    public Collector(String collectorAllias, String collectorStlye, int collectorCollection) {

        this.collectorAllias = collectorAllias;
        this.collectorStlye = collectorStlye;
        this.collectorCollection = collectorCollection;

    }

    public String getCollectorAllias() {
        return collectorAllias;
    }

    public void setCollectorAllias(String collectorAllias) {
        this.collectorAllias = collectorAllias;
    }

    public String getCollectorStlye() {
        return collectorStlye;
    }

    public void setCollectorStlye(String collectorStlye) {
        this.collectorStlye = collectorStlye;
    }

    public int getCollectorCollection() {
        return collectorCollection;
    }

    public void setCollectorCollection(int collectorCollection) {
        this.collectorCollection = collectorCollection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collector collector = (Collector) o;
        return collectorCollection == collector.collectorCollection && Objects.equals(collectorAllias, collector.collectorAllias) && Objects.equals(collectorStlye, collector.collectorStlye);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectorAllias, collectorStlye, collectorCollection);
    }

    @Override
    public String toString() {
        return "Collector{" +
                "collectorAllias='" + collectorAllias + '\'' +
                ", collectorStlye='" + collectorStlye + '\'' +
                ", collectorCollection=" + collectorCollection +
                '}';

    }

}
