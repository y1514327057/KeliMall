package com.yts.Keli.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yts.common.utils.PageUtils;
import com.yts.Keli.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author yts
 * @email y1514327057@gmail.com
 * @date 2025-08-12 12:43:22
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

