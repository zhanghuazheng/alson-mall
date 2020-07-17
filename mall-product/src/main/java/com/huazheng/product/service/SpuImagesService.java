package com.huazheng.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huazheng.common.utils.PageUtils;
import com.huazheng.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author zhanghuazheng
 * @email 18911341753@gmail.com
 * @date 2020-07-17 10:30:58
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

