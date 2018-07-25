package com.example.meri.userslist.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.meri.userslist.R;
import com.example.meri.userslist.user.User;
import com.example.meri.userslist.holder.UserViewHolder;

import java.util.ArrayList;
import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UserViewHolder>{

    private List<User> mUsers;

    public UsersAdapter() {
        mUsers = new ArrayList<>();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_item, parent, false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = mUsers.get(position);

        holder.bind(user.getLogin());
    }


    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    public void addAll(List<User> users){
        mUsers.addAll(users);
        notifyDataSetChanged();
    }

    public void add(User user){
        mUsers.clear();
        mUsers.add(user);
        notifyDataSetChanged();
    }
}
