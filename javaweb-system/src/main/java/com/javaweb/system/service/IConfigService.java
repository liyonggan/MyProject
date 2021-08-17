// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.system.service;

import com.javaweb.system.entity.Config;
import com.javaweb.common.common.IBaseService;

import java.util.List;

/**
 * <p>
 * 系统配置 服务类
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-03
 */
public interface IConfigService extends IBaseService<Config> {

    /**
     * 根据分组ID获取配置列表
     * @param groupId 分组ID
     * @return
     */
    List<Config> getConfigListByGroupId(Integer groupId);

}