package com.example.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.model.BooK;

import jakarta.persistence.Entity;




public interface BookRepo extends JpaRepository<BooK,Integer> {
	

}
