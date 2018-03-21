package com.guigu.restaurant.po;

public class Menu {
    private Integer menuId;

    private Integer staffId;

    private String menuName;

    private String menuType;

    private Integer menuQuantity;

    private Float menuPrice;

    private String menuNote;

    private String menuPicture;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    public Integer getMenuQuantity() {
        return menuQuantity;
    }

    public void setMenuQuantity(Integer menuQuantity) {
        this.menuQuantity = menuQuantity;
    }

    public Float getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(Float menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getMenuNote() {
        return menuNote;
    }

    public void setMenuNote(String menuNote) {
        this.menuNote = menuNote == null ? null : menuNote.trim();
    }

    public String getMenuPicture() {
        return menuPicture;
    }

    public void setMenuPicture(String menuPicture) {
        this.menuPicture = menuPicture == null ? null : menuPicture.trim();
    }
}