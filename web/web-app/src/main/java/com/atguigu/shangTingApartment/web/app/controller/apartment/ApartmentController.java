package com.atguigu.shangTingApartment.web.app.controller.apartment;

import com.atguigu.shangTingApartment.common.result.Result;
import com.atguigu.shangTingApartment.web.app.vo.apartment.ApartmentDetailVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "公寓信息")
@RequestMapping("/app/apartment")
public class ApartmentController {

    @Operation(summary = "根据id获取公寓信息")
    @GetMapping("getDetailById")
    public Result<ApartmentDetailVo> getDetailById(@RequestParam Long id) {
        return Result.ok();
    }


}
