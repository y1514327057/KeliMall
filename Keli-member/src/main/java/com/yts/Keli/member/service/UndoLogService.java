package com.yts.Keli.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yts.common.utils.PageUtils;
import com.yts.Keli.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author yts
 * @email y1514327057@gmail.com
 * @date 2025-08-12 12:51:22
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

