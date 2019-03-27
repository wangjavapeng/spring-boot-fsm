package com.yestae.report.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yestae.report.dto.OrderGoodsCountDTO;
import com.yestae.report.entity.OrderGoods;
import com.yestae.report.mapper.OrderGoodsMapper;
import com.yestae.report.service.OrderGoodsService;

/**
 * <p>
 * 订单商品明细表 服务实现类
 * </p>
 *
 * @author wp
 * @since 2019-01-10
 */
@Service
public class OrderGoodsServiceImpl extends ServiceImpl<OrderGoodsMapper, OrderGoods> implements OrderGoodsService {

	@Override
	public void queryCount() {
		List<OrderGoodsCountDTO> list = baseMapper.queryCount();
		System.err.println(JSON.toJSONString(list));
	}
	
}
