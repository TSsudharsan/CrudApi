package com.crudapplication.apicrud.service;

import com.crudapplication.apicrud.model.employee;
import com.crudapplication.apicrud.repo.emprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class empservice {
@Autowired
emprepo repo;

    public List<employee> getEmp() {

        return repo.findAll();
    }
}
