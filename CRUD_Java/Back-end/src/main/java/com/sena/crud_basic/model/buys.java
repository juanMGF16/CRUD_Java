package com.sena.crud_basic.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "buys")
public class buys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "date_buys", nullable = false)
    private Date dateBuys;

    @Column(name = "total_buys", nullable = false)
    private BigDecimal totalBuys;

    public buys() {
    }

    public buys(Integer id, Customer customer, Employee employee, Date dateBuys, BigDecimal totalBuys) {
        this.id = id;
        this.customer = customer;
        this.employee = employee;
        this.dateBuys = dateBuys;
        this.totalBuys = totalBuys;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDateBuys() {
        return dateBuys;
    }

    public void setDateBuys(Date dateBuys) {
        this.dateBuys = dateBuys;
    }

    public BigDecimal getTotalBuys() {
        return totalBuys;
    }

    public void setTotalBuys(BigDecimal totalBuys) {
        this.totalBuys = totalBuys;
    }

    
}
