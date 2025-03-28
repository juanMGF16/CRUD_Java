package com.sena.crud_basic.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "plant_location_id", nullable = false)
    private PlantLocation plantLocation;

    @Column(name = "quantity_available", nullable = false)
    private Integer quantityAvailable;

    @Column(name = "quantity_reserved", nullable = false)
    private Integer quantityReserved;

    @Column(name = "minimum_stock", nullable = false)
    private Integer minimumStock;

    @Column(name = "maximum_stock", nullable = false)
    private Integer maximumStock;

    @Column(name = "last_count_date", nullable = false)
    private Date lastCountDate;

    @Column(name = "next_count_date", nullable = false)
    private Date nextCountDate;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    public Inventory() {
    }

    public Inventory(Integer id, PlantLocation plantLocation, Integer quantityAvailable, Integer quantityReserved,
            Integer minimumStock, Integer maximumStock, Date lastCountDate, Date nextCountDate, Date createdAt) {
        this.id = id;
        this.plantLocation = plantLocation;
        this.quantityAvailable = quantityAvailable;
        this.quantityReserved = quantityReserved;
        this.minimumStock = minimumStock;
        this.maximumStock = maximumStock;
        this.lastCountDate = lastCountDate;
        this.nextCountDate = nextCountDate;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PlantLocation getPlantLocation() {
        return plantLocation;
    }

    public void setPlantLocation(PlantLocation plantLocation) {
        this.plantLocation = plantLocation;
    }

    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(Integer quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Integer getQuantityReserved() {
        return quantityReserved;
    }

    public void setQuantityReserved(Integer quantityReserved) {
        this.quantityReserved = quantityReserved;
    }

    public Integer getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(Integer minimumStock) {
        this.minimumStock = minimumStock;
    }

    public Integer getMaximumStock() {
        return maximumStock;
    }

    public void setMaximumStock(Integer maximumStock) {
        this.maximumStock = maximumStock;
    }

    public Date getLastCountDate() {
        return lastCountDate;
    }

    public void setLastCountDate(Date lastCountDate) {
        this.lastCountDate = lastCountDate;
    }

    public Date getNextCountDate() {
        return nextCountDate;
    }

    public void setNextCountDate(Date nextCountDate) {
        this.nextCountDate = nextCountDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    
}
