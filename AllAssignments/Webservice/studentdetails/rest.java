package studentdetails;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;

//import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import studentdetails.StudentService;


@RestController

public class rest {
	StudentService studentService = new StudentService();
	
	
	@GetMapping("/studentinfo")
	public Student getDummyStudent() {
	Student s =new Student();
	s.setName("anshul");
	s.setAge(34);
	s.setAddress("alwar");
	s.setId(0);
	s.setBranch("me");
	
	return s;
	
	
	}
	
	@GetMapping("/studentId")
	public Student getDummyStudentById(@PathVariable("id") Integer id) {

	Student s =new Student();
	s.setId(id);
	s.setName("anshul");
	s.setAge(34);
	s.setAddress("alwar");
	s.setBranch("CS");
	return s;
	}

	 // add the person information POst

	 @PostMapping("/insertstudentdetails")
	 
	public Student insertDummyPerson(@RequestBody Student student) {
	return studentService.addStudent(student);
	}

	//update person info
	@PutMapping("/update")
	public Student updateStudentInfo(@RequestBody Student student) {
	return studentService.updateStudent(student);

	 }
	//get list
	@GetMapping("/getlist")
	public List<Student> getDummyPersonList() {
	List<Student> listOfStudent = studentService.getAllStudentlist();
	return listOfStudent;
	}

	@DeleteMapping("/delete/{id}")
	public List<Student> deleteStudentById(@PathVariable Integer id) {
	new StudentService().deleteStudent(id);
	return new StudentService().getAllStudentlist();
	
    
	}
	}
	
