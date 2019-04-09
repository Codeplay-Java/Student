package com.itsc30.student3.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itsc30.student3.Domain.Student;
import com.itsc30.student3.Mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class studentController {
    @Autowired
    StudentMapper studentMapper;


    @RequestMapping("listStudent")
    public String listStudent(Model m, @RequestParam(value = "start",defaultValue = "0")int start,@RequestParam(value = "size",defaultValue = "5")int size) throws Exception {
        PageHelper.startPage(start,size,"sid desc");
        List<Student> cs=studentMapper.findAll();
        PageInfo<Student> page=new PageInfo<>(cs);
        m.addAttribute("page", page);
        m.addAttribute("start",start);
        return "listStudent";
    }

    @RequestMapping("/addStudent")
    public String listStudent(Student s){
        studentMapper.save(s);
        return "redirect:listStudent";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(Student s){
        studentMapper.delete(s.getSid());
        return "redirect:listStudent";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Student s) throws Exception {
        studentMapper.update(s);
        return "redirect:listStudent";
    }


    @RequestMapping("/editStudent")
    public String listStudent(int sid,Model m) throws Exception {
        Student s= studentMapper.get(sid);
        m.addAttribute("s", s);
        return "editStudent";
    }
}
