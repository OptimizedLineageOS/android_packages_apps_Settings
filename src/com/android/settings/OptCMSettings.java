package com.android.settings;

import android.os.Bundle;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import com.android.settings.search.Indexable;

public class OptCMSettings extends SettingsPreferenceFragment
        implements  Indexable {
		
		@Override
		public void onCreate(Bundle icicle) {
			super.onCreate(icicle);
			addPreferencesFromResource(R.xml.optcm_settings);
			}
}	
