package sachonidas.halfrioja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

public class BiciActivity extends AppCompatActivity {

    private ListView lstBici;
    private Spinner sp1;
    private ImageView imgSecBici, imgPerfilBici;
    private String[] pasosBici = {
            "	Av. de la Playa, 4, 26009 Logroño, La Rioja, España",
            "	Dirígete al este por Av. de la Playa hacia Paseo Fermín Manso de Zuñiga	329 m",
            "	Continúa por Calle Concepción Arenal.	124 m",
            "	Gira a la izquierda hacia Calle San Ignacio de Loyola	469 m",
            "	En la rotonda, toma la tercera salida en dirección Av. de la Sonsierra/N-232ª 	458 m",
            "	En la rotonda, toma la segunda salida	443 m",
            "	Continúa por Puente de Sagasta.	503 m",
            "	En la rotonda, toma la tercera salida en dirección Calle Gral. Urrutia	523 m",
            "	Gira a la derecha hacia Calle Carmen Medrano	153 m",
            "	Gira a la derecha	120 m",
            "	Gira a la izquierda hacia Calle Carmen Medrano	312 m",
            "	Gira ligeramente a la derecha hacia Calle Carmen Medrano	158 m",
            "	Gira a la izquierda en Travesía San Lázaro	14 m",
            "	Gira a la derecha hacia Calle Carmen Medrano	317 m",
            "	En rotonda, toma segunda salida en dirección Calle Duques de Nájera y Pasa 2 rotondas	1,25 km",
            "	Gira a la derecha hacia Av. República Argentina y Pasa una rotonda		469 m",
            "	En rotonda, toma la segunda salida en dirección Av. de la Sierra y Pasa una rotonda		608 m",
            "	En la rotonda, toma la segunda salida en dirección Calle Sequoias 	302 m",
            "	En la rotonda, toma la primera salida en dirección Av. de Madrid 		2,36 km",
            "	Gira a la derecha hacia Av. de San Marcial	400 m",
            "	Gira ligeramente a la izquierda hacia Calle Eduardo G. Gallarza	228 m",
            "	Continúa por Av. de Entrena.	265 m",
            "	Continúa por LR-254.	7,26 km",
            "	Gira a la derecha hacia Av. Santa Ana	299 m",
            "	Mantente a la derecha para continuar por Calle Velilla	1,30 km",
            "	En la rotonda, toma la segunda salida en dirección LR-444	2,09 km",
            "	Gira a la izquierda hacia Calle Barrera/LR-444Continúa hacia LR-444	94 m",
            "	Mantente a la derecha para continuar por Plaza Iglesia/LR-444",
            "	Continúa hacia LR-444		268 m",
            "	Gira a la derecha hacia LR-341	4,47 km",
            "	Gira a la izquierda hacia Ctra. Sotés/LR-341Continúa hacia LR-341	5,24 km",
            "	En la rotonda, toma la tercera salida en dirección N-120ª	7,04 km",
            "	Gira a la derecha hacia Ctra. de Logroño/N-120aContinúa hacia N-120ª	5,19 km",
            "	En la rotonda, toma la segunda salida	221 m",
            "	En la rotonda, toma la primera salida en dirección LR-313	230 m",
            "	En la rotonda, toma la tercera salida en dirección Carr. de Logroño/N-120	3,73 km",
            "	En la rotonda, toma la segunda salida y continúa por Carr. de Logroño/N-120	2,59 km",
            "	Entra en la rotonda	161 m",
            "	LR-207, 26324 Hervías, La Rioja, España Y VUELTA POR EL MISMO RECORRIDO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bici);

        sp1 = (Spinner)findViewById(R.id.sp1);
        ArrayAdapter adapter2 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, pasosBici);
        sp1.setAdapter(adapter2);

        imgSecBici = (ImageView)findViewById(R.id.imgSecBici);

        imgSecBici.setImageResource(R.drawable.perfilbici);

    }

    public void onClicLanzaInicio(View view){

        Intent intent = new Intent(BiciActivity.this, MainActivity.class);
        startActivity(intent);
    }

}
