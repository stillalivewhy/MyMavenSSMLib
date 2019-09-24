package com.xmx.test;

import com.xmx.ssm.entity.Student;
import com.xmx.ssm.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration(locations = {"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class MyTest {
    @Resource
    private StudentService studentService;

    @Test
    public void test(){
        List<Student> students = studentService.findAll();
        Iterator<Student> studentIterator = students.iterator();
        while(studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }
    }
}
