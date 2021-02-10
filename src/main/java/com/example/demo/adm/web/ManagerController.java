package com.example.demo.adm.web;

import java.lang.System.Logger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.adm.service.Manager;
import com.example.demo.adm.service.ManagerMapper;
import com.example.demo.adm.service.ManagerService;

import lombok.var;

@RestController 
@RequestMapping(value={"/managers"})
public class ManagerController {

	@Autowired Manager manager;
	@Autowired ManagerMapper managerMapper;
	@Autowired ManagerService managerService;
	// Test Commit
	@PostMapping("")
	public String register(@RequestBody Manager manager){
		System.out.println("Manager register check! "+manager);
		return (managerMapper.register(manager)==1) ? "SUCCESS": "FAILURE";
	}
	

	@PostMapping("/login")
    public Map<?,?> login(@RequestBody Manager manager){
		System.out.println("manager 넘어온 값:" + manager.toString());
		var map = new HashMap();
        Manager mgr = managerMapper.login(manager);
        map.put("message",( mgr != null ) ?  "SUCCESS" : "FAILURE");
        map.put("manager", mgr);
        return map;
    }
		

	@PostMapping("/manage")
	public Manager select(String id) {
		System.out.println("Check manager Presence");
		return managerMapper.selectUserById(id);
	}
	
	
	@DeleteMapping("/manage2")
	public void delete(@PathVariable Manager manager) {
		System.out.println("Manager delete check!");
		managerMapper.delete(manager);
	}
	
	
	@GetMapping("/select")
	public Map<?, ?> selectAll() {
		System.out.println("Manager list check!");
		Map managerMap = new HashMap<>();
		managerMap.put("managerList", managerService.selectAll());
		return managerMap;
	}
}