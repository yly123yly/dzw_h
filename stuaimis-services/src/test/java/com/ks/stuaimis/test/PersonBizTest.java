package com.ks.stuaimis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ks.stuaimis.biz.person.PersonBiz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:spring-ctx.xml")
public class PersonBizTest {
	@Autowired
	private PersonBiz personBiz;

	@Test
	public void testFindQuery() {
		personBiz.findPersonList();
	}

}
