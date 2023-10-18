package com.geeks.emil_maldybaev_hw3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList <String > contactNameList=new ArrayList<>();
    private RecyclerView rvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        LoadData();
    }

    private void LoadData() {
        contactNameList.add("Каха");
        contactNameList.add("Денчик");
        contactNameList.add("Данила");
        contactNameList.add("Должен 500с");
        contactNameList.add("Серега");
        contactNameList.add("Талант");
        contactNameList.add("Виталя");
        contactNameList.add("Caня");
        contactNameList.add("Агйгуля брат");
        contactNameList.add("Бая");
        contactNameList.add("Вода");
        contactNameList.add("Газ");
        contactNameList.add("Свет");
        contactNameList.add("микро челик");
        contactNameList.add("Имя забыл1");
        contactNameList.add("Имя забыл2");
        initAdapter();
    }

    private void initAdapter() {
        ContactAdapter adapter = new ContactAdapter(contactNameList);
        rvContact.setAdapter(adapter);
    }
    private void initView() {
        rvContact = findViewById(R.id.rv_contacts);
    }
}