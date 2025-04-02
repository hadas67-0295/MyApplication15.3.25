package com.example.myapplication15325;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TableDAO {
    @Insert
    void insert(TableDataBase tableDataBase);

    @Update
    void  update(TableDataBase tableDataBase);

    @Delete
    void delete(TableDataBase tableDataBase);

    @Query("SELECT*FROM tableDataBase")
    List<TableDataBase> getAllInfo();



}
