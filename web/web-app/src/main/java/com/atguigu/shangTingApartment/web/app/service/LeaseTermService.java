package com.atguigu.shangTingApartment.web.app.service;

import com.atguigu.shangTingApartment.model.entity.LeaseTerm;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author liubo
* @description 针对表【lease_term(租期)】的数据库操作Service
* @createDate 2023-07-26 11:12:39
*/
public interface LeaseTermService extends IService<LeaseTerm> {

    /**
     * 根据房间id获取可选获取租期列表
     * @param id
     * @return
     */
    List<LeaseTerm> listByRoomId(Long id);
}
