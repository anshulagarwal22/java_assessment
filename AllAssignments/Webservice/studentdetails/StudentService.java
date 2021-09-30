package studentdetails;


import java.util.HashMap;
import java.util.List;


import java.util.ArrayList;


		

public class StudentService {
	static HashMap<Integer, Student> StudentIdMap = getStudentIdMap(); 

	 public StudentService() {
	super();

	 if (StudentIdMap == null) {
	StudentIdMap = new HashMap<Integer, Student>();
	// Creating some objects of Student while initializing
	Student AStudent = new Student(1001,"raju",21,"tokyo","cs");
	Student BStudent = new Student(1002,"shyam",20,"berlin","me");
	Student CStudent = new Student(1003,"baburao",19,"rio","ce");
	Student DStudent = new Student(1004,"munna",23,"denver","ee" );

	 //adding map list of collections in java
	StudentIdMap.put(1001, AStudent);
	StudentIdMap.put(1003, BStudent);
	StudentIdMap.put(1004, CStudent);
	StudentIdMap.put(1002, DStudent);
	}
	}

	 public List<Student> getAllStudentlist() {
	List<Student> studentlist = new ArrayList<Student>(StudentIdMap.values());
	return studentlist;
	}

	 public Student getStudent(int id) {
	Student student = StudentIdMap.get(id);
	return student;
	}
	// add student
	public Student addStudent(Student student) {
	student.setId(getMaxId()+ 1);
	// key , value
	StudentIdMap.put(student.getId(), student); ///logic class
	return student;
	}
	//update
	public Student updateStudent(Student student) {
	if (student.getId() <= 0)
	return null;
	StudentIdMap.put(student.getId(), student);
	return student;

	 }
	//delete

	 public void deleteStudent(int id) {
	StudentIdMap.remove(id);
	}

	 public static HashMap<Integer, Student> getStudentIdMap() {
	return StudentIdMap;
	}

	 // Utility method to get max id
	public static int getMaxId() {
	int max = 0;
	for (int id : StudentIdMap.keySet()) {
	if (max <= id)
	max = id;

	 }
	return max;
	}
	}


