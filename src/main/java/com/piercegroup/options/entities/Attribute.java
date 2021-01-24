package com.piercegroup.options.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

/**
 * Attribute entity class.
 *
 * @version 0.0.1
 * @author Łukasz Czapraga
 */

@Entity(name = "ATTRIBUTE")
public class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "SUPPLIERPACKSIZE")
    private String supplierPackSize;

    @Column(name = "PACKSIZE")
    private String packsize;

    @Column(name = "HELMETSIZE")
    private String helmetSize;

    @Column(name = "SHOESIZE")
    private String shoeSize;

    @Column(name = "SIZE")
    private String size;

    @Column(name = "SIZECAP")
    private String sizeCap;

    @Column(name = "SIZECHILD")
    private String sizeChild;

    @Column(name = "SIZECHILDCL")
    private String sizeChildCl;

    @Column(name = "SIZEGLOVESCHILD")
    private String sizeGlovesChild;

    @Column(name = "SIZEGLOVESMAN")
    private String sizeGlovesMan;

    @Column(name = "SIZEGLOVESWOMAN")
    private String sizeGlovesWoman;

    @Column(name = "SIZEMAN")
    private String sizeMan;

    @Column(name = "SIZEMANCL")
    private String sizeManCl;

    @Column(name = "SIZEUNISEX")
    private String sizeUnisex;

    @Column(name = "SIZEWOMAN")
    private String sizeWoman;

    @Column(name = "SIZEWOMANCL")
    private String sizeWomanCl;

    @Column(name = "ADDITIONALCOLORS")
    private String additionalColors;

    @Column(name = "COLOR")
    private String color;

    public Attribute() {
    }

    public Attribute(long id, String code, String supplierPackSize, String packsize, String helmetSize, String shoeSize,
                     String size, String sizeCap, String sizeChild, String sizeChildCl, String sizeGlovesChild,
                     String sizeGlovesMan, String sizeGlovesWoman, String sizeMan, String sizeManCl, String sizeUnisex,
                     String sizeWoman, String sizeWomanCl, String additionalColors, String color) {
        this.id = id;
        this.code = code;
        this.supplierPackSize = supplierPackSize;
        this.packsize = packsize;
        this.helmetSize = helmetSize;
        this.shoeSize = shoeSize;
        this.size = size;
        this.sizeCap = sizeCap;
        this.sizeChild = sizeChild;
        this.sizeChildCl = sizeChildCl;
        this.sizeGlovesChild = sizeGlovesChild;
        this.sizeGlovesMan = sizeGlovesMan;
        this.sizeGlovesWoman = sizeGlovesWoman;
        this.sizeMan = sizeMan;
        this.sizeManCl = sizeManCl;
        this.sizeUnisex = sizeUnisex;
        this.sizeWoman = sizeWoman;
        this.sizeWomanCl = sizeWomanCl;
        this.additionalColors = additionalColors;
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getSupplierPackSize() {
        return supplierPackSize;
    }

    public String getPacksize() {
        return packsize;
    }

    public String getHelmetSize() {
        return helmetSize;
    }

    public String getShoeSize() {
        return shoeSize;
    }

    public String getSize() {
        return size;
    }

    public String getSizeCap() {
        return sizeCap;
    }

    public String getSizeChild() {
        return sizeChild;
    }

    public String getSizeChildCl() {
        return sizeChildCl;
    }

    public String getSizeGlovesChild() {
        return sizeGlovesChild;
    }

    public String getSizeGlovesMan() {
        return sizeGlovesMan;
    }

    public String getSizeGlovesWoman() {
        return sizeGlovesWoman;
    }

    public String getSizeMan() {
        return sizeMan;
    }

    public String getSizeManCl() {
        return sizeManCl;
    }

    public String getSizeUnisex() {
        return sizeUnisex;
    }

    public String getSizeWoman() {
        return sizeWoman;
    }

    public String getSizeWomanCl() {
        return sizeWomanCl;
    }

    public String getAdditionalColors() {
        return additionalColors;
    }

    public String getColor() {
        return color;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSupplierPackSize(String supplierPackSize) {
        this.supplierPackSize = supplierPackSize;
    }

    public void setPacksize(String packsize) {
        this.packsize = packsize;
    }

    public void setHelmetSize(String helmetSize) {
        this.helmetSize = helmetSize;
    }

    public void setShoeSize(String shoeSize) {
        this.shoeSize = shoeSize;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSizeCap(String sizeCap) {
        this.sizeCap = sizeCap;
    }

    public void setSizeChild(String sizeChild) {
        this.sizeChild = sizeChild;
    }

    public void setSizeChildCl(String sizeChildCl) {
        this.sizeChildCl = sizeChildCl;
    }

    public void setSizeGlovesChild(String sizeGlovesChild) {
        this.sizeGlovesChild = sizeGlovesChild;
    }

    public void setSizeGlovesMan(String sizeGlovesMan) {
        this.sizeGlovesMan = sizeGlovesMan;
    }

    public void setSizeGlovesWoman(String sizeGlovesWoman) {
        this.sizeGlovesWoman = sizeGlovesWoman;
    }

    public void setSizeMan(String sizeMan) {
        this.sizeMan = sizeMan;
    }

    public void setSizeManCl(String sizeManCl) {
        this.sizeManCl = sizeManCl;
    }

    public void setSizeUnisex(String sizeUnisex) {
        this.sizeUnisex = sizeUnisex;
    }

    public void setSizeWoman(String sizeWoman) {
        this.sizeWoman = sizeWoman;
    }

    public void setSizeWomanCl(String sizeWomanCl) {
        this.sizeWomanCl = sizeWomanCl;
    }

    public void setAdditionalColors(String additionalColors) {
        this.additionalColors = additionalColors;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
