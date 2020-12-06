package com.example.spiceful;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link request#newInstance} factory method to
 * create an instance of this fragment.
 */
public class request extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public request() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment request.
     */
    // TODO: Rename and change types and number of parameters
    public static request newInstance(String param1, String param2) {
        request fragment = new request();
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

       View view= inflater.inflate(R.layout.fragment_request, container, false);
         final EditText name = view.findViewById(R.id.requestDishUserNameInput);
        final EditText email = view.findViewById(R.id.requestDishEmailInput);
        final EditText dishName = view.findViewById(R.id.requestDishNameInput);
       Button button = view.findViewById(R.id.submit);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString().trim();
                String userEmail = email.getText().toString().trim();
                String recipeRequest = dishName.getText().toString().trim();
                String[]emailAddress={"yashkumartestemail@gmail.com"};
            Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,emailAddress);
                intent.putExtra(Intent.EXTRA_SUBJECT,"Can you please a this recipe to the app ?");
                intent.putExtra(Intent.EXTRA_TEXT,"Name: "+userName+"\n Email: "+userEmail+"\n Recipe(s) name: "+recipeRequest);
            //                if(intent.resolveActivity(getActivity().getPackageManager()) != null){
            startActivity(intent);
//                }else {
//                    Toast.makeText(getActivity(),"No app installed or email account not added in the app",Toast.LENGTH_SHORT).show();
//                }
            }

        });

        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.animate_out);
        view.startAnimation(animation);

       return view;
    }
}