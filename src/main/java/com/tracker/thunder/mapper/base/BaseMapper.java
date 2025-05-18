package com.tracker.thunder.mapper.base;

public interface BaseMapper <I,O>{

    I mapToDomain(O input);

    O mapToEntity(I output);
}
