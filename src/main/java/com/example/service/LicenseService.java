/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.example.DTO.LicenseDTO;
import com.example.dao.LicenseDAO;
import com.example.entity.License;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admins
 */
@Service
public class LicenseService {

    @Autowired
    LicenseDAO licenseDAO;

    public List<LicenseDTO> getAll() {
        List<License> license= licenseDAO.findAll();
        List<LicenseDTO> list= new ArrayList<>();
        for(License item:license){
            list.add(convertEntityToDTO(item));
        }
        return list;
    }

    public LicenseDTO save(LicenseDTO license) {
        License li= convertDTOToEntity(license);
        return convertEntityToDTO(licenseDAO.save(li));
    }
    public LicenseDTO update(LicenseDTO licenseDTO){
        License license= convertDTOToEntity(licenseDTO);
        Optional<License> li = licenseDAO.findById(license.getId());
        if (li.isPresent()) {
            return convertEntityToDTO(licenseDAO.save(license));
        }
        return null;
    }
    
    public void delete(Long index) {
       licenseDAO.deleteById(index);
    }
    private LicenseDTO convertEntityToDTO(License license) {
        LicenseDTO licenseDTO = new LicenseDTO();
        licenseDTO.setId(license.getId());
        licenseDTO.setFileAttach(license.getFileAttach());
        licenseDTO.setLicense(license.getLicense());
        licenseDTO.setVersion(license.getVersion());
        BeanUtils.copyProperties(license, licenseDTO);
        return licenseDTO;
    }

    private License convertDTOToEntity(LicenseDTO licenseDTO) {
        License license = new License();
        BeanUtils.copyProperties(licenseDTO, license);
        return license;
    }
}
