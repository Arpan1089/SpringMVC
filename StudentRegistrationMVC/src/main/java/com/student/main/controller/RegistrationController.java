package com.student.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.main.entity.Student;

@Controller
public class RegistrationController {

	@RequestMapping
	public String showForm(Model theModal ) {
		Student theStudent = new Student();
		theModal.addAttribute("student", theStudent);
		return "StudentRegistration";
	}
}
