package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<NewsClass> {

    private static final String TEE = "T";

        public NewsAdapter(Context context, ArrayList<NewsClass> news) {
            // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
            // the second argument is used when the ArrayAdapter is populating a single TextView.
            // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
            // going to use this second argument, so it can be any value. Here, we used 0.
            super(context, 0, news);

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            View listItemView = convertView;

            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.single_news_item_layout, parent, false);

            }

            NewsClass currentPosition = getItem(position);

            TextView newsTitleTextView = (TextView) listItemView.findViewById(R.id.news_title);
            newsTitleTextView.setText(currentPosition.getNewsTitle());

            TextView newsSectionTextView = (TextView) listItemView.findViewById(R.id.news_section);
            newsSectionTextView.setText(currentPosition.getSectionName());

            String toSplit = currentPosition.getNewsDate();
            String dateExtract = "";

            if (toSplit.contains(TEE)) {
                String[] parts = toSplit.split(TEE);
                dateExtract = parts[0];
            }
            TextView newsDateTextView = (TextView) listItemView.findViewById(R.id.news_date);
            newsDateTextView.setText(dateExtract);

            return listItemView;

        }

}
