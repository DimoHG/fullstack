package com.fullstack.server.controllers;

import com.fullstack.server.models.Todo;
import com.fullstack.server.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


@RestController
@RequestMapping("/test")
public class ExposeTest
{
	@Autowired TodoRepository todoRepository;

	@RequestMapping(value = "bulkCreate", method = RequestMethod.GET)
	public String bulkCreate()
	{
		todoRepository.saveAll(Arrays.asList(new Todo("work", "postgres"), new Todo("test", "test")));
		return "Done";
	}

	@RequestMapping(value = "addRandom", method = RequestMethod.GET)
	public String addRandom()
	{
		Random random = new Random();
		double a = random.nextInt();
		todoRepository.save(new Todo("random" + a, "random" + a));
		return "" + a;
	}

	@RequestMapping(value = "all", method = RequestMethod.GET)
	public List<Todo> getAll()
	{
		return todoRepository.findAll();
	}

}
