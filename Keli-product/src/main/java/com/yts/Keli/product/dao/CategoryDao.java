package com.yts.Keli.product.dao;

import com.yts.Keli.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yts
 * @email y1514327057@gmail.com
 * @date 2025-08-12 12:34:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
