package com.example.sharepreferencesnotas;


import android.content.Context;
import android.content.SharedPreferences;

public class NotasController {
	SharedPreferences sharedPreferences;
	SharedPreferences.Editor editor;
	
	public NotasController(Context c){
		sharedPreferences = c.getSharedPreferences("notepad", c.MODE_PRIVATE);
		editor = sharedPreferences.edit();
	}
	
	public void save(String key, String str){
		editor.putString(key,str);
		editor.commit();
	}
	
	public String recover(String key){
		return sharedPreferences.getString(key,"");
	}
	
}
