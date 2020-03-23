package com.example.carmanage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class InputPayPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_pay_password);
        final EditText et = findViewById(R.id.et_password);
        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (et.getText().toString().equals("123456")) {
                    Toast.makeText(InputPayPasswordActivity.this, "交易成功", Toast.LENGTH_LONG).show();
                    finish();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }


}
