package com.bbstest.mybatis.dao;

import com.bbstest.mybatis.pojo.t_reply_indicators;

public interface t_reply_indicatorsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reply_indicators
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer triId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reply_indicators
     *
     * @mbggenerated
     */
    int insert(t_reply_indicators record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reply_indicators
     *
     * @mbggenerated
     */
    int insertSelective(t_reply_indicators record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reply_indicators
     *
     * @mbggenerated
     */
    t_reply_indicators selectByPrimaryKey(Integer triId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reply_indicators
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(t_reply_indicators record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reply_indicators
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(t_reply_indicators record);
}