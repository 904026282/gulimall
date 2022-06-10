package com.wyy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyy.common.utils.PageUtils;
import com.wyy.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wangyangyang
 * @email 904026282@qq.com
 * @date 2022-06-03 17:58:24
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

