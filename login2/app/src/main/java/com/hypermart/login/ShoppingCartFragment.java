package com.hypermart.login;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by HP on 8/9/2018.
 */

public class ShoppingCartFragment extends Fragment implements  View.OnClickListener {


    View view;
    Button btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        view = inflater.inflate(R.layout.activity_shopping_cart, container, false);
        btn = (Button) view.findViewById(R.id.checkout);
        btn.setOnClickListener(this);

        return view;

    }

    public void onClick(View view) {

       DeliverInfoFragment deliverInfoFragment = new DeliverInfoFragment();
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,deliverInfoFragment,"findThisFragment").addToBackStack(null).commit();

    }


    }
