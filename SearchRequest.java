package com.test.filter;

import java.util.List;


public class SearchRequest {
	private int currentPage;
	private List<Search> search;
	private String sortBy;
	private String sort;
	private int pageSize;
	
	public int getCurrentPage() {
		if(currentPage>0) return currentPage-1;
		return currentPage;
	}
	public List<Search> getSearch() {
		return search;
	}
	public String getSortBy() {
		return sortBy;
	}
	public String getSort() {
		return sort;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public void setSearch(List<Search> search) {
		this.search = search;
	}
	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
}
