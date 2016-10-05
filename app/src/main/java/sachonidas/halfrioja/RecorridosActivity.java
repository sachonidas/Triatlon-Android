package sachonidas.halfrioja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RecorridosActivity extends AppCompatActivity {

    private ImageButton imgNatacion, imgBici, imgCorrer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recorridos);

        imgNatacion = (ImageButton)findViewById(R.id.imgNatacion);
        imgBici = (ImageButton)findViewById(R.id.imgBici);
        imgCorrer = (ImageButton)findViewById(R.id.imgCorrer);

        imgNatacion.setImageResource(R.drawable.swimmer);
        imgBici.setImageResource(R.drawable.bici);
        imgCorrer.setImageResource(R.drawable.correr);
    }

    public void lanzaNatacion(View view){
        Intent natacion = new Intent(RecorridosActivity.this, NatacionActivity.class);
        startActivity(natacion);
    }

    public void lanzaBici(View view){
        Intent bici = new Intent(RecorridosActivity.this, BiciActivity.class);
        startActivity(bici);
    }

    public void lanzaCorrer(View view){
        Intent correr = new Intent(RecorridosActivity.this, CorrerActivity.class);
        startActivity(correr);
    }
}
