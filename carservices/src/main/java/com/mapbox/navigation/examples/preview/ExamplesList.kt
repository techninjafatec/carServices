package com.mapbox.navigation.examples.preview

import android.content.Context
import androidx.core.content.ContextCompat
import com.mapbox.navigation.examples.preview.dropinui.CustomNavigationViewOptionsActivity
import com.mapbox.navigation.examples.preview.dropinui.CustomRuntimeStylingActivity
import com.mapbox.navigation.examples.preview.dropinui.CustomSpeedLimitActivity
import com.mapbox.navigation.examples.preview.dropinui.CustomTripProgressActivity
import com.mapbox.navigation.examples.preview.dropinui.CustomViewInjectionActivity
import com.mapbox.navigation.examples.preview.dropinui.NavigationViewActivity
import com.mapbox.navigation.examples.preview.dropinui.ToggleThemeActivity

fun Context.examplesList() = listOf(
    MapboxExample(
        ContextCompat.getDrawable(this, R.drawable.mapbox_screenshot_navigation_view),
        getString(R.string.title_navigation_view),
        getString(R.string.description_navigation_view),
        NavigationViewActivity::class.java
    ),
)
