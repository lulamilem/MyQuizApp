package com.businescard.lulams.myquizapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class education_question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_question2);
    }
    public void onClickmts(View view)
    {
        Intent intent = new Intent( education_question2.this, education_question3.class);
        startActivity(intent);
    }

    public void onClickhst(View view)
    {
        Intent intent = new Intent( education_question2.this, education_question3.class);
        startActivity(intent);
    }

    public void onClicknwtn(View view)
    {
        Intent intent = new Intent( education_question2.this, education_question3.class);
        startActivity(intent);
        MainActivity.score=MainActivity.score +1;
    }


}
