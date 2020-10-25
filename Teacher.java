package course;
public class Teacher {
	 private int id;
	 private char sex;
	 private String teacherName;
	 private Course[] courses;
	 //构造函数
	 public Teacher() {
		 super();
		 
		 courses= new Course[1];
	 }
	 public Teacher(int id,String teacherName,char i){
	  this.id=id;
	  this.teacherName=teacherName;
	  this.sex=i;
	  i ='男';
	  courses = new Course[1];
	 }
	 char i ='男';
	 //修改或是添加属性
	 public int getId() {
	  return id;
	 }
	 public void setId(int id) {
	  this.id = id;
	 }
	 public char getsex() {
		 return sex;
	 }
	 public void setsex(char sex) {
		 this.sex=sex;
	 }
	 public String getTeacherName() {
	  return teacherName;
	 }
	 public void setTeacherName(String teacherName) {
	  this.teacherName = teacherName;
	 }
	 
	 
	}