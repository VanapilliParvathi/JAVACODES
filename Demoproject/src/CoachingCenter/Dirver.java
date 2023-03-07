package CoachingCenter;

public class Dirver {
	public static void main(String args[]) {
		
		Skillslash skillslash =new Skillslash();
		
//		Course object creation
		course java = new course();
		java.setCourseName("JAVA");
		java.setDuration(2);
		java.setFee(15000);
		
		course python = new course();
		python.setCourseName("PYTHON");
		python.setDuration(3);
		python.setFee(25000);
		
		course Ruby = new course();
		Ruby.setCourseName("Ruby");
		Ruby.setDuration(5);
		Ruby.setFee(35000);
		
//		Available courses put into the skil1slash
		skillslash.registerCourse(java);
		System.out.println("java course is inserted successfully");
		skillslash.registerCourse(python);
		System.out.println("python course is inserted successfully");
		
		skillslash.registerCourse(Ruby);
		System.out.println("Ruby course is inserted successfully");
		
//	student will giving his details
		student mahesh =new student();
		mahesh.setName("MAHESH");
		mahesh.setAddress("vizag");
		mahesh.setAge(19);
		mahesh.setStudentid(100);
		mahesh.setCourse("java");
//		Student searches the courses
		System.out.println(skillslash.getCourseinfo("JAVA"));
		
//		Student enrolling for the he wanted course
		skillslash.enrollCourse("java", mahesh);
		System.out.println("mahesh is enrolled for java course");
		
//		Another student enrolling into the course
		student mahesh1 =new student();
		mahesh1.setName("MAHESH1");
		mahesh1.setAddress("banglore");
		mahesh1.setAge(20);
		mahesh1.setStudentid(200);
		mahesh1.setCourse("python");
		System.out.println(skillslash.getCourseinfo("PYTHON"));
		skillslash.enrollCourse("python", mahesh1);
		System.out.println("mahesh1 is enrolled for java course");
		
		
		
	}

}
