package com.yestae.report.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yestae.report.entity.OrderTest;
import com.yestae.report.mapper.OrderTestMapper;
import com.yestae.report.service.IOrderTestService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wp123
 * @since 2019-03-27
 */
@Service
public class OrderTestService extends ServiceImpl<OrderTestMapper, OrderTest> implements IOrderTestService {

}
