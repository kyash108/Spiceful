package com.example.spiceful;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class settingsFragment extends PreferenceFragment {
    @Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.preference);
}
}
