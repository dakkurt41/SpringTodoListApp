package com.dogan.lil.sprintTodoList.models;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface TodoDao extends CrudRepository<Todo, Long> {
}
