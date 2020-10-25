package course;
public class Student {
	 private String stuName;
	 private char Stusex;
	 private int stuId;
	 private String major;
	 private Course[] courses;
	 //���캯��
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
	 
	 //�޸Ļ�ȡ����name,id,sex,major
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
	 //ѧ��ѡ�Σ�
	 public boolean addCourse(Course course){
	  boolean flag=false;
	  if(!isSelectedCourse(course)&&isNullCourse(course)){
	   for(int i=0;i<this.courses.length;i++){
	    if(courses[i]==null){
	     courses[i]=course;
	     course.addStudent(this);//�γ�ҲҪ���ѧ��
	     flag=true;
	     break;
	    }
	   }
	  }
	  return flag;
	 }

	 //��ʾѧ����ѡ�Ŀγ�
	 public void displayCourse(){
	  System.out.println("ѧ��"+this.stuName+"�Ա�:Ů"+this.Stusex+"��ѡ�γ��У�");
	  for(Course c:courses){
	   if(c!=null){
	    System.out.print(c.getName()+" ");
	   }
	  }
	  System.out.println();
	 }
	 
	 //���Ƿ�ѡ��
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
	 //ѧ���Ƿ���ѡ�޿�λ��
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
	 
	 
	}