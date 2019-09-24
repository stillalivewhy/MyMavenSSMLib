package com.xmx.ssm.dao;

import com.xmx.ssm.entity.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> findAll();
}
