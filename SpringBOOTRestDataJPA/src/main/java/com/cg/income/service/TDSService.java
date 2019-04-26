package com.cg.income.service;


import java.util.ArrayList;

import com.cg.income.model.TDSMaster;

public interface TDSService {

	TDSMaster getByPid(int pId);

	ArrayList<TDSMaster> getAll();
}
