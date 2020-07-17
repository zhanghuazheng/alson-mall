package com.huazheng.order.dao;

import com.huazheng.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhanghuazheng
 * @email 18911341753@gmail.com
 * @date 2020-07-17 14:25:54
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
