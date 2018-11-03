package com.example.gema.androidroomgojek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gema.androidroomgojek.ListHistoryModel;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListHistoryAdapter extends RecyclerView.Adapter<ListHistoryAdapter.MyViewHolder> {
    Context context;
    ArrayList<ListHistoryModel> listOrder = new ArrayList<>();

    //constructor
    public ListHistoryAdapter(Context context, ArrayList<ListHistoryModel> listOrder) {
        this.context = context;
        this.listOrder = listOrder;
    }

    //mengatur layout item
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_item, parent, false);

        return new MyViewHolder(view);
    }

    //set data
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.item_status_order.setText(listOrder.get(position).getStatusOrder());
        holder.item_time_order.setText(listOrder.get(position).getTimeOrder());
        holder.item_location_order.setText(listOrder.get(position).getLocationOrder());
        holder.item_status_image.setImageResource(listOrder.get(position).getImageOrder());
    }

    //hitung jumlah list
    @Override
    public int getItemCount() {
        return listOrder.size();
    }

    //inisialisasi komponen di dalam item
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView item_status_order, item_time_order, item_location_order;
        ImageView item_status_image;

        public MyViewHolder(View itemView) {
            super(itemView);
            item_status_order = itemView.findViewById(R.id.item_status_order);
            item_time_order = itemView.findViewById(R.id.item_time_order);
            item_location_order = itemView.findViewById(R.id.item_location_order);
            item_status_image = itemView.findViewById(R.id.item_status_image);
        }
    }

    //extend
}
