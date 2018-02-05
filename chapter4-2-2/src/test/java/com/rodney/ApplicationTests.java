package com.rodney;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	private Logger logger = LogManager.getLogger(ApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("输出info");
		logger.debug("输出debug");
		logger.warn("输出warn");
		logger.error("输出error");
	}

}
