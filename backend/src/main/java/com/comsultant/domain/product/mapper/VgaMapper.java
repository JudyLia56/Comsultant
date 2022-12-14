package com.comsultant.domain.product.mapper;

import com.comsultant.domain.product.dto.VgaDto;
import com.comsultant.domain.product.entity.Vga;
import com.comsultant.global.common.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface VgaMapper extends EntityMapper<VgaDto, Vga> {

    VgaMapper mapper = Mappers.getMapper(VgaMapper.class);

    @Override
    @Mapping(source = "product.idx", target = "idx") // 변수명이 다를 경우. source = Entity, target = DTO
    @Mapping(target = "wish", ignore = true)
    VgaDto toDto(final Vga entity);

    @Override
    @Mapping(source = "idx", target = "product.idx") // source = DTO, target = Entity
    Vga toEntity(final VgaDto dto);

    List<VgaDto> toDtoList(List<Vga> entityList);

    List<Vga> toEntityList(List<VgaDto> dtoList);
}
