package com.inc.admin.domain.biz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HydrologicStationCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    /**
     */
    public HydrologicStationCriteria() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * @param orderByClause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @return java.lang.String
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @param distinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @return boolean
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @return java.util.List<Criteria>
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @param criteria
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @return Criteria
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @return Criteria
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @return Criteria
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @param pageNo
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    /**
     * @return java.lang.Integer
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     * @param startRow
     */
    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    /**
     * @return java.lang.Integer
     */
    public Integer getStartRow() {
        return startRow;
    }

    /**
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    /**
     * @return java.lang.Integer
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 
     * @author tanzibiao
     * @date 2024-07-01 21:00:08
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHNameIsNull() {
            addCriterion("h_name is null");
            return (Criteria) this;
        }

        public Criteria andHNameIsNotNull() {
            addCriterion("h_name is not null");
            return (Criteria) this;
        }

        public Criteria andHNameEqualTo(String value) {
            addCriterion("h_name =", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotEqualTo(String value) {
            addCriterion("h_name <>", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThan(String value) {
            addCriterion("h_name >", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThanOrEqualTo(String value) {
            addCriterion("h_name >=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThan(String value) {
            addCriterion("h_name <", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThanOrEqualTo(String value) {
            addCriterion("h_name <=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLike(String value) {
            addCriterion("h_name like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotLike(String value) {
            addCriterion("h_name not like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameIn(List<String> values) {
            addCriterion("h_name in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotIn(List<String> values) {
            addCriterion("h_name not in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameBetween(String value1, String value2) {
            addCriterion("h_name between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotBetween(String value1, String value2) {
            addCriterion("h_name not between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHCodeIsNull() {
            addCriterion("h_code is null");
            return (Criteria) this;
        }

        public Criteria andHCodeIsNotNull() {
            addCriterion("h_code is not null");
            return (Criteria) this;
        }

        public Criteria andHCodeEqualTo(String value) {
            addCriterion("h_code =", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeNotEqualTo(String value) {
            addCriterion("h_code <>", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeGreaterThan(String value) {
            addCriterion("h_code >", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeGreaterThanOrEqualTo(String value) {
            addCriterion("h_code >=", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeLessThan(String value) {
            addCriterion("h_code <", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeLessThanOrEqualTo(String value) {
            addCriterion("h_code <=", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeLike(String value) {
            addCriterion("h_code like", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeNotLike(String value) {
            addCriterion("h_code not like", value, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeIn(List<String> values) {
            addCriterion("h_code in", values, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeNotIn(List<String> values) {
            addCriterion("h_code not in", values, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeBetween(String value1, String value2) {
            addCriterion("h_code between", value1, value2, "hCode");
            return (Criteria) this;
        }

        public Criteria andHCodeNotBetween(String value1, String value2) {
            addCriterion("h_code not between", value1, value2, "hCode");
            return (Criteria) this;
        }

        public Criteria andRSystemIsNull() {
            addCriterion("r_system is null");
            return (Criteria) this;
        }

        public Criteria andRSystemIsNotNull() {
            addCriterion("r_system is not null");
            return (Criteria) this;
        }

        public Criteria andRSystemEqualTo(String value) {
            addCriterion("r_system =", value, "rSystem");
            return (Criteria) this;
        }

        public Criteria andRSystemNotEqualTo(String value) {
            addCriterion("r_system <>", value, "rSystem");
            return (Criteria) this;
        }

        public Criteria andRSystemGreaterThan(String value) {
            addCriterion("r_system >", value, "rSystem");
            return (Criteria) this;
        }

        public Criteria andRSystemGreaterThanOrEqualTo(String value) {
            addCriterion("r_system >=", value, "rSystem");
            return (Criteria) this;
        }

        public Criteria andRSystemLessThan(String value) {
            addCriterion("r_system <", value, "rSystem");
            return (Criteria) this;
        }

        public Criteria andRSystemLessThanOrEqualTo(String value) {
            addCriterion("r_system <=", value, "rSystem");
            return (Criteria) this;
        }

        public Criteria andRSystemLike(String value) {
            addCriterion("r_system like", value, "rSystem");
            return (Criteria) this;
        }

        public Criteria andRSystemNotLike(String value) {
            addCriterion("r_system not like", value, "rSystem");
            return (Criteria) this;
        }

        public Criteria andRSystemIn(List<String> values) {
            addCriterion("r_system in", values, "rSystem");
            return (Criteria) this;
        }

        public Criteria andRSystemNotIn(List<String> values) {
            addCriterion("r_system not in", values, "rSystem");
            return (Criteria) this;
        }

        public Criteria andRSystemBetween(String value1, String value2) {
            addCriterion("r_system between", value1, value2, "rSystem");
            return (Criteria) this;
        }

        public Criteria andRSystemNotBetween(String value1, String value2) {
            addCriterion("r_system not between", value1, value2, "rSystem");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andMeanAnnualRunoffIsNull() {
            addCriterion("mean_annual_runoff is null");
            return (Criteria) this;
        }

        public Criteria andMeanAnnualRunoffIsNotNull() {
            addCriterion("mean_annual_runoff is not null");
            return (Criteria) this;
        }

        public Criteria andMeanAnnualRunoffEqualTo(Double value) {
            addCriterion("mean_annual_runoff =", value, "meanAnnualRunoff");
            return (Criteria) this;
        }

        public Criteria andMeanAnnualRunoffNotEqualTo(Double value) {
            addCriterion("mean_annual_runoff <>", value, "meanAnnualRunoff");
            return (Criteria) this;
        }

        public Criteria andMeanAnnualRunoffGreaterThan(Double value) {
            addCriterion("mean_annual_runoff >", value, "meanAnnualRunoff");
            return (Criteria) this;
        }

        public Criteria andMeanAnnualRunoffGreaterThanOrEqualTo(Double value) {
            addCriterion("mean_annual_runoff >=", value, "meanAnnualRunoff");
            return (Criteria) this;
        }

        public Criteria andMeanAnnualRunoffLessThan(Double value) {
            addCriterion("mean_annual_runoff <", value, "meanAnnualRunoff");
            return (Criteria) this;
        }

        public Criteria andMeanAnnualRunoffLessThanOrEqualTo(Double value) {
            addCriterion("mean_annual_runoff <=", value, "meanAnnualRunoff");
            return (Criteria) this;
        }

        public Criteria andMeanAnnualRunoffIn(List<Double> values) {
            addCriterion("mean_annual_runoff in", values, "meanAnnualRunoff");
            return (Criteria) this;
        }

        public Criteria andMeanAnnualRunoffNotIn(List<Double> values) {
            addCriterion("mean_annual_runoff not in", values, "meanAnnualRunoff");
            return (Criteria) this;
        }

        public Criteria andMeanAnnualRunoffBetween(Double value1, Double value2) {
            addCriterion("mean_annual_runoff between", value1, value2, "meanAnnualRunoff");
            return (Criteria) this;
        }

        public Criteria andMeanAnnualRunoffNotBetween(Double value1, Double value2) {
            addCriterion("mean_annual_runoff not between", value1, value2, "meanAnnualRunoff");
            return (Criteria) this;
        }

        public Criteria andMaximumDischargeIsNull() {
            addCriterion("maximum_discharge is null");
            return (Criteria) this;
        }

        public Criteria andMaximumDischargeIsNotNull() {
            addCriterion("maximum_discharge is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumDischargeEqualTo(Double value) {
            addCriterion("maximum_discharge =", value, "maximumDischarge");
            return (Criteria) this;
        }

        public Criteria andMaximumDischargeNotEqualTo(Double value) {
            addCriterion("maximum_discharge <>", value, "maximumDischarge");
            return (Criteria) this;
        }

        public Criteria andMaximumDischargeGreaterThan(Double value) {
            addCriterion("maximum_discharge >", value, "maximumDischarge");
            return (Criteria) this;
        }

        public Criteria andMaximumDischargeGreaterThanOrEqualTo(Double value) {
            addCriterion("maximum_discharge >=", value, "maximumDischarge");
            return (Criteria) this;
        }

        public Criteria andMaximumDischargeLessThan(Double value) {
            addCriterion("maximum_discharge <", value, "maximumDischarge");
            return (Criteria) this;
        }

        public Criteria andMaximumDischargeLessThanOrEqualTo(Double value) {
            addCriterion("maximum_discharge <=", value, "maximumDischarge");
            return (Criteria) this;
        }

        public Criteria andMaximumDischargeIn(List<Double> values) {
            addCriterion("maximum_discharge in", values, "maximumDischarge");
            return (Criteria) this;
        }

        public Criteria andMaximumDischargeNotIn(List<Double> values) {
            addCriterion("maximum_discharge not in", values, "maximumDischarge");
            return (Criteria) this;
        }

        public Criteria andMaximumDischargeBetween(Double value1, Double value2) {
            addCriterion("maximum_discharge between", value1, value2, "maximumDischarge");
            return (Criteria) this;
        }

        public Criteria andMaximumDischargeNotBetween(Double value1, Double value2) {
            addCriterion("maximum_discharge not between", value1, value2, "maximumDischarge");
            return (Criteria) this;
        }

        public Criteria andMaximumTimeIsNull() {
            addCriterion("maximum_time is null");
            return (Criteria) this;
        }

        public Criteria andMaximumTimeIsNotNull() {
            addCriterion("maximum_time is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumTimeEqualTo(Date value) {
            addCriterion("maximum_time =", value, "maximumTime");
            return (Criteria) this;
        }

        public Criteria andMaximumTimeNotEqualTo(Date value) {
            addCriterion("maximum_time <>", value, "maximumTime");
            return (Criteria) this;
        }

        public Criteria andMaximumTimeGreaterThan(Date value) {
            addCriterion("maximum_time >", value, "maximumTime");
            return (Criteria) this;
        }

        public Criteria andMaximumTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("maximum_time >=", value, "maximumTime");
            return (Criteria) this;
        }

        public Criteria andMaximumTimeLessThan(Date value) {
            addCriterion("maximum_time <", value, "maximumTime");
            return (Criteria) this;
        }

        public Criteria andMaximumTimeLessThanOrEqualTo(Date value) {
            addCriterion("maximum_time <=", value, "maximumTime");
            return (Criteria) this;
        }

        public Criteria andMaximumTimeIn(List<Date> values) {
            addCriterion("maximum_time in", values, "maximumTime");
            return (Criteria) this;
        }

        public Criteria andMaximumTimeNotIn(List<Date> values) {
            addCriterion("maximum_time not in", values, "maximumTime");
            return (Criteria) this;
        }

        public Criteria andMaximumTimeBetween(Date value1, Date value2) {
            addCriterion("maximum_time between", value1, value2, "maximumTime");
            return (Criteria) this;
        }

        public Criteria andMaximumTimeNotBetween(Date value1, Date value2) {
            addCriterion("maximum_time not between", value1, value2, "maximumTime");
            return (Criteria) this;
        }

        public Criteria andMinimumDischargeIsNull() {
            addCriterion("minimum_discharge is null");
            return (Criteria) this;
        }

        public Criteria andMinimumDischargeIsNotNull() {
            addCriterion("minimum_discharge is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumDischargeEqualTo(Double value) {
            addCriterion("minimum_discharge =", value, "minimumDischarge");
            return (Criteria) this;
        }

        public Criteria andMinimumDischargeNotEqualTo(Double value) {
            addCriterion("minimum_discharge <>", value, "minimumDischarge");
            return (Criteria) this;
        }

        public Criteria andMinimumDischargeGreaterThan(Double value) {
            addCriterion("minimum_discharge >", value, "minimumDischarge");
            return (Criteria) this;
        }

        public Criteria andMinimumDischargeGreaterThanOrEqualTo(Double value) {
            addCriterion("minimum_discharge >=", value, "minimumDischarge");
            return (Criteria) this;
        }

        public Criteria andMinimumDischargeLessThan(Double value) {
            addCriterion("minimum_discharge <", value, "minimumDischarge");
            return (Criteria) this;
        }

        public Criteria andMinimumDischargeLessThanOrEqualTo(Double value) {
            addCriterion("minimum_discharge <=", value, "minimumDischarge");
            return (Criteria) this;
        }

        public Criteria andMinimumDischargeIn(List<Double> values) {
            addCriterion("minimum_discharge in", values, "minimumDischarge");
            return (Criteria) this;
        }

        public Criteria andMinimumDischargeNotIn(List<Double> values) {
            addCriterion("minimum_discharge not in", values, "minimumDischarge");
            return (Criteria) this;
        }

        public Criteria andMinimumDischargeBetween(Double value1, Double value2) {
            addCriterion("minimum_discharge between", value1, value2, "minimumDischarge");
            return (Criteria) this;
        }

        public Criteria andMinimumDischargeNotBetween(Double value1, Double value2) {
            addCriterion("minimum_discharge not between", value1, value2, "minimumDischarge");
            return (Criteria) this;
        }

        public Criteria andMinimumTimeIsNull() {
            addCriterion("minimum_time is null");
            return (Criteria) this;
        }

        public Criteria andMinimumTimeIsNotNull() {
            addCriterion("minimum_time is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumTimeEqualTo(Date value) {
            addCriterion("minimum_time =", value, "minimumTime");
            return (Criteria) this;
        }

        public Criteria andMinimumTimeNotEqualTo(Date value) {
            addCriterion("minimum_time <>", value, "minimumTime");
            return (Criteria) this;
        }

        public Criteria andMinimumTimeGreaterThan(Date value) {
            addCriterion("minimum_time >", value, "minimumTime");
            return (Criteria) this;
        }

        public Criteria andMinimumTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("minimum_time >=", value, "minimumTime");
            return (Criteria) this;
        }

        public Criteria andMinimumTimeLessThan(Date value) {
            addCriterion("minimum_time <", value, "minimumTime");
            return (Criteria) this;
        }

        public Criteria andMinimumTimeLessThanOrEqualTo(Date value) {
            addCriterion("minimum_time <=", value, "minimumTime");
            return (Criteria) this;
        }

        public Criteria andMinimumTimeIn(List<Date> values) {
            addCriterion("minimum_time in", values, "minimumTime");
            return (Criteria) this;
        }

        public Criteria andMinimumTimeNotIn(List<Date> values) {
            addCriterion("minimum_time not in", values, "minimumTime");
            return (Criteria) this;
        }

        public Criteria andMinimumTimeBetween(Date value1, Date value2) {
            addCriterion("minimum_time between", value1, value2, "minimumTime");
            return (Criteria) this;
        }

        public Criteria andMinimumTimeNotBetween(Date value1, Date value2) {
            addCriterion("minimum_time not between", value1, value2, "minimumTime");
            return (Criteria) this;
        }
    }

    /**
     * 
     * @author tanzibiao
     * @date 2024-07-01 21:00:08
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * @author tanzibiao
     * @date 2024-07-01 21:00:08
     */
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