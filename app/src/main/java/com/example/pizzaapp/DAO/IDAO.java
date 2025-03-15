package com.example.pizzaapp.DAO;

import java.util.List;

public interface IDAO<T>{

    public void create(T o);
    public boolean update(T o);
    public void delete(T o);
    public T findById(int id);
    public List<T> findAll();
}
