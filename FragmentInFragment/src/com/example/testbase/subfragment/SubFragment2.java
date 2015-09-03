package com.example.testbase.subfragment;

import com.example.testbase.commom.T;
import com.example.testbase.fragment3.R;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SubFragment2 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		T.showShort(getActivity(), "SubFragment2==onCreateView");
		TextView tv = new TextView(getActivity());
		tv.setTextSize(25);
		tv.setBackgroundColor(Color.parseColor("#FFA07A"));
		tv.setText("²Æ¾­");
		tv.setGravity(Gravity.CENTER);
		return tv;
	}
}
