package com.tfp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tfp.common.utils.PageUtils;
import com.tfp.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author tfp
 * @email tfp@gmail.com
 * @date 2023-08-13 10:54:09
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

