package com.Quizz.Quizz.Service;

import com.Quizz.Quizz.Dao.PeopleDao;
import com.Quizz.Quizz.Model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {
    @Autowired
    PeopleDao peopleDao;
    public List<People> allusers(People people) {
        return peopleDao.findAll();
    }

    public String adduser(People user) {
        peopleDao.save(user);
        return "Success";
    }

    public People userById(Integer id) {
        return peopleDao.findById(id).orElse(null);
    }

    public People updateUser(People user) {
       return peopleDao.save(user);
    }

    public void delUserById(Integer id) {
        peopleDao.deleteById(id);
    }
}
