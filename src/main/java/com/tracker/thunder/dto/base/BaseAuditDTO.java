package com.tracker.thunder.dto.base;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseAuditDTO {

    private String createdBy;
    private LocalDateTime createdOn;
    private String updatedBy;
    private LocalDateTime updatedOn;
}
