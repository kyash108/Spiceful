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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link veg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class veg extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    TextView description;

    public veg() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment veg.
     */
    // TODO: Rename and change types and number of parameters
    public static veg newInstance(String param1, String param2) {
        veg fragment = new veg();
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
        View view= inflater.inflate(R.layout.fragment_veg, container, false);

        final ListView listView = view.findViewById(R.id.vegListView);
        description = view.findViewById(R.id.vegDescription);
        ArrayList<ListViewItem> dataTypeItemArrayList = new ArrayList<>();
        dataTypeItemArrayList.add(new ListViewItem("Aloo Matar","Ingredients: \n" +
                "1)Potato                                     1/2 Kg\n"+
                "2)Peas                                        1 Cup\n"+
                "3)Onions                                     6\n"+
                "4)Tomato                                   1/4 Kg\n"+
                "5)Ginger Garlic Paste               2 Teaspoons\n"+
                "6)Corriander Powder                1 TableSpoons\n"+
                "7)Tumeric Powder                    1 Teaspoons\n"+
                "8)Garam Massala Powder      1 Teaspoons\n"+
                "9)Red Chilly Powder                 2 1/2 TableSpoons\n"+
                "10)Oil                                           3 TableSpoons\n"+
                "11)Corriander Leaves               1 TableSpoons\n"+
                "\n"+"\n"+
                "Method\n"+
                "1) Cut onions into big pieces and grind to a coarse paste. \n"+
                "2) Chop the tomatoes finely.\n"+
                "3) Boil potatoes in pressure cooker. \n"+
                "4) Peel and dice them. \n"+
                "5) Cook peas and keep aside.\n"+
                "6) Heat oil in a frying pan, season with jeera or aniseed, fry the ginger-garlic paste for a minute.\n"+
                "7) Add onion paster and fry till it turns golden brown in colour. \n"+
                "8) Add chopped tomatoes and fry for fre muinutes.\n"+
                "9) When the tomatoes become soft, add corriander powder, tumeric powder, garam massala, sald and chilly powder.\n"+
                "10) Fry till oil seprates from the massala.\n"+
                "11) Pour enought water along with boilder peas and potatoes.\n"+
                "12) Cook till the gravy becomes thick.\n"+
                "13) Serve hot, garnished with corriander leaves\n"));
        dataTypeItemArrayList.add(new ListViewItem("Matar Paneer","description 2"));
        dataTypeItemArrayList.add(new ListViewItem("Bhindi Massala","description 2"));
        dataTypeItemArrayList.add(new ListViewItem("Paneer Bhurji","description 2"));


        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(),R.layout.list,dataTypeItemArrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                description.setText(((ListViewItem)listView.getItemAtPosition(position)).getDescription());
            }
        });


        CustomViewPagerAdapter adapter = new CustomViewPagerAdapter(getChildFragmentManager());
        ViewPager viewPager = view.findViewById(R.id.photos);
        viewPager.setAdapter(adapter);
        return view;
    }

    public class CustomViewPagerAdapter extends FragmentPagerAdapter {

        public CustomViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return vegContentFragment.newInstance(R.drawable.dal,"Aloo Matar");
                case 1: return vegContentFragment.newInstance(R.drawable.ic_baseline_map_24,"Matar Paneer");
                case 2: return vegContentFragment.newInstance(R.drawable.ic_baseline_map_24,"Bhindi Massala");
                case 3: return vegContentFragment.newInstance(R.drawable.ic_baseline_map_24,"Paneer Bhurji");

                default: return vegContentFragment.newInstance(R.drawable.facebook,"Mutter Paneer");

            }
        }


        @Override
        public int getCount() {
            return 2;
        }
    }
}
