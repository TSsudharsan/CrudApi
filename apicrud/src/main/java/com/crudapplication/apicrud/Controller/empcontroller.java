package com.crudapplication.apicrud.Controller;

import com.crudapplication.apicrud.model.employee;
import com.crudapplication.apicrud.service.empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController



public class empcontroller {

@Autowired
    public empservice empser;

    @GetMapping("/show")

    public List<employee> gt(){
        return  empser.getEmp();
    }
    @Value("${app.name}")
    String appname;
    @GetMapping("/sample")

    public String show(){
        return  appname+"san";
    }

}
