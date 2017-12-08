package com.example.brandon.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.*;

public class EditItemActivity extends AppCompatActivity {

    String item;
    EditText etEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String item = getIntent().getStringExtra("item");
        etEditText = (EditText) findViewById(R.id.etEditText);
        etEditText.setText(item);

        //Toast.makeText(this, username, Toast.LENGTH_LONG).show();
    }

    public void onSave(View view) {
        Intent data = new Intent();
        String item = etEditText.getText().toString();
        data.putExtra("item", item);
        setResult(RESULT_OK, data);
        finish();
    }

    public void onCancel(View view) {
        this.finish();
    }
}
