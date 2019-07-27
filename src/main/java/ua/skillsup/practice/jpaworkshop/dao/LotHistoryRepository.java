package ua.skillsup.practice.jpaworkshop.dao;

import ua.skillsup.practice.jpaworkshop.dao.entity.LotHistory;

import java.util.List;

public interface LotHistoryRepository {

	long create(LotHistory lotHistory);
	LotHistory getOne(long id);
	List<LotHistory> findAll();
//	List<LotHistory> findByFilter(LotHistoryFilter lotHistoryFilter);

}