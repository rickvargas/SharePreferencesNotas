package com.example.sharepreferencesnotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	NotasController notes;
	TextView result;
	EditText text;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		notes = new NotasController(this);

		text = findViewById(R.id.textInputEdit);
		result = findViewById(R.id.textViewResult);
		
	}
	
	public void Save(View v){
		String string = text.getText().toString();
		notes.save("texto", string);
		
		result.setText(notes.recover("texto"));
	}
	
	public void Clear(View v){
		notes.save("texto", "");
		result.setText(notes.recover("texto"));
	}
	
	protected void onStart() {
		super.onStart();
		
		result.setText(notes.recover("texto"));
	}
}
