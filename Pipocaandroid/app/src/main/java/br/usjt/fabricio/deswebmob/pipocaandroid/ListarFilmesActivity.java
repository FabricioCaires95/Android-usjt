package br.usjt.fabricio.deswebmob.pipocaandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListarFilmesActivity extends AppCompatActivity {

    public static final String FILME = "br.usjt.fabricio.deswebmob.pipocaandroid";
    Activity atividade;
    Filme filme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_filmes);

        atividade = this;
        filme = new Filme();
        Intent intent = getIntent();
        String genero = intent.getStringExtra(MainActivity.CHAVE);

        ListView listView = findViewById(R.id.lista_filmes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, filme.getListaNomes(genero));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // manda para a tela de detalhe
                Intent intent = new Intent(atividade, DetalheFilmeActivity.class);
                intent.putExtra(FILME, parent.getItemIdAtPosition(position));
                startActivity(intent);
            }

        });
    }

}
