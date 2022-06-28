package com.wyy.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyy.common.utils.PageUtils;
import com.wyy.gulimall.ware.entity.PurchaseEntity;
import com.wyy.gulimall.ware.vo.MergeVo;
import com.wyy.gulimall.ware.vo.PurchaseDoneVo;

import java.util.List;
import java.util.Map;

/**
 * 采购信息
 *
 * @author wangyangyang
 * @email 904026282@qq.com
 * @date 2022-06-03 22:04:35
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPageUnreceive(Map<String, Object> params);

    void mergePurchase(MergeVo mergeVo);

    void received(List<Long> ids);

    void done(PurchaseDoneVo doneVo);

}

