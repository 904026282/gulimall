package com.wyy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyy.common.utils.PageUtils;
import com.wyy.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author wangyangyang
 * @email 904026282@qq.com
 * @date 2022-06-03 21:39:18
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

