package com.smartjournal.service.common;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public interface AbstractService<T, ID extends Serializable> {

    long count();

    void delete(ID id);

    void delete(Iterable<? extends T> entities);

    void delete(T entity);

    void deleteAll();

    void deleteAllInBatch();

    void deleteInBatch(Iterable<T> entities);

    boolean exists(ID id);

    List<T> findAll();

    Iterable<T> findAll(Iterable<ID> ids);

    Page<T> findAll(Pageable pageable);

    List<T> findAll(Sort sort);

    T findOne(ID id);

    void flush();

    <S extends T> List<S> save(Iterable<S> entities);

    <S extends T> S save(S entity);

    T saveAndFlush(T entity);
}
