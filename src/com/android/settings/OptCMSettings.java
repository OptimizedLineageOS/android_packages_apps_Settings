package com.android.settings;

import android.os.Bundle;
import com.android.internal.logging.MetricsLogger;

public class OptCMSettings extends SettingsPreferenceFragment {
		
		@Override
		protected int getMetricsCategory() {
			return 0;
		}
		
		@Override
		public void onCreate(Bundle icicle) {
			super.onCreate(icicle);
			addPreferencesFromResource(R.xml.optcm_settings);
			}
}	