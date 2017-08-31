package net.daum.www.locationtest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by thswl on 2017-08-23.
 */

public class MainFragment extends Fragment {
   public static MainFragment newInstance(){ return new MainFragment();}

   private Edit mEdit;
   private EditText mEditText1;


   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_main, container, false);

      mEditText1 = (EditText)view.findViewById(R.id.EditText1);

      return view;
   }
}

