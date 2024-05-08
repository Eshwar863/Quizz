package com.Quizz.Quizz.Dao;

import com.Quizz.Quizz.Model.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeopleDao extends JpaRepository<People,Integer> {
}
