package com.example.demo.pageuser;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PageUserRepository extends CrudRepository<PageUser, Long> {
    public PageUser findFirstByName(String name);

}
