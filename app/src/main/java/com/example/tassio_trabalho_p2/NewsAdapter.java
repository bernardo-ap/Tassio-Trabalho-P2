package com.example.tassio_trabalho_p2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, List<News> newsList) {
        super(context, 0, newsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        News news = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_content, parent, false);
        }

        TextView titleTextView = convertView.findViewById(R.id.newsTitle);
        TextView descriptionTextView = convertView.findViewById(R.id.newsDescription);
        ImageView imageView = convertView.findViewById(R.id.newsImage);

        if (news != null) {
            titleTextView.setText(news.getTitle());
            descriptionTextView.setText(news.getDescription());
            imageView.setImageResource(news.getImageResId());

            // Adicione um listener de clique
            convertView.setOnClickListener(v -> {
                // Criar uma Intent para iniciar a NewsDetailActivity
                Intent intent = new Intent(getContext(), NewsDetailActivity.class);
                intent.putExtra("news_title", news.getTitle());
                intent.putExtra("news_description", news.getDescription());
                intent.putExtra("news_image", news.getImageResId());
                getContext().startActivity(intent);
            });
        }

        return convertView;
    }

}
