package com.ks.stuaimis.test;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.ks.stuaimis.dao.person.IPersonDao;
import com.ks.stuaimis.pojo.Person;

public class PersonDaoTest {

	private SqlSessionFactory ssf;
	private Logger logger = Logger.getRootLogger();

	@Before
	public void initFactory() {
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		try {
			ssf = sfb.build(Resources.getResourceAsStream("MyBatisConfig.xml"));
		} catch (IOException e) {
			logger.error("配置文佳加载失败", e);
		}
	}

	@Test
	public void testPersonQuery() throws Exception {
		SqlSession session=ssf.openSession();
		IPersonDao dao=session.getMapper(IPersonDao.class);
		for(Person person:dao.queryPerson()) {
			System.out.println(person);
		}
	}
}
