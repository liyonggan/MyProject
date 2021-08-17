// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.system.mapper;

import com.javaweb.system.entity.OperLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 操作日志 Mapper 接口
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-04
 */
public interface OperLogMapper extends BaseMapper<OperLog> {

    /**
     * 创建系统操作日志
     *
     * @param operLog 操作日志对象
     */
    void insertOperlog(OperLog operLog);

}
