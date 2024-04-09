package com.atguigu.shangTingApartment.web.app.vo.apartment;

import com.atguigu.shangTingApartment.model.entity.ApartmentInfo;
import com.atguigu.shangTingApartment.model.entity.FacilityInfo;
import com.atguigu.shangTingApartment.model.entity.LabelInfo;
import com.atguigu.shangTingApartment.web.app.vo.graph.GraphVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


@Data
@Schema(description = "APP端公寓信息详情")
public class ApartmentDetailVo extends ApartmentInfo {

    @Schema(description = "图片列表")
    private List<GraphVo> graphVoList;

    @Schema(description = "标签列表")
    private List<LabelInfo> labelInfoList;

    @Schema(description = "配套列表")
    private List<FacilityInfo> facilityInfoList;

    @Schema(description = "租金最小值")
    private BigDecimal minRent;

    @Schema(description = "公寓信息是否被删除")
    private Boolean isDelete;
}
