package com.bbstest.mybatis.pojo;

import java.io.Serializable;

public class t_topic_indicators implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic_indicators.tpi_id
     *
     * @mbggenerated
     */
    private Integer tpiId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic_indicators.tp_id
     *
     * @mbggenerated
     */
    private Integer tpId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic_indicators.reply_count
     *
     * @mbggenerated
     */
    private Integer replyCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic_indicators.read_count
     *
     * @mbggenerated
     */
    private Integer readCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic_indicators.agree_count
     *
     * @mbggenerated
     */
    private Integer agreeCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_topic_indicators.disagree_count
     *
     * @mbggenerated
     */
    private Integer disagreeCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_topic_indicators
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic_indicators.tpi_id
     *
     * @return the value of t_topic_indicators.tpi_id
     *
     * @mbggenerated
     */
    public Integer getTpiId() {
        return tpiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic_indicators.tpi_id
     *
     * @param tpiId the value for t_topic_indicators.tpi_id
     *
     * @mbggenerated
     */
    public void setTpiId(Integer tpiId) {
        this.tpiId = tpiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic_indicators.tp_id
     *
     * @return the value of t_topic_indicators.tp_id
     *
     * @mbggenerated
     */
    public Integer getTpId() {
        return tpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic_indicators.tp_id
     *
     * @param tpId the value for t_topic_indicators.tp_id
     *
     * @mbggenerated
     */
    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic_indicators.reply_count
     *
     * @return the value of t_topic_indicators.reply_count
     *
     * @mbggenerated
     */
    public Integer getReplyCount() {
        return replyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic_indicators.reply_count
     *
     * @param replyCount the value for t_topic_indicators.reply_count
     *
     * @mbggenerated
     */
    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic_indicators.read_count
     *
     * @return the value of t_topic_indicators.read_count
     *
     * @mbggenerated
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic_indicators.read_count
     *
     * @param readCount the value for t_topic_indicators.read_count
     *
     * @mbggenerated
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic_indicators.agree_count
     *
     * @return the value of t_topic_indicators.agree_count
     *
     * @mbggenerated
     */
    public Integer getAgreeCount() {
        return agreeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic_indicators.agree_count
     *
     * @param agreeCount the value for t_topic_indicators.agree_count
     *
     * @mbggenerated
     */
    public void setAgreeCount(Integer agreeCount) {
        this.agreeCount = agreeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_topic_indicators.disagree_count
     *
     * @return the value of t_topic_indicators.disagree_count
     *
     * @mbggenerated
     */
    public Integer getDisagreeCount() {
        return disagreeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_topic_indicators.disagree_count
     *
     * @param disagreeCount the value for t_topic_indicators.disagree_count
     *
     * @mbggenerated
     */
    public void setDisagreeCount(Integer disagreeCount) {
        this.disagreeCount = disagreeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic_indicators
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
        t_topic_indicators other = (t_topic_indicators) that;
        return (this.getTpiId() == null ? other.getTpiId() == null : this.getTpiId().equals(other.getTpiId()))
            && (this.getTpId() == null ? other.getTpId() == null : this.getTpId().equals(other.getTpId()))
            && (this.getReplyCount() == null ? other.getReplyCount() == null : this.getReplyCount().equals(other.getReplyCount()))
            && (this.getReadCount() == null ? other.getReadCount() == null : this.getReadCount().equals(other.getReadCount()))
            && (this.getAgreeCount() == null ? other.getAgreeCount() == null : this.getAgreeCount().equals(other.getAgreeCount()))
            && (this.getDisagreeCount() == null ? other.getDisagreeCount() == null : this.getDisagreeCount().equals(other.getDisagreeCount()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic_indicators
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTpiId() == null) ? 0 : getTpiId().hashCode());
        result = prime * result + ((getTpId() == null) ? 0 : getTpId().hashCode());
        result = prime * result + ((getReplyCount() == null) ? 0 : getReplyCount().hashCode());
        result = prime * result + ((getReadCount() == null) ? 0 : getReadCount().hashCode());
        result = prime * result + ((getAgreeCount() == null) ? 0 : getAgreeCount().hashCode());
        result = prime * result + ((getDisagreeCount() == null) ? 0 : getDisagreeCount().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic_indicators
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tpiId=").append(tpiId);
        sb.append(", tpId=").append(tpId);
        sb.append(", replyCount=").append(replyCount);
        sb.append(", readCount=").append(readCount);
        sb.append(", agreeCount=").append(agreeCount);
        sb.append(", disagreeCount=").append(disagreeCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}