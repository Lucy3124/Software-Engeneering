package com.tiancheng.homework.domain;

import java.util.ArrayList;
import java.util.List;

public class GradeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public GradeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
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

        public Criteria andIdExamineeIsNull() {
            addCriterion("idExaminee is null");
            return (Criteria) this;
        }

        public Criteria andIdExamineeIsNotNull() {
            addCriterion("idExaminee is not null");
            return (Criteria) this;
        }

        public Criteria andIdExamineeEqualTo(Integer value) {
            addCriterion("idExaminee =", value, "idExaminee");
            return (Criteria) this;
        }

        public Criteria andIdExamineeNotEqualTo(Integer value) {
            addCriterion("idExaminee <>", value, "idExaminee");
            return (Criteria) this;
        }

        public Criteria andIdExamineeGreaterThan(Integer value) {
            addCriterion("idExaminee >", value, "idExaminee");
            return (Criteria) this;
        }

        public Criteria andIdExamineeGreaterThanOrEqualTo(Integer value) {
            addCriterion("idExaminee >=", value, "idExaminee");
            return (Criteria) this;
        }

        public Criteria andIdExamineeLessThan(Integer value) {
            addCriterion("idExaminee <", value, "idExaminee");
            return (Criteria) this;
        }

        public Criteria andIdExamineeLessThanOrEqualTo(Integer value) {
            addCriterion("idExaminee <=", value, "idExaminee");
            return (Criteria) this;
        }

        public Criteria andIdExamineeIn(List<Integer> values) {
            addCriterion("idExaminee in", values, "idExaminee");
            return (Criteria) this;
        }

        public Criteria andIdExamineeNotIn(List<Integer> values) {
            addCriterion("idExaminee not in", values, "idExaminee");
            return (Criteria) this;
        }

        public Criteria andIdExamineeBetween(Integer value1, Integer value2) {
            addCriterion("idExaminee between", value1, value2, "idExaminee");
            return (Criteria) this;
        }

        public Criteria andIdExamineeNotBetween(Integer value1, Integer value2) {
            addCriterion("idExaminee not between", value1, value2, "idExaminee");
            return (Criteria) this;
        }

        public Criteria andIdpersonIsNull() {
            addCriterion("idperson is null");
            return (Criteria) this;
        }

        public Criteria andIdpersonIsNotNull() {
            addCriterion("idperson is not null");
            return (Criteria) this;
        }

        public Criteria andIdpersonEqualTo(String value) {
            addCriterion("idperson =", value, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonNotEqualTo(String value) {
            addCriterion("idperson <>", value, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonGreaterThan(String value) {
            addCriterion("idperson >", value, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonGreaterThanOrEqualTo(String value) {
            addCriterion("idperson >=", value, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonLessThan(String value) {
            addCriterion("idperson <", value, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonLessThanOrEqualTo(String value) {
            addCriterion("idperson <=", value, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonLike(String value) {
            addCriterion("idperson like", value, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonNotLike(String value) {
            addCriterion("idperson not like", value, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonIn(List<String> values) {
            addCriterion("idperson in", values, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonNotIn(List<String> values) {
            addCriterion("idperson not in", values, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonBetween(String value1, String value2) {
            addCriterion("idperson between", value1, value2, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonNotBetween(String value1, String value2) {
            addCriterion("idperson not between", value1, value2, "idperson");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSubject1IsNull() {
            addCriterion("subject1 is null");
            return (Criteria) this;
        }

        public Criteria andSubject1IsNotNull() {
            addCriterion("subject1 is not null");
            return (Criteria) this;
        }

        public Criteria andSubject1EqualTo(String value) {
            addCriterion("subject1 =", value, "subject1");
            return (Criteria) this;
        }

        public Criteria andSubject1NotEqualTo(String value) {
            addCriterion("subject1 <>", value, "subject1");
            return (Criteria) this;
        }

        public Criteria andSubject1GreaterThan(String value) {
            addCriterion("subject1 >", value, "subject1");
            return (Criteria) this;
        }

        public Criteria andSubject1GreaterThanOrEqualTo(String value) {
            addCriterion("subject1 >=", value, "subject1");
            return (Criteria) this;
        }

        public Criteria andSubject1LessThan(String value) {
            addCriterion("subject1 <", value, "subject1");
            return (Criteria) this;
        }

        public Criteria andSubject1LessThanOrEqualTo(String value) {
            addCriterion("subject1 <=", value, "subject1");
            return (Criteria) this;
        }

        public Criteria andSubject1Like(String value) {
            addCriterion("subject1 like", value, "subject1");
            return (Criteria) this;
        }

        public Criteria andSubject1NotLike(String value) {
            addCriterion("subject1 not like", value, "subject1");
            return (Criteria) this;
        }

        public Criteria andSubject1In(List<String> values) {
            addCriterion("subject1 in", values, "subject1");
            return (Criteria) this;
        }

        public Criteria andSubject1NotIn(List<String> values) {
            addCriterion("subject1 not in", values, "subject1");
            return (Criteria) this;
        }

        public Criteria andSubject1Between(String value1, String value2) {
            addCriterion("subject1 between", value1, value2, "subject1");
            return (Criteria) this;
        }

        public Criteria andSubject1NotBetween(String value1, String value2) {
            addCriterion("subject1 not between", value1, value2, "subject1");
            return (Criteria) this;
        }

        public Criteria andGrade1IsNull() {
            addCriterion("grade1 is null");
            return (Criteria) this;
        }

        public Criteria andGrade1IsNotNull() {
            addCriterion("grade1 is not null");
            return (Criteria) this;
        }

        public Criteria andGrade1EqualTo(String value) {
            addCriterion("grade1 =", value, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1NotEqualTo(String value) {
            addCriterion("grade1 <>", value, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1GreaterThan(String value) {
            addCriterion("grade1 >", value, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1GreaterThanOrEqualTo(String value) {
            addCriterion("grade1 >=", value, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1LessThan(String value) {
            addCriterion("grade1 <", value, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1LessThanOrEqualTo(String value) {
            addCriterion("grade1 <=", value, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1Like(String value) {
            addCriterion("grade1 like", value, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1NotLike(String value) {
            addCriterion("grade1 not like", value, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1In(List<String> values) {
            addCriterion("grade1 in", values, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1NotIn(List<String> values) {
            addCriterion("grade1 not in", values, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1Between(String value1, String value2) {
            addCriterion("grade1 between", value1, value2, "grade1");
            return (Criteria) this;
        }

        public Criteria andGrade1NotBetween(String value1, String value2) {
            addCriterion("grade1 not between", value1, value2, "grade1");
            return (Criteria) this;
        }

        public Criteria andSubject2IsNull() {
            addCriterion("subject2 is null");
            return (Criteria) this;
        }

        public Criteria andSubject2IsNotNull() {
            addCriterion("subject2 is not null");
            return (Criteria) this;
        }

        public Criteria andSubject2EqualTo(String value) {
            addCriterion("subject2 =", value, "subject2");
            return (Criteria) this;
        }

        public Criteria andSubject2NotEqualTo(String value) {
            addCriterion("subject2 <>", value, "subject2");
            return (Criteria) this;
        }

        public Criteria andSubject2GreaterThan(String value) {
            addCriterion("subject2 >", value, "subject2");
            return (Criteria) this;
        }

        public Criteria andSubject2GreaterThanOrEqualTo(String value) {
            addCriterion("subject2 >=", value, "subject2");
            return (Criteria) this;
        }

        public Criteria andSubject2LessThan(String value) {
            addCriterion("subject2 <", value, "subject2");
            return (Criteria) this;
        }

        public Criteria andSubject2LessThanOrEqualTo(String value) {
            addCriterion("subject2 <=", value, "subject2");
            return (Criteria) this;
        }

        public Criteria andSubject2Like(String value) {
            addCriterion("subject2 like", value, "subject2");
            return (Criteria) this;
        }

        public Criteria andSubject2NotLike(String value) {
            addCriterion("subject2 not like", value, "subject2");
            return (Criteria) this;
        }

        public Criteria andSubject2In(List<String> values) {
            addCriterion("subject2 in", values, "subject2");
            return (Criteria) this;
        }

        public Criteria andSubject2NotIn(List<String> values) {
            addCriterion("subject2 not in", values, "subject2");
            return (Criteria) this;
        }

        public Criteria andSubject2Between(String value1, String value2) {
            addCriterion("subject2 between", value1, value2, "subject2");
            return (Criteria) this;
        }

        public Criteria andSubject2NotBetween(String value1, String value2) {
            addCriterion("subject2 not between", value1, value2, "subject2");
            return (Criteria) this;
        }

        public Criteria andGrade2IsNull() {
            addCriterion("grade2 is null");
            return (Criteria) this;
        }

        public Criteria andGrade2IsNotNull() {
            addCriterion("grade2 is not null");
            return (Criteria) this;
        }

        public Criteria andGrade2EqualTo(String value) {
            addCriterion("grade2 =", value, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2NotEqualTo(String value) {
            addCriterion("grade2 <>", value, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2GreaterThan(String value) {
            addCriterion("grade2 >", value, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2GreaterThanOrEqualTo(String value) {
            addCriterion("grade2 >=", value, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2LessThan(String value) {
            addCriterion("grade2 <", value, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2LessThanOrEqualTo(String value) {
            addCriterion("grade2 <=", value, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2Like(String value) {
            addCriterion("grade2 like", value, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2NotLike(String value) {
            addCriterion("grade2 not like", value, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2In(List<String> values) {
            addCriterion("grade2 in", values, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2NotIn(List<String> values) {
            addCriterion("grade2 not in", values, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2Between(String value1, String value2) {
            addCriterion("grade2 between", value1, value2, "grade2");
            return (Criteria) this;
        }

        public Criteria andGrade2NotBetween(String value1, String value2) {
            addCriterion("grade2 not between", value1, value2, "grade2");
            return (Criteria) this;
        }

        public Criteria andSubject3IsNull() {
            addCriterion("subject3 is null");
            return (Criteria) this;
        }

        public Criteria andSubject3IsNotNull() {
            addCriterion("subject3 is not null");
            return (Criteria) this;
        }

        public Criteria andSubject3EqualTo(String value) {
            addCriterion("subject3 =", value, "subject3");
            return (Criteria) this;
        }

        public Criteria andSubject3NotEqualTo(String value) {
            addCriterion("subject3 <>", value, "subject3");
            return (Criteria) this;
        }

        public Criteria andSubject3GreaterThan(String value) {
            addCriterion("subject3 >", value, "subject3");
            return (Criteria) this;
        }

        public Criteria andSubject3GreaterThanOrEqualTo(String value) {
            addCriterion("subject3 >=", value, "subject3");
            return (Criteria) this;
        }

        public Criteria andSubject3LessThan(String value) {
            addCriterion("subject3 <", value, "subject3");
            return (Criteria) this;
        }

        public Criteria andSubject3LessThanOrEqualTo(String value) {
            addCriterion("subject3 <=", value, "subject3");
            return (Criteria) this;
        }

        public Criteria andSubject3Like(String value) {
            addCriterion("subject3 like", value, "subject3");
            return (Criteria) this;
        }

        public Criteria andSubject3NotLike(String value) {
            addCriterion("subject3 not like", value, "subject3");
            return (Criteria) this;
        }

        public Criteria andSubject3In(List<String> values) {
            addCriterion("subject3 in", values, "subject3");
            return (Criteria) this;
        }

        public Criteria andSubject3NotIn(List<String> values) {
            addCriterion("subject3 not in", values, "subject3");
            return (Criteria) this;
        }

        public Criteria andSubject3Between(String value1, String value2) {
            addCriterion("subject3 between", value1, value2, "subject3");
            return (Criteria) this;
        }

        public Criteria andSubject3NotBetween(String value1, String value2) {
            addCriterion("subject3 not between", value1, value2, "subject3");
            return (Criteria) this;
        }

        public Criteria andGrade3IsNull() {
            addCriterion("grade3 is null");
            return (Criteria) this;
        }

        public Criteria andGrade3IsNotNull() {
            addCriterion("grade3 is not null");
            return (Criteria) this;
        }

        public Criteria andGrade3EqualTo(String value) {
            addCriterion("grade3 =", value, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3NotEqualTo(String value) {
            addCriterion("grade3 <>", value, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3GreaterThan(String value) {
            addCriterion("grade3 >", value, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3GreaterThanOrEqualTo(String value) {
            addCriterion("grade3 >=", value, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3LessThan(String value) {
            addCriterion("grade3 <", value, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3LessThanOrEqualTo(String value) {
            addCriterion("grade3 <=", value, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3Like(String value) {
            addCriterion("grade3 like", value, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3NotLike(String value) {
            addCriterion("grade3 not like", value, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3In(List<String> values) {
            addCriterion("grade3 in", values, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3NotIn(List<String> values) {
            addCriterion("grade3 not in", values, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3Between(String value1, String value2) {
            addCriterion("grade3 between", value1, value2, "grade3");
            return (Criteria) this;
        }

        public Criteria andGrade3NotBetween(String value1, String value2) {
            addCriterion("grade3 not between", value1, value2, "grade3");
            return (Criteria) this;
        }

        public Criteria andSubject4IsNull() {
            addCriterion("subject4 is null");
            return (Criteria) this;
        }

        public Criteria andSubject4IsNotNull() {
            addCriterion("subject4 is not null");
            return (Criteria) this;
        }

        public Criteria andSubject4EqualTo(String value) {
            addCriterion("subject4 =", value, "subject4");
            return (Criteria) this;
        }

        public Criteria andSubject4NotEqualTo(String value) {
            addCriterion("subject4 <>", value, "subject4");
            return (Criteria) this;
        }

        public Criteria andSubject4GreaterThan(String value) {
            addCriterion("subject4 >", value, "subject4");
            return (Criteria) this;
        }

        public Criteria andSubject4GreaterThanOrEqualTo(String value) {
            addCriterion("subject4 >=", value, "subject4");
            return (Criteria) this;
        }

        public Criteria andSubject4LessThan(String value) {
            addCriterion("subject4 <", value, "subject4");
            return (Criteria) this;
        }

        public Criteria andSubject4LessThanOrEqualTo(String value) {
            addCriterion("subject4 <=", value, "subject4");
            return (Criteria) this;
        }

        public Criteria andSubject4Like(String value) {
            addCriterion("subject4 like", value, "subject4");
            return (Criteria) this;
        }

        public Criteria andSubject4NotLike(String value) {
            addCriterion("subject4 not like", value, "subject4");
            return (Criteria) this;
        }

        public Criteria andSubject4In(List<String> values) {
            addCriterion("subject4 in", values, "subject4");
            return (Criteria) this;
        }

        public Criteria andSubject4NotIn(List<String> values) {
            addCriterion("subject4 not in", values, "subject4");
            return (Criteria) this;
        }

        public Criteria andSubject4Between(String value1, String value2) {
            addCriterion("subject4 between", value1, value2, "subject4");
            return (Criteria) this;
        }

        public Criteria andSubject4NotBetween(String value1, String value2) {
            addCriterion("subject4 not between", value1, value2, "subject4");
            return (Criteria) this;
        }

        public Criteria andGrade4IsNull() {
            addCriterion("grade4 is null");
            return (Criteria) this;
        }

        public Criteria andGrade4IsNotNull() {
            addCriterion("grade4 is not null");
            return (Criteria) this;
        }

        public Criteria andGrade4EqualTo(String value) {
            addCriterion("grade4 =", value, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4NotEqualTo(String value) {
            addCriterion("grade4 <>", value, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4GreaterThan(String value) {
            addCriterion("grade4 >", value, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4GreaterThanOrEqualTo(String value) {
            addCriterion("grade4 >=", value, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4LessThan(String value) {
            addCriterion("grade4 <", value, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4LessThanOrEqualTo(String value) {
            addCriterion("grade4 <=", value, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4Like(String value) {
            addCriterion("grade4 like", value, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4NotLike(String value) {
            addCriterion("grade4 not like", value, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4In(List<String> values) {
            addCriterion("grade4 in", values, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4NotIn(List<String> values) {
            addCriterion("grade4 not in", values, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4Between(String value1, String value2) {
            addCriterion("grade4 between", value1, value2, "grade4");
            return (Criteria) this;
        }

        public Criteria andGrade4NotBetween(String value1, String value2) {
            addCriterion("grade4 not between", value1, value2, "grade4");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table grade
     *
     * @mbg.generated do_not_delete_during_merge Fri Dec 14 14:23:28 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
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