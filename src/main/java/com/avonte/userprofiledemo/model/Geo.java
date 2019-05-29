package com.avonte.userprofiledemo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Geo {

    @Column(name = "GEO_DATA_LATITUDE")
    private String lat;

    @Column(name = "GEO_DATA_LONGITUDE")
    private String lng;

    public Geo(){

    }

    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }
}
