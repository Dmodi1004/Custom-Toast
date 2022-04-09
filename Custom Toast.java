package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Default Toast:-
                //Toast.makeText(MainActivity.this, "This is my custom Toast", Toast.LENGTH_LONG).show();

                //Custom Toast
                Toast toast = new Toast(MainActivity.this);

                View view1 = getLayoutInflater().inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.viewContainer));
                toast.setView(view1);

                TextView txtMsg = view1.findViewById(R.id.txtMsg);
                txtMsg.setText("This is my custom Toast");

                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 235);

                toast.show();

            }
        });

    }
}