package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /**
     *  عرفوا مصفوفة بإسم students
     *  define an arraylist named students
     */
    ArrayList<Student> students = new ArrayList<Student>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);

        /**
         *  إكتبوا الكود بعد هذا السطر
         *  ضيفوا عناصر من الكلاس
         *  add objects from class Student
         */

        Student student1 = new Student("Omar",24,100,R.drawable.boy);
        Student s1 = new Student( "Mohammed",14,92,R.drawable.boy1);
        students.add(student1);
        students.add(s1);
        StudentAdapter studentAdapter = new StudentAdapter(this,0,students);


        listView.setAdapter(studentAdapter);
    }
}