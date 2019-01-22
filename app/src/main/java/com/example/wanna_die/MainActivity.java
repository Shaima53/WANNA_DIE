package com.example.wanna_die;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static SQLiteHelper  database;
    TextView t;
    TextView t2,textView;
    Button ebdabtn;
    String name;
EditText editTextEnterName;
    MainActivity mainActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create database
        database= new SQLiteHelper(this,"CHILD_DIE.db");
        String sql="CREATE TABLE IF NOT EXISTS testCHILD ( ID INTEGER PRIMARY KEY  AUTOINCREMENT , NAME VARCHAR(25),SCORE INTEGER(3) );";
        database.queryData(sql);











    }

    public void btnAdd(View view) {
        editTextEnterName=(EditText)findViewById(R.id.editTextEnterName);

        if (editTextEnterName.getText().toString().isEmpty())
            editTextEnterName.setError("أدخل إسمك من فضلك");
        else
        {
            name=editTextEnterName.getText().toString();


            database.insertData(name);


        }//end of onClick method






    }
}
