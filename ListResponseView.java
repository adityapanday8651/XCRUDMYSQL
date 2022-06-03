package com.test.model.view;

public class ListResponseView {
	
	private long totalCount;
	private Object list;
	public ListResponseView(long totalCount, Object list) {
		super();
		this.totalCount = totalCount;
		this.list = list;
	}
	public long getTotalCount() {
		return totalCount;
	}
	public Object getList() {
		return list;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public void setList(Object list) {
		this.list = list;
	}
}
