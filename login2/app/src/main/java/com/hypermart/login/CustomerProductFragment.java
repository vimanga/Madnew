package com.hypermart.login;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Created by HP on 8/9/2018.
 */

public class CustomerProductFragment extends Fragment {


    View view,bn;
    Button btn1, btn2;
    int[] IMAGES = {R.drawable.apple,R.drawable.banana,R.drawable.orange,R.drawable.strawberry};
    String[] NAMES = {"Apple","Banana","Orange","Strawberry" };
    String[] DESCRIPTIONS = {"Product Details","Product Details","Product Details","Product Details"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_customer_products,container,false);



        ListView listView = (ListView)view.findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);
//        btn1 = (Button) view.findViewById(R.id.addToCart);
//        btn1.setOnClickListener(this);
//        btn2 = (Button) view.findViewById(R.id.buy);
//        btn2.setOnClickListener(this);



        return view;

    }

    class CustomAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customercustomlayout,null);

            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView textView_name = (TextView)view.findViewById(R.id.textView_name);
            TextView textView_description = (TextView)view.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTIONS[i]);

            return view;
        }

    }
//
//    public void onClick(View view) {
//
////
////        AddProductFragment addProductFragment = new AddProductFragment();
////        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,addProductFragment,"findThisFragment").addToBackStack(null).commit();
//
//
//        switch (view.getId()){
//
//            case R.id.addproducts : {
//
//                AddProductFragment addProductFragment = new AddProductFragment();
//                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,addProductFragment,"findThisFragment").addToBackStack(null).commit();
//                break;
//            }
//
//
//            case R.id.editItem :{
//                EditProductsFragment editProductsFragment = new EditProductsFragment();
//                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,editProductsFragment,"findThisFragment").addToBackStack(null).commit();
//                break;
//            }
//
//
//        }
//
//
//    }



//    public void onClick(View view) {
//
//
//        switch (view.getId()) {
//
//            case R.id.buy: {
//                DeliverInfoFragment deliverInfoFragment = new DeliverInfoFragment();
//                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, deliverInfoFragment, "findThisFragment").addToBackStack(null).commit();
//            }
//
//
//            case R.id.addToCart: {
//                ShoppingCartFragment shoppingCartFragment = new ShoppingCartFragment();
//                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, shoppingCartFragment, "findThisFragment").addToBackStack(null).commit();
//
//                break;
//            }
//
//
//        }
//    }
}

