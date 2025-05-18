package com.tracker.thunder.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class DbBaseEntity{

    @Column(name = "created_by", nullable = true, length = 200)
    private String createdBy;
    @Column(name = "created_on", nullable = false)
    private LocalDateTime createdOn;
    @Column(name = "updated_by", nullable = true, length = 200)
    private String updatedBy;
    @Column(name = "updated_on", nullable = false)
    private LocalDateTime updatedOn;
}
