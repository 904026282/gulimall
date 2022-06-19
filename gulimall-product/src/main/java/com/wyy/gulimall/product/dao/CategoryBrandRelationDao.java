package com.wyy.gulimall.product.dao;

import com.wyy.gulimall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 品牌分类关联
 * 
 * @author wangyangyang
 * @email 904026282@qq.com
 * @date 2022-06-03 17:58:24
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {

    void updateCategory(@Param("name") String name,@Param("catId") Long catId);
}
