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
                "1) Potato                                     1/2 Kg\n"+
                "2) Peas                                        1 Cup\n"+
                "3) Onions                                     6\n"+
                "4) Tomato                                   1/4 Kg\n"+
                "5) Garlic Paste                            2 Teaspoons\n"+
                "6) Coriander Powder                1 tablespoons\n"+
                "7) Tumeric Powder                    1 Teaspoons\n"+
                "8) Garam Massala Powder      1 Teaspoons\n"+
                "9) Red Chilly Powder                 2 1/2 tablespoons\n"+
                "10)Oil                                            3 tablespoons\n"+
                "11)Coriander Leaves                As Required\n"+
                "\n"+"\n"+
                "Method:\n"+
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
        dataTypeItemArrayList.add(new ListViewItem("Matar Paneer","Ingredients: \n"+
                "1)  Green peas(Fresh)              1/2 Kg\n"+
                "2)  Paneer (Indian Cheese)     400 grams\n"+
                "3)  Tomatoes                            2\n"+
                "4)  Oil (For deep frying)           As required\n"+
                "5)  Butter                                   2 1/2 tablespoons\n"+
                "6)  Salt                                       As required\n"+
                "7)  Coriander leaves                As required\n"+
                "8)  Chiily Powder                      2 teaspoons\n"+
                "9)  Garam Massala                  1 teaspoons\n"+
                "10) Cumin Seeds                     1/2 teaspoons\n"+
                "11) Turmeric Powder              1/4 teaspoons\n"+
                "12) Cardamoms                       2\n"+
                "13) Poppy Seeds                      1 tablespoon\n"+
                "14) Cashew Nuts                     5\n"+
                "15) Onions                                2\n"+
                "16) Ginger                                1/2 inch piece\n"+
                "17) Garlic                                  6 flakes\n"+"\n"+"\n"+
                "Method:\n"+
                "1) Boil peas and keep aside.\n"+
                "2) Cut paneer into pieces and deep fry.\n"+
                "3) Keep it aside, plunged in warm water.\n"+
                "4) Grind the massala.\n"+
                "5) Heat oil in a frying pan, add ground paste and fry till oil separates.\n"+
                "6) Add boilded peas and chopped tomatoes, enough water and salt.\n"+
                "7) Boil till gravy thickens, mix fired paneer and a little beaten cream.\n"+
                "8) Garnish with coriander leaves.\n"+
                "9) Serve hot accompanied with cut onions and lime to tandoori naan or flat bread.\n"));
        dataTypeItemArrayList.add(new ListViewItem("Bhindi Massala","Ingredients: \n"+
                "1) Okra                                     1/2 Kg\n"+
                "2) Green chillies                      3\n"+
                "3) Red chilly powder              1 1/2 teaspoons\n"+
                "4) Salt                                       As required\n"+
                "5) Coriander powder              2 teaspoons\n"+
                "6) Jeera powder                     1/2 teaspoon\n"+
                "7) Sugar                                   1 teaspoon\n"+
                "8) Tomato                                1\n"+
                "9) Curd                                     2 Cups\n"+
                "10) Garam Massala               1/2 teaspoon\n"+
                "11) Cashew nuts                    15\n"+
                "12) Onions                               4\n"+
                "13) Poppy Seeds                    1 tablespoon\n"+
                "14) Oil (For deep frying)        As required\n\n\n"+
                "Method:\n"+
                "1) Cut ladies finger into 1 1/2 inch length pieces.\n"+
                "2) Deep fry in hot oil till light brown. (Do not over fry since it may become crisp).\n"+
                "3) Dice onions and tomatoes into 1 inch pieces.\n"+
                "4) Slit green chillies vertically.\n"+
                "5) Dry roast poppy and cashew nuts separately.\n"+
                "6) Fry onions till transparent in little oil.\n"+
                "7) Grind these onions with roasted Ingredients: to smooth paste.\n"+
                "8) Heat oil in fry in pan, tamper aniseeds or cumin seeds with little fenugreek seeds.\n"+
                "9) Put slit chillies and ground massala.\n"+
                "10) Stir constantly in medium flame till golden brown in colour.\n"+
                "11) Add sugar, salt, chilly powder, dhania, jeera powder and continue frying till oil seprates.\n"+
                "12) To this mix strained and whipped curds and continue frying till oil floats on top.\n"+
                "13) Add cut tomatoes and ladies finger.\n"+
                "14) Allow it to boil for a few minutrs.\n"+
                "15) Serve hot.\n"));
        dataTypeItemArrayList.add(new ListViewItem("Paneer Bhurji","Ingredients: \n"+
                "1) Paneer (Indian Cheese)     400 grams\n"+
                "2) Onion                                    1 (Chopped)\n"+
                "3) Tomato                                 1 (Finely chopped)\n"+
                "4) Ginger garlic paste             1 teaspoon\n"+
                "5) Green chilli                           1 (Chopped)\n"+
                "6) Tumeric powder                  1/4 teaspoon\n"+
                "7) Chilli powder                        1 teaspoon\n"+
                "8) Garam Massala                   1/4 teaspoon\n"+
                "9) Kasuri methi                         1 teaspoon\n"+
                "10) Salt                                      To taste\n"+
                "11) Coriander leaves               2 Stalks (Finely chopped)\n"+
                "12) Oil                                        1 tablespoon \n"+
                "13) Cumin seeds                     1 teaspoon\n\n\n"+
                "Method:\n"+
                "1) Crumble up the paneer in a bowl. If you are making homemade paneer, after draining the liquid, keep it ready.\n"+
                "2) Heat oil in a kadai,, pop cumin seeds. Add the chopped onions, green chilli and saute till it becomes golden brown.\n"+
                "3) Add ginger garlic paster followed by chopped tomatoes. Cook till the tomatoes are totally mashed up.\n"+
                "4) Add the turmic powder, red chilli powder, required salt and garam massala. Reduce the flame and cook for 1-2 minutes.\n"+
                "5) Now add the crumbled paneer and gently mix together.\n"+
                "6) Once the paneer is well mixed, add crushed kasuri methi. Cook for couple for minutes and switch off. Do not cook it longer.\n"+
                "7) Finally add chopped coriander leaves and serve.\n"));


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
