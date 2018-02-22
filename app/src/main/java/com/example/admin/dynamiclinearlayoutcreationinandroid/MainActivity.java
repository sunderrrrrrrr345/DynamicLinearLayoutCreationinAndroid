package com.example.admin.dynamiclinearlayoutcreationinandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;
    TextView[] tv;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ll = new LinearLayout(MainActivity.this);
        ll.setOrientation(LinearLayout.VERTICAL);	//	Vertical
        //  ll.setOrientation(0);	//	Horizontal
        tv = new TextView[7];
        ll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(i<6) {
                    i++;
                    tv[i] = new TextView(MainActivity.this);
                    tv[i].setText("Text " + i);
                    tv[i].setTextSize(25);
                    tv[i].setBackgroundColor(getResources().getColor(R.color.colorAccent));
                  //  tv[i].setBackgroundResource(R.drawable.ic_launcher_background);
                    tv[i].setPadding(50, 20, 0, 10);
                    ll.addView(tv[i]);
                      }
                    else{
                        Toast.makeText(MainActivity.this,"Hi",Toast.LENGTH_SHORT).show();
                    }
                }
            });

        setContentView(ll);

    }
}
