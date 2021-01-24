package com.piercegroup.options.entities;

import javax.persistence.*;

/**
 * Option class
 *
 * @author Łukasz Czapraga
 * @version 0.0.1
 */
@Entity(name = "OPTIONS")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "ES")
    private String labelEs_ES;

    @Column(name = "NL")
    private String labelNl_NL;

    @Column(name = "BE")
    private String labelNl_BE;

    @Column(name = "NO")
    private String labelNb_NO;

    @Column(name = "IT")
    private String labelIt_IT;

    @Column(name = "FR")
    private String labelFr_FR;

    @Column(name = "FI")
    private String labelFi_FI;

    @Column(name = "US")
    private String labelUs_US;

    @Column(name = "SE")
    private String labelSv_SE;

    @Column(name = "IE")
    private String labelEn_IE;

    @Column(name = "GB")
    private String labelEn_GB;

    @Column(name = "DE")
    private String labelDe_DE;

    @Column(name = "CH")
    private String labelDe_CH;

    @Column(name = "AT")
    private String labelDe_AT;

    @Column(name = "DK")
    private String labelDa_DK;

    @Column(name = "CZ")
    private String labelCs_CZ;

    @Column(name = "PL")
    private String labelPl_PL;

    @Column(name = "ATTRIBUTECODE")
    private String attributeCode;

    public Option() {
    }

    public Option(long id, String code, String labelEs_ES, String labelNl_NL, String labelNl_BE, String labelNb_NO,
                  String labelIt_IT, String labelFr_FR, String labelFi_FI, String labelUs_US, String labelSv_SE,
                  String labelEn_IE, String labelEn_GB, String labelDe_DE, String labelDe_CH, String labelDe_AT,
                  String labelDa_DK, String labelCs_CZ, String labelPl_PL, String attributeCode, Attribute attribute) {
        this.id = id;
        this.code = code;
        this.labelEs_ES = labelEs_ES;
        this.labelNl_NL = labelNl_NL;
        this.labelNl_BE = labelNl_BE;
        this.labelNb_NO = labelNb_NO;
        this.labelIt_IT = labelIt_IT;
        this.labelFr_FR = labelFr_FR;
        this.labelFi_FI = labelFi_FI;
        this.labelUs_US = labelUs_US;
        this.labelSv_SE = labelSv_SE;
        this.labelEn_IE = labelEn_IE;
        this.labelEn_GB = labelEn_GB;
        this.labelDe_DE = labelDe_DE;
        this.labelDe_CH = labelDe_CH;
        this.labelDe_AT = labelDe_AT;
        this.labelDa_DK = labelDa_DK;
        this.labelCs_CZ = labelCs_CZ;
        this.labelPl_PL = labelPl_PL;
        this.attributeCode = attributeCode;
    }

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLabelEs_ES() {
        return labelEs_ES;
    }

    public String getLabelNl_NL() {
        return labelNl_NL;
    }

    public String getLabelNl_BE() {
        return labelNl_BE;
    }

    public String getLabelNb_NO() {
        return labelNb_NO;
    }

    public String getLabelIt_IT() {
        return labelIt_IT;
    }

    public String getLabelFr_FR() {
        return labelFr_FR;
    }

    public String getLabelFi_FI() {
        return labelFi_FI;
    }

    public String getLabelUs_US() {
        return labelUs_US;
    }

    public String getLabelSv_SE() {
        return labelSv_SE;
    }

    public String getLabelEn_IE() {
        return labelEn_IE;
    }

    public String getLabelEn_GB() {
        return labelEn_GB;
    }

    public String getLabelDe_DE() {
        return labelDe_DE;
    }

    public String getLabelDe_CH() {
        return labelDe_CH;
    }

    public String getLabelDe_AT() {
        return labelDe_AT;
    }

    public String getLabelDa_DK() {
        return labelDa_DK;
    }

    public String getLabelCs_CZ() {
        return labelCs_CZ;
    }

    public String getLabelPl_PL() {
        return labelPl_PL;
    }

    public String getAttributeCode() {
        return attributeCode;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLabelEs_ES(String labelEs_ES) {
        this.labelEs_ES = labelEs_ES;
    }

    public void setLabelNl_NL(String labelNl_NL) {
        this.labelNl_NL = labelNl_NL;
    }

    public void setLabelNl_BE(String labelNl_BE) {
        this.labelNl_BE = labelNl_BE;
    }

    public void setLabelNb_NO(String labelNb_NO) {
        this.labelNb_NO = labelNb_NO;
    }

    public void setLabelIt_IT(String labelIt_IT) {
        this.labelIt_IT = labelIt_IT;
    }

    public void setLabelFr_FR(String labelFr_FR) {
        this.labelFr_FR = labelFr_FR;
    }

    public void setLabelFi_FI(String labelFi_FI) {
        this.labelFi_FI = labelFi_FI;
    }

    public void setLabelUs_US(String labelUs_US) {
        this.labelUs_US = labelUs_US;
    }

    public void setLabelSv_SE(String labelSv_SE) {
        this.labelSv_SE = labelSv_SE;
    }

    public void setLabelEn_IE(String labelEn_IE) {
        this.labelEn_IE = labelEn_IE;
    }

    public void setLabelEn_GB(String labelEn_GB) {
        this.labelEn_GB = labelEn_GB;
    }

    public void setLabelDe_DE(String labelDe_DE) {
        this.labelDe_DE = labelDe_DE;
    }

    public void setLabelDe_CH(String labelDe_CH) {
        this.labelDe_CH = labelDe_CH;
    }

    public void setLabelDe_AT(String labelDe_AT) {
        this.labelDe_AT = labelDe_AT;
    }

    public void setLabelDa_DK(String labelDa_DK) {
        this.labelDa_DK = labelDa_DK;
    }

    public void setLabelCs_CZ(String labelCs_CZ) {
        this.labelCs_CZ = labelCs_CZ;
    }

    public void setLabelPl_PL(String labelPl_PL) {
        this.labelPl_PL = labelPl_PL;
    }

    public void setAttributeCode(String attributeCode) {
        this.attributeCode = attributeCode;
    }
}
