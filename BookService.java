package com.example.bookstore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bookstore.model.*;
import com.example.bookstore.dao.*;
import java.util.*;

@Service
public class BookService {
	@Autowired
	BookRepo br;
	
	public BooK get1(BooK b)
	{
	return br.save(b);
	}
	//select all
 	public List<BooK> get2()
 	{
 		return br.findAll();
 	}
 	//particular select
 	public Optional <BooK> get3(int id)
 	{
 		return br.findById(id);
 	}
 	//delete by id
 	public void get4(int id)
 	{
 		 br.deleteById(id);
 	}
 	
 	
	
}
