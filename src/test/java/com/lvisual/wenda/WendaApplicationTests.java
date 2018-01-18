package com.lvisual.wenda;

import com.lvisual.wenda.dao.QuestionDAO;
import com.lvisual.wenda.dao.UserDAO;
import com.lvisual.wenda.model.Question;
import com.lvisual.wenda.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.nio.ch.KQueueSelectorProvider;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WendaApplicationTests {
	@Autowired
	UserDAO userdao;
	@Autowired
	QuestionDAO questiondao;
	@Test
	public void contextLoads() {
		//User user = new User();
		//user.setId(1);
		//user.setName("messi");
		//user.setPassword("1234");
		//userdao.upDatePassword(user);
		//userdao.addUser(user);
		//user = userdao.selectById(1);
		//userdao.deleteById(4);
		for(int i = 0;i < 4;i++){
			Question question = new Question();
			question.setTitle(String.format("Title %d",i));
			question.setComment(String.format("comment%d",i));
			question.setCommentCount(i);
			question.setUserId(i+1);
			Date date = new Date();
			date.setTime(date.getTime()+1000*3600*i);
			question.setCreatedDate(date);
			questiondao.addQuestion(question);
		}
	}
}
