package com.pcs.praktekcustomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MovieAdapter extends ArrayAdapter <Movie> {

    private Context nContext;
    private int nResource;

    public MovieAdapter(@NonNull Context context, int resource, @NonNull List<Movie> objects) {
        super(context, resource, objects);
        this.nContext = context;
        this.nResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String movieTitle = getItem(position).getTitle().toString();
        String movieYear = getItem(position).getYear().toString();

        LayoutInflater inflater = LayoutInflater.from(nContext);
        convertView = inflater.inflate(nResource,parent,false);

        TextView txtMovie = convertView.findViewById(R.id.txtTitle);
        TextView txtYear = convertView.findViewById(R.id.txtYear);

        txtMovie.setText(movieTitle);
        txtYear.setText(movieYear);

        return convertView;
    }
}
