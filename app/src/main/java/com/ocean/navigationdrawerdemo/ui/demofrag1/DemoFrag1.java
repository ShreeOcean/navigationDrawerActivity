package com.ocean.navigationdrawerdemo.ui.demofrag1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ocean.navigationdrawerdemo.R;
import com.ocean.navigationdrawerdemo.databinding.FragmentDemoFrag1Binding;

public class DemoFrag1 extends Fragment {

    private FragmentDemoFrag1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        DemoFrag1ViewModel viewModel = new ViewModelProvider(this).get(DemoFrag1ViewModel.class);
        binding = FragmentDemoFrag1Binding.inflate(inflater, container, false);

        getActivity().setTitle("Demo Fragment");
        viewModel.getText().observe(getViewLifecycleOwner(), binding.tvDemoFragOne::setText);
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}