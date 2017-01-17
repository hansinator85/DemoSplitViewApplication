package com.fabasoft.demosplitviewapplication;

import android.content.res.Configuration;
import android.widget.TextView;

import java.text.MessageFormat;

/**
 * Created by Johannes.Puchberger on 17.01.2017.
 */
public class Helper {
  public static void fillDimensionsTextView(TextView tvDimens, Configuration config, boolean multiWindowMode) {
    if (tvDimens != null && config != null) {
      int width = config.screenWidthDp;
      int height = config.screenHeightDp;
      int smallestWidth = config.smallestScreenWidthDp;
      int orientation = config.orientation;
      String orientationText = orientation == Configuration.ORIENTATION_LANDSCAPE ? "Landscape" : "Portrait";
      String screenSizeText = getScreenSizeAsText(config);
      String dimensionsText = MessageFormat.format("{0}dp x {1}dp\nSmallest Width: {2}dp\nOrientation: {3}\nMulti-Window-Mode: {4}\n{5}",
        width, height, smallestWidth, orientationText, multiWindowMode, screenSizeText);
      tvDimens.setText(dimensionsText);
    }
  }

  public static String getScreenSizeAsText(Configuration config) {
    String screenSizeText;
    if ((config.screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_NORMAL) {
      screenSizeText = "Normal sized screen (Phone)";
    } else if ((config.screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_LARGE) {
      screenSizeText = "Large screen (Tablet)";
    } else if ((config.screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_XLARGE) {
      screenSizeText = "Very Large screen (Tablet)";
    } else if ((config.screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_SMALL) {
      screenSizeText = "Small sized screen (Watch)";
    } else {
      screenSizeText = "Screen size is undefined";
    }
    return screenSizeText;
  }
}
