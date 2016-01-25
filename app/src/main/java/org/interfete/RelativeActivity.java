package org.interfete;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RelativeActivity extends Activity {

    Button btnCancel;
    Button btnSave;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        btnCancel=(Button) findViewById(R.id.btnCancel);
        btnSave=(Button)findViewById(R.id.btnSave);
        editText=(EditText) findViewById(R.id.txtComments);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RelativeActivity.this, "Ati apasat pe butonul " + btnCancel.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Ati apasat pe butonul " +btnSave.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(), "Click pe textbox ", Toast.LENGTH_SHORT).show();

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
