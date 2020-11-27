package com.example.spiceful;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Credit#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Credit extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Credit() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Credit.
     */
    // TODO: Rename and change types and number of parameters
    public static Credit newInstance(String param1, String param2) {
        Credit fragment = new Credit();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_credit, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycle);
        ArrayList<Term> terms = new ArrayList<>();
        terms.add(new Term("Picture of Butter Chicken", "Photo by:- The Endless Meal\n https://www.instagram.com/theendlessmeal/"));
        terms.add(new Term("Picture of Chicken Biryani","Photo by:- Kitchen Sanctuary\n https://www.instagram.com/kitchensanctuary/"));
        terms.add(new Term("Picture of Kadhai Chicken","Photo by:- Farha Ambreen\n https://www.instagram.com/fariamby/"));
        terms.add(new Term("Picture of Aloo Matar Curry","Photo by:- Udai Sareen\n https://www.instagram.com/tasteofculturesindia/"));
        terms.add(new Term("Picture of Matar Paneer Curry","Photo by:- Ujawal's Kitchen/Food\n https://www.instagram.com/ujawalskitchen/"));
        terms.add(new Term("Picture of Bhindi Massala","Photo by:- Krishie’s eat\n https://www.instagram.com/foodcheersforever/"));
        terms.add(new Term("Picture of Paneer Bhurji","Photo by:- Sumedh Kanade | Food Blogger \n https://www.instagram.com/gourmetmusafir/"));

        //layout manager
//        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //adaptor
        recyclerView.setAdapter(new CustomRecyclerViewAdapter(terms));
        return view;
    }
}