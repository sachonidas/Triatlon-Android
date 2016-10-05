package sachonidas.halfrioja;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class ContactoActivity extends AppCompatActivity {

    private ImageView imgWeb, imgFacebook, imgTwitter;
    private EditText  etAsunto, etEmail, etMensaje;
    private Button btnEnviar;
    String[] TO = {"lsachaabazan@gmail.com "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        imgWeb = (ImageView)findViewById(R.id.imgWeb);
        imgFacebook = (ImageView)findViewById(R.id.imgFacebook);
        imgTwitter = (ImageView)findViewById(R.id.imgTwitter);

        etAsunto = (EditText) findViewById(R.id.etAsunto);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etMensaje = (EditText) findViewById(R.id.etMensaje);

        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        imgWeb.setImageResource(R.drawable.web);
        imgFacebook.setImageResource(R.drawable.facebook);
        imgTwitter.setImageResource(R.drawable.twitter);

        imgWeb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://riojatriatlon.com/"));
                startActivity(intent);
            }
        });
        imgTwitter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/Rioja_Triatlon?lang=es"));
                startActivity(intent);
            }
        });
        imgFacebook.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/rioja.triatlon?fref=ts"));
                startActivity(intent);
            }
        });

    }

    public void onClicLanzaInicio(View view){

        Intent intent = new Intent(ContactoActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void envioFormulario(View view){

        String asunto = etAsunto.getText().toString();
        String email = etEmail.getText().toString();
        String mensaje = etMensaje.getText().toString();


        Intent itSend = new Intent(Intent.ACTION_SEND);
        itSend.setType("text/html");
        itSend.putExtra(Intent.EXTRA_EMAIL, TO);
        itSend.putExtra(Intent.EXTRA_CC, email);
        itSend.putExtra(Intent.EXTRA_SUBJECT, asunto);
        itSend.putExtra(Intent.EXTRA_TEXT, mensaje);

        try {
            startActivity(itSend);
            finish();
            Log.e("Finished" , "seing email...");
            Toast.makeText(ContactoActivity.this,
                    "Mensaje enviado!!", Toast.LENGTH_SHORT).show();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(ContactoActivity.this,
                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
        //startActivity(itSend);
    }

}
