package com.bbstest.mybatis.dao;

import com.bbstest.mybatis.pojo.t_user_specific;

public interface t_user_specificMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_specific
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer uId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_specific
     *
     * @mbggenerated
     */
    int insert(t_user_specific record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_specific
     *
     * @mbggenerated
     */
    int insertSelective(t_user_specific record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_specific
     *
     * @mbggenerated
     */
    t_user_specific selectByPrimaryKey(Integer uId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_specific
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(t_user_specific record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_specific
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(t_user_specific record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_specific
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(t_user_specific record);
}