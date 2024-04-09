package com.atguigu.shangTingApartment.web.admin.service.impl;

import com.atguigu.shangTingApartment.model.entity.AttrKey;
import com.atguigu.shangTingApartment.web.admin.mapper.AttrKeyMapper;
import com.atguigu.shangTingApartment.web.admin.service.AttrKeyService;
import com.atguigu.shangTingApartment.web.admin.vo.attr.AttrKeyVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liubo
* @description 针对表【attr_key(房间基本属性表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class AttrKeyServiceImpl extends ServiceImpl<AttrKeyMapper, AttrKey>
    implements AttrKeyService {

    @Autowired
    AttrKeyMapper attrKeyMapper;

    @Override
    public List<AttrKeyVo> queryAll() {
        return attrKeyMapper.selectAll();
    }
}




