package com.example.tugas4_prak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SepatuAdapter extends RecyclerView.Adapter<SepatuAdapter.SepatuViewHolder>{
    private ArrayList<Sepatu> dataList;
    public SepatuAdapter(ArrayList<Sepatu> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public SepatuAdapter.SepatuViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemsepatu, parent, false);
        return new SepatuViewHolder(view);
    }

    public void onBindViewHolder(SepatuViewHolder holder, int position) {
        holder.Logo.setImageResource(dataList.get(position).getLogo());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtUkuran.setText(dataList.get(position).getUkuran());
        holder.txtCodeproduksi.setText(dataList.get(position).getCodeproduksi());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class SepatuViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtCodeproduksi, txtUkuran;
        private ImageView Logo;
        public SepatuViewHolder(View itemView) {
            super(itemView);
            Logo = (ImageView)
                    itemView.findViewById(R.id.img_logo);
            txtNama = (TextView)
                    itemView.findViewById(R.id.txt_nama);
            txtUkuran = (TextView)
                    itemView.findViewById(R.id.txt_ukuran);
            txtCodeproduksi = (TextView)
                    itemView.findViewById(R.id.txt_codeproduksi);
        }
    }
}
