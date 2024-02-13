package com.example.pagination.Repository;

import com.example.pagination.Entity.Usersname;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Usersname,Long> {
Page<Usersname> findAllByNameContainsIgnoreCase(Pageable page, String name);
}
