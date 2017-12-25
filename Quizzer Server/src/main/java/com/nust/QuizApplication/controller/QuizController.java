package com.nust.QuizApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nust.QuizApplication.dao.QuizDAO;
import com.nust.QuizApplication.model.Quiz;

@RestController
@RequestMapping(value = "/quizzes")
public class QuizController {
	@Autowired
    private QuizDAO quizDao;

    @RequestMapping(value = "/makequiz" ,method = RequestMethod.POST )
    public ResponseEntity<Quiz> create(@RequestBody Quiz quiz) {
        int id = quizDao.save(quiz);
        if(id>0)
        	return new ResponseEntity<Quiz>(quiz,HttpStatus.OK);
        else
        	return new ResponseEntity<Quiz>(quiz,HttpStatus.BAD_REQUEST);
    }
    
    
    @ResponseBody
    @RequestMapping(value = "/allquizzes",method = RequestMethod.GET)
    public List<Quiz> getAllQuizzes()
    {
    	List<Quiz> quizList = quizDao.retrieveAllQuizzes();
    	return quizList;
    }
}
