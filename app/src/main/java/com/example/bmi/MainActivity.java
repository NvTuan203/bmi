package com.example.bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button btnChuandoan;
    EditText edtTen,edtChieucao,edtCannang,edtBMI,edtChuandoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChuandoan= findViewById(R.id.btnBMI);
        edtTen=findViewById(R.id.edtTen);
        edtChieucao= findViewById(R.id.edtChieucao);
        edtCannang= findViewById(R.id.edtCannang);
        edtBMI= findViewById(R.id.edtBMI);
        edtChuandoan= findViewById(R.id.edtTen);
        btnChuandoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                double H=Double.parseDouble(edtChieucao.getText()+"");
                double W=Double.parseDouble(edtCannang.getText()+"");
                double BMI=W/Math.pow(H,2);
                String chandoan="";
                if(BMI<18)
                {
                    chandoan="Bạn gầy";
                }
                else if(BMI<=24.9)
                {
                    chandoan="Bạn bình thường";
                }
                else if(BMI<=29.9)
                {
                    chandoan="Bạn béo phì độ 1";
                }
                else if(BMI<=34.9)
                {
                    chandoan="Bạn béo phì độ 2";
                }
                else
                {
                    chandoan="Bạn béo phì độ 3";
                }
                DecimalFormat dcf=new DecimalFormat("#.0");
                edtBMI.setText(dcf.format(BMI));
                edtChuandoan.setText(chandoan);
            }
        });
    }
}
