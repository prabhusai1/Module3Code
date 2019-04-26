package com.cg.income.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.income.model.TDSMaster;

@Component("tdsdao")
@Repository
@ComponentScan("com.cg.income")

public class TDSDaoImpl implements TDSDao {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public ArrayList<TDSMaster> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TDSMaster getByPid(int pId) {
		TDSMaster tdsMast = entityManager.find(TDSMaster.class, pId);
		return tdsMast;
	}

	}
