package com.ks.stuaimis.dao.person;

import java.util.List;

import com.ks.stuaimis.pojo.Person;

public interface IPersonDao {

	/**
	 * 
	 * @title: queryPerson
	 * @description: 查询
	 * @return
	 */
	public List<Person> queryPerson();

}
