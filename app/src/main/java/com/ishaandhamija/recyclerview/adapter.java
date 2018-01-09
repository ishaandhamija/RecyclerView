package com.ishaandhamija.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by ishaandhamija on 1/9/18.
 */

public class adapter extends RecyclerView.Adapter<holder> {

    Context context;
    ArrayList<messages> messages;

    public adapter(Context context, ArrayList<com.ishaandhamija.recyclerview.messages> messages) {
        this.context = context;
        this.messages = messages;
    }

    @Override
    public holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = li.inflate(R.layout.sample_chat, parent, false);

        return new holder(itemView, context);

    }

    @Override
    public void onBindViewHolder(holder holder, int position) {
        messages m=messages.get(position);
        holder.name.setText(m.getName());
        holder.message.setText(m.getMessagel());

    }

    @Override
    public int getItemCount() {
        return messages.size();
    }
}
