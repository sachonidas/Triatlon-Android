package sachonidas.halfrioja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NatacionActivity extends AppCompatActivity {

    private ImageView imgNatacion, imgTransicion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natacion);

        imgNatacion = (ImageView)findViewById(R.id.imgSecNat);
        imgTransicion = (ImageView)findViewById(R.id.imgTransicion);

        imgNatacion.setImageResource(R.drawable.secnat);
        imgTransicion.setImageResource(R.drawable.trans);

    }

    public void onClicLanzaInicio(View view){

        Intent intent = new Intent(NatacionActivity.this, MainActivity.class);
        startActivity(intent);
    }

}
