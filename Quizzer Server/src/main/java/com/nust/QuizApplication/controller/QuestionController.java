package com.nust.QuizApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nust.QuizApplication.dao.MCQDAO;
import com.nust.QuizApplication.dao.NumDAO;
import com.nust.QuizApplication.dao.QuestionDAO;
import com.nust.QuizApplication.dao.TrueFalseDAO;
import com.nust.QuizApplication.model.MCQ;
import com.nust.QuizApplication.model.Num;
import com.nust.QuizApplication.model.Question;
import com.nust.QuizApplication.model.TrueFalse;

@RestController
@RequestMapping(value = "/questions")
public class QuestionController {
	@Autowired
	private MCQDAO mcqDao;

	@Autowired
	private TrueFalseDAO truefalseDao;

	@Autowired
	private NumDAO numericDao;
	
	@Autowired 
	QuestionDAO quesdao;

    @RequestMapping(value = "/addques" ,method = RequestMethod.POST)
    public ResponseEntity<Question> addques(@RequestBody Question ques) {
			 int id = quesdao.save(ques);
			 if(id>0)
		        return new ResponseEntity<Question>(ques,HttpStatus.OK);
			 else
				 return new ResponseEntity<Question>(ques,HttpStatus.BAD_REQUEST);
    }
	
    @RequestMapping(value = "/addmcq" ,method = RequestMethod.POST)
    public ResponseEntity<MCQ> addMCQ(@RequestBody MCQ mcq) {

			 String message = mcqDao.save(mcq);
		        if(message=="Successful")
		        	return new ResponseEntity<MCQ>(mcq,HttpStatus.OK);
		        else
		        	 return new ResponseEntity<MCQ>(mcq,HttpStatus.BAD_REQUEST);
    }
    
    @RequestMapping(value = "/addtruefalse" ,method = RequestMethod.POST)
    public ResponseEntity<TrueFalse> addTrueFalse(@RequestBody TrueFalse truefalse) {
    	
        String message = truefalseDao.save(truefalse);
        if(message=="Successful")
        	return new ResponseEntity<TrueFalse>(truefalse,HttpStatus.OK);
        else
        	 return new ResponseEntity<TrueFalse>(truefalse,HttpStatus.BAD_REQUEST);
    }

	@RequestMapping(value = "/addnumeric" ,method = RequestMethod.POST)
    public ResponseEntity<Num> addNumeric(@RequestBody Num num) {
		
        String message = numericDao.save(num);
        if(message=="Successful")
        	return new ResponseEntity<Num>(num,HttpStatus.OK);
        else
        	 return new ResponseEntity<Num>(num,HttpStatus.BAD_REQUEST);
    }
	
}
