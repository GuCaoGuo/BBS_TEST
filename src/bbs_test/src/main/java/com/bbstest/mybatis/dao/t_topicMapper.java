package com.bbstest.mybatis.dao;

import com.bbstest.mybatis.pojo.t_topic;

public interface t_topicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer tpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated
     */
    int insert(t_topic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated
     */
    int insertSelective(t_topic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated
     */
    t_topic selectByPrimaryKey(Integer tpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(t_topic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(t_topic record);
}