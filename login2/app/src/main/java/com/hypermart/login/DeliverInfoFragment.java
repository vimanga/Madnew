package com.hypermart.login;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class DeliverInfoFragment extends Fragment implements  View.OnClickListener{

    View view;
    Button btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_delivery_info, container, false);
        btn = (Button) view.findViewById(R.id.proceed);
        btn.setOnClickListener(this);

        return view;

    }

    public void onClick(View view) {

        PaymentInfoFragment paymentInfoFragment = new PaymentInfoFragment();
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, paymentInfoFragment, "findThisFragment").addToBackStack(null).commit();

    }
}
