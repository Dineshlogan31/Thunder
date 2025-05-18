package com.tracker.thunder.mapper.user;

import com.tracker.thunder.entity.user.DbAppUser;
import com.tracker.thunder.dto.user.AppUser;
import com.tracker.thunder.mapper.base.BaseMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AppUserMapper implements BaseMapper<AppUser, DbAppUser> {

    @Override
    public AppUser mapToDomain(DbAppUser dbAppUser) {
        AppUser appUser=new AppUser();
        appUser.setUserId(dbAppUser.getUserId());
        appUser.setFirstName(dbAppUser.getFirstName());
        appUser.setLastName(dbAppUser.getLastName());
        appUser.setEmail(dbAppUser.getEmail());
        appUser.setContactNumber(dbAppUser.getContactNumber());
        appUser.setUserRole(dbAppUser.getUserRole());
        appUser.setActive(dbAppUser.isActive());
        appUser.setGender(dbAppUser.getGender());
        appUser.setCreatedBy(dbAppUser.getCreatedBy());
        appUser.setCreatedOn(dbAppUser.getCreatedOn());
        appUser.setUpdatedBy(dbAppUser.getUpdatedBy());
        appUser.setUpdatedOn(dbAppUser.getUpdatedOn());
        return appUser;
    }

    @Override
    public DbAppUser mapToEntity(AppUser appUser) {
        DbAppUser dbAppUser=new DbAppUser();
        dbAppUser.setFirstName(appUser.getFirstName());
        dbAppUser.setLastName(appUser.getLastName());
        dbAppUser.setPasswordHash(appUser.getPasswordHash());
        dbAppUser.setEmail(appUser.getEmail());
        dbAppUser.setContactNumber(appUser.getContactNumber());
        dbAppUser.setUserRole(appUser.getUserRole());
        dbAppUser.setActive(appUser.isActive());
        dbAppUser.setGender(appUser.getGender());
        dbAppUser.setCreatedBy(appUser.getCreatedBy());
        dbAppUser.setCreatedOn(LocalDateTime.now());
        dbAppUser.setUpdatedBy(appUser.getUpdatedBy());
        dbAppUser.setUpdatedOn(LocalDateTime.now());
        return dbAppUser;
    }
}
