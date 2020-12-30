package com.ks.stuaimis.biz.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ks.stuaimis.dao.person.IPersonDao;
import com.ks.stuaimis.pojo.Person;

@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {
		Exception.class })
@Service
public class PersonBiz {
	@Autowired
	private IPersonDao personDao;

	public List<Person> findPersonList() {
		return personDao.queryPerson();
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	public void addPerson() {

	}
}
