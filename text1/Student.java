package text1;

import java.util.*;
import java.io.*;
/*
 * 学生类
 */
public class Student implements Serializable {
	private int order;
	private String id;
	private String name;
	private int eng;
	private int java;
	private int lin;
	private double avr;

	public Student(String id, String name, int eng, int java, int lin) {
		this.id = id;
		this.name = name;
		this.eng = eng;
		this.java = java;
		this.lin = lin;
		avr();
	}

	public Student(Student s) {
		this.id = s.id;
		this.name = s.name;
		this.eng = s.eng;
		this.java = s.java;
		this.lin = s.lin;
		avr();
	}

	void avr() {
		this.avr = (eng + java + lin) / 3;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "[学号" + id + ", 姓名" + name + ",  英语成绩：" + eng + ",  java成绩：" + java
				+ ",  数据结构成绩：" + lin + ",  平均成绩" + avr + "]";
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getLin() {
		return lin;
	}

	public void setLin(int lin) {
		this.lin = lin;
	}

	public double getAvr() {
		return avr;
	}

	public void setAvr(double avr) {
		this.avr = avr;
	}

	public String getId() {
		return id;
	}
	
}
