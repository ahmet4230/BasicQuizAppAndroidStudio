package com.example.soruuyg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    EditText TxtSoru;
    RadioButton r1,r2,r3,r4;
    Button cvpBtn, sonrakiBtn;
    TextView dogru,yanlis;
    sorular sorular = new sorular();
    ArrayList<Integer> ssira = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4));
    int sayac = 0;
    int d,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TxtSoru = (EditText) findViewById(R.id.TxtSoru);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
        r3 = (RadioButton) findViewById(R.id.r3);
        r4 = (RadioButton) findViewById(R.id.r4);
        cvpBtn = (Button) findViewById(R.id.cvpBtn);
        sonrakiBtn = (Button) findViewById(R.id.sonrakiBtn);
        dogru = (TextView) findViewById(R.id.dogru);
        yanlis = (TextView) findViewById(R.id.yanlis);

        Collections.shuffle(ssira);
        yukle();

        sonrakiBtn.setEnabled(false);
        d=y=0;

        sonrakiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sayac++;
                if (sayac<5) yukle();
                cvpBtn.setEnabled(true);
            }
        });

        cvpBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (r1.isChecked()){
                    if (r1.getText().equals(sorular.cev.get(ssira.get(sayac)))){
                        d++;
                        dogru.setText(d+ "DOĞRU CEVAP");
                    }else{
                        y++;
                        yanlis.setText(y+"YANLIŞ CEVAP");
                    }
                }
                if (r2.isChecked()){
                    if(r2.getText().equals(sorular.cev.get(ssira.get(sayac)))){
                        d++;
                        dogru.setText(d+"DOĞRU CEVAP");
                    }else{
                        y++;
                        yanlis.setText(y+"YANLIŞ CEVAP");
                    }
                }
                if (r3.isChecked()){
                    if (r3.getText().equals(sorular.cev.get(ssira.get(sayac)))){
                        d++;
                        dogru.setText(d+"DOĞRU CEVAP");
                    }else{
                        y++;
                        yanlis.setText(y+"YANLIŞ CEVAP");
                    }
                }
                if (r4.isChecked()){
                    if (r4.getText().equals(sorular.cev.get(ssira.get(sayac)))){
                        d++;
                        dogru.setText(d+"DOĞRU CEVAP");
                    }else{
                        y++;
                        yanlis.setText(y+"YANLIŞ CEVAP");
                    }
                }
                cvpBtn.setEnabled(false);
                sonrakiBtn.setEnabled(true);
            }
        });
    }

    public void yukle() {
        TxtSoru.setText(sorular.s.get(ssira.get(sayac)));
        Collections.shuffle(sorular.sec[ssira.get(sayac)]);
        r1.setText(sorular.sec[ssira.get(sayac)].get(0));
        r2.setText(sorular.sec[ssira.get(sayac)].get(1));
        r3.setText(sorular.sec[ssira.get(sayac)].get(2));
        r4.setText(sorular.sec[ssira.get(sayac)].get(3));

        sonrakiBtn.setEnabled(false);

    }


}