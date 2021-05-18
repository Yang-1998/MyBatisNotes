package com.yqm.mybatis.dto;
//DTO：Data Transfer Object,用于查询结果的数据传输对象，一般由拓展实体对象完成

import com.yqm.mybatis.entity.Category;
import com.yqm.mybatis.entity.Goods;

public class GoodsDTO {
    private Goods goods = new Goods();
    private Category category = new Category();
    private String test;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "GoodsDTO{" +
                "goods=" + goods +
                ", category=" + category +
                ", test='" + test + '\'' +
                '}';
    }
}
