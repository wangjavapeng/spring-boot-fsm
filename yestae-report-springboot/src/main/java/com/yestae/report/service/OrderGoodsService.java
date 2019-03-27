package com.yestae.report.service;

import com.baomidou.mybatisplus.service.IService;
import com.yestae.report.entity.OrderGoods;

/**
 * <p>
 * 订单商品明细表 服务类
 * </p>
 *
 * @author wp
 * @since 2019-01-10
 */
public interface OrderGoodsService extends IService<OrderGoods> {
	public void queryCount();
}
