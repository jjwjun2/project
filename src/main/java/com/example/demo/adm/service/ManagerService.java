package com.example.demo.adm.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

//	@Autowired Manager manager;
	@Autowired
	ManagerMapper managerMapper;

	// v
	public Manager login(Manager manager) {
		return (managerMapper.login(manager));
	}

	public int register(Manager manager) {
		return managerMapper.register(manager);
	};

	public Manager selectById(String id) {
		return managerMapper.selectUserById(id);
	}

	public Manager updateManager(Manager manger) {
		return managerMapper.updateManager(manger);
	}

	public void deleteByid(Manager manager) {
		managerMapper.delete(manager);

	}

	public List<Manager> selectAll() {

		return managerMapper.selectAll();
	}

	public List<Manager> selectAllByName() {
		return managerMapper.selectAll().stream().filter(Manager->Manager.getPrdName()
				.equals("A")).collect(Collectors.toList());
	}
}
