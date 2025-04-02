package com.example.myapplication15325;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities={TableDataBase.class},version = 1)
public abstract class DataBase extends RoomDatabase {
    private static DataBase instance;

    public abstract TableDAO tableDAO();

    public static synchronized DataBase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(
                            context.getApplicationContext(),
                            DataBase.class,
                            "dataBase_db")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
}
