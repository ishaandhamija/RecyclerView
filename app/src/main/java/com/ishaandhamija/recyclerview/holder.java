package com.ishaandhamija.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ishaandhamija on 1/9/18.
 */

public class holder extends RecyclerView.ViewHolder {

    TextView name,message;

    public holder(View itemView, Context ctx) {

        super(itemView);

        this.name=(TextView)itemView.findViewById(R.id.name);
        this.message=(TextView)itemView.findViewById(R.id.msg);

    }
}
