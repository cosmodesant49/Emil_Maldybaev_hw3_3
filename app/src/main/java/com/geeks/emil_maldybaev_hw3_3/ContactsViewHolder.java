package com.geeks.emil_maldybaev_hw3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvName;                                // inicialization
    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_name);

    }
    public void onBind(String contactName){ // get information by adapter
        tvName.setText(contactName);
    }
}
