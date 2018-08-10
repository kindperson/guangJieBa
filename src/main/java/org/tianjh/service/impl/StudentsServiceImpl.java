package org.tianjh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tianjh.dao.StudentMapper;
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
@Service
public class StudentsServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }
}
