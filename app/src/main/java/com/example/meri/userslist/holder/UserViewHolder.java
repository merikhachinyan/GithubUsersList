package com.example.meri.userslist.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.meri.userslist.R;

public class UserViewHolder extends RecyclerView.ViewHolder{

    private TextView mUser;

    public UserViewHolder(View itemView) {
        super(itemView);

        mUser = itemView.findViewById(R.id.user_login);
    }

    public void bind(String login){
        mUser.setText(login);
    }
}
