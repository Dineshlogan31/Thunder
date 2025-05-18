package com.tracker.thunder.dao.user;

import com.tracker.thunder.entity.user.DbAppUser;
import com.tracker.thunder.repository.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class AppUserDAO {

    public AppUserDAO(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    private final AppUserRepository appUserRepository;

    public DbAppUser createUser(DbAppUser dbAppUser) {
        return appUserRepository.save(dbAppUser);
    }
}
