package com.guigu.restaurant.po;

import java.util.Date;

public class Staff {
    private Integer staffId;

    private String staffName;

    private String staffType;

    private String staffSex;

    private String staffPhone;

    private String staffMoblePhone;

    private String staffIdCard;

    private Date staffDate;

    private Date staffJoinDate;

    private Integer staffAuthority;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType == null ? null : staffType.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone == null ? null : staffPhone.trim();
    }

    public String getStaffMoblePhone() {
        return staffMoblePhone;
    }

    public void setStaffMoblePhone(String staffMoblePhone) {
        this.staffMoblePhone = staffMoblePhone == null ? null : staffMoblePhone.trim();
    }

    public String getStaffIdCard() {
        return staffIdCard;
    }

    public void setStaffIdCard(String staffIdCard) {
        this.staffIdCard = staffIdCard == null ? null : staffIdCard.trim();
    }

    public Date getStaffDate() {
        return staffDate;
    }

    public void setStaffDate(Date staffDate) {
        this.staffDate = staffDate;
    }

    public Date getStaffJoinDate() {
        return staffJoinDate;
    }

    public void setStaffJoinDate(Date staffJoinDate) {
        this.staffJoinDate = staffJoinDate;
    }

    public Integer getStaffAuthority() {
        return staffAuthority;
    }

    public void setStaffAuthority(Integer staffAuthority) {
        this.staffAuthority = staffAuthority;
    }
}