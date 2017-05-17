package sample.camel.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import sample.camel.model.DateExc;
@Transactional
public interface DateExcService extends CrudRepository<DateExc, Integer> {
	List<DateExc> findAll();
}