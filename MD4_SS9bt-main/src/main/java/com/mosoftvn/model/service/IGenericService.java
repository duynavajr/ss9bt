package com.mosoftvn.model.service;

import java.util.List;

public interface IGenericService <T,ID> {
    List<T> findAll();
    Boolean create(T t);
    Boolean update(T t,ID id);
    T findId(ID id);
    void delete(ID id);

}
