package com.itsc30.student3.Mapper;

import com.itsc30.student3.Domain.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select * from stu ")
    List<Student> findAll();

    @Insert("insert into stu (sname) values(#{sname})")
    public int save(Student student);

    @Delete("delete from stu where sid =#{sid}")
    public void delete(int sid);

    @Select("select * from stu where sid=#{sid}")
    public Student get(int sid);

    @Update("update stu set sname=#{sname} where sid=#{sid}")
    public int update(Student student);
}
