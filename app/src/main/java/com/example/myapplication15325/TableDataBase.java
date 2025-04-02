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
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getString() {
        return this.string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPercent() {
        return this.percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }
}
