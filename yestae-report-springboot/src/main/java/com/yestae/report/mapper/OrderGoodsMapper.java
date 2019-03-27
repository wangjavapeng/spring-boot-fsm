package com.yestae.report.mapper;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yestae.report.dto.OrderGoodsCountDTO;
import com.yestae.report.entity.OrderGoods;

/**
 * <p>
  * 订单商品明细表 Mapper 接口
 * </p>
 *
 * @author wp
 * @since 2019-01-10
 */
public interface OrderGoodsMapper extends BaseMapper<OrderGoods> {

	List<OrderGoodsCountDTO> queryCount();

}