package com.fabasoft.demosplitviewapplication;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
  TextView tvDimens;

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    tvDimens = findViewById(R.id.tv_dimens);
    Helper.fillDimensionsTextView(tvDimens, getResources().getConfiguration(), isInMultiWindowMode());
  }

  @Override
  public void onConfigurationChanged(@NonNull Configuration newConfig)
  {
    super.onConfigurationChanged(newConfig);
    Helper.fillDimensionsTextView(tvDimens, getResources().getConfiguration(), isInMultiWindowMode());
  }
}
