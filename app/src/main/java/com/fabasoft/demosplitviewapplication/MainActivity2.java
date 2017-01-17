package com.fabasoft.demosplitviewapplication;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.text.MessageFormat;
import java.util.logging.Logger;

public class MainActivity2 extends AppCompatActivity {
  TextView tvDimens;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    tvDimens = (TextView) findViewById(R.id.tv_dimens);
    Helper.fillDimensionsTextView(tvDimens, getResources().getConfiguration(), isInMultiWindowMode());
  }

  @Override
  public void onConfigurationChanged(Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    Helper.fillDimensionsTextView(tvDimens, getResources().getConfiguration(), isInMultiWindowMode());
  }
}
