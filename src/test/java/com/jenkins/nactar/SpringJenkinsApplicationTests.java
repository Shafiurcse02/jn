package com.jenkins.nactar;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpringJenkinsApplicationTests {

	public static final Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@Test
	void contextLoads() {
		logger.info("RUNNER Clas Shafiur kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		assertEquals(true, true);
	}

}
