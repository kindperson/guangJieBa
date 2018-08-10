package org.tianjh.dao;

import org.apache.ibatis.annotations.Mapper;
import org.tianjh.model.Student;

import java.util.List;

/**
 * @author: wb-tjh438466
 * @date: 2018/8/10
 * @since: 1
 * description:
 */
@Mapper
public interface StudentMapper {

     List<Student> getAll();
}
