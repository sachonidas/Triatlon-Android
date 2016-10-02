package sachonidas.halfrioja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ContactoActivity extends AppCompatActivity {

    private ImageView imgWeb, imgFacebook, imgTwitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        imgWeb = (ImageView)findViewById(R.id.imgWeb);
        imgFacebook = (ImageView)findViewById(R.id.imgFacebook);
        imgTwitter = (ImageView)findViewById(R.id.imgTwitter);

        imgWeb.setImageResource(R.drawable.web);
        imgFacebook.setImageResource(R.drawable.facebook);
        imgTwitter.setImageResource(R.drawable.twitter);

    }

    public void onClicLanzaInicio(View view){

        Intent intent = new Intent(ContactoActivity.this, MainActivity.class);
        startActivity(intent);
    }

}
