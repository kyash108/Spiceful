package com.example.spiceful;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class settingsFragment extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference);
    }
}
