package com.cg.income.dao;


import java.util.ArrayList;

import com.cg.income.model.TDSMaster;


public interface TDSDao {

	ArrayList<TDSMaster> getAll();
	TDSMaster getByPid(int pId);
}

