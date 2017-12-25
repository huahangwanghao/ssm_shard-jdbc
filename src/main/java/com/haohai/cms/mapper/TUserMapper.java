package com.haohai.cms.mapper;

import com.haohai.cms.model.TUser;
import com.haohai.cms.model.TUserCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TUserMapper {
    int countByExample(TUserCriteria example);

    int deleteByExample(TUserCriteria example);

    int deleteByPrimaryKey(Integer userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserCriteria example);

    TUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserCriteria example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserCriteria example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
    
    TUser getUserById(int userId);
    List<TUser> getAllUser ();
}