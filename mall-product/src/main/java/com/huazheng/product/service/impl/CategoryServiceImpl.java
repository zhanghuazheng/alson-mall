package com.huazheng.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huazheng.common.utils.PageUtils;
import com.huazheng.common.utils.Query;

import com.huazheng.product.dao.CategoryDao;
import com.huazheng.product.entity.CategoryEntity;
import com.huazheng.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> queryWithTree() {
        //查询出全部的菜单分类
        List<CategoryEntity> categoryList = baseMapper.selectList(null);

        //查询出每级菜单的子菜单
        List<CategoryEntity> menuWithTree = categoryList.stream().filter((menu) -> {
            return menu.getParentCid() == 0;
        }).map(menu->{
            menu.setChirdreCatetory(getChirdrens(menu,categoryList));
            return menu;
        }).sorted(Comparator.comparing(CategoryEntity::getSort)).collect(Collectors.toList());

        return menuWithTree;
    }

    private List<CategoryEntity> getChirdrens(CategoryEntity menu,List<CategoryEntity> all){
        List<CategoryEntity> childrens = all.stream().filter(category -> {
            return menu.getCatId() == category.getParentCid();
        }).map(subCategory->{
             subCategory.setChirdreCatetory(getChirdrens(subCategory,all));
             return subCategory;
        }).sorted(Comparator.comparing(CategoryEntity::getSort)).collect(Collectors.toList());

        return  childrens;

    }

}