package com.mosoftvn.model.service;

import com.mosoftvn.dto.StudentDTO;
import com.mosoftvn.model.dao.StudentDAO;
import com.mosoftvn.model.entity.Student;

import java.util.List;

public class StudentService implements IGenericService<StudentDTO, Integer> {
    private StudentDAO studentDAO = new StudentDAO();

    @Override
    public List<StudentDTO> findAll() {
        return studentDAO.findAll();
    }

    @Override
    public Boolean create(StudentDTO studentDTO) {
        return studentDAO.create(studentDTO);
    }

    @Override
    public Boolean update(StudentDTO studentDTO, Integer integer) {
        return studentDAO.update(studentDTO, integer);
    }

    @Override
    public StudentDTO findId(Integer integer) {
        return studentDAO.findId(integer);
    }

    @Override
    public void delete(Integer integer) {
        studentDAO.delete(integer);
    }

}
