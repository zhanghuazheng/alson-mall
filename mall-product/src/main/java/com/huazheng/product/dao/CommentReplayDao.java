package com.huazheng.product.dao;

import com.huazheng.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author zhanghuazheng
 * @email 18911341753@gmail.com
 * @date 2020-07-17 10:30:58
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
