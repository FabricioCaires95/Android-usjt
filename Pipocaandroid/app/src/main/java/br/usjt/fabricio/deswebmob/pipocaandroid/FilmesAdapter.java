package br.usjt.fabricio.deswebmob.pipocaandroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Fabricio Caires
 * 816155552
 */
public class FilmesAdapter extends ArrayAdapter<Filme> {

    public FilmesAdapter(Context context, List<Filme> cast ){
        super(context,-1,cast);
    }

    private  static class ViewHolder{
        ImageView filmeImage;
        TextView titulo;
        TextView diretor;
        TextView dataLancamento;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,
                        @NonNull ViewGroup parent){
        Filme filme = getItem(position);
        View raiz = null;
        ViewHolder viewHolder = null;
        Context context = getContext();
        if(convertView==null){
            LayoutInflater inflater = LayoutInflater.from(context);
            raiz = inflater.inflate(R.layout.activity_item_filme,parent,false);
            viewHolder = new ViewHolder();
            raiz.setTag(viewHolder);
            viewHolder.filmeImage = raiz.findViewById(R.id.conditionImageView);
            viewHolder.titulo = raiz.findViewById(R.id.txtTitulo);
            viewHolder.diretor = raiz.findViewById(R.id.txtDirecao);
            viewHolder.dataLancamento = raiz.findViewById(R.id.txtData);
        }
        else{
            raiz = convertView;
            viewHolder = (ViewHolder) raiz.getTag();
        }
        viewHolder.titulo.setText(filme.getTitulo());
        viewHolder.diretor.setText(filme.getDirecao());
        viewHolder.dataLancamento.setText(filme.getAnoLancamento().toString());
        return  raiz;
    }


}
