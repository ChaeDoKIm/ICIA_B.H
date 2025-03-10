package com.icia.fproject.vrp.dto;


import com.icia.fproject.vrp.entity.NodeCostEntity;
import lombok.Data;

import java.util.Date;

@Data
public class NodeCostDTO {

    private Long id;//노드비용id
    private Long startNodeId;//시작노드id
    private Long endNodeId;//종료노드id
    private Long distanceMeter;//이동거리(미터)
    private Long durationSecond;//이동시간(초)
    private Integer tollFare;//통행 요금(톨게이트)
    private Integer taxiFare;//택시 요금(지자체별, 심야, 시경계, 복합, 콜비 감안)
    private Integer fuelPrice;//해당 시점의 전국 평균 유류비와 연비를 감안한 유류비
    private String pathJson;//이동경로json [[x,y],[x,y]]
    private Date regDt;//등록일시
    private Date modDt;//수정일시

    public static NodeCostDTO toDTO (NodeCostEntity entity) {
        NodeCostDTO dto = new NodeCostDTO();

        dto.setId(entity.getId());
        dto.setStartNodeId(entity.getStartNodeId());
        dto.setEndNodeId(entity.getEndNodeId());
        dto.setDistanceMeter(entity.getDistanceMeter());
        dto.setDurationSecond(entity.getDurationSecond());
        dto.setTollFare(entity.getTollFare());
        dto.setTaxiFare(entity.getTaxiFare());
        dto.setFuelPrice(entity.getFuelPrice());
        dto.setPathJson(entity.getPathJson());
        dto.setRegDt(entity.getRegDt());
        dto.setModDt(entity.getModDt());

        return dto;
    }
}
