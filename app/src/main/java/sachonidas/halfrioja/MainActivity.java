package sachonidas.halfrioja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgLogo;
    private ImageButton btnRecorridos, btnBienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgLogo = (ImageView)findViewById(R.id.imgLogo);
        btnBienvenida = (ImageButton)findViewById(R.id.imageButton);
        btnRecorridos = (ImageButton)findViewById(R.id.imageButton2);

        imgLogo.setImageResource(R.drawable.logook);

        btnBienvenida.setImageResource(R.drawable.info);
        btnRecorridos.setImageResource(R.drawable.recorridos);

    }

    public void onClickBienvenida(View view){

        Intent intent = new Intent(MainActivity.this, BienvenidaActivity.class);
        startActivity(intent);

    }

    public void lanzaRecorridos(View view){
        Intent intent = new Intent(MainActivity.this, RecorridosActivity.class);
        startActivity(intent);

    }
}
