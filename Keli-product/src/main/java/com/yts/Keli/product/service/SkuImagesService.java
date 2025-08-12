package com.yts.Keli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yts.common.utils.PageUtils;
import com.yts.Keli.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author yts
 * @email y1514327057@gmail.com
 * @date 2025-08-12 12:34:20
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

