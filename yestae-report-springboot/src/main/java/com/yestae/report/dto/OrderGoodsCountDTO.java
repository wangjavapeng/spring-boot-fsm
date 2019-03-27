package com.yestae.report.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * 单品销售
 *
 * @Package com.yestae.report.dto 
 * @ClassName OrderGoodsCountDTO 
 * @author wangpeng
 * @date 2019年1月10日 上午10:13:06 
 *
 */
public class OrderGoodsCountDTO implements Serializable {

	/** 
	 */
	private static final long serialVersionUID = 4030354347165443748L;

	private BigDecimal payAmount;
	
	private Float goodsNums;
	
	private String goodsName;
	
	private String goodsNo;

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public Float getGoodsNums() {
		return goodsNums;
	}

	public void setGoodsNums(Float goodsNums) {
		this.goodsNums = goodsNums;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsNo() {
		return goodsNo;
	}

	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderGoodsCountDTO [payAmount=");
		builder.append(payAmount);
		builder.append(", goodsNums=");
		builder.append(goodsNums);
		builder.append(", goodsName=");
		builder.append(goodsName);
		builder.append(", goodsNo=");
		builder.append(goodsNo);
		builder.append("]");
		return builder.toString();
	}
}
