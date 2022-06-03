package com.test.service.core;

import java.util.List;

import com.test.filter.SearchRequest;



public interface AbstractService<T> {
	List<T> search(SearchRequest request, String sellerId); 
	public long searchCount(SearchRequest request, String sellerId);

}
