package com.example.clase004.Dao;

import java.util.List;
import java.util.Map;

import com.example.clase004.Entity.Asginatura;
import com.example.clase004.Entity.Profesor;

public interface Todo<T> {
  int create (T t);
  int update (T t);
  int delete(int id);
  T read(int id);
  List<Map<String,Object>> readAll();
  List<Map<String,Object>> readAll2();
  List<Map<String,Object>> readAll3();
}
