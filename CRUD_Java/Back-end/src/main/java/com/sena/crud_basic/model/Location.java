package com.sena.crud_basic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "location_place", length = 50, nullable = false)
    private String locationPlace;

    @Column(name = "location_sector", length = 50, nullable = false)
    private String locationSector;
    
    public Location() {
    }

    public Location(Integer id, String locationPlace, String locationSector) {
        this.id = id;
        this.locationPlace = locationPlace;
        this.locationSector = locationSector;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocationPlace() {
        return locationPlace;
    }

    public void setLocationPlace(String locationPlace) {
        this.locationPlace = locationPlace;
    }

    public String getLocationSector() {
        return locationSector;
    }

    public void setLocationSector(String locationSector) {
        this.locationSector = locationSector;
    }
}
