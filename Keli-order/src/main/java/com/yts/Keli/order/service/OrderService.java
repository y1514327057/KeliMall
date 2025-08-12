package com.yts.Keli.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yts.common.utils.PageUtils;
import com.yts.Keli.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author yts
 * @email y1514327057@gmail.com
 * @date 2025-08-12 16:42:51
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

