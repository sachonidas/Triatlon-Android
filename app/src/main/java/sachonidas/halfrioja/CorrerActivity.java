package sachonidas.halfrioja;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CorrerActivity extends AppCompatActivity {

    private ImageView imgCorrer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correr);

        imgCorrer = (ImageView)findViewById(R.id.imgCorrer);

        imgCorrer.setImageResource(R.drawable.seccor);
    }

    public void onClicLanzaInicio(View view){

        Intent intent = new Intent(CorrerActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
