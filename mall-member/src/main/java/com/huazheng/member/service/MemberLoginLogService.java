package com.huazheng.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huazheng.common.utils.PageUtils;
import com.huazheng.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author zhanghuazheng
 * @email 18911341753@gmail.com
 * @date 2020-07-17 14:20:40
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

