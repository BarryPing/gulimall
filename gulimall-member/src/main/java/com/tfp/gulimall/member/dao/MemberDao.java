package com.tfp.gulimall.member.dao;

import com.tfp.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tfp
 * @email tfp@gmail.com
 * @date 2023-08-13 13:34:48
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
