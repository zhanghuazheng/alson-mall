package com.huazheng.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huazheng.common.utils.PageUtils;
import com.huazheng.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author zhanghuazheng
 * @email 18911341753@gmail.com
 * @date 2020-07-17 14:25:53
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

