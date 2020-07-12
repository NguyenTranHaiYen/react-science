/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.DTO;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Admins
 */
public class LicenseDTO {
    
    private Long id;
    
    private String fileAttach;
    
    private String license;
    
    private Float version;
    
    private Date dateChanged;
    
    private String changedBy;
    
    private Boolean contentReset;
    
    private String commentAttach;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileAttach() {
        return fileAttach;
    }

    public void setFileAttach(String fileAttach) {
        this.fileAttach = fileAttach;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Float getVersion() {
        return version;
    }

    public void setVersion(Float version) {
        this.version = version;
    }

    public Date getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public Boolean getContentReset() {
        return contentReset;
    }

    public void setContentReset(Boolean contentReset) {
        this.contentReset = contentReset;
    }

    public String getCommentAttach() {
        return commentAttach;
    }

    public void setCommentAttach(String commentAttach) {
        this.commentAttach = commentAttach;
    }

    @Override
    public String toString() {
        return "LicenseDTO{" + "id=" + id + ", fileAttach=" + fileAttach + ", license=" + license + ", version=" + version + ", dateChanged=" + dateChanged + ", changedBy=" + changedBy + ", contentReset=" + contentReset + ", commentAttach=" + commentAttach + '}';
    }

    
}
