package com.example.umar.servicefinderapp.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.umar.servicefinderapp.Models.Technician;
import com.example.umar.servicefinderapp.R;

import java.util.List;

/**
 * Created by umar on 12/3/2018.
 */

public class TechnicianListViewHolder extends RecyclerView.Adapter<TechnicianListViewHolder.ViewHolder>{

    List<Technician> users;

    public TechnicianListViewHolder(List<Technician> users) {
        this.users = users;
    }

    @Override
        public TechnicianListViewHolder.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item, parent, false);
            ViewHolder ev = new ViewHolder(view);
            return ev;
            //return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(TechnicianListViewHolder.ViewHolder holder, int position) {

            holder.image.setImageResource(Integer.parseInt(users.get(position).getImage()));
            holder.name.setText(users.get(position).getName());
        }

        @Override
        public int getItemCount() {
            return users.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView name;
            ImageView image;

            public ViewHolder(View itemView) {
                super(itemView);

                image = itemView.findViewById(R.id.category_item1_pic);
                name = itemView.findViewById(R.id.category_item1_name);

            }
        }
    }






    /*







    public TextView name;
    public ImageView image;
    private AdapterView.OnItemClickListener itemClickListener;
/*
    public void setItemClickListener(AdapterView.OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public TechnicianListViewHolder(View itemView) {
        super(itemView);
        //name= itemView.findViewsById(R.id.category_item1_name);
        //image= itemView.findViewsById(R.id.category_item1_pic);
    }

    @Override
    public void onClick(View view) {

    }
}
*/