package com.guigu.restaurant.po;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("menu_type is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("menu_type is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("menu_type =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("menu_type <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("menu_type >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("menu_type >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("menu_type <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("menu_type <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("menu_type like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("menu_type not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("menu_type in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("menu_type not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("menu_type between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("menu_type not between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuQuantityIsNull() {
            addCriterion("menu_quantity is null");
            return (Criteria) this;
        }

        public Criteria andMenuQuantityIsNotNull() {
            addCriterion("menu_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andMenuQuantityEqualTo(Integer value) {
            addCriterion("menu_quantity =", value, "menuQuantity");
            return (Criteria) this;
        }

        public Criteria andMenuQuantityNotEqualTo(Integer value) {
            addCriterion("menu_quantity <>", value, "menuQuantity");
            return (Criteria) this;
        }

        public Criteria andMenuQuantityGreaterThan(Integer value) {
            addCriterion("menu_quantity >", value, "menuQuantity");
            return (Criteria) this;
        }

        public Criteria andMenuQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_quantity >=", value, "menuQuantity");
            return (Criteria) this;
        }

        public Criteria andMenuQuantityLessThan(Integer value) {
            addCriterion("menu_quantity <", value, "menuQuantity");
            return (Criteria) this;
        }

        public Criteria andMenuQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("menu_quantity <=", value, "menuQuantity");
            return (Criteria) this;
        }

        public Criteria andMenuQuantityIn(List<Integer> values) {
            addCriterion("menu_quantity in", values, "menuQuantity");
            return (Criteria) this;
        }

        public Criteria andMenuQuantityNotIn(List<Integer> values) {
            addCriterion("menu_quantity not in", values, "menuQuantity");
            return (Criteria) this;
        }

        public Criteria andMenuQuantityBetween(Integer value1, Integer value2) {
            addCriterion("menu_quantity between", value1, value2, "menuQuantity");
            return (Criteria) this;
        }

        public Criteria andMenuQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_quantity not between", value1, value2, "menuQuantity");
            return (Criteria) this;
        }

        public Criteria andMenuPriceIsNull() {
            addCriterion("menu_price is null");
            return (Criteria) this;
        }

        public Criteria andMenuPriceIsNotNull() {
            addCriterion("menu_price is not null");
            return (Criteria) this;
        }

        public Criteria andMenuPriceEqualTo(Float value) {
            addCriterion("menu_price =", value, "menuPrice");
            return (Criteria) this;
        }

        public Criteria andMenuPriceNotEqualTo(Float value) {
            addCriterion("menu_price <>", value, "menuPrice");
            return (Criteria) this;
        }

        public Criteria andMenuPriceGreaterThan(Float value) {
            addCriterion("menu_price >", value, "menuPrice");
            return (Criteria) this;
        }

        public Criteria andMenuPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("menu_price >=", value, "menuPrice");
            return (Criteria) this;
        }

        public Criteria andMenuPriceLessThan(Float value) {
            addCriterion("menu_price <", value, "menuPrice");
            return (Criteria) this;
        }

        public Criteria andMenuPriceLessThanOrEqualTo(Float value) {
            addCriterion("menu_price <=", value, "menuPrice");
            return (Criteria) this;
        }

        public Criteria andMenuPriceIn(List<Float> values) {
            addCriterion("menu_price in", values, "menuPrice");
            return (Criteria) this;
        }

        public Criteria andMenuPriceNotIn(List<Float> values) {
            addCriterion("menu_price not in", values, "menuPrice");
            return (Criteria) this;
        }

        public Criteria andMenuPriceBetween(Float value1, Float value2) {
            addCriterion("menu_price between", value1, value2, "menuPrice");
            return (Criteria) this;
        }

        public Criteria andMenuPriceNotBetween(Float value1, Float value2) {
            addCriterion("menu_price not between", value1, value2, "menuPrice");
            return (Criteria) this;
        }

        public Criteria andMenuNoteIsNull() {
            addCriterion("menu_note is null");
            return (Criteria) this;
        }

        public Criteria andMenuNoteIsNotNull() {
            addCriterion("menu_note is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNoteEqualTo(String value) {
            addCriterion("menu_note =", value, "menuNote");
            return (Criteria) this;
        }

        public Criteria andMenuNoteNotEqualTo(String value) {
            addCriterion("menu_note <>", value, "menuNote");
            return (Criteria) this;
        }

        public Criteria andMenuNoteGreaterThan(String value) {
            addCriterion("menu_note >", value, "menuNote");
            return (Criteria) this;
        }

        public Criteria andMenuNoteGreaterThanOrEqualTo(String value) {
            addCriterion("menu_note >=", value, "menuNote");
            return (Criteria) this;
        }

        public Criteria andMenuNoteLessThan(String value) {
            addCriterion("menu_note <", value, "menuNote");
            return (Criteria) this;
        }

        public Criteria andMenuNoteLessThanOrEqualTo(String value) {
            addCriterion("menu_note <=", value, "menuNote");
            return (Criteria) this;
        }

        public Criteria andMenuNoteLike(String value) {
            addCriterion("menu_note like", value, "menuNote");
            return (Criteria) this;
        }

        public Criteria andMenuNoteNotLike(String value) {
            addCriterion("menu_note not like", value, "menuNote");
            return (Criteria) this;
        }

        public Criteria andMenuNoteIn(List<String> values) {
            addCriterion("menu_note in", values, "menuNote");
            return (Criteria) this;
        }

        public Criteria andMenuNoteNotIn(List<String> values) {
            addCriterion("menu_note not in", values, "menuNote");
            return (Criteria) this;
        }

        public Criteria andMenuNoteBetween(String value1, String value2) {
            addCriterion("menu_note between", value1, value2, "menuNote");
            return (Criteria) this;
        }

        public Criteria andMenuNoteNotBetween(String value1, String value2) {
            addCriterion("menu_note not between", value1, value2, "menuNote");
            return (Criteria) this;
        }

        public Criteria andMenuPictureIsNull() {
            addCriterion("menu_picture is null");
            return (Criteria) this;
        }

        public Criteria andMenuPictureIsNotNull() {
            addCriterion("menu_picture is not null");
            return (Criteria) this;
        }

        public Criteria andMenuPictureEqualTo(String value) {
            addCriterion("menu_picture =", value, "menuPicture");
            return (Criteria) this;
        }

        public Criteria andMenuPictureNotEqualTo(String value) {
            addCriterion("menu_picture <>", value, "menuPicture");
            return (Criteria) this;
        }

        public Criteria andMenuPictureGreaterThan(String value) {
            addCriterion("menu_picture >", value, "menuPicture");
            return (Criteria) this;
        }

        public Criteria andMenuPictureGreaterThanOrEqualTo(String value) {
            addCriterion("menu_picture >=", value, "menuPicture");
            return (Criteria) this;
        }

        public Criteria andMenuPictureLessThan(String value) {
            addCriterion("menu_picture <", value, "menuPicture");
            return (Criteria) this;
        }

        public Criteria andMenuPictureLessThanOrEqualTo(String value) {
            addCriterion("menu_picture <=", value, "menuPicture");
            return (Criteria) this;
        }

        public Criteria andMenuPictureLike(String value) {
            addCriterion("menu_picture like", value, "menuPicture");
            return (Criteria) this;
        }

        public Criteria andMenuPictureNotLike(String value) {
            addCriterion("menu_picture not like", value, "menuPicture");
            return (Criteria) this;
        }

        public Criteria andMenuPictureIn(List<String> values) {
            addCriterion("menu_picture in", values, "menuPicture");
            return (Criteria) this;
        }

        public Criteria andMenuPictureNotIn(List<String> values) {
            addCriterion("menu_picture not in", values, "menuPicture");
            return (Criteria) this;
        }

        public Criteria andMenuPictureBetween(String value1, String value2) {
            addCriterion("menu_picture between", value1, value2, "menuPicture");
            return (Criteria) this;
        }

        public Criteria andMenuPictureNotBetween(String value1, String value2) {
            addCriterion("menu_picture not between", value1, value2, "menuPicture");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}