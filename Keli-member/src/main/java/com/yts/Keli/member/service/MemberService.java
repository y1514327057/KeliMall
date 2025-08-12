package com.yts.Keli.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yts.common.utils.PageUtils;
import com.yts.Keli.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author yts
 * @email y1514327057@gmail.com
 * @date 2025-08-12 12:51:21
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

