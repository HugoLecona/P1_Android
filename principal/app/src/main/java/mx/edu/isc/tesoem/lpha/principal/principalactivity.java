package mx.edu.isc.tesoem.lpha.principal;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import java.security.Principal;

public class principalactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principalactivity);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent cargarmenu = Intent (principalactivity.this, Menu.class);
                startActivity(cargarmenu);
            }
        })
    }
}
