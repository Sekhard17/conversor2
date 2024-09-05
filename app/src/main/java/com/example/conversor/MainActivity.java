package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Definimos los elementos de la interfaz
    private EditText campoValor;
    private Button botonFahrenheitCelsius, botonCelsiusFahrenheit, botonCmsMts,
            botonMtsCms, botonMtsKms, botonKmsMts, botonLibrasKilos,
            botonKilosLibras, botonDolaresEuros, botonEurosDolares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializamos los elementos de la interfaz (campo de texto y botones)
        campoValor = findViewById(R.id.campoValor);

        botonFahrenheitCelsius = findViewById(R.id.botonFahrenheitCelsius);
        botonCelsiusFahrenheit = findViewById(R.id.botonCelsiusFahrenheit);
        botonCmsMts = findViewById(R.id.botonCmsMts);
        botonMtsCms = findViewById(R.id.botonMtsCms);
        botonMtsKms = findViewById(R.id.botonMtsKms);
        botonKmsMts = findViewById(R.id.botonKmsMts);
        botonLibrasKilos = findViewById(R.id.botonLibrasKilos);
        botonKilosLibras = findViewById(R.id.botonKilosLibras);
        botonDolaresEuros = findViewById(R.id.botonDolaresEuros);
        botonEurosDolares = findViewById(R.id.botonEurosDolares);

        // Asignamos los listeners a los botones para realizar las conversiones
        botonFahrenheitCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarConversion("fahrenheit_celsius");
            }
        });

        botonCelsiusFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarConversion("celsius_fahrenheit");
            }
        });

        botonCmsMts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarConversion("cms_mts");
            }
        });

        botonMtsCms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarConversion("mts_cms");
            }
        });

        botonMtsKms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarConversion("mts_kms");
            }
        });

        botonKmsMts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarConversion("kms_mts");
            }
        });

        botonLibrasKilos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarConversion("lbs_kgs");
            }
        });

        botonKilosLibras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarConversion("kgs_lbs");
            }
        });

        botonDolaresEuros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarConversion("dol_euros");
            }
        });

        botonEurosDolares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarConversion("euros_dol");
            }
        });
    }

    /**
     * Método que realiza la conversión basada en el tipo de conversión seleccionada.
     * @param tipoConversion El tipo de conversión seleccionada por el usuario (ej: fahrenheit_celsius).
     */
    private void realizarConversion(String tipoConversion) {
        // Validamos que el campo de valor no esté vacío
        String valorTexto = campoValor.getText().toString();
        if (valorTexto.isEmpty()) {
            Toast.makeText(this, "Por favor, ingrese un valor", Toast.LENGTH_SHORT).show();
            return;
        }

        // Convertimos el valor ingresado a double
        double valor = Double.parseDouble(valorTexto);

        // Creamos un intent para ir a la siguiente actividad y pasamos el valor y el tipo de conversión
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("VALOR", valor);
        intent.putExtra("TIPO_CONVERSION", tipoConversion);
        startActivity(intent);
    }
}
