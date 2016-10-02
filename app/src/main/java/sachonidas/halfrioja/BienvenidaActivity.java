package sachonidas.halfrioja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BienvenidaActivity extends AppCompatActivity {

    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        btnVolver = (Button)findViewById(R.id.btnInicio);
    }

    public void onClicLanzaInicio(View view){

        Intent intent = new Intent(BienvenidaActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
