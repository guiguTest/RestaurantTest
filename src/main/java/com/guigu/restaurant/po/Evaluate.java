package com.guigu.restaurant.po;

public class Evaluate {
    private Integer evaluateId;

    private Integer menuId;

    private Integer detailId;

    private String evaluateName;

    private String evaluateNote;

    private String picture;

    public Integer getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Integer evaluateId) {
        this.evaluateId = evaluateId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public String getEvaluateName() {
        return evaluateName;
    }

    public void setEvaluateName(String evaluateName) {
        this.evaluateName = evaluateName == null ? null : evaluateName.trim();
    }

    public String getEvaluateNote() {
        return evaluateNote;
    }

    public void setEvaluateNote(String evaluateNote) {
        this.evaluateNote = evaluateNote == null ? null : evaluateNote.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
}