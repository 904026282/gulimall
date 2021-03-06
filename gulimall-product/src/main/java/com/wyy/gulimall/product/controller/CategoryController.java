package com.wyy.gulimall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wyy.gulimall.product.entity.CategoryEntity;
import com.wyy.gulimall.product.service.CategoryService;
import com.wyy.common.utils.PageUtils;
import com.wyy.common.utils.R;

import javax.validation.Valid;


/**
 * 商品三级分类
 *
 * @author wangyangyang
 * @email 904026282@qq.com
 * @date 2022-06-03 18:23:05
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list/tree")
    ////@RequiresPermissions("product:category:list")
    public R list(@RequestParam Map<String, Object> params){
        /*PageUtils page = categoryService.queryPage(params);*/
        List<CategoryEntity> list = categoryService.listWithTree();
        return R.ok().put("data", list);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    // @RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId){
        CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // //@RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    ////@RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateCascade(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    ////@RequiresPermissions("product:category:delete")
    public R delete(@RequestBody Long[] catIds){

        categoryService.removeMenusByIds(Arrays.asList(catIds));
		//categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

    /**
     * 修改分类
     */
    @RequestMapping("/update/sort")
    // @RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity[] category){

        categoryService.updateBatchById(Arrays.asList(category));
        return R.ok();
    }


}
