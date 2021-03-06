package com.wyy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyy.common.utils.PageUtils;
import com.wyy.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author wangyangyang
 * @email 904026282@qq.com
 * @date 2022-06-03 21:39:18
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

