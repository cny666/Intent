package com.example.intent;

import android.content.Intent;
import android.net.Uri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ImplicitIntentActivity extends AppCompatActivity {
    EditText Url;
    Button Browse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.implicitintent_layout);
        Url = (EditText)findViewById(R.id.editTextIntent);
        Browse = (Button)findViewById(R.id.buttonIntent);
        Browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = Url.getText().toString();
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}