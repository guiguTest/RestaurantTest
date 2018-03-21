package com.guigu.restaurant.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffTypeIsNull() {
            addCriterion("staff_type is null");
            return (Criteria) this;
        }

        public Criteria andStaffTypeIsNotNull() {
            addCriterion("staff_type is not null");
            return (Criteria) this;
        }

        public Criteria andStaffTypeEqualTo(String value) {
            addCriterion("staff_type =", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotEqualTo(String value) {
            addCriterion("staff_type <>", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeGreaterThan(String value) {
            addCriterion("staff_type >", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeGreaterThanOrEqualTo(String value) {
            addCriterion("staff_type >=", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeLessThan(String value) {
            addCriterion("staff_type <", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeLessThanOrEqualTo(String value) {
            addCriterion("staff_type <=", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeLike(String value) {
            addCriterion("staff_type like", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotLike(String value) {
            addCriterion("staff_type not like", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeIn(List<String> values) {
            addCriterion("staff_type in", values, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotIn(List<String> values) {
            addCriterion("staff_type not in", values, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeBetween(String value1, String value2) {
            addCriterion("staff_type between", value1, value2, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotBetween(String value1, String value2) {
            addCriterion("staff_type not between", value1, value2, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNull() {
            addCriterion("staff_sex is null");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNotNull() {
            addCriterion("staff_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSexEqualTo(String value) {
            addCriterion("staff_sex =", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotEqualTo(String value) {
            addCriterion("staff_sex <>", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThan(String value) {
            addCriterion("staff_sex >", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThanOrEqualTo(String value) {
            addCriterion("staff_sex >=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThan(String value) {
            addCriterion("staff_sex <", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThanOrEqualTo(String value) {
            addCriterion("staff_sex <=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLike(String value) {
            addCriterion("staff_sex like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotLike(String value) {
            addCriterion("staff_sex not like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexIn(List<String> values) {
            addCriterion("staff_sex in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotIn(List<String> values) {
            addCriterion("staff_sex not in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexBetween(String value1, String value2) {
            addCriterion("staff_sex between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotBetween(String value1, String value2) {
            addCriterion("staff_sex not between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIsNull() {
            addCriterion("staff_phone is null");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIsNotNull() {
            addCriterion("staff_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneEqualTo(String value) {
            addCriterion("staff_phone =", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotEqualTo(String value) {
            addCriterion("staff_phone <>", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneGreaterThan(String value) {
            addCriterion("staff_phone >", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("staff_phone >=", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLessThan(String value) {
            addCriterion("staff_phone <", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLessThanOrEqualTo(String value) {
            addCriterion("staff_phone <=", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLike(String value) {
            addCriterion("staff_phone like", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotLike(String value) {
            addCriterion("staff_phone not like", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIn(List<String> values) {
            addCriterion("staff_phone in", values, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotIn(List<String> values) {
            addCriterion("staff_phone not in", values, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneBetween(String value1, String value2) {
            addCriterion("staff_phone between", value1, value2, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotBetween(String value1, String value2) {
            addCriterion("staff_phone not between", value1, value2, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffMoblePhoneIsNull() {
            addCriterion("staff_moble_phone is null");
            return (Criteria) this;
        }

        public Criteria andStaffMoblePhoneIsNotNull() {
            addCriterion("staff_moble_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffMoblePhoneEqualTo(String value) {
            addCriterion("staff_moble_phone =", value, "staffMoblePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMoblePhoneNotEqualTo(String value) {
            addCriterion("staff_moble_phone <>", value, "staffMoblePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMoblePhoneGreaterThan(String value) {
            addCriterion("staff_moble_phone >", value, "staffMoblePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMoblePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("staff_moble_phone >=", value, "staffMoblePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMoblePhoneLessThan(String value) {
            addCriterion("staff_moble_phone <", value, "staffMoblePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMoblePhoneLessThanOrEqualTo(String value) {
            addCriterion("staff_moble_phone <=", value, "staffMoblePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMoblePhoneLike(String value) {
            addCriterion("staff_moble_phone like", value, "staffMoblePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMoblePhoneNotLike(String value) {
            addCriterion("staff_moble_phone not like", value, "staffMoblePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMoblePhoneIn(List<String> values) {
            addCriterion("staff_moble_phone in", values, "staffMoblePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMoblePhoneNotIn(List<String> values) {
            addCriterion("staff_moble_phone not in", values, "staffMoblePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMoblePhoneBetween(String value1, String value2) {
            addCriterion("staff_moble_phone between", value1, value2, "staffMoblePhone");
            return (Criteria) this;
        }

        public Criteria andStaffMoblePhoneNotBetween(String value1, String value2) {
            addCriterion("staff_moble_phone not between", value1, value2, "staffMoblePhone");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardIsNull() {
            addCriterion("staff_id_card is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardIsNotNull() {
            addCriterion("staff_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardEqualTo(String value) {
            addCriterion("staff_id_card =", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardNotEqualTo(String value) {
            addCriterion("staff_id_card <>", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardGreaterThan(String value) {
            addCriterion("staff_id_card >", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id_card >=", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardLessThan(String value) {
            addCriterion("staff_id_card <", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardLessThanOrEqualTo(String value) {
            addCriterion("staff_id_card <=", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardLike(String value) {
            addCriterion("staff_id_card like", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardNotLike(String value) {
            addCriterion("staff_id_card not like", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardIn(List<String> values) {
            addCriterion("staff_id_card in", values, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardNotIn(List<String> values) {
            addCriterion("staff_id_card not in", values, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardBetween(String value1, String value2) {
            addCriterion("staff_id_card between", value1, value2, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardNotBetween(String value1, String value2) {
            addCriterion("staff_id_card not between", value1, value2, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffDateIsNull() {
            addCriterion("staff_date is null");
            return (Criteria) this;
        }

        public Criteria andStaffDateIsNotNull() {
            addCriterion("staff_date is not null");
            return (Criteria) this;
        }

        public Criteria andStaffDateEqualTo(Date value) {
            addCriterionForJDBCDate("staff_date =", value, "staffDate");
            return (Criteria) this;
        }

        public Criteria andStaffDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("staff_date <>", value, "staffDate");
            return (Criteria) this;
        }

        public Criteria andStaffDateGreaterThan(Date value) {
            addCriterionForJDBCDate("staff_date >", value, "staffDate");
            return (Criteria) this;
        }

        public Criteria andStaffDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_date >=", value, "staffDate");
            return (Criteria) this;
        }

        public Criteria andStaffDateLessThan(Date value) {
            addCriterionForJDBCDate("staff_date <", value, "staffDate");
            return (Criteria) this;
        }

        public Criteria andStaffDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_date <=", value, "staffDate");
            return (Criteria) this;
        }

        public Criteria andStaffDateIn(List<Date> values) {
            addCriterionForJDBCDate("staff_date in", values, "staffDate");
            return (Criteria) this;
        }

        public Criteria andStaffDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("staff_date not in", values, "staffDate");
            return (Criteria) this;
        }

        public Criteria andStaffDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_date between", value1, value2, "staffDate");
            return (Criteria) this;
        }

        public Criteria andStaffDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_date not between", value1, value2, "staffDate");
            return (Criteria) this;
        }

        public Criteria andStaffJoinDateIsNull() {
            addCriterion("staff_join_date is null");
            return (Criteria) this;
        }

        public Criteria andStaffJoinDateIsNotNull() {
            addCriterion("staff_join_date is not null");
            return (Criteria) this;
        }

        public Criteria andStaffJoinDateEqualTo(Date value) {
            addCriterionForJDBCDate("staff_join_date =", value, "staffJoinDate");
            return (Criteria) this;
        }

        public Criteria andStaffJoinDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("staff_join_date <>", value, "staffJoinDate");
            return (Criteria) this;
        }

        public Criteria andStaffJoinDateGreaterThan(Date value) {
            addCriterionForJDBCDate("staff_join_date >", value, "staffJoinDate");
            return (Criteria) this;
        }

        public Criteria andStaffJoinDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_join_date >=", value, "staffJoinDate");
            return (Criteria) this;
        }

        public Criteria andStaffJoinDateLessThan(Date value) {
            addCriterionForJDBCDate("staff_join_date <", value, "staffJoinDate");
            return (Criteria) this;
        }

        public Criteria andStaffJoinDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("staff_join_date <=", value, "staffJoinDate");
            return (Criteria) this;
        }

        public Criteria andStaffJoinDateIn(List<Date> values) {
            addCriterionForJDBCDate("staff_join_date in", values, "staffJoinDate");
            return (Criteria) this;
        }

        public Criteria andStaffJoinDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("staff_join_date not in", values, "staffJoinDate");
            return (Criteria) this;
        }

        public Criteria andStaffJoinDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_join_date between", value1, value2, "staffJoinDate");
            return (Criteria) this;
        }

        public Criteria andStaffJoinDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("staff_join_date not between", value1, value2, "staffJoinDate");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityIsNull() {
            addCriterion("staff_authority is null");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityIsNotNull() {
            addCriterion("staff_authority is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityEqualTo(Integer value) {
            addCriterion("staff_authority =", value, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityNotEqualTo(Integer value) {
            addCriterion("staff_authority <>", value, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityGreaterThan(Integer value) {
            addCriterion("staff_authority >", value, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_authority >=", value, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityLessThan(Integer value) {
            addCriterion("staff_authority <", value, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityLessThanOrEqualTo(Integer value) {
            addCriterion("staff_authority <=", value, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityIn(List<Integer> values) {
            addCriterion("staff_authority in", values, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityNotIn(List<Integer> values) {
            addCriterion("staff_authority not in", values, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityBetween(Integer value1, Integer value2) {
            addCriterion("staff_authority between", value1, value2, "staffAuthority");
            return (Criteria) this;
        }

        public Criteria andStaffAuthorityNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_authority not between", value1, value2, "staffAuthority");
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