package com.example.pagination.Mapper;

import java.util.List;

public interface UserMapperInterface<Dto,Entity>{
    Dto toDto(Entity entity);
    Entity toEntity(Dto dto);
    List<Dto> toDtoList(List<Entity> entities);
    List<Entity> toEntityList(List<Dto> dtos);

}
