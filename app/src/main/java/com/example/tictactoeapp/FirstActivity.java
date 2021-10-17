package com.example.tictactoeapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void playGame(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void aboutGame(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(FirstActivity.this);
        builder.setTitle("O igri");
        builder.setMessage("Igru iks – oks igraju dva igrača.Igra se na dvodimenzionalnoj tabli, sa dve vrste\n" +
                "simbola (X i O) Cilj igre je povezati određen broj svojih\n" +
                "simbola u jednoj liniji. U najrasprostranjenijoj varijanti igre dimenzije table su 3 x 3 i potrebno je\n" +
                "povezati 3 simbol.");
        builder.setPositiveButton("OK",null);
        builder.show();
    }
}