package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    // Definimos los elementos de la interfaz
    private TextView textoTipoConversion;
    private TextView textoValorConvertir;
    private TextView textoResultado;
    private Button botonVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Inicializamos los elementos de la interfaz
        textoTipoConversion = findViewById(R.id.textoTipoConversion);
        textoValorConvertir = findViewById(R.id.textoValorConvertir);
        textoResultado = findViewById(R.id.textoResultado);
        botonVolver = findViewById(R.id.botonVolver);

        // Obtenemos los valores enviados desde la actividad anterior
        double valor = getIntent().getDoubleExtra("VALOR", 0);
        String tipoConversion = getIntent().getStringExtra("TIPO_CONVERSION");

        // Realizamos la conversión dependiendo del tipo seleccionado
        double resultado = 0;
        String unidadResultado = "";

        switch (tipoConversion) {
            case "fahrenheit_celsius":
                resultado = (valor - 32) * 5/9;
                unidadResultado = String.format("%.2f °C", resultado);
                textoTipoConversion.setText("Conversión de Fahrenheit a Celsius");
                break;
            case "celsius_fahrenheit":
                resultado = (valor * 9/5) + 32;
                unidadResultado = String.format("%.2f °F", resultado);
                textoTipoConversion.setText("Conversión de Celsius a Fahrenheit");
                break;
            case "cms_mts":
                resultado = valor / 100;
                unidadResultado = String.format("%.2f mts", resultado);
                textoTipoConversion.setText("Conversión de Cms a Mts");
                break;
            case "mts_cms":
                resultado = valor * 100;
                unidadResultado = String.format("%.2f cms", resultado);
                textoTipoConversion.setText("Conversión de Mts a Cms");
                break;
            case "mts_kms":
                resultado = valor / 1000;
                unidadResultado = String.format("%.2f kms", resultado);
                textoTipoConversion.setText("Conversión de Mts a Kms");
                break;
            case "kms_mts":
                resultado = valor * 1000;
                unidadResultado = String.format("%.2f mts", resultado);
                textoTipoConversion.setText("Conversión de Kms a Mts");
                break;
            case "lbs_kgs":
                resultado = valor * 0.453592;
                unidadResultado = String.format("%.2f kgs", resultado);
                textoTipoConversion.setText("Conversión de Libras a Kilos");
                break;
            case "kgs_lbs":
                resultado = valor / 0.453592;
                unidadResultado = String.format("%.2f lbs", resultado);
                textoTipoConversion.setText("Conversión de Kilos a Libras");
                break;
            case "dol_euros":
                resultado = valor * 0.729980291;
                unidadResultado = String.format("%.2f €", resultado);
                textoTipoConversion.setText("Conversión de Dólares a Euros");
                break;
            case "euros_dol":
                resultado = valor / 0.729980291;
                unidadResultado = String.format("%.2f $", resultado);
                textoTipoConversion.setText("Conversión de Euros a Dólares");
                break;
        }

        // Mostramos el valor ingresado y el resultado de la conversión
        textoValorConvertir.setText(String.format("Valor a Convertir: %.2f", valor));
        textoResultado.setText(unidadResultado);

        // Acción del botón Volver
        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Vuelve a la actividad anterior
            }
        });
    }
}
