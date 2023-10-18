package com.geeks.emil_maldybaev_hw3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactsViewHolder> {

    private ArrayList<String> contactNameList;

    public ContactAdapter(ArrayList<String> contactNameList) {
        this.contactNameList = contactNameList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactsViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_contacts, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {//передача данных
        holder.onBind(contactNameList.get(position));
    }

    @Override
    public int getItemCount() {
        return contactNameList.size();
    }
}
