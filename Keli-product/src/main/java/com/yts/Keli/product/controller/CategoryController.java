package com.yts.Keli.product.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.yts.Keli.product.entity.CategoryEntity;
import com.yts.Keli.product.service.CategoryService;
import com.yts.common.utils.R;

import javax.annotation.Resource;


/**
 * 商品三级分类
 *
 * @author yts
 * @email y1514327057@gmail.com
 * @date 2025-08-12 12:34:20
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    /**
     * 查询所有分类 并且组装成树形结构
     */
    @GetMapping("/list/tree")
    public R list(){
        List<CategoryEntity> categoryEntities = categoryService.listWithTree();
        return R.ok().put("data", categoryEntities);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
        categoryService.removeMenusBatch(Arrays.asList(catIds));
        return R.ok();
    }

}
