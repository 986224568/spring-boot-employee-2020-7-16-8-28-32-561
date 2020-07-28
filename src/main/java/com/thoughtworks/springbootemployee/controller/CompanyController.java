package com.thoughtworks.springbootemployee.controller;
import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @PostMapping(path = "/companies")
    public void addCompany(@RequestBody Company company) {
        companyService.addCompany(company);
    }

    @GetMapping(path = "/companies")
    public List<Company> getAllCompany() {
        return companyService.getALLCompany();
    }

}