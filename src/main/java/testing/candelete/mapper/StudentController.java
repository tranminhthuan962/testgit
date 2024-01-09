package testing.candelete.mapper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import testing.candelete.model.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    //List for student
    private static final List<Student> students = new ArrayList<>();

    //Create static data
    static {
        students.add(new Student("Thuan", "thuangmail"));
        students.add(new Student("Vi", "Vigmail"));
    }

    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = {"/studentList"}, method = RequestMethod.GET)
    public String studentList(Model model) {
        model.addAttribute("studentList", students);
        return "studentListaa";
    }

    @RequestMapping(value = {"/addStudent"}, method = RequestMethod.GET)
    public String showAddStudent(Model model) {
        Student newStudent = new Student();
        model.addAttribute("newStudent2", newStudent);
        return "addStudent";
    }

    @RequestMapping(value = {"/addStudent"}, method = RequestMethod.POST)
    public String addStudent(Model model, @ModelAttribute("newStudent") Student student) {
        String name = student.getName();
        String email = student.getEmail();

        Student newStudent = new Student(name, email);
        students.add(newStudent);
        return "addStudent";
    }
}
