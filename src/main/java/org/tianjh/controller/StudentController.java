package org.tianjh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tianjh.model.Student;
import org.tianjh.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: wb-tjh438466
 * @date: 2018/8/10
 * @since: 1
 * description:
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/getAll")
    public List<Student> getAll(){
        System.out.printf("lala");
        return  studentService.getAll();
    }
}
