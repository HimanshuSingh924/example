package com.springcore;

public class Student {
	
	private int studId;
	private String studName;
	private String studAddress;
	
	public int getStudId() {
		System.out.println( "ID" );
		return studId;
	}
	public void setStudId(int studId) {
		System.out.println( "ID !" );
		this.studId = studId;
	}
	public String getStudName() {
		System.out.println( "Name" );
		return studName;
	}
	public void setStudName(String studName) {
		System.out.println( "Name !" );
		this.studName = studName;
	}
	public String getStudAddress() {
		System.out.println( "Address" );
		return studAddress;
	}
	public void setStudAddress(String studAddress) {
		System.out.println( "Address !" );
		this.studAddress = studAddress;
	}
	
	/*public Student(int studId, String studName, String studAddress) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAddress = studAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}*/
	
	@Override
	public String toString() {
		return "Student [studId = " + studId + ", studName = " + studName + ", studAddress = " + studAddress + "]";
	}
}
