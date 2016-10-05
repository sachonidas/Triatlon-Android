package sachonidas.halfrioja;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgLogo;
    private ImageButton btnRecorridos, btnBienvenida, btnContacto, btnLogroTurismo, btnRiojaTurismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgLogo = (ImageView)findViewById(R.id.imgLogo);
        btnBienvenida = (ImageButton)findViewById(R.id.imageButton);
        btnRecorridos = (ImageButton)findViewById(R.id.imageButton2);
        btnContacto = (ImageButton)findViewById(R.id.imageButton6);
        btnLogroTurismo = (ImageButton)findViewById(R.id.imageButton4);
        btnRiojaTurismo = (ImageButton)findViewById(R.id.imageButton5);


        imgLogo.setImageResource(R.drawable.logook);

        btnBienvenida.setImageResource(R.drawable.info);
        btnRecorridos.setImageResource(R.drawable.recorridos);
        btnContacto.setImageResource(R.drawable.contacticon);
        //btnContacto.setImageIcon(R.drawable.contacticon);

        btnLogroTurismo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.xn--logroo-0wa.es/wps/portal/web/inicio/laCiudad/turismo/!ut/p/c5/04_SB8K8xLLM9MSSzPy8xBz9CP0os3hTF98Af293QwMDDwsLA09H42AjNx9_A2dfI6B8pFm8AQ7gaICi29_PyAWo2yjQ0jfM38jE1AyiG488frvDQa41iw80Nw0Fq7DwsXQ18AwJDDZ0dgwwMDA1h8jjcZ2fR35uqn5BbmiEQZaJIgCJw-vv/dl3/d3/L2dJQSEvUUt3QS9ZQnZ3LzZfNURNUE9LRzEwT04yRDBJQTJROU1WTzJDNDQ!/?WCM_GLOBAL_CONTEXT=/web_es/logrono/secciones/ciudad/turismo/Turismo"));
                startActivity(intent);
            }
        });
        btnRiojaTurismo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://lariojaturismo.com/comunidad/larioja"));
                startActivity(intent);
            }
        });



    }

    public void onClickBienvenida(View view){

        Intent intent = new Intent(MainActivity.this, BienvenidaActivity.class);
        startActivity(intent);

    }

    public void lanzaRecorridos(View view){
        Intent intent = new Intent(MainActivity.this, RecorridosActivity.class);
        startActivity(intent);

    }

    public void lanzaContacto(View view){
        Intent intent = new Intent(MainActivity.this, ContactoActivity.class);
        startActivity(intent);

    }

    public void lanzaMapa(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

}
