package com.getbyte.prueba;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VPAdapter extends RecyclerView.Adapter<VPAdapter.ViewHolder> {
    ArrayList<ViewPagerItem> viewPagerItemArrayList;

    public VPAdapter(ArrayList<ViewPagerItem> viewPagerItemArrayList) {
        this.viewPagerItemArrayList = viewPagerItemArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VPAdapter.ViewHolder holder, int position) {
        ViewPagerItem viewPagerItem = viewPagerItemArrayList.get(position);

        holder.imagen.setImageResource(viewPagerItem.imageID);
        holder.tvMotivo.setText(viewPagerItem.tvMotivo);
        holder.tvTiempo.setText(viewPagerItem.tvTiempo);
    }

    @Override
    public int getItemCount() {return viewPagerItemArrayList.size();}
    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imagen;
        TextView tvMotivo, tvTiempo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagen = itemView.findViewById(R.id.perfil_imagen);
            tvMotivo = itemView.findViewById(R.id.motivo);
            tvTiempo = itemView.findViewById(R.id.tiempo);
        }
    }
}
