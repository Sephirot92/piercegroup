package com.piercegroup.options.entities;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Product entity class
 */

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "LABELCODE")
    private String labelCode;

    @Column(name = "NUMBERINSUPPLIERPACKAGE")
    private BigDecimal numberInSupplierPackage;

    @Column(name = "NUMBERINPACKAGE")
    private BigDecimal numberInPackage;

    @Column(name = "SIZETYPE")
    private String sizeType;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "ADDITIONALCOLOR")
    private String additionalColor;
}
