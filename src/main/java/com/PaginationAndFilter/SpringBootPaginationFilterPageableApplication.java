package com.PaginationAndFilter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.PaginationAndFilter.model.Tutorial;
import com.PaginationAndFilter.repository.TutorialRepository;

@SpringBootApplication
public class SpringBootPaginationFilterPageableApplication  {

	@Autowired
	TutorialRepository tutorialRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPaginationFilterPageableApplication.class, args);
	}

	
}
