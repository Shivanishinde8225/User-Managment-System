package com.acc.service;

import java.lang.module.FindException;
import java.util.List;

import com.acc.model.Employee;

public interface OPerable {
	public List<Employee>findAll();
	public Employee Find();
	public void delete(int id);
	public void add(Employee emp);
	public void update(int id,int age); 
}
