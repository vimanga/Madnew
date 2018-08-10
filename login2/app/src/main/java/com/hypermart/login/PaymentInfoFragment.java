package com.hypermart.login;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by HP on 8/10/2018.
 */

public class PaymentInfoFragment extends Fragment implements View.OnClickListener{


    View view;
    RadioButton rb1,rb2;
    RadioGroup rg;
    TextView txt;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.activity_payment_info, container, false);
        rb1 = (RadioButton) view.findViewById(R.id.cash);
        rb1.setOnClickListener(this);
        rb2 = (RadioButton) view.findViewById(R.id.card);
        rb2.setOnClickListener(this);

        rg = (RadioGroup)view.findViewById(R.id.radioGroup);

        return view;

    }

    public void onClick(View view) {

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int id = rg.getCheckedRadioButtonId();

                switch (id){

                    case R.id.card :{
                        PaymentcardFragment paymentcardFragment = new PaymentcardFragment();
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, paymentcardFragment, "findThisFragment").addToBackStack(null).commit();
                        break;
                    }


                    case R.id.cash :{
                    CashOnDeliveyFragment cashOnDeliveyFragment = new CashOnDeliveyFragment();
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,cashOnDeliveyFragment,"findThisFragment").addToBackStack(null).commit();

                        break;}


                }
            }
        });


    }
}
