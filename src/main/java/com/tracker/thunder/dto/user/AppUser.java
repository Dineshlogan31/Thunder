package com.tracker.thunder.dto.user;

import com.tracker.thunder.dto.base.BaseAuditDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AppUser extends BaseAuditDTO {

    private String userId;
    private String firstName;
    private String lastName;
    private String passwordHash;
    private String email;
    private String contactNumber;
    private String userRole;
    private boolean active;
    private String gender;
}
