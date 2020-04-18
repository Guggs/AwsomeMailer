package com.example.demo.authorization;

import com.example.demo.pageuser.PageUser;
import com.example.demo.pageuser.PageUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    AuthRepository authRepository;
    @Autowired
    private PageUserRepository pageUserRepository;

    @PostConstruct
    public void addAuthorization() {
        Auth auth = new Auth("Admin", true, true, true, true, true);
        Auth auth1 = new Auth("Customer");
        this.authRepository.save(auth);
        this.authRepository.save(auth1);
        this.authRepository.findAll().forEach(System.out::println);
    }

    public List<Auth> getAllRoles(){
        return (List<Auth>) this.authRepository.findAll();
    }

    public Auth getAuthByRole(String name){
        String role = pageUserRepository.findFirstByName(name).getRole();
        return this.authRepository.findById(role).get();
    }
}
