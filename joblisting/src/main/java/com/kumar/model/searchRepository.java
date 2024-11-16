package com.kumar.model;


import java.util.List;

public interface searchRepository {
	 default List<Post> findByText(String text){
		return null;
		
	}
}
