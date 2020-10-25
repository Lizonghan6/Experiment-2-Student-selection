package course;

public class Course {
	 private String courseName;
	 private int courseId;
	 private Teacher teacher;
	 private String coursePlace;
	 private String coursetime;
	 private Student[] students;
	 //构造函数
	 public Course(int courseId,String courseName,String coursePlace,String coursetime,Teacher teacher) {
	  super();
	  this.courseId=courseId;
	  this.courseName=courseName;
	  this.coursePlace=coursePlace;
	  this.setTeacher(teacher);
	  this.coursetime=coursetime;
	  students = new Student[30];
	 }
	 public Course(int courseId,String courseName,String coursePlace,String coursetime) {
	  super();
	  this.courseId=courseId;
	  this.courseName=courseName;
	  this.coursePlace=coursePlace;
	  this.coursetime=coursetime;
	  students = new Student[30];
	 }
	 
	 public Course(int courseId,String courseName,String coursetime) {
	  super();
	  this.courseId=courseId;
	  this.courseName=courseName;
	  this.coursetime=coursetime;
	  students = new Student[30];
	 }
	 
	 public Course() {//默认形式，要有以防万一
	  super();
	  students = new Student[30];
	 }
	 
	 //修改或获取属性值id，name，credit，
	 public void setId(int id){
	  this.courseId=id;
	 }
	 public int getId(){
	  return this.courseId;
	 }
	 public void setName(String name){
	  this.courseName=name;
	 }
	 public String getName(){
	  return this.courseName;
	 }
	 public void coursePlace(String coursePlace ){
	  this.coursePlace=coursePlace;
	 }
	 public String coursePlace(){
	  return this.coursePlace;
	 }
	 public void settime(String coursetime){
		  this.coursetime=coursetime;
     }
	 public String gettime(){
		  return this.coursetime;
	 }
	 public Teacher getTeacher() {
	  return teacher;
	 }
	 public void setTeacher(Teacher teacher) {
	  this.teacher = teacher;
	 }
	 public boolean addStudent(Student stu){
		  boolean flag = false;//标志值：是否加入成功
		  //如果学生没有选过这门课，同时课的学生还没满则执行
		  if(!isSelectedStudent(stu)){
		   for(int i=0;i<students.length;i++){
		    if(students[i]==null){
		     students[i]=stu;
		     flag=true;
		     break;
		    }
		   }
		  }
		  return flag;
		 }
		 
	 //显示选择课程的学生：
	 public void displayStudent(){
	  System.out.println("选择的课程："+this.courseName+"的学生有:");
	  for(Student s:students){
	   if(s!=null){
	    System.out.print(s.getStuName()+" ");
	   }
	  }
	  System.out.println();
	 }
	 public boolean isSelectedStudent(Student stu){
		  boolean flag=false;
		  for(Student s:students){
		   if(s==stu){
		    flag=true;
		    break;
		   }
		  }
		  return flag;
		 }
		 
		 public static void main(String[] args) {
		 }
	}