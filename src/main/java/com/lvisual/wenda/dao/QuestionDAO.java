package com.lvisual.wenda.dao;

import com.lvisual.wenda.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface  QuestionDAO{
    @Insert({"insert into question (title, comment, create_date, user_id, comment_count) values (#{title},#{comment},#{createdDate},#{userId},#{commentCount})"})
    int addQuestion(Question question);

    Question selectQuestionById(int id);


}


