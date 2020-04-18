package com.example.demo.pageuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Stream;

@Service
public class PageUserService {

    @Autowired
    private PageUserRepository pageUserRepository;

    @PostConstruct
    public void addPageUser() {
        /*Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
            PageUser pageUser = new PageUser(name);
            this.pageUserRepository.save(pageUser);
        });*/
        this.pageUserRepository.findAll().forEach(System.out::println);
    }

    public List<PageUser> getAllPageUsers(){
        return (List<PageUser>) this.pageUserRepository.findAll();
    }

    public void addPageUser(PageUser pageUser){
        this.pageUserRepository.save(pageUser);
    }
}
