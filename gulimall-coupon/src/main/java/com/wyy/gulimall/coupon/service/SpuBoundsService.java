package com.wyy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyy.common.utils.PageUtils;
import com.wyy.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author wangyangyang
 * @email 904026282@qq.com
 * @date 2022-06-03 21:39:18
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

