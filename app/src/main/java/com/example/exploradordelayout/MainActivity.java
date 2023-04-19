package com.example.exploradordelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);
    }
        public void carregarLaoutLinear(View v){
//            setContentView(R.layout.);
        }

        public void carregarLayoutRestrito(View v){
            setContentView(R.layout.activity_main);
        }

        public void carregarLayoutTabela(View v){
//            setContentView(R.layout.LayoutPadrao);
        }
}