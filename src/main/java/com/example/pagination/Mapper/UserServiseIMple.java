package com.example.pagination.Mapper;

import com.example.pagination.Dto.UserResponseDto;
import com.example.pagination.Entity.Usersname;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class UserServiseIMple implements UserMapper{
    @Override
    public UserResponseDto toDto(Usersname usersname) {
        return UserResponseDto.builder()
                .id(usersname.getId())
                .name(usersname.getName())
                .build();
    }

    @Override
    public Usersname toEntity(UserResponseDto userResponseDto) {
        return Usersname.builder()
                .id(userResponseDto.getId())
                .name(userResponseDto.getName())
                .build();
    }

    @Override
    public List<UserResponseDto> toDtoList(List<Usersname> usersnames) {
        return usersnames.stream()
                .map(this::toDto)
                .collect(Collectors.toList());

    }

    @Override
    public List<Usersname> toEntityList(List<UserResponseDto> userResponseDtos) {
        return userResponseDtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
