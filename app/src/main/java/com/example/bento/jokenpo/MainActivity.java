package com.example.bento.jokenpo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    int placarJogador = 0;
    int placarComputador = 0;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
    public void jogar(View view){
        setContentView(R.layout.telainicial);
    }
    public void pedra(View view) {
        int escolhaComputador = (int) (Math.random() * 3) + 1;

        if (escolhaComputador == 1) {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.p_pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.c_pedra);

            Toast.makeText(
                    MainActivity.this,
                    "Ops, deu empate!",
                    Toast.LENGTH_SHORT
            ).show();
        } else if (escolhaComputador == 2) {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.p_pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.c_papel);

            placarComputador++;
            TextView pontos = (TextView) findViewById(R.id.placarComputador);
            pontos.setText(String.valueOf(this.placarComputador));

        } else if (escolhaComputador == 3) {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.p_pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.c_tesoura);

            placarJogador++;
            TextView pontos = (TextView) findViewById(R.id.placarJogador);
            pontos.setText(String.valueOf(this.placarJogador));
        }

    }

    public void papel(View view) {
        int escolhaComputador = (int) (Math.random() * 3) + 1;

        if (escolhaComputador == 1) {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.p_papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.c_pedra);

            placarJogador++;
            TextView pontos = (TextView) findViewById(R.id.placarJogador);
            pontos.setText(String.valueOf(this.placarJogador));

        } else if (escolhaComputador == 2) {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.p_papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.c_papel);

            Toast.makeText(
                    MainActivity.this,
                    "Ops, deu empate!",
                    Toast.LENGTH_SHORT
            ).show();

        } else if (escolhaComputador == 3) {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.p_papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.c_tesoura);

            placarComputador++;
            TextView pontos = (TextView) findViewById(R.id.placarComputador);
            pontos.setText(String.valueOf(this.placarComputador));

        }

    }

    public void tesoura(View view) {
        int escolhaComputador = (int) (Math.random() * 3) + 1;

        if (escolhaComputador == 1) {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.p_tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.c_pedra);

            placarComputador++;
            TextView pontos = (TextView) findViewById(R.id.placarComputador);
            pontos.setText(String.valueOf(this.placarComputador));


        } else if (escolhaComputador == 2) {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.p_tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.c_papel);

            placarJogador++;
            TextView pontos = (TextView) findViewById(R.id.placarJogador);
            pontos.setText(String.valueOf(this.placarJogador));

        } else if (escolhaComputador == 3) {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.p_tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.c_tesoura);

            Toast.makeText(
                    MainActivity.this,
                    "Ops, deu empate!",
                    Toast.LENGTH_SHORT
            ).show();

        }

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.bento.jokenpo/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.bento.jokenpo/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
