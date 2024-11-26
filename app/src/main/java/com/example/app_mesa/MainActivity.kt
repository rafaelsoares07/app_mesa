package com.example.app_mesa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.app_mesa.character.Character

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val character = Character();

        Toast.makeText(this, character.toString(), Toast.LENGTH_SHORT).show();
    }
}