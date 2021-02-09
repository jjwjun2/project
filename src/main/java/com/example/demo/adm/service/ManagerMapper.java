package com.example.demo.adm.service;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ManagerMapper {
	public int register(Manager manager);
	public Manager selectUserById(String id);
	public Manager updateManager(Manager manager);
	public void delete(Manager manager);
	public List<Manager> selectAll();
	public Manager login(Manager manager);
}