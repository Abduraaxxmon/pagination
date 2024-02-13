package com.example.pagination.Mapper;

import com.example.pagination.Dto.UserResponseDto;
import com.example.pagination.Entity.Usersname;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends UserMapperInterface<UserResponseDto, Usersname> {
}
