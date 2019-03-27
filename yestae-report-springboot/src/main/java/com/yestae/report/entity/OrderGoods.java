package com.yestae.report.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 订单商品明细表
 * </p>
 *
 * @author wp
 * @since 2019-01-10
 */
@TableName("sdb_b2c_order_goods")
public class OrderGoods {

    /**
     * 主键
     */
	private String id;
    /**
     * 会员ID
     */
	@TableField("member_id")
	private String memberId;
    /**
     * 会员编号
     */
	@TableField("member_no")
	private String memberNo;
    /**
     * 会员名称
     */
	@TableField("member_name")
	private String memberName;
    /**
     * 会员手机号
     */
	@TableField("member_phone")
	private String memberPhone;
    /**
     * 会员等级
     */
	@TableField("member_level")
	private String memberLevel;
    /**
     * 订单ID
     */
	@TableField("order_id")
	private String orderId;
    /**
     * 订单编号
     */
	@TableField("order_no")
	private String orderNo;
    /**
     * 货品ID
     */
	@TableField("product_id")
	private String productId;
    /**
     * 货品编号
     */
	@TableField("product_no")
	private String productNo;
    /**
     * 商品ID
     */
	@TableField("goods_id")
	private String goodsId;
    /**
     * 商品编号
     */
	@TableField("goods_no")
	private String goodsNo;
    /**
     * 商品类型
     */
	@TableField("goods_type")
	private String goodsType;
    /**
     * 商品名称
     */
	@TableField("goods_name")
	private String goodsName;
    /**
     * 商品成本价
     */
	@TableField("goods_cost")
	private BigDecimal goodsCost;
    /**
     * 商品销售价
     */
	@TableField("sale_price")
	private BigDecimal salePrice;
    /**
     * 商品促销价
     */
	@TableField("prom_price")
	private BigDecimal promPrice;
    /**
     * 商品会员价
     */
	@TableField("member_price")
	private BigDecimal memberPrice;
    /**
     * 优惠促销总金额
     */
	@TableField("pmt_amount")
	private BigDecimal pmtAmount;
    /**
     * 实际支付总金额
     */
	@TableField("pay_amount")
	private BigDecimal payAmount;
    /**
     * 商品数量单位
     */
	@TableField("goods_unit")
	private String goodsUnit;
    /**
     * 商品数量
     */
	@TableField("goods_nums")
	private Float goodsNums;
    /**
     * 商品销售类型
     */
	@TableField("sale_type")
	private String saleType;
    /**
     * 订单商品是否可存茶0:不能,1:能
     */
	@TableField("if_can_savetea")
	private String ifCanSavetea;
    /**
     * 商品的规格属性
     */
	@TableField("goods_spec")
	private String goodsSpec;
    /**
     * 商品的体积
     */
	@TableField("goods_size")
	private BigDecimal goodsSize;
    /**
     * 商品的重量
     */
	@TableField("goods_weight")
	private BigDecimal goodsWeight;
    /**
     * 新建时间
     */
	@TableField("create_time")
	private Long createTime;
    /**
     * 修改时间
     */
	@TableField("update_time")
	private Long updateTime;
    /**
     * 年度
     */
	@TableField("create_year")
	private Integer createYear;
    /**
     * 月份
     */
	@TableField("create_month")
	private Integer createMonth;
    /**
     * 状态
     */
	private String state;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsNo() {
		return goodsNo;
	}

	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public BigDecimal getGoodsCost() {
		return goodsCost;
	}

	public void setGoodsCost(BigDecimal goodsCost) {
		this.goodsCost = goodsCost;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public BigDecimal getPromPrice() {
		return promPrice;
	}

	public void setPromPrice(BigDecimal promPrice) {
		this.promPrice = promPrice;
	}

	public BigDecimal getMemberPrice() {
		return memberPrice;
	}

	public void setMemberPrice(BigDecimal memberPrice) {
		this.memberPrice = memberPrice;
	}

	public BigDecimal getPmtAmount() {
		return pmtAmount;
	}

	public void setPmtAmount(BigDecimal pmtAmount) {
		this.pmtAmount = pmtAmount;
	}

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public String getGoodsUnit() {
		return goodsUnit;
	}

	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}

	public Float getGoodsNums() {
		return goodsNums;
	}

	public void setGoodsNums(Float goodsNums) {
		this.goodsNums = goodsNums;
	}

	public String getSaleType() {
		return saleType;
	}

	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}

	public String getIfCanSavetea() {
		return ifCanSavetea;
	}

	public void setIfCanSavetea(String ifCanSavetea) {
		this.ifCanSavetea = ifCanSavetea;
	}

	public String getGoodsSpec() {
		return goodsSpec;
	}

	public void setGoodsSpec(String goodsSpec) {
		this.goodsSpec = goodsSpec;
	}

	public BigDecimal getGoodsSize() {
		return goodsSize;
	}

	public void setGoodsSize(BigDecimal goodsSize) {
		this.goodsSize = goodsSize;
	}

	public BigDecimal getGoodsWeight() {
		return goodsWeight;
	}

	public void setGoodsWeight(BigDecimal goodsWeight) {
		this.goodsWeight = goodsWeight;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getCreateYear() {
		return createYear;
	}

	public void setCreateYear(Integer createYear) {
		this.createYear = createYear;
	}

	public Integer getCreateMonth() {
		return createMonth;
	}

	public void setCreateMonth(Integer createMonth) {
		this.createMonth = createMonth;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "SdbB2cOrderGoods{" +
			"id=" + id +
			", memberId=" + memberId +
			", memberNo=" + memberNo +
			", memberName=" + memberName +
			", memberPhone=" + memberPhone +
			", memberLevel=" + memberLevel +
			", orderId=" + orderId +
			", orderNo=" + orderNo +
			", productId=" + productId +
			", productNo=" + productNo +
			", goodsId=" + goodsId +
			", goodsNo=" + goodsNo +
			", goodsType=" + goodsType +
			", goodsName=" + goodsName +
			", goodsCost=" + goodsCost +
			", salePrice=" + salePrice +
			", promPrice=" + promPrice +
			", memberPrice=" + memberPrice +
			", pmtAmount=" + pmtAmount +
			", payAmount=" + payAmount +
			", goodsUnit=" + goodsUnit +
			", goodsNums=" + goodsNums +
			", saleType=" + saleType +
			", ifCanSavetea=" + ifCanSavetea +
			", goodsSpec=" + goodsSpec +
			", goodsSize=" + goodsSize +
			", goodsWeight=" + goodsWeight +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			", createYear=" + createYear +
			", createMonth=" + createMonth +
			", state=" + state +
			"}";
	}
}
