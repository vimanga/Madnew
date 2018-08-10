package com.hypermart.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class HomeFragment extends Fragment implements View.OnClickListener {

    View view;
    ImageView img;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_home, container, false);
        img = (ImageView) view.findViewById(R.id.fruits);
        img.setOnClickListener(this);

        return view;

    }

    public void onClick(View view) {


        ProductFragment productFragment = new ProductFragment();
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,productFragment,"findThisFragment").addToBackStack(null).commit();
//        CustomerProductFragment customerProductFragment = new CustomerProductFragment();
//        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, customerProductFragment, "findThisFragment").addToBackStack(null).commit();


    }

}
