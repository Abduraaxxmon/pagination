package com.example.pagination.Servise;

import com.example.pagination.Dto.UserResponseDto;
import com.example.pagination.Entity.Usersname;
import com.example.pagination.Mapper.UserMapper;
import com.example.pagination.Mapper.UserServiseIMple;
import com.example.pagination.Repository.UserRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServise implements Interface {
    @Autowired
    private UserServiseIMple mapper;
    @Autowired
    private UserRepository repository;
    @Override
    public UserResponseDto getById(Long id) {
        return mapper.toDto(repository.getReferenceById(id));
    }

    @Override
    public Page<Usersname> searchByName(Integer page,Integer size,String name) {
        Pageable pageable= PageRequest.of(page,size, Sort.by("id"));
        Page<Usersname> usersnames=repository.findAllByNameContainsIgnoreCase(pageable,name);

        return usersnames;
    }
}
