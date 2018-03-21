package com.guigu.restaurant.po;

public class DataDictorytion {
    private Integer dataId;

    private String dataNote;

    private String dataDetail;

    private String note;

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getDataNote() {
        return dataNote;
    }

    public void setDataNote(String dataNote) {
        this.dataNote = dataNote == null ? null : dataNote.trim();
    }

    public String getDataDetail() {
        return dataDetail;
    }

    public void setDataDetail(String dataDetail) {
        this.dataDetail = dataDetail == null ? null : dataDetail.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}