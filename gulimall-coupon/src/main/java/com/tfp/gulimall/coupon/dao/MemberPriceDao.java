package com.tfp.gulimall.coupon.dao;

import com.tfp.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author tfp
 * @email tfp@gmail.com
 * @date 2023-08-13 10:54:10
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
