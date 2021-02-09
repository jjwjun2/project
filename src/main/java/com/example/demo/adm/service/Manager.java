package com.example.demo.adm.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Lazy
@Component
@NoArgsConstructor
public class Manager {
	private int userid, number;
	private String password, prdName;
}