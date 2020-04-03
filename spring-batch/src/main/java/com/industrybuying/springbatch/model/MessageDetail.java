package com.industrybuying.springbatch.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;


//id,Message,truth,cube,google,google_spam,google_not_spam,ibm,ibm_spam,ibm_not_spam

@Entity
public class MessageDetail {

    @Id
    private Integer id;
    @Lob
    private String message;
    private String truth;
    private String cubee;
    private String google;
    private Double googleSpam;
    private Double googleNotSpam;
    private String ibm;
    private Double ibmSpam;
    private Double ibmNotSpam;

    public MessageDetail(){}

    public MessageDetail(Integer id, String message, String truth, String cube, String google, Double googleSpam, Double googleNotSpam, String ibm, Double ibmSpam, Double ibmNotSpam) {
        this.id = id;
        this.message = message;
        this.truth = truth;
        this.cubee = cube;
        this.google = google;
        this.googleSpam = googleSpam;
        this.googleNotSpam = googleNotSpam;
        this.ibm = ibm;
        this.ibmSpam = ibmSpam;
        this.ibmNotSpam = ibmNotSpam;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTruth() {
        return truth;
    }

    public void setTruth(String truth) {
        this.truth = truth;
    }

    public String getCubee() {
        return cubee;
    }

    public void setCubee(String cube) {
        this.cubee = cube;
    }

    public String getGoogle() {
        return google;
    }

    public void setGoogle(String google) {
        this.google = google;
    }

    public Double getGoogleSpam() {
        return googleSpam;
    }

    public void setGoogleSpam(Double googleSpam) {
        this.googleSpam = googleSpam;
    }

    public Double getGoogleNotSpam() {
        return googleNotSpam;
    }

    public void setGoogleNotSpam(Double googleNotSpam) {
        this.googleNotSpam = googleNotSpam;
    }

    public String getIbm() {
        return ibm;
    }

    public void setIbm(String ibm) {
        this.ibm = ibm;
    }

    public Double getIbmSpam() {
        return ibmSpam;
    }

    public void setIbmSpam(Double ibmSpam) {
        this.ibmSpam = ibmSpam;
    }

    public Double getIbmNotSpam() {
        return ibmNotSpam;
    }

    public void setIbmNotSpam(Double ibmNotSpam) {
        this.ibmNotSpam = ibmNotSpam;
    }

}
