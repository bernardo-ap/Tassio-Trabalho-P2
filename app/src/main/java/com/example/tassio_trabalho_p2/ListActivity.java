package com.example.tassio_trabalho_p2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        ListView newsListView = findViewById(R.id.newsListView);
        ImageView logoImageView = findViewById(R.id.logoImageView);

        List<News> newsList = new ArrayList<>();
        newsList.add(new News("Tecnologia 5G Chega a Mais 50 Cidades no Brasil",
                "Descrição breve da notícia sobre 5G.",
                R.drawable.imagem_internet));

        newsList.add(new News("Novo Lançamento da SpaceX: Foguete Bate Recorde de Velocidade",
                "Descrição breve da notícia sobre SpaceX.",
                R.drawable.foguete_space_x));

        newsList.add(new News("Inteligência Artificial Está Mudando o Mercado Financeiro",
                "Descrição breve da notícia sobre IA.",
                R.drawable.ia_imagem));

        newsList.add(new News("Criptomoedas Em Alta: Bitcoin Supera os 40 Mil Dólares",
                "Descrição breve da notícia sobre Bitcoin.",
                R.drawable.bitcoin_imagem));

        NewsAdapter adapter = new NewsAdapter(this, newsList);
        newsListView.setAdapter(adapter);

        logoImageView.setOnClickListener(v -> {
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
