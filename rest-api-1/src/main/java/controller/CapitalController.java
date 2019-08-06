package controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Capital;
import service.CapitalService;

@CrossOrigin
@RestController
@RequestMapping("/")

public class CapitalController {
	@Autowired
	CapitalService ps;

	@RequestMapping("/all")
	public ArrayList<Capital> getAll() {
		return ps.getAll();
	}

	@RequestMapping("{id}")
	public Capital getCapital(@PathVariable("id") String id) {
		return ps.getcapital(id);
	}
}
