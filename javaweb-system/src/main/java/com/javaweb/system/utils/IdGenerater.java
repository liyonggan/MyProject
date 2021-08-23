package com.javaweb.system.utils;

import com.javaweb.common.utils.SpringUtils;
import com.javaweb.system.entity.Tsequence;
import com.javaweb.system.mapper.TsequenceMapper;

public class IdGenerater {

    public static int generaterId(String key) {
        TsequenceMapper tsequenceMapper = SpringUtils.getBean(TsequenceMapper.class);
        Tsequence tsequence = tsequenceMapper.selectById(key);
        int result = tsequence.getSeqNum();
        tsequence.setSeqNum(tsequence.getSeqNum() + 1);
        tsequenceMapper.updateByPrimaryKey(tsequence);
        return result;
    }
}
