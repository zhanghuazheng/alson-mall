package com.huazheng.coupon.dao;

import com.huazheng.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhanghuazheng
 * @email 18911341753@gmail.com
 * @date 2020-07-17 14:16:46
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
