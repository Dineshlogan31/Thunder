package com.tracker.thunder.service.user;

import com.tracker.thunder.dao.user.AppUserDAO;
import com.tracker.thunder.dto.user.AppUser;
import com.tracker.thunder.entity.user.DbAppUser;
import com.tracker.thunder.mapper.user.AppUserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {

    private final AppUserDAO appUserDAO;

    private final AppUserMapper appUserMapper;

//    public UserService(AppUserDAO appUserDAO, AppUserMapper appUserMapper) {
//        this.appUserDAO = appUserDAO;
//        this.appUserMapper = appUserMapper;
//    }

//    private final AppUserDAO appUserDAO;
//    private final AppUserMapper appUserMapper;
    public DbAppUser createUser(AppUser appUser) {
        DbAppUser dbAppUser =appUserMapper.mapToEntity(appUser);
        String uniqueId= UUID.randomUUID().toString();
        dbAppUser.setUserId(uniqueId);
        dbAppUser.setCreatedBy(uniqueId);
        dbAppUser.setUpdatedBy(uniqueId);
        return appUserDAO.createUser(dbAppUser);

    }
}
