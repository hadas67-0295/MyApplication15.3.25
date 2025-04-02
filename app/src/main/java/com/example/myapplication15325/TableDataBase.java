package com.example.myapplication15325;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tableDataBase")
public class TableDataBase {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String string;
    private Integer number;
    private String percent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }
}
