package com.cn.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AutomatPaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AutomatPaymentExample() {
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

        public Criteria andAutorecIdIsNull() {
            addCriterion("autorec_id is null");
            return (Criteria) this;
        }

        public Criteria andAutorecIdIsNotNull() {
            addCriterion("autorec_id is not null");
            return (Criteria) this;
        }

        public Criteria andAutorecIdEqualTo(String value) {
            addCriterion("autorec_id =", value, "autorecId");
            return (Criteria) this;
        }

        public Criteria andAutorecIdNotEqualTo(String value) {
            addCriterion("autorec_id <>", value, "autorecId");
            return (Criteria) this;
        }

        public Criteria andAutorecIdGreaterThan(String value) {
            addCriterion("autorec_id >", value, "autorecId");
            return (Criteria) this;
        }

        public Criteria andAutorecIdGreaterThanOrEqualTo(String value) {
            addCriterion("autorec_id >=", value, "autorecId");
            return (Criteria) this;
        }

        public Criteria andAutorecIdLessThan(String value) {
            addCriterion("autorec_id <", value, "autorecId");
            return (Criteria) this;
        }

        public Criteria andAutorecIdLessThanOrEqualTo(String value) {
            addCriterion("autorec_id <=", value, "autorecId");
            return (Criteria) this;
        }

        public Criteria andAutorecIdLike(String value) {
            addCriterion("autorec_id like", value, "autorecId");
            return (Criteria) this;
        }

        public Criteria andAutorecIdNotLike(String value) {
            addCriterion("autorec_id not like", value, "autorecId");
            return (Criteria) this;
        }

        public Criteria andAutorecIdIn(List<String> values) {
            addCriterion("autorec_id in", values, "autorecId");
            return (Criteria) this;
        }

        public Criteria andAutorecIdNotIn(List<String> values) {
            addCriterion("autorec_id not in", values, "autorecId");
            return (Criteria) this;
        }

        public Criteria andAutorecIdBetween(String value1, String value2) {
            addCriterion("autorec_id between", value1, value2, "autorecId");
            return (Criteria) this;
        }

        public Criteria andAutorecIdNotBetween(String value1, String value2) {
            addCriterion("autorec_id not between", value1, value2, "autorecId");
            return (Criteria) this;
        }

        public Criteria andTelIdIsNull() {
            addCriterion("tel_id is null");
            return (Criteria) this;
        }

        public Criteria andTelIdIsNotNull() {
            addCriterion("tel_id is not null");
            return (Criteria) this;
        }

        public Criteria andTelIdEqualTo(String value) {
            addCriterion("tel_id =", value, "telId");
            return (Criteria) this;
        }

        public Criteria andTelIdNotEqualTo(String value) {
            addCriterion("tel_id <>", value, "telId");
            return (Criteria) this;
        }

        public Criteria andTelIdGreaterThan(String value) {
            addCriterion("tel_id >", value, "telId");
            return (Criteria) this;
        }

        public Criteria andTelIdGreaterThanOrEqualTo(String value) {
            addCriterion("tel_id >=", value, "telId");
            return (Criteria) this;
        }

        public Criteria andTelIdLessThan(String value) {
            addCriterion("tel_id <", value, "telId");
            return (Criteria) this;
        }

        public Criteria andTelIdLessThanOrEqualTo(String value) {
            addCriterion("tel_id <=", value, "telId");
            return (Criteria) this;
        }

        public Criteria andTelIdLike(String value) {
            addCriterion("tel_id like", value, "telId");
            return (Criteria) this;
        }

        public Criteria andTelIdNotLike(String value) {
            addCriterion("tel_id not like", value, "telId");
            return (Criteria) this;
        }

        public Criteria andTelIdIn(List<String> values) {
            addCriterion("tel_id in", values, "telId");
            return (Criteria) this;
        }

        public Criteria andTelIdNotIn(List<String> values) {
            addCriterion("tel_id not in", values, "telId");
            return (Criteria) this;
        }

        public Criteria andTelIdBetween(String value1, String value2) {
            addCriterion("tel_id between", value1, value2, "telId");
            return (Criteria) this;
        }

        public Criteria andTelIdNotBetween(String value1, String value2) {
            addCriterion("tel_id not between", value1, value2, "telId");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Float value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Float value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Float value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Float value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Float value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Float> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Float> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Float value1, Float value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Float value1, Float value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andAutorecTimeIsNull() {
            addCriterion("autorec_time is null");
            return (Criteria) this;
        }

        public Criteria andAutorecTimeIsNotNull() {
            addCriterion("autorec_time is not null");
            return (Criteria) this;
        }

        public Criteria andAutorecTimeEqualTo(Date value) {
            addCriterion("autorec_time =", value, "autorecTime");
            return (Criteria) this;
        }

        public Criteria andAutorecTimeNotEqualTo(Date value) {
            addCriterion("autorec_time <>", value, "autorecTime");
            return (Criteria) this;
        }

        public Criteria andAutorecTimeGreaterThan(Date value) {
            addCriterion("autorec_time >", value, "autorecTime");
            return (Criteria) this;
        }

        public Criteria andAutorecTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("autorec_time >=", value, "autorecTime");
            return (Criteria) this;
        }

        public Criteria andAutorecTimeLessThan(Date value) {
            addCriterion("autorec_time <", value, "autorecTime");
            return (Criteria) this;
        }

        public Criteria andAutorecTimeLessThanOrEqualTo(Date value) {
            addCriterion("autorec_time <=", value, "autorecTime");
            return (Criteria) this;
        }

        public Criteria andAutorecTimeIn(List<Date> values) {
            addCriterion("autorec_time in", values, "autorecTime");
            return (Criteria) this;
        }

        public Criteria andAutorecTimeNotIn(List<Date> values) {
            addCriterion("autorec_time not in", values, "autorecTime");
            return (Criteria) this;
        }

        public Criteria andAutorecTimeBetween(Date value1, Date value2) {
            addCriterion("autorec_time between", value1, value2, "autorecTime");
            return (Criteria) this;
        }

        public Criteria andAutorecTimeNotBetween(Date value1, Date value2) {
            addCriterion("autorec_time not between", value1, value2, "autorecTime");
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