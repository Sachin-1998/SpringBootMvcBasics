package com.dt.entity;

public class Employee 
{
	private Integer eno;
	private String ename;
	private Double salary;
	private Boolean isVaccinated;
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Boolean getIsVaccinated() {
		return isVaccinated;
	}
	public void setIsVaccinated(Boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Integer eno, String ename, Double salary, Boolean isVaccinated) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.isVaccinated = isVaccinated;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", isVaccinated=" + isVaccinated
				+ "]";
	}
	

}
