package course;
public class Teacher {
	 private int id;
	 private char sex;
	 private String teacherName;
	 private Course[] courses;
	 //���캯��
	 public Teacher() {
		 super();
		 
		 courses= new Course[1];
	 }
	 public Teacher(int id,String teacherName,char i){
	  this.id=id;
	  this.teacherName=teacherName;
	  this.sex=i;
	  i ='��';
	  courses = new Course[1];
	 }
	 char i ='��';
	 //�޸Ļ����������
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