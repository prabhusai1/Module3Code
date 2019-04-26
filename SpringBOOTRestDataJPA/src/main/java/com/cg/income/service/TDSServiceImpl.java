package com.cg.income.service;


import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.income.dao.TDSDao;
import com.cg.income.model.TDSMaster;


@Component("tdsservice")
@Service
@Transactional
public class TDSServiceImpl implements TDSService {

	@Autowired
	TDSDao tdsdao;
	
	
	
	@Override
	public TDSMaster getByPid(int pId) {
		// TODO Auto-generated method stub
		return tdsdao.getByPid(pId);
	}
	
	@Override
	public ArrayList<TDSMaster> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

