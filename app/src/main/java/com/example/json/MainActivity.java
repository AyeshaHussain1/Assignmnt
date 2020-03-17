package com.example.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        serialization();
        deserialization();
    }
    private static void serialization()
    {
        Student student=new Student(firstname:"Ayesha",age:"23",mail:"Ayesha@gmail.com");
        Gson gson = new Gson();
        String json=gson.toJson(File);
    }
    private static void deserialization()
    {
        String Student="{\"firstName\":\"Ayesha\",\"age\":23,\"mail\":\"Ayesha@gmail.com\"}";
        Gson gson=new Gson();
        gson.fromJson(File);
    }
}