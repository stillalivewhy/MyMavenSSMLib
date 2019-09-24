package com.xmx.ssm.service.impl;

import com.xmx.ssm.dao.StudentMapper;
import com.xmx.ssm.entity.Student;
import com.xmx.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> findAll(){
        return studentMapper.findAll();
    }
}
