package com.huazheng.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huazheng.common.utils.PageUtils;
import com.huazheng.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author zhanghuazheng
 * @email 18911341753@gmail.com
 * @date 2020-07-17 10:30:58
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

