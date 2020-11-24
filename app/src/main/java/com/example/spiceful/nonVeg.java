package com.example.spiceful;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link nonVeg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class nonVeg extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    TextView description;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public nonVeg() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment nonVeg.
     */
    // TODO: Rename and change types and number of parameters
    public static nonVeg newInstance(String param1, String param2) {
        nonVeg fragment = new nonVeg();
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

        View view= inflater.inflate(R.layout.fragment_non_veg, container, false);

        final ListView nonVegListView = view.findViewById(R.id.nonVegListView);
        description = view.findViewById(R.id.nonVegDescriptions);


        ArrayList<ListViewItem> dataTypeItemArrayList = new ArrayList<>();
        dataTypeItemArrayList.add(new ListViewItem("Aloo Matar Curry","Ingredients: "));

        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(),R.layout.list,dataTypeItemArrayList);
        nonVegListView.setAdapter(arrayAdapter);

        nonVegListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                description.setText(((ListViewItem)nonVegListView.getItemAtPosition(position)).getDescription());
            }
        });

        CustomViewPagerAdapter adapter = new CustomViewPagerAdapter(getChildFragmentManager());
        ViewPager viewPager = view.findViewById(R.id.novegPhotos);
        viewPager.setAdapter(adapter);
        return view;
    }
    public static class CustomViewPagerAdapter extends FragmentPagerAdapter {

        public CustomViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return non_veg_contentFragment.newInstance(R.drawable.dal,"Aloo Matar Curry");
                case 1: return non_veg_contentFragment.newInstance(R.drawable.ic_baseline_map_24,"Matar Paneer Curry");
                case 2: return non_veg_contentFragment.newInstance(R.drawable.ic_baseline_map_24,"Bhindi Massala");
                case 3: return non_veg_contentFragment.newInstance(R.drawable.ic_baseline_map_24,"Paneer Bhurji");

                default: return non_veg_contentFragment.newInstance(R.drawable.facebook,"Mutter Paneer Curry");

            }
        }
        @Override
        public int getCount() {
            return 4;
        }
    }
}

