package com.bbstest.mybatis.pojo;

import java.io.Serializable;

public class t_category implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category.ct_id
     *
     * @mbggenerated
     */
    private Short ctId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_category.ct_name
     *
     * @mbggenerated
     */
    private String ctName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_category
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category.ct_id
     *
     * @return the value of t_category.ct_id
     *
     * @mbggenerated
     */
    public Short getCtId() {
        return ctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category.ct_id
     *
     * @param ctId the value for t_category.ct_id
     *
     * @mbggenerated
     */
    public void setCtId(Short ctId) {
        this.ctId = ctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_category.ct_name
     *
     * @return the value of t_category.ct_name
     *
     * @mbggenerated
     */
    public String getCtName() {
        return ctName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_category.ct_name
     *
     * @param ctName the value for t_category.ct_name
     *
     * @mbggenerated
     */
    public void setCtName(String ctName) {
        this.ctName = ctName == null ? null : ctName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        t_category other = (t_category) that;
        return (this.getCtId() == null ? other.getCtId() == null : this.getCtId().equals(other.getCtId()))
            && (this.getCtName() == null ? other.getCtName() == null : this.getCtName().equals(other.getCtName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCtId() == null) ? 0 : getCtId().hashCode());
        result = prime * result + ((getCtName() == null) ? 0 : getCtName().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ctId=").append(ctId);
        sb.append(", ctName=").append(ctName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}