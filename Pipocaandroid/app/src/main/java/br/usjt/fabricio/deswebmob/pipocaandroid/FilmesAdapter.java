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

    private List<Filme> filmes;
    private  Context context;

    public FilmesAdapter(List<Filme> filmes, Context context){
        super(context, -1, filmes);
        this.filmes = filmes;
        this.context = context;
    }

    private static class ViewHolder{
        ImageView conditionImageView;
        TextView txtTitulo;
        TextView txtId;
        TextView txtDirecao;
        TextView txtData;
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
        View principal = null;
        ViewHolder holder = null;
        Context context= getContext();

        //TextView tituloDoItemTextView;
        //TextView descricaoDoItemTextView;
        ViewHolder viewHolder;

        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            principal = inflater.inflate(R.layout.activity_item_filme, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.conditionImageView = principal.findViewById(R.id.conditionImageView);
            viewHolder.txtTitulo = principal.findViewById(R.id.txtTitulo);
            viewHolder.txtId = principal.findViewById(R.id.txtId);
            viewHolder.txtDirecao = principal.findViewById(R.id.txtDirecao);
            viewHolder.txtData = principal.findViewById(R.id.txtData);

            //convertView = inflater.inflate();
        } else {
            principal = convertView;
            viewHolder = (ViewHolder) principal.getTag();
        }

        viewHolder.txtTitulo.setText(desejado.getTitulo());
        viewHolder.txtId.setText(String.valueOf(desejado.getId()));
        viewHolder.txtDirecao.setText(desejado.getDirecao());
        viewHolder.txtData.setText(desejado.getAnoLancamento());



        return super.getView(position, convertView, parent);


    }


}
