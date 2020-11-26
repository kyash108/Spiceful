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
        dataTypeItemArrayList.add(new ListViewItem("Butter Chicken","Ingredients: \n" +
                "For the chicken marinade:\n" +
                "Boneless chicken breasts        800g\n" +
                "Plain yogurt                                 1/2 cup\n" +
                "Minced garlic                              1 1/2 tablespoons\n" +
                "Minced ginger                             1 tablespoon\n" +
                "Garam masala                            2 teaspoons\n" +
                "Tumeric                                        1 teaspoon\n" +
                "Ground cumin                             1 teaspoon\n" +
                "Red Chili Powder                        1 teaspoon\n" +
                "Salt                                               1 teaspoon\n" +
                "For the sauce:\n" +
                "olive oil                                       2 tablespoons \n" +
                "Butter                                          2 tablespoons\n" +
                "Onion (chopped)                      1 large \n" +
                "Minced garlic                            1 1/2 tablespoons\n" +
                "Minced ginger grated              1 tablespoon\n" +
                "Ground cumin                           1 1/2 teaspoons\n" +
                "Garam Massala                        1 1/2 teaspoons\n" +
                "Ground coriander                      1 teaspoon\n" +
                "Crushed tomatoes                    400 g\n" +
                "Red Chilli Powder                     1 teaspoon\n" +
                "Salt                                              1 1/4 teaspoons\n" +
                "Heavy cream                              1 cup\n" +
                "Sugar                                           1 tablespoon\n" +
                "Dried fenugreek leaves             1/2 teaspoon\n\n\n" +
                "Method:\n" +
                "1) In a bowl, combine chicken with all of the ingredients for the chicken marinade; let marinate for 30 minutes to an hour (or overnight if time allows). \n" +
                "2) Heat oil in a large skillet or pot over medium-high heat. When sizzling, add chicken pieces in batches of two or three, making sure not to crowd the pan. Fry until browned for only 3 minutes on each side. Set aside and keep warm. (You will finish cooking the chicken in the sauce.)\n" +
                "3) Heat butter or ghee in the same pan. Fry the onions until they start to sweat (about 6 minutes) while scraping up any browned bits stuck on the bottom of the pan. \n" +
                "4) Add garlic and ginger and sauté for 1 minute until fragrant, then add ground coriander, cumin and garam masala. Let cook for about 20 seconds until fragrant, while stirring occasionally.\n" +
                "5) Add crushed tomatoes, chili powder and salt. Let simmer for about 10-15 minutes, stirring occasionally until sauce thickens and becomes a deep brown red colour.\n" +
                "6) Remove from heat, scoop mixture into a blender and blend until smooth. You may need to add a couple tablespoons of water to help it blend (up to 1/4 cup). Work in batches depending on the size of your blender.\n" +
                "7) Pour the puréed sauce back into the pan. Stir the cream, sugar and crushed kasoori methi (or fenugreek leaves) through the sauce. Add the chicken with juices back into the pan and cook for an additional 8-10 minutes until chicken is cooked through and the sauce is thick and bubbling.\n" +
                "8) Garnish with chopped cilantro and serve with fresh, hot garlic butter rice and fresh homemade Naan bread!\n"));
        dataTypeItemArrayList.add(new ListViewItem("Chicken Biryani","Ingredients: \n" +
                "For the chicken marinade: \n" +
                "Vegetable oil                               1 tablespoon\n" +
                "Garlic                                           10 Grams\n" +
                "Ginger                                          10 Grams \n" +
                "Chilli peppers                             1\n" +
                "Cilantro                                       10 Grams\n" +
                "Garam Massala                         1 tablespoon\n" +
                "Ground cinnamon                     1/2 teaspoon\n" +
                "Salt                                             1 teaspoon\n" +
                "Chicken breats                          900 grams\n" +
                "For Rice:\n" +
                "Water                                         6 cups\n" +
                "Salt                                             2 1/2 teaspoons\n" +
                "Green Cardamom                    5\n" +
                "Bay Leaf                                   1\n" +
                "Basmati rice                             360 grams\n" +
                "For onion: \n" +
                "Ghee                                           2 tablespoon\n" +
                "Medium Onions                        2\n" +
                "\n\n" +
                "Method:\n" +
                "1) To marinate the chicken for the biryani, combine the vegetable oil, garlic, ginger, chili peppers, mint, cilantro, garam masala, cinnamon and salt in a large bowl and stir together. Add the chicken pieces and toss together making sure the chicken is thoroughly coated in the marinade. Allow the chicken to marinate for at least 1 hour or up to overnight.\n" +
                "2) In a pot wide enough to hold the chicken in a single layer, add the ghee and onions and saute the onions until they are well caramelized (15-20 minutes). Transfer the caramelized onions to a bowl and set aside.\n" +
                "3) While the onions caramelize, prepare the rice by washing in a strainer under cold running water until the water runs clear.\n" +
                "4) To par-boil the rice, add the water, salt, cardamom, cumin and bay leaf to a pot and bring to a boil. Add the rice and boil for 7 minutes. Drain the rice, reserving 1 cup of the liquid.\n" +
                "5) In the pot you caramelized the onions in, add the chicken in a single layer, skin-side down. Fry until golden brown on one side (about 5 minutes). Flip the chicken over and fry the other side until golden brown. Transfer the chicken back to the bowl you marinated it in.\n" +
                "6) To assemble the biryani, add the saffron to the rice and toss to distribute evenly. Add half the rice mixture to the bottom of the pot you browned the chicken in.\n" +
                "7) Top the rice with the chicken in a single layer.\n" +
                "8) Top the chicken with an even layer of caramelized onions.\n"));
        dataTypeItemArrayList.add(new ListViewItem("Kadhai Chicken","Ingredients: \n" +
                "For the chicken marinade: \n" +
                "Chicken                                        1 Kg\n" +
                "Ginger-garlic paste                    1 tablespoon\n" +
                "Pepper powder                          1/2 tablespoon\n" +
                "Lime juice                                  1 tablespoon\n" +
                "Oil                                               1 tablespoon\n" +
                "Salt                                             1 tablespoon\n" +
                "For the gravy:\n" +
                "Tomatoes                                  2\n" +
                "Green chillies                            2\n" +
                "Ginger-garlic paste                  1 tablespoon\n" +
                "Chilli powder                            1 tablespoon\n" +
                "Black cardamoms                   3\n" +
                "Cloves                                       3\n" +
                "Water                                        1 Cup\n" +
                "For sauteing:\n" +
                "Onion                                      2 Large\n" +
                "Ginger                                     1 tablespoon\n" +
                "Green chillies                         3\n" +
                "Chilli powder                          2 tablespoon\n" +
                "Tumeric powder                     1 tablespoon\n" +
                "Garam Massala                      3/4 tablespoon\n" +
                "Fenugreek Leaf                      1/2 tablespoon\n" +
                "Cream                                      1 Cup\n\n\n" +

                "Method: \n" +
                "1) Marinate chicken with the ingredients mentioned and keep it aside for a while.\n" +
                "2) Grind all the ingredients for the tomato paste into a fine paste.\n" +
                "3) In a frying pan, shallow fry chicken pieces to light brown color.\n" +
                "4) In the same oil add onion, ginger and green chillies for sauteing and stir till onion turn golden brown.\n" +
                "5) Add chilli powder, turmeric powder, garam masala and kasuri methi.\n" +
                "6) Now add the tomato mixture and a cup of water.\n" +
                "7) Once it boils, add fried chicken pieces and mix everything together.\n" +
                "8) Add a little bit of salt if required.\n" +
                "9) Pop the lid on and cook for 10 minutes on medium heat.\n" +
                "10) Once finished cooking, add a cup of cream to give it a rich taste.\n"));
//        dataTypeItemArrayList.add(new ListViewItem("Chicken Tikka","Ingredients: "));

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
                case 0: return non_veg_contentFragment.newInstance(R.drawable.dal,"Butter Chicken");
                case 1: return non_veg_contentFragment.newInstance(R.drawable.ic_baseline_map_24,"Chicken Biryani");
                case 2: return non_veg_contentFragment.newInstance(R.drawable.ic_baseline_map_24,"Kadhai Chicken");

                default: return non_veg_contentFragment.newInstance(R.drawable.facebook,"Butter Chicken");

            }
        }
        @Override
        public int getCount() {
            return 3;
        }
    }
}

