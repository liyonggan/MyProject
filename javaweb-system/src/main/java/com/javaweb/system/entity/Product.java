// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.system.entity;

import com.javaweb.common.common.BaseEntity;


/**
 * <p>
 * 产品
 * </p>
 *
 */
public class Product extends BaseEntity {
    private static final long serialVersionUID = 1L;
    /**
     * 产品名称
     */
    private String name;

    /**
     * 所属品牌id
     */
    private Integer brandId;

    /**
     * 状态：1正常 0停用
     */
    private Integer status;

    /**
     * 所属国家/地区
     */
    private String country;

    /**
     * 价格
     */
    private double price;

    /**
     * 金额单位
     */
    private String unit;

    /**
     * 库存
     */
    private Integer inventory;

    /**
     * 已出售
     */
    private Integer sold;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brand_id) {
        this.brandId = brand_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }
}