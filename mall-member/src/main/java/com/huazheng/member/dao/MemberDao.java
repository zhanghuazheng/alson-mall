package com.huazheng.member.dao;

import com.huazheng.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhanghuazheng
 * @email 18911341753@gmail.com
 * @date 2020-07-17 14:20:40
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
