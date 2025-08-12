package com.yts.Keli.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page; // 引入MyBatis-Plus的Page类
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yts.common.utils.PageUtils; // 假设你保留PageUtils用于封装返回结果

import com.yts.Keli.product.dao.CategoryDao;
import com.yts.Keli.product.entity.CategoryEntity;
import com.yts.Keli.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        // 从参数中获取页码和每页记录数
        long pageNum = params.get("page") == null ? 1 : Long.parseLong(params.get("page").toString());
        long pageSize = params.get("limit") == null ? 10 : Long.parseLong(params.get("limit").toString());

        // 使用MyBatis-Plus的Page类构建分页对象
        IPage<CategoryEntity> page = new Page<>(pageNum, pageSize);

        // 执行分页查询，MyBatis-Plus会自动处理分页逻辑
        IPage<CategoryEntity> resultPage = this.page(
                page,
                new QueryWrapper<CategoryEntity>()
        );

        // 返回封装好的PageUtils对象
        return new PageUtils(resultPage.getRecords(), (int) resultPage.getTotal(), (int) resultPage.getSize(), (int) resultPage.getCurrent());
    }

}