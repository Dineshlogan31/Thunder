package com.tracker.thunder.repository;

import com.tracker.thunder.entity.user.DbAppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface AppUserRepository extends JpaRepository<DbAppUser, Long> {
    // Custom query methods can be defined here if needed
    // For example:
    // Optional<AppUser> findByUsername(String username);
}
