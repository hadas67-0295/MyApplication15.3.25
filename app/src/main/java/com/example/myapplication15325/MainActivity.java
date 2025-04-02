package com.example.myapplication15325;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    DataBase dataBase;
    TableDAO tableDAO;

    TextView tvShowValue;
    Button btnShowRandomValue;

    List<TableDataBase> listDataTable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        dataBase = DataBase.getInstance(this);
        tableDAO = dataBase.tableDAO();

        tvShowValue = findViewById(R.id.tvShowValue);
        btnShowRandomValue = findViewById(R.id.btnShowRandomValue);

        if(tableDAO.getAllInfo().isEmpty()) {
            tableDAO.insert(new TableDataBase("Apple", 50, "20%"));
            tableDAO.insert(new TableDataBase("Banana", 75, "35%"));
            tableDAO.insert(new TableDataBase("Cherry", 30, "15%"));
            tableDAO.insert(new TableDataBase("Date", 40, "25%"));
            tableDAO.insert(new TableDataBase("Elderberry", 90, "50%"));
        }

        listDataTable = tableDAO.getAllInfo();

        btnShowRandomValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listDataTable.isEmpty()) {
                    tvShowValue.setText("No data available");
                    return;
                }

                Random random = new Random();
                TableDataBase tableRandomValue = listDataTable.get(random.nextInt(listDataTable.size()));

                String returnRandomValue = tableRandomValue.toString();
                tvShowValue.setText(returnRandomValue);
            }
        });
    }

}