package com.wyy.gulimall.order.dao;

import com.wyy.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author wangyangyang
 * @email 904026282@qq.com
 * @date 2022-06-03 21:58:39
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
