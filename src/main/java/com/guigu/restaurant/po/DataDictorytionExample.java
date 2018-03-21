package com.guigu.restaurant.po;

import java.util.ArrayList;
import java.util.List;

public class DataDictorytionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataDictorytionExample() {
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

        public Criteria andDataIdIsNull() {
            addCriterion("data_id is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("data_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(Integer value) {
            addCriterion("data_id =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(Integer value) {
            addCriterion("data_id <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(Integer value) {
            addCriterion("data_id >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_id >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(Integer value) {
            addCriterion("data_id <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(Integer value) {
            addCriterion("data_id <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<Integer> values) {
            addCriterion("data_id in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<Integer> values) {
            addCriterion("data_id not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(Integer value1, Integer value2) {
            addCriterion("data_id between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(Integer value1, Integer value2) {
            addCriterion("data_id not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataNoteIsNull() {
            addCriterion("data_note is null");
            return (Criteria) this;
        }

        public Criteria andDataNoteIsNotNull() {
            addCriterion("data_note is not null");
            return (Criteria) this;
        }

        public Criteria andDataNoteEqualTo(String value) {
            addCriterion("data_note =", value, "dataNote");
            return (Criteria) this;
        }

        public Criteria andDataNoteNotEqualTo(String value) {
            addCriterion("data_note <>", value, "dataNote");
            return (Criteria) this;
        }

        public Criteria andDataNoteGreaterThan(String value) {
            addCriterion("data_note >", value, "dataNote");
            return (Criteria) this;
        }

        public Criteria andDataNoteGreaterThanOrEqualTo(String value) {
            addCriterion("data_note >=", value, "dataNote");
            return (Criteria) this;
        }

        public Criteria andDataNoteLessThan(String value) {
            addCriterion("data_note <", value, "dataNote");
            return (Criteria) this;
        }

        public Criteria andDataNoteLessThanOrEqualTo(String value) {
            addCriterion("data_note <=", value, "dataNote");
            return (Criteria) this;
        }

        public Criteria andDataNoteLike(String value) {
            addCriterion("data_note like", value, "dataNote");
            return (Criteria) this;
        }

        public Criteria andDataNoteNotLike(String value) {
            addCriterion("data_note not like", value, "dataNote");
            return (Criteria) this;
        }

        public Criteria andDataNoteIn(List<String> values) {
            addCriterion("data_note in", values, "dataNote");
            return (Criteria) this;
        }

        public Criteria andDataNoteNotIn(List<String> values) {
            addCriterion("data_note not in", values, "dataNote");
            return (Criteria) this;
        }

        public Criteria andDataNoteBetween(String value1, String value2) {
            addCriterion("data_note between", value1, value2, "dataNote");
            return (Criteria) this;
        }

        public Criteria andDataNoteNotBetween(String value1, String value2) {
            addCriterion("data_note not between", value1, value2, "dataNote");
            return (Criteria) this;
        }

        public Criteria andDataDetailIsNull() {
            addCriterion("data_detail is null");
            return (Criteria) this;
        }

        public Criteria andDataDetailIsNotNull() {
            addCriterion("data_detail is not null");
            return (Criteria) this;
        }

        public Criteria andDataDetailEqualTo(String value) {
            addCriterion("data_detail =", value, "dataDetail");
            return (Criteria) this;
        }

        public Criteria andDataDetailNotEqualTo(String value) {
            addCriterion("data_detail <>", value, "dataDetail");
            return (Criteria) this;
        }

        public Criteria andDataDetailGreaterThan(String value) {
            addCriterion("data_detail >", value, "dataDetail");
            return (Criteria) this;
        }

        public Criteria andDataDetailGreaterThanOrEqualTo(String value) {
            addCriterion("data_detail >=", value, "dataDetail");
            return (Criteria) this;
        }

        public Criteria andDataDetailLessThan(String value) {
            addCriterion("data_detail <", value, "dataDetail");
            return (Criteria) this;
        }

        public Criteria andDataDetailLessThanOrEqualTo(String value) {
            addCriterion("data_detail <=", value, "dataDetail");
            return (Criteria) this;
        }

        public Criteria andDataDetailLike(String value) {
            addCriterion("data_detail like", value, "dataDetail");
            return (Criteria) this;
        }

        public Criteria andDataDetailNotLike(String value) {
            addCriterion("data_detail not like", value, "dataDetail");
            return (Criteria) this;
        }

        public Criteria andDataDetailIn(List<String> values) {
            addCriterion("data_detail in", values, "dataDetail");
            return (Criteria) this;
        }

        public Criteria andDataDetailNotIn(List<String> values) {
            addCriterion("data_detail not in", values, "dataDetail");
            return (Criteria) this;
        }

        public Criteria andDataDetailBetween(String value1, String value2) {
            addCriterion("data_detail between", value1, value2, "dataDetail");
            return (Criteria) this;
        }

        public Criteria andDataDetailNotBetween(String value1, String value2) {
            addCriterion("data_detail not between", value1, value2, "dataDetail");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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