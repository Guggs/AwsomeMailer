package com.example.demo.pageuser;

import com.example.demo.authorization.Auth;
import com.example.demo.authorization.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PageUserController {

    @Autowired
    private PageUserService pageUserService;

    @Autowired
    private AuthService authService;


    //JSONObject obj = new JSONObject();
    //@RequestMapping(value = "/name", method = RequestMethod.GET, produces = "application/json")
    @GetMapping(value = "/name", produces = "application/json")
    public List<PageUser> getPageUsers(){
        return this.pageUserService.getAllPageUsers();
    }

    @PostMapping("/name")
    public void addPageUser(@RequestBody PageUser pageUser){
        this.pageUserService.addPageUser(pageUser);
    }

    @GetMapping(value="/auth/{name}", produces = "application/json")
    public Auth getAuthByRole(@PathVariable String name){
        return this.authService.getAuthByRole(name);
    }
}
