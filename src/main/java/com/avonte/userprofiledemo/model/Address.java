package com.avonte.userprofiledemo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;


@Embeddable
public class Address {

    @Column(name = "ADDRESS_DATA_STREET")
    private String street;

    @Column(name = "ADDRESS_DATA_SUITE")
    private String suite;

    @Column(name = "ADDRESS_DATA_CITY")
    private String city;

    @Column(name = "ADDRESS_DATA_ZIPCODE")
    private String zipcode;

    @Column(name = "ADDRESS_DATA_GEO")
    private Geo geo;

    public Address(){

    }

    public Address(String street, String suite, String city, String zipcode, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", geo=" + geo +
                '}';
    }
}
