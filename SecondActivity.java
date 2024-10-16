package com.example.acara6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Mengambil data extra dari Intent
        Intent intent = getIntent();
        String usernameview = intent.getStringExtra("username");
        String emailview = intent.getStringExtra("email");
        String phoneview = intent.getStringExtra("phone");

        // Tampilkan data pada TextView
        TextView textView = findViewById(R.id.usernameView);
        textView.setText("Welcome " + "" + usernameview);
        textView = findViewById(R.id.emailView);
        textView.setText("Your " + " " + emailview + " " + "has been activated");
        textView = findViewById(R.id.phoneView);
        textView.setText("Your " + " " + phoneview + " " + "has been registered");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()== R.id.logout){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}