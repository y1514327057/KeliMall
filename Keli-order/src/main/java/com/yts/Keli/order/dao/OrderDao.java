package com.yts.Keli.order.dao;

import com.yts.Keli.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yts
 * @email y1514327057@gmail.com
 * @date 2025-08-12 16:42:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
