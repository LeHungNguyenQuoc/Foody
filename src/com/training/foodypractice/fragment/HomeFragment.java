package com.training.foodypractice.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

import com.training.foodypractice.R;

public class HomeFragment extends Fragment {

	public View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.test_layout, container, false);
		((TextView) rootView.findViewById(R.id.tv_test)).setText("Home fragment");
		return rootView;
	}

}
