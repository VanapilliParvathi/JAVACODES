package CoachingCenter;
import java.util.Map;
import java.util.HashMap;

public class Skillslash implements Coaching {
	
	Map<String,course> CourseMap;
	Map<Integer,student> StudentMap;
	
	public Skillslash() {
		 this.CourseMap=new HashMap<>();
		 this.StudentMap= new HashMap<>();
		 
		 }
	
//  student can be enrolls which is likes in the register courses
	
	@Override
	public void enrollCourse(String course, student student) {
		// TODO Auto-generated method stub
		StudentMap.put(student.getStudentid(), student);
	}

//	register in various courses
	@Override
	public void registerCourse(course course) {
		// TODO Auto-generated method stub
		
		CourseMap.put(course.getCourseName(),course);
		
	}

//	this method gives specific course information.
	@Override
	public course getCourseinfo(String name) {
		// TODO Auto-generated method stub
		
		return CourseMap.get(name);
	}
	

}
