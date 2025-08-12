package com.yts.Keli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yts.common.utils.PageUtils;
import com.yts.Keli.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author yts
 * @email y1514327057@gmail.com
 * @date 2025-08-12 12:34:19
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

