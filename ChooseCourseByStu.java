package course;
public class ChooseCourseByStu {
	 
	 private static char ch;
	 

	/**
	  * 选课管理系统
	 * @param ch 
	  */
	 public static void main(String[] args) {
	  Student stu1 = new Student(1001,":Lily",ch);
	  Course cour1 = new Course(001,"JAVA技术及应用", null);
	  stu1.addCourse(cour1);
	  stu1.displayCourse();
	 }
	 
	}