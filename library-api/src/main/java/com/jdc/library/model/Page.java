package com.jdc.library.model;

import java.util.List;

import lombok.Data;

@Data
public class Page<T> {

	private List<T> list;
	private long total;
	private int totalPage;
	private int current;
	private int limit;
}
