package com.example.spiceful;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Credit#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Credit extends Fragment {

    private SharedPreferences sharedPreferences;

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

    /**
     * Created the content for credit fragment
     * @author- Yash Kumar
     * @Date - 24 Nov
     */


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_credit, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycle);
        ArrayList<Term> terms = new ArrayList<>();
        terms.add(new Term(R.drawable.butterchicken, " Picture of- Butter Chicken \n Photo by:- The Endless Meal \n https://www.instagram.com/theendlessmeal/"));
        terms.add(new Term(R.drawable.chickenbiryani," Picture of- Chicken Biryani\n Photo by:- Kitchen Sanctuary\n https://www.instagram.com/kitchensanctuary/"));
        terms.add(new Term(R.drawable.kadhaichicken," Picture of- Kadhai Chicken \n Photo by:- Farha Ambreen\n https://www.instagram.com/fariamby/"));
        terms.add(new Term(R.drawable.alloomatar," Picture of- Aloo Mattar\n Photo by:- Udai Sareen\n https://www.instagram.com/tasteofculturesindia/"));
        terms.add(new Term(R.drawable.matarpaneer," Picture of- Matar Paneer\n Photo by:- Ujawal's Kitchen/Food\n https://www.instagram.com/ujawalskitchen/"));
        terms.add(new Term(R.drawable.bhindi," Picture of- Bhindi \n Photo by:- Krishie’s eat\n https://www.instagram.com/foodcheersforever/"));
        terms.add(new Term(R.drawable.paneerbhurji," Picture of- Paneer Bhurji \n Photo by:- Sumedh Kanade | Food Blogger \n https://www.instagram.com/gourmetmusafir/"));
        terms.add(new Term(R.drawable.vegw," Picture of- Vegetable Bowl icon \n Photo by:- Monkik \n https://www.flaticon.com/free-icon/salad_701974?term=vegetarian&page=1&position=12&related_item_id=701974"));
        terms.add(new Term(R.drawable.nonvegw," Picture of- Icon for Non-Veg page \n Photo by:- Freepik \n https://www.flaticon.com/free-icon/turkey_1895685?term=chicken&page=1&position=77&related_item_id=1895685"));
        terms.add(new Term(R.drawable.requestw," Picture of- Icon for Request dish page \n Photo by:- Freepik \n https://www.flaticon.com/free-icon/question_2353698?term=think&page=1&position=6&related_item_id=2353698"));
        terms.add(new Term(R.drawable.sharew," Picture of- Icon for Share page \n Photo by:- Pixel perfect \n https://www.flaticon.com/free-icon/share_1828956?term=share&page=1&position=2&related_item_id=1828956"));
        terms.add(new Term(R.drawable.facebook," Picture of- Facebook Icon \n Photo by:- Freepik \n https://www.flaticon.com/free-icon/facebook_1384053?term=facebook&page=1&position=11&related_item_id=1384053"));
        terms.add(new Term(R.drawable.contactw," Picture of- Contact Us Icon \n Photo by:- Sirp \n https://www.flaticon.com/free-icon/communicate_2343723?term=contact&page=1&position=22&related_item_id=2343723"));



        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new CustomRecyclerViewAdapter(terms,getContext()));


        return view;
    }


}