package com.bbstest.mybatis.dao;

import com.bbstest.mybatis.pojo.t_topic_content;

public interface t_topic_contentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic_content
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer tpcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic_content
     *
     * @mbggenerated
     */
    int insert(t_topic_content record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic_content
     *
     * @mbggenerated
     */
    int insertSelective(t_topic_content record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic_content
     *
     * @mbggenerated
     */
    t_topic_content selectByPrimaryKey(Integer tpcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic_content
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(t_topic_content record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic_content
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(t_topic_content record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_topic_content
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(t_topic_content record);
}