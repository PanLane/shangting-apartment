package com.atguigu.shangTingApartment.web.app.service.impl;

import com.atguigu.shangTingApartment.model.entity.RoomInfo;
import com.atguigu.shangTingApartment.web.app.service.RoomInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import com.atguigu.shangTingApartment.web.app.mapper.RoomInfoMapper;
import org.springframework.stereotype.Service;

/**
 * @author liubo
 * @description 针对表【room_info(房间信息表)】的数据库操作Service实现
 * @createDate 2023-07-26 11:12:39
 */
@Service
@Slf4j
public class RoomInfoServiceImpl extends ServiceImpl<RoomInfoMapper, RoomInfo>
        implements RoomInfoService {


}




