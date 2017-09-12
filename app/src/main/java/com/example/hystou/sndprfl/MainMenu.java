package com.example.hystou.sndprfl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainMenu extends AppCompatActivity {

    TextView Title;
    Button Creation;
    Button Choosing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Title = (TextView) findViewById(R.id.textView2);
        Creation = (Button) findViewById(R.id.Creation);
        Choosing = (Button) findViewById(R.id.Choosing);

        Creation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, Set_settings.class));
            }
        });

        Choosing.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, Choose_Existing_Activity.class));
            }
        });



    }




    /*@Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Creation: //проверка текстом
                title.setText("pressed 1");
                break;
            case  R.id.Choosing:
                title.setText("pressed 2");
            default:
                break;
            case R.id.Creation: //так делать со сменой активити не выйлет -- надо методы херачить отдельные
                Intent intent1 = new Intent(MainMenu.this, Set_settings.class);
                startActivity(intent1);
            case  R.id.Choosing:
                Intent intent2 = new Intent(MainMenu.this, Choose_Existing_Activity.class);
                startActivity(intent2);
            default:
                break;
        }

    }*/
}

