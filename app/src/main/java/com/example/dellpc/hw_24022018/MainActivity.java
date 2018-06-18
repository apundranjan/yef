package com.example.dellpc.hw_24022018;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView et1 = findViewById(R.id.et1);
        final TextView et2 = findViewById(R.id.et2);
        final Button b1 = findViewById(R.id.b1);
        final LinearLayout LL2 = findViewById(R.id.LL2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListView lv1 = new ListView(MainActivity.this);
                Button b2 = new Button(MainActivity.this);
                b2.setText("SAVE");
                LL2.addView(lv1);
                LL2.addView(b2);
                String str = new String();
                TextView t1 = new TextView(MainActivity.this);
                t1.setText(str);
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(MainActivity.this,"str",Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });



    }
}
