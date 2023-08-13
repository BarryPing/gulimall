package com.tfp.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tfp.common.utils.PageUtils;
import com.tfp.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author tfp
 * @email tfp@gmail.com
 * @date 2023-08-13 17:38:08
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

