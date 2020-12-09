package com.example.spiceful;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomRecyclerViewAdapter.CustomViewHolder> {
    private ArrayList<Term> terms;
    private Context context;

    public CustomRecyclerViewAdapter(ArrayList<Term> terms, Context context){
        this.terms = terms;
        this.context = context;
    }
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_recycle_display,null);
        view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
       return  new CustomViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Term term = terms.get(position);
        holder.name.setImageResource(term.getName());
        holder.description.setText(term.getDescription());
    }

    @Override
    public int getItemCount() {
        if (terms != null){
            return terms.size();
        }
        return 0;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        protected ImageView name;
        protected TextView description;

        public CustomViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            this.name = itemView.findViewById(R.id.name);
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
            String imageSize = sharedPrefs.getString("imageSize","Medium");
            switch (imageSize){
                case "Small": name.getLayoutParams().height = 200;
                    break;
                case "Medium": name.getLayoutParams().height = 400;
                    break;
                case "Large": name.getLayoutParams().height = 600;
                    break;
            }
            this.description = itemView.findViewById(R.id.descriptionItem);
            String fontSizeChoice = sharedPrefs.getString("fontSize","18sp");
            switch (fontSizeChoice){
                case "18sp" : description.setTextSize(18);
                break;
                case "22sp" : description.setTextSize(22);
                break;
                case "24sp" : description.setTextSize(24);
                break;
            }
        }
    }
}
