package com.yts.Keli.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yts.common.utils.PageUtils;
import com.yts.Keli.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author yts
 * @email y1514327057@gmail.com
 * @date 2025-08-12 16:42:51
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

