package com.example.exp9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView tv_result;
    EditText et_P;
    Button btn_calculate;
    Spinner sp_period;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_P = findViewById(R.id.et_P);
        tv_result = findViewById(R.id.tv_result);
        btn_calculate = findViewById(R.id.btn_calculate);
        sp_period = findViewById(R.id.sp_period);
    }
    public void calculate(View view){
        float r = (float) 0.007291;
        //String newR = Float.toString(r);
        int p = Integer.parseInt(et_P.getText().toString());
        int period = Integer.parseInt(String.valueOf(sp_period.getSelectedItem()));

        float emi = (float) (p * period * (Math.pow((1 + period), r)) / (Math.pow((1 + period), r) - 1));
        String newEmi = Float.toString(emi);
        tv_result.setText(newEmi);
    }
}