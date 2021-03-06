package com.huazheng.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huazheng.common.utils.PageUtils;
import com.huazheng.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author zhanghuazheng
 * @email 18911341753@gmail.com
 * @date 2020-07-17 10:30:58
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);


    List<CategoryEntity> queryWithTree();
}

