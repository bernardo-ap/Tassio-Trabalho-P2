package com.example.tassio_trabalho_p2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        String title = getIntent().getStringExtra("news_title");
        String description = getIntent().getStringExtra("news_description");
        int imageResId = getIntent().getIntExtra("news_image", 0);

        TextView titleTextView = findViewById(R.id.detailTitle);
        TextView descriptionTextView = findViewById(R.id.detailDescription);
        ImageView imageView = findViewById(R.id.detailImage);
        ImageView logoImageView = findViewById(R.id.logoImageView);

        titleTextView.setText(title);
        descriptionTextView.setText(description);
        imageView.setImageResource(imageResId);

        logoImageView.setOnClickListener(v -> {

            Intent intent = new Intent(NewsDetailActivity.this, ListActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}
