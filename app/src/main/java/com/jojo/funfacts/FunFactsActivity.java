package com.jojo.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    private static final String TAG=FunFactsActivity.class.getSimpleName();
    private FactBook factBook=new FactBook();
    private ColorWheel colorWheel=new ColorWheel();
    private TextView factsTextView;
    private Button showFactsButton;
    RelativeLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
       layout=(RelativeLayout)findViewById(R.id.rellayout);
        factsTextView= (TextView) findViewById(R.id.textView2);
        showFactsButton= (Button) findViewById(R.id.button);
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String fact=factBook.getfacts();
                factsTextView.setText(fact);
                int color=colorWheel.getcolors();
                layout.setBackgroundColor(color);
                showFactsButton.setTextColor(color);
            }
        };
        showFactsButton.setOnClickListener(listener);
    }
}
