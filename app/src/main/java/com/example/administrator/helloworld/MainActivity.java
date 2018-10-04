package com.example.administrator.helloworld;

import android.content.SyncStatusObserver;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//1.
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //you want to declare display as a private instance var so its not only accesible in
    private TextView txtView;
    private EditText txtEdit;
    private Button btn;


    @Override
    // onCreate() -> método en el que se crea la actividad
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView = findViewById(R.id.Name);
        txtEdit = findViewById(R.id.EditName);
        btn = findViewById(R.id.button);
        //We create an instance of View.OnClickListener and wire it to the btn using setOnClickListener(View.OnClickListener). As a result**
        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // **The system executes code here on the MAIN THREAD after user presses button

                //We pick up the text in the Activity where the view hosts the EditText
                String txt = txtView.getText().toString();
                String input = txtEdit.getText().toString();

                //1. Instantiate an AlertDialog.Builder with its constructor
                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                //2.
                builder.setTitle("Input Data");
                builder.setMessage(txt +": "+ input);
                //3. Get the AlertDialog from create()
                AlertDialog dialog = builder.create();
                dialog.show();

                //txtEdit.setText(txt);
                //txtView.setText(input);

            }
        });

    }

}
