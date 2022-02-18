package com.mondee;
	import javax.persistence.Entity;
	import javax.persistence.Entity;
import javax.persistence.Id;

	@Entity
	public class Student {
		
		@Id
		private int sid;
		private String name;
		private int marks;
		
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getname() {
			return name;
		}
		public void setname(String name) {
			this.name = name;
		}
		public int getmarks() {
			return marks;
		}
		public void setmarks(int marks) {
			this.marks = marks;
		}
		

	
}
