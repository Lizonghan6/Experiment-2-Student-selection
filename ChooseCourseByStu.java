package course;
public class ChooseCourseByStu {
	 
	 private static char ch;
	 

	/**
	  * ѡ�ι���ϵͳ
	 * @param ch 
	  */
	 public static void main(String[] args) {
	  Student stu1 = new Student(1001,":Lily",ch);
	  Course cour1 = new Course(001,"JAVA������Ӧ��", null);
	  stu1.addCourse(cour1);
	  stu1.displayCourse();
	 }
	 
	}