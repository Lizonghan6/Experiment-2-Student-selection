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