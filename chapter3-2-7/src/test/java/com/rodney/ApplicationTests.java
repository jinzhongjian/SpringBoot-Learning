package com.rodney;

import com.rodney.domain.User;
import com.rodney.domain.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ApplicationTests {


	@Autowired
	public UserMapper userMapper;

	@Test
	@Rollback
	public void findByName() throws Exception {
		userMapper.insert(1L,"AAAAA", 20);
		User u = userMapper.findByName("AAAAA");
		Assert.assertEquals(20, u.getAge().intValue());
	}

}
