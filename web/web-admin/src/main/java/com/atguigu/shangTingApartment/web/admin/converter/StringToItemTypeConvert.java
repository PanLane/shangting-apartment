package com.atguigu.shangTingApartment.web.admin.converter;

import com.atguigu.lease.model.enums.ItemType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToItemTypeConvert implements Converter<String,ItemType> {

    @Override
    public ItemType convert(String source) {
        for (ItemType value : ItemType.values()) {
            if(value.getCode().toString().equals(source)) return value;
        }
        throw new RuntimeException("code类型错误！");
    }
}
