package com.yqm.mybatis.entity;

import java.util.List;

public class Goods {
//    实体命名时要按照驼峰式命名，数据类型和属性名要和数据库表中的字段完全对应，
//    如果表中是下划线如goods_id,则须在mybatis-config.xml中增加设置项（setting），开启驼峰命名与下划线形式的转换
    private Integer goodsId;//商品编号
    private String title;//标题
    private String subTitle;//子标题
    private Float originalCost;//原始价格
    private Float currentPrice;//当前价格
    private Float discount;//折扣率
    private Integer isFreeDelivery;//是否包邮 ,1-包邮 0-不包邮
    private Integer categoryId;//分类编号
    private List<GoodsDetail> goodsDetails;//一个Goods对象下，可以关联多个GoodsDetail对象
                                            //要在goods.xml中说明，通过resultMap映射，以此得到数据

    public List<GoodsDetail> getGoodsDetails() {
        return goodsDetails;
    }

    public void setGoodsDetails(List<GoodsDetail> goodsDetails) {
        this.goodsDetails = goodsDetails;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Float getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(Float originalCost) {
        this.originalCost = originalCost;
    }

    public Float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Integer getIsFreeDelivery() {
        return isFreeDelivery;
    }

    public void setIsFreeDelivery(Integer isFreeDelivery) {
        this.isFreeDelivery = isFreeDelivery;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", originalCost=" + originalCost +
                ", currentPrice=" + currentPrice +
                ", discount=" + discount +
                ", isFreeDelivery=" + isFreeDelivery +
                ", categoryId=" + categoryId +
                '}';
    }
}
