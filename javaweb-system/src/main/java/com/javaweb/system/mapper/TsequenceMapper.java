package com.javaweb.system.mapper;

import com.javaweb.system.entity.Tsequence;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TsequenceMapper {

    int deleteByPrimaryKey(String id);

    int insert(Tsequence record);

    int insertSelective(Tsequence record);

    Tsequence selectById(String id);

    int updateByPrimaryKeySelective(Tsequence record);

    int updateByPrimaryKey(Tsequence record);
}