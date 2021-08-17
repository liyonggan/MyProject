// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.common.service;

import com.javaweb.common.utils.JsonResult;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 人员角色表 服务类
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-02-26
 */
public interface IUploadService {

    /**
     * 上传图片
     *
     * @param request 网络请求
     * @param name    目录名
     * @return
     */
    JsonResult uploadImage(HttpServletRequest request, String name);

    /**
     * 上传文件
     *
     * @param request
     * @param name    目录名
     * @return
     */
    JsonResult uploadFile(HttpServletRequest request, String name);

    /**
     * 上传图片
     *
     * @param request 网络请求
     * @param name    目录名
     * @return
     */
    String kindeditorImage(HttpServletRequest request, String name);

}
