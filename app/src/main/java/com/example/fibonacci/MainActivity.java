package com.example.fibonacci;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText textBoxPosicion;
    public static EditText textBoxResultado;
    private Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBoxPosicion = (EditText)findViewById(R.id.textBoxPosicion);
        textBoxResultado=(EditText)findViewById(R.id.textBoxResultado);
        buttonCalcular=(Button)findViewById(R.id.buttonCalcular);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textBoxResultado.setText(textBoxPosicion.getText().toString());
                Fibonacci f = new Fibonacci();
                int n =0;
                f.fibonacci(n);
            }
        });
    }
}
