package br.usjt.fabricio.deswebmob.pipocaandroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class FilmesAdapter extends ArrayAdapter<Filme> {

    private List<Filme> filmes;
    private  Context context;

    public FilmesAdapter(List<Filme> filmes, Context context){
        super(context, -1, filmes);
        this.filmes = filmes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public Filme getItem(int position){
        return filmes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Filme desejado = filmes.get(position);
        TextView tituloDoItemTextView;
        TextView descricaoDoItemTextView;
        ViewHolder viewHolder;

        if (context == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            //convertView = inflater.inflate();
        }

        return super.getView(position, convertView, parent);
    }

    private class ViewHolder {
        TextView tituloDoItemTextView;
        TextView descricaoDoItemTextView;
    }
}
