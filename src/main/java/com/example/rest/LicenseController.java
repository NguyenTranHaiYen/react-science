package com.example.rest;

import com.example.DTO.LicenseDTO;
import com.example.entity.License;
import com.example.service.LicenseService;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admins
 */
@RestController
@RequestMapping("/license")
public class LicenseController {
    
   @Autowired
   LicenseService licenseService;
   
   @GetMapping
   public List<LicenseDTO> getAll(){
       return licenseService.getAll();
   }
   
   @PostMapping()
   public LicenseDTO saveLicense(@RequestBody LicenseDTO license){
       return licenseService.save(license);
   }
   @PutMapping()
   public LicenseDTO update(@RequestBody LicenseDTO license){
       return licenseService.update(license);
   }
   
   @DeleteMapping()
   public void delete(@PathVariable Long id){
       licenseService.delete(id);
   }
}
