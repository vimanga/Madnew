package com.hypermart.login;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MyAccountFragment extends Fragment implements View.OnClickListener {
    View view;
    Button btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_my_account, container, false);
        btn = (Button) view.findViewById(R.id.editAccount);
        btn.setOnClickListener(this);

        return view;

    }

    public void onClick(View view) {

        EditAccountFragment editAccountFragment = new EditAccountFragment();
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,editAccountFragment,"findThisFragment").addToBackStack(null).commit();

    }
}

