package es.ifp.conversioneurosdolares;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    protected TextView label1;
    protected TextView label2;
    protected EditText label3;
    protected TextView label4;
    protected TextView label5;
    protected Button boton1;
    protected Button boton2;
    protected String contenidoCaja3;
    protected String contenidoCaja5;
    protected float moneda;
    protected float resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciamos los componentes
        label1 = (TextView) findViewById(R.id.label1_start);
        label2 = (TextView) findViewById(R.id.label2_start);
        label3 = (EditText) findViewById(R.id.label3_start);
        label4 = (TextView) findViewById(R.id.label4_start);
        label5 = (TextView) findViewById(R.id.label5_start);
        boton1 = (Button) findViewById(R.id.boton1_start);
        boton2 = (Button) findViewById(R.id.boton2_start);

        // Conervsión euros a dolares
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contenidoCaja3 = label3.getText().toString();
                if (contenidoCaja3.equals("")) {
                    Toast.makeText(StartActivity.this, "Debe introducir una cantidad a convertir", Toast.LENGTH_SHORT).show();
                } else {
                    try {
                        moneda = Float.parseFloat(contenidoCaja3);
                        resultado = (float) (moneda * 1.21);
                        label5.setText(resultado + "$");
                        Toast.makeText(StartActivity.this, "Operación realizada correctamente", Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        Toast.makeText(StartActivity.this, "Valor erróneo, introduce un valor numérico", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contenidoCaja3 = label3.getText().toString();
                if (contenidoCaja3.equals("")) {
                    Toast.makeText(StartActivity.this, "Debe introducir una cantidad a convertir", Toast.LENGTH_SHORT).show();
                } else {
                    try {
                        moneda = Float.parseFloat(contenidoCaja3);
                        resultado = (float) (moneda / 1.21);
                        label5.setText(resultado + "€");
                        Toast.makeText(StartActivity.this, "Operación realizada correctamente", Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        Toast.makeText(StartActivity.this, "Valor erróneo, introduce un valor numérico", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}