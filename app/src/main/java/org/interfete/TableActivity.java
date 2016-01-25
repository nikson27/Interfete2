package org.interfete;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TableActivity extends Activity {
    Button btn;
    EditText user;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        user=(EditText)findViewById(R.id.txtUserName);
        pass=(EditText)findViewById(R.id.txtPassword);
        btn=(Button) findViewById(R.id.buttonSignIn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TableActivity.this, "Ati apasat pe butonul " + btn.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        user.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    Toast.makeText(getApplicationContext(), "Click pe edittext", Toast.LENGTH_SHORT).show();
                }
            }
        });
        pass.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(getApplicationContext(), "Click pe edittext"+ pass.getId(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
