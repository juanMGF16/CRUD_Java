package com.sena.crud_basic.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "detailsBuys")
public class DetailsBuys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "buys_id", nullable = false)
    private buys buys;

    @ManyToOne
    @JoinColumn(name = "plant_location_id", nullable = false)
    private PlantLocation plantLocation;

    @Column(name = "value_unitary", nullable = false)
    private BigDecimal valueUnitary;
}
