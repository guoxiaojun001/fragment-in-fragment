package com.example.testbase.fragment;

import com.example.testbase.commom.T;
import com.example.testbase.fragment3.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentHome extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_home, null);

		T.showShort(getActivity(), "FragmentHome==onCreateView");

		return view;

	}
}
