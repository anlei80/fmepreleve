package com.fme.lersac.preleve.activity;

import com.example.fmepreleve.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class EditDiversFragment extends Fragment {
    
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.edit_divers, container, false);
         
        return rootView;
    }
}
