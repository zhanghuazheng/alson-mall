package com.huazheng.member.fegin;

import com.huazheng.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname OrderFeginService
 * @Description TODO
 * @Date 2020/7/17 16:44
 * @Created by zhanghuazheng
 */

@FeignClient("mall-order")
public interface OrderFeginService {
    @RequestMapping("order/order/member/list")
    public R memberList();
}
