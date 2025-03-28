package com.sena.crud_basic.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "plant")
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_plant", length = 50, nullable = false)
    private String namePlant;

    @Column(name = "description_plant", length = 50)
    private String descriptionPlant;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(nullable = false)
    private BigDecimal value;

    public Plant() {}

    public Plant(Integer id, String namePlant, String descriptionPlant, Category category, BigDecimal value) {
        this.id = id;
        this.namePlant = namePlant;
        this.descriptionPlant = descriptionPlant;
        this.category = category;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamePlant() {
        return namePlant;
    }

    public void setNamePlant(String namePlant) {
        this.namePlant = namePlant;
    }

    public String getDescriptionPlant() {
        return descriptionPlant;
    }

    public void setDescriptionPlant(String descriptionPlant) {
        this.descriptionPlant = descriptionPlant;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    
}
