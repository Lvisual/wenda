package com.lvisual.wenda.dao;

import com.lvisual.wenda.model.Question;
import com.lvisual.wenda.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.nio.ch.KQueueSelectorProvider;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WendaApplicationTests {
	@Autowired
	UserDAO userdao;
	@Autowired
	QuestionDAO questiondao;
	@Test
	public void contextLoads() {
		Question question = new Question();
		question = questiondao.selectQuestionById(1);
		//User user = new User();
		//userdao.selectById(5);
		//user = userdao.selectByName("lk");
		System.out.print(question.getComment());
	}
}
