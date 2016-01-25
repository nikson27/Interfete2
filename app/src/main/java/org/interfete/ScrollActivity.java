package org.interfete;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ScrollActivity extends Activity {
Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        btn1=(Button) findViewById(R.id.button1);
        btn2=(Button) findViewById(R.id.button2);
        btn3=(Button) findViewById(R.id.button3);
        btn4=(Button) findViewById(R.id.button4);
        btn5=(Button) findViewById(R.id.button5);
        editText=(EditText)findViewById(R.id.txt);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ScrollActivity.this, "Ati apasat pe butonul " + btn1.getText().toString(), Toast.LENGTH_SHORT).show();       
            }
        });
        
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ScrollActivity.this, "Ati apasat pe butonul " + btn2.getText().toString(), Toast.LENGTH_SHORT).show();       
            }
        });
        
        
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ScrollActivity.this, "Ati apasat pe butonul " + btn3.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ScrollActivity.this, "Ati apasat pe butonul " + btn4.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
            
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ScrollActivity.this, "Ati apasat pe butonul " + btn5.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(), "Click pe Edit text", Toast.LENGTH_SHORT).show();

            }
        });

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Click pe Edit text", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
