package com.wyy.gulimall.product.dao;

import com.wyy.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangyangyang
 * @email 904026282@qq.com
 * @date 2022-06-03 17:58:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
