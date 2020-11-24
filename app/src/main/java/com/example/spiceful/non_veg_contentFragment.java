package com.example.spiceful;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link non_veg_contentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class non_veg_contentFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private int mParam1;
    private String mParam2;

    public non_veg_contentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment non_veg_contentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static non_veg_contentFragment newInstance(int param1, String param2) {
        non_veg_contentFragment fragment = new non_veg_contentFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_non_veg_content, container, false);

        if(mParam1 !=0) {
            ImageView imageView = view.findViewById(R.id.nonVegImage);
            imageView.setImageResource(mParam1);
        }
        if(mParam2 !=null) {
            TextView description = view.findViewById(R.id.nonVegDescription);
            description.setText(mParam2);
        }
        return view;
    }
}