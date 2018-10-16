package br.usjt.fabricio.deswebmob.pipocaandroid;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.support.v7.widget.Toolbar;
//import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerGenero;
    public static final String CHAVE = "br.usjt.fabricio.deswebmob.pipocaandroid.txtGenero";
    String genero = "Todos";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerGenero = (Spinner)findViewById(R.id.spinnerGenero);
        spinnerGenero.setOnItemSelectedListener(new GeneroSelecionado());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ListarFilmesActivity.class);

                intent.putExtra(CHAVE, genero);
                startActivity(intent);
            }
        });
    }

    private class GeneroSelecionado implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            genero = (String) parent.getItemAtPosition(position);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
