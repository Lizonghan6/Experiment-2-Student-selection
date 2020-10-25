# Javahomework2

JAVA实验三 学生选课模拟系统

##实验目的：
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

##业务要求：
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
对象示例：	人员（编号、姓名、性别……）
教师（编号、姓名、性别、所授课程、……）
			学生（编号、姓名、性别、所选课程、……）
			课程（编号、课程名称、上课地点、时间、授课教师、……）
##实验要求：
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
3.编写实验报告。

##实验过程：
1.设计5个类分别为people，Teacher,Student,Course,ChooseCourseByStu
2.满足实验要求，对每一个类设置相关变量，不同属性，构造函数，并套用super和this的方法
3.修改相关的属性值，调整返回类型和输出结果

##实验代码：
1.people
package course;

public class people {
    private int id;
    private char sex;
    private String peopleName;
    private Course[] courses;
    public people() {
    super();
	 courses= new Course[1];
	 }
    public people(int id,String peopleName,char sex){
		  this.id=id;
		  this.peopleName=peopleName;
		  this.sex=sex;
		  courses = new Course[1];
		 }
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
		 public String getpeopleName() {
		  return peopleName;
		 }
		 public void setpeopleName(String peopleName) {
		  this.peopleName = peopleName;
		 }
		 
 }
 
 
2.Teacher
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
  
  
  
  3.Student
  package course;
public class Student {
	 private String stuName;
	 private char Stusex;
	 private int stuId;
	 private String major;
	 private Course[] courses;
	 //构造函数
	 public Student() {
	  super();
	  courses = new Course[1];
	 }
	 public Student(int stuId,String stuName,char Stusex) {
	  super();
	  this.stuId=stuId;
	  this.stuName=stuName;
	  this.Stusex=Stusex;
	  courses = new Course[1];
	 }
	 public Student(int stuId,String stuName,String major,char Stusex) {
	  super();
	  this.stuId=stuId;
	  this.stuName=stuName;
	  this.major = major;
	  this.Stusex=Stusex;
	  courses = new Course[1];
	 }
	 
	 //修改获取属性name,id,sex,major
	 public String getStuName() {
	  return stuName;
	 }
	 
	 public void setStuName(String stuName) {
	  this.stuName = stuName;
	 }
	 public int getStuId() {
	  return stuId;
	 }
	 public void setStuId(int stuId) {
	  this.stuId = stuId;
	 }
	 public char getStusex() {
		 return Stusex;		 
	 }
	 public void Stusex(char Stusex) {
		  this.Stusex = Stusex;
	 }
	 public String getMajor() {
	  return major;
	 }
	 public void setMajor(String major) {
	  this.major = major;
	 }
	 //学生选课；
	 public boolean addCourse(Course course){
	  boolean flag=false;
	  if(!isSelectedCourse(course)&&isNullCourse(course)){
	   for(int i=0;i<this.courses.length;i++){
	    if(courses[i]==null){
	     courses[i]=course;
	     course.addStudent(this);//课程也要添加学生
	     flag=true;
	     break;
	    }
	   }
	  }
	  return flag;
	 }

	 //显示学生所选的课程
	 public void displayCourse(){
	  System.out.println("学生"+this.stuName+"性别:女"+this.Stusex+"所选课程有：");
	  for(Course c:courses){
	   if(c!=null){
	    System.out.print(c.getName()+" ");
	   }
	  }
	  System.out.println();
	 }
	 
	 //课是否被选过
	 public boolean isSelectedCourse(Course course){
	  boolean flag=false;
	  for(Course c:courses){
	   if(c==course){
	    flag=true;
	    break;
	   }
	  }
	  return flag;
	 }
	 //学生是否还有选修课位置
	 public boolean isNullCourse(Course course){
	  boolean flag=false;
	  for(Course c:courses){
	   if(c==null){
	    flag=true;
	    break;
	   }
	  }
	  return flag;
	 }
   
   4.Course
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
  5.ChooseCourseByStu
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
  
  ##核心方法：
1.面向对象的类设计方法（属性、方法）；
2.类的继承用法，通过构造方法实例化对象；
3.使用super()，this,用于实例化子类；
4.this:
构造方法是创建java对象的重要途径,通过new关键字调用构造器时,构造器返回该类的对象,但是这个对手并不是完全由构造器负责创建. 创建一个对象分为如下四步:
　　a. 分配对象空间,并将对象成员变量初始化为0或者null
　　b. 执行属性值的显式初始化
　　c. 执行构造方法
　　d. 返回对象的地址给相关变量
　　this的本质就是“创建好的的对象的地址”, 由于在构造方法调用前,对象已经创建. 因此,在构造方法中也可以使用this代表“当前对象”.
5.super():
super是指向父类的引用，如果构造方法没有显示地调用父类的构造方法，那么编译器会自动为它加上一个默认的super()方法调用。
如果父类由没有默认的无参构造方法，编译器就会报错，super()语句必须是构造方法的第一个子句。
定义子类的一个对象时，会先调用子类的构造函数，然后在调用父类的构造函数.

##实验结果：
学生:Lily性别:女
JAVA技术及应用 

##实验感想：
本次实验学会使用super()继承的方法，设立不同的名称和属性，实验过程中遇到很多小麻烦，
如参数值没有赋予，没有使用构造方法，无法返回类型，无法定义...为变量，构造函数未定义等诸多问题，
通过eclipse中自带的修改方式和网上搜索修改代码，最终完成代码并运行出想要的结果

