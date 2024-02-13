package com.example.pagination.Servise;

import com.example.pagination.Dto.UserResponseDto;
import com.example.pagination.Entity.Usersname;
import org.springframework.data.domain.Page;

import java.util.List;

public interface Interface {
    UserResponseDto getById(Long id);

    Page<Usersname> searchByName(Integer page, Integer size, String name);


}
