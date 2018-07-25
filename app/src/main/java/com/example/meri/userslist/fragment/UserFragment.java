package com.example.meri.userslist.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.meri.userslist.R;
import com.example.meri.userslist.user.User;
import com.example.meri.userslist.adapter.UsersAdapter;

public class UserFragment extends Fragment {

    public static final String USER = "User";

    public UserFragment() {
    }

    public static UserFragment newInstance(User user){
        UserFragment userFragment = new UserFragment();

        Bundle args = new Bundle();
        args.putSerializable(USER, user);
        userFragment.setArguments(args);

        return userFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        init(view);
    }

    private void init(View view){
        RecyclerView recyclerView = view.findViewById(R.id.item_user_fragment_recycler_view);
        final LinearLayoutManager manager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),
                DividerItemDecoration.VERTICAL));

        UsersAdapter adapter = new UsersAdapter();
        recyclerView.setAdapter(adapter);

        User user = (User) getArguments().getSerializable(USER);
        adapter.add(user);
    }
}
