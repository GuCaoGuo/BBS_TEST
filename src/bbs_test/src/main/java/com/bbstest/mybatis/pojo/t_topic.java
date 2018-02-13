package com.bbstest.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;

public class t_topic implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.tp_id
     *
     * @mbggenerated
     */
    private Integer tpId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.u_id
     *
     * @mbggenerated
     */
    private Integer uId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.ct_id
     *
     * @mbggenerated
     */
    private Integer ctId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.tp_title
     *
     * @mbggenerated
     */
    private String tpTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.create_date
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic.tp_status
     *
     * @mbggenerated
     */
    private Byte tpStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_topic
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.tp_id
     *
     * @return the value of t_topic.tp_id
     *
     * @mbggenerated
     */
    public Integer getTpId() {
        return tpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.tp_id
     *
     * @param tpId the value for t_topic.tp_id
     *
     * @mbggenerated
     */
    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.u_id
     *
     * @return the value of t_topic.u_id
     *
     * @mbggenerated
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.u_id
     *
     * @param uId the value for t_topic.u_id
     *
     * @mbggenerated
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.ct_id
     *
     * @return the value of t_topic.ct_id
     *
     * @mbggenerated
     */
    public Integer getCtId() {
        return ctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.ct_id
     *
     * @param ctId the value for t_topic.ct_id
     *
     * @mbggenerated
     */
    public void setCtId(Integer ctId) {
        this.ctId = ctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.tp_title
     *
     * @return the value of t_topic.tp_title
     *
     * @mbggenerated
     */
    public String getTpTitle() {
        return tpTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.tp_title
     *
     * @param tpTitle the value for t_topic.tp_title
     *
     * @mbggenerated
     */
    public void setTpTitle(String tpTitle) {
        this.tpTitle = tpTitle == null ? null : tpTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.create_date
     *
     * @return the value of t_topic.create_date
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.create_date
     *
     * @param createDate the value for t_topic.create_date
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic.tp_status
     *
     * @return the value of t_topic.tp_status
     *
     * @mbggenerated
     */
    public Byte getTpStatus() {
        return tpStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic.tp_status
     *
     * @param tpStatus the value for t_topic.tp_status
     *
     * @mbggenerated
     */
    public void setTpStatus(Byte tpStatus) {
        this.tpStatus = tpStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
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
        t_topic other = (t_topic) that;
        return (this.getTpId() == null ? other.getTpId() == null : this.getTpId().equals(other.getTpId()))
            && (this.getuId() == null ? other.getuId() == null : this.getuId().equals(other.getuId()))
            && (this.getCtId() == null ? other.getCtId() == null : this.getCtId().equals(other.getCtId()))
            && (this.getTpTitle() == null ? other.getTpTitle() == null : this.getTpTitle().equals(other.getTpTitle()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getTpStatus() == null ? other.getTpStatus() == null : this.getTpStatus().equals(other.getTpStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTpId() == null) ? 0 : getTpId().hashCode());
        result = prime * result + ((getuId() == null) ? 0 : getuId().hashCode());
        result = prime * result + ((getCtId() == null) ? 0 : getCtId().hashCode());
        result = prime * result + ((getTpTitle() == null) ? 0 : getTpTitle().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getTpStatus() == null) ? 0 : getTpStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tpId=").append(tpId);
        sb.append(", uId=").append(uId);
        sb.append(", ctId=").append(ctId);
        sb.append(", tpTitle=").append(tpTitle);
        sb.append(", createDate=").append(createDate);
        sb.append(", tpStatus=").append(tpStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}