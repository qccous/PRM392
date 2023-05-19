package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtData;

    private  EditText edtShowData;

    private Button btnShow;

    private  void bindingView(){

        btnShow = findViewById(R.id.btnShow);

        edtData = findViewById(R.id.edtData);

        edtShowData = findViewById(R.id.edtShowData);
    }
    private void bindingAction(){

        btnShow.setOnLongClickListener(this::onBtnShowLongClick);

        btnShow.setOnClickListener(this::onBtnShowClick);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
     bindingView();
     bindingAction();
    }

    private boolean onBtnShowLongClick(View view) {
        Log.d("Debug: ","btnShow long clicked!");

        Toast.makeText(this,"btn long click", Toast.LENGTH_SHORT).show();

        return false;
    }

    private  void onBtnShowClick(View view){
        Log.d("Debug: ","btnShow clicked!");

     edtData = findViewById(R.id.edtData);

        String data = edtData.getText().toString();

        Toast.makeText(this,data, Toast.LENGTH_SHORT).show();

         edtShowData = findViewById(R.id.edtShowData);

        edtShowData.setText(data);
    }

}