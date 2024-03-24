package com.example.notetakingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notetakingapp.viewModel.NoteViewModel

class MainActivity : AppCompatActivity() {
    public lateinit var noteViewModel: NoteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}