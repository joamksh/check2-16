package com.mysite.basketproject.answer;

import com.mysite.basketproject.answer.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}