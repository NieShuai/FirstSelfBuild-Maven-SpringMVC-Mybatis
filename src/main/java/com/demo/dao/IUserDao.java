package com.demo.dao;

import java.util.List;
import java.util.Map;

public interface IUserDao {
	
	@SuppressWarnings("rawtypes")
	public List<Map> getUser();
}
