package com.example.konversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editCelcius, editKelvin, editFarenheit, editReamur;
    private Button btnKonversi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCelcius = findViewById(R.id.edit_Celcius);
        editKelvin = findViewById(R.id.edit_Kelvin);
        editFarenheit = findViewById(R.id.edit_Farenheit);
        editReamur = findViewById(R.id.edit_Reamur);
        btnKonversi = findViewById(R.id.btn_konversi);

        btnKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String celcius = editCelcius.getText().toString().trim();
                String kelvin = editKelvin.getText().toString().trim();
                String farenheit = editFarenheit.getText().toString().trim();
                String reamur = editReamur.getText().toString().trim();

                double c = Double.parseDouble(celcius);
//                double k = Double.parseDouble(kelvin);
//                double f = Double.parseDouble(farenheit);
//                double r = Double.parseDouble(reamur);

                double konKelvin = c + 273;
                double konFarenheit = 1.8 * c + 32;
                double konReamur = 0.8 * c;

                editKelvin.setText(konKelvin+"");
                editFarenheit.setText(konFarenheit+"");
                editReamur.setText(konReamur+"");
            }
        });

    }
}
