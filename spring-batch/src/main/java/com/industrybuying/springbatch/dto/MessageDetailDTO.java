package com.industrybuying.springbatch.dto;

public class MessageDetailDTO {
    int total;
    Truth truth;
    Cubee cube;
    Google google;
    Ibm ibm;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Truth getTruth() {
        return truth;
    }

    public void setTruth(Truth truth) {
        this.truth = truth;
    }

    public Cubee getCube() {
        return cube;
    }

    public void setCube(Cubee cube) {
        this.cube = cube;
    }

    public Google getGoogle() {
        return google;
    }

    public void setGoogle(Google google) {
        this.google = google;
    }

    public Ibm getIbm() {
        return ibm;
    }

    public void setIbm(Ibm ibm) {
        this.ibm = ibm;
    }
}
