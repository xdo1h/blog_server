package com.xiaoh.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xiaoh.BlogApiApplicationTests;
import com.xiaoh.repository.CategoryRepository;

public class CategoryRepositoryTest extends BlogApiApplicationTests{

	@Autowired
	private CategoryRepository	categoryRepository;

	@Test
	public void test() {
	}
}
