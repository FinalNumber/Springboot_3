package com.example.spring_homework.springbootdeveloper.repository;

import com.example.spring_homework.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}