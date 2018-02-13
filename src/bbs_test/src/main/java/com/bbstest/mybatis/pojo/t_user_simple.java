package com.bbstest.mybatis.pojo;

import java.io.Serializable;

public class t_user_simple implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_simple.u_id
     *
     * @mbggenerated
     */
    private Integer uId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_simple.u_name
     *
     * @mbggenerated
     */
    private String uName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_simple.u_password
     *
     * @mbggenerated
     */
    private String uPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_simple.u_icon_url
     *
     * @mbggenerated
     */
    private String uIconUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user_simple
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_simple.u_id
     *
     * @return the value of t_user_simple.u_id
     *
     * @mbggenerated
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_simple.u_id
     *
     * @param uId the value for t_user_simple.u_id
     *
     * @mbggenerated
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_simple.u_name
     *
     * @return the value of t_user_simple.u_name
     *
     * @mbggenerated
     */
    public String getuName() {
        return uName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_simple.u_name
     *
     * @param uName the value for t_user_simple.u_name
     *
     * @mbggenerated
     */
    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_simple.u_password
     *
     * @return the value of t_user_simple.u_password
     *
     * @mbggenerated
     */
    public String getuPassword() {
        return uPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_simple.u_password
     *
     * @param uPassword the value for t_user_simple.u_password
     *
     * @mbggenerated
     */
    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_simple.u_icon_url
     *
     * @return the value of t_user_simple.u_icon_url
     *
     * @mbggenerated
     */
    public String getuIconUrl() {
        return uIconUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_simple.u_icon_url
     *
     * @param uIconUrl the value for t_user_simple.u_icon_url
     *
     * @mbggenerated
     */
    public void setuIconUrl(String uIconUrl) {
        this.uIconUrl = uIconUrl == null ? null : uIconUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_simple
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
        t_user_simple other = (t_user_simple) that;
        return (this.getuId() == null ? other.getuId() == null : this.getuId().equals(other.getuId()))
            && (this.getuName() == null ? other.getuName() == null : this.getuName().equals(other.getuName()))
            && (this.getuPassword() == null ? other.getuPassword() == null : this.getuPassword().equals(other.getuPassword()))
            && (this.getuIconUrl() == null ? other.getuIconUrl() == null : this.getuIconUrl().equals(other.getuIconUrl()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_simple
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getuId() == null) ? 0 : getuId().hashCode());
        result = prime * result + ((getuName() == null) ? 0 : getuName().hashCode());
        result = prime * result + ((getuPassword() == null) ? 0 : getuPassword().hashCode());
        result = prime * result + ((getuIconUrl() == null) ? 0 : getuIconUrl().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_simple
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uId=").append(uId);
        sb.append(", uName=").append(uName);
        sb.append(", uPassword=").append(uPassword);
        sb.append(", uIconUrl=").append(uIconUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}