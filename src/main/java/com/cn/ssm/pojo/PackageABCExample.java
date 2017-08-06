package com.cn.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PackageABCExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PackageABCExample() {
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

        public Criteria andTcIdIsNull() {
            addCriterion("tc_id is null");
            return (Criteria) this;
        }

        public Criteria andTcIdIsNotNull() {
            addCriterion("tc_id is not null");
            return (Criteria) this;
        }

        public Criteria andTcIdEqualTo(String value) {
            addCriterion("tc_id =", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdNotEqualTo(String value) {
            addCriterion("tc_id <>", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdGreaterThan(String value) {
            addCriterion("tc_id >", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdGreaterThanOrEqualTo(String value) {
            addCriterion("tc_id >=", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdLessThan(String value) {
            addCriterion("tc_id <", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdLessThanOrEqualTo(String value) {
            addCriterion("tc_id <=", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdLike(String value) {
            addCriterion("tc_id like", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdNotLike(String value) {
            addCriterion("tc_id not like", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdIn(List<String> values) {
            addCriterion("tc_id in", values, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdNotIn(List<String> values) {
            addCriterion("tc_id not in", values, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdBetween(String value1, String value2) {
            addCriterion("tc_id between", value1, value2, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdNotBetween(String value1, String value2) {
            addCriterion("tc_id not between", value1, value2, "tcId");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentIsNull() {
            addCriterion("monthly_rent is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentIsNotNull() {
            addCriterion("monthly_rent is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentEqualTo(Float value) {
            addCriterion("monthly_rent =", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentNotEqualTo(Float value) {
            addCriterion("monthly_rent <>", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentGreaterThan(Float value) {
            addCriterion("monthly_rent >", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentGreaterThanOrEqualTo(Float value) {
            addCriterion("monthly_rent >=", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentLessThan(Float value) {
            addCriterion("monthly_rent <", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentLessThanOrEqualTo(Float value) {
            addCriterion("monthly_rent <=", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentIn(List<Float> values) {
            addCriterion("monthly_rent in", values, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentNotIn(List<Float> values) {
            addCriterion("monthly_rent not in", values, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentBetween(Float value1, Float value2) {
            addCriterion("monthly_rent between", value1, value2, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentNotBetween(Float value1, Float value2) {
            addCriterion("monthly_rent not between", value1, value2, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andPreferentialIsNull() {
            addCriterion("preferential is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialIsNotNull() {
            addCriterion("preferential is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialEqualTo(Integer value) {
            addCriterion("preferential =", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialNotEqualTo(Integer value) {
            addCriterion("preferential <>", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialGreaterThan(Integer value) {
            addCriterion("preferential >", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialGreaterThanOrEqualTo(Integer value) {
            addCriterion("preferential >=", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialLessThan(Integer value) {
            addCriterion("preferential <", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialLessThanOrEqualTo(Integer value) {
            addCriterion("preferential <=", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialIn(List<Integer> values) {
            addCriterion("preferential in", values, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialNotIn(List<Integer> values) {
            addCriterion("preferential not in", values, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialBetween(Integer value1, Integer value2) {
            addCriterion("preferential between", value1, value2, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialNotBetween(Integer value1, Integer value2) {
            addCriterion("preferential not between", value1, value2, "preferential");
            return (Criteria) this;
        }

        public Criteria andStartDataIsNull() {
            addCriterion("start_data is null");
            return (Criteria) this;
        }

        public Criteria andStartDataIsNotNull() {
            addCriterion("start_data is not null");
            return (Criteria) this;
        }

        public Criteria andStartDataEqualTo(Date value) {
            addCriterionForJDBCDate("start_data =", value, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_data <>", value, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataGreaterThan(Date value) {
            addCriterionForJDBCDate("start_data >", value, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_data >=", value, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataLessThan(Date value) {
            addCriterionForJDBCDate("start_data <", value, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_data <=", value, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataIn(List<Date> values) {
            addCriterionForJDBCDate("start_data in", values, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_data not in", values, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_data between", value1, value2, "startData");
            return (Criteria) this;
        }

        public Criteria andStartDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_data not between", value1, value2, "startData");
            return (Criteria) this;
        }

        public Criteria andEndDataIsNull() {
            addCriterion("end_data is null");
            return (Criteria) this;
        }

        public Criteria andEndDataIsNotNull() {
            addCriterion("end_data is not null");
            return (Criteria) this;
        }

        public Criteria andEndDataEqualTo(Date value) {
            addCriterionForJDBCDate("end_data =", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_data <>", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataGreaterThan(Date value) {
            addCriterionForJDBCDate("end_data >", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_data >=", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataLessThan(Date value) {
            addCriterionForJDBCDate("end_data <", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_data <=", value, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataIn(List<Date> values) {
            addCriterionForJDBCDate("end_data in", values, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_data not in", values, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_data between", value1, value2, "endData");
            return (Criteria) this;
        }

        public Criteria andEndDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_data not between", value1, value2, "endData");
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