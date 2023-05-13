package com.example.buttonnavigate.ui.galerie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.buttonnavigate.databinding.FragmentGalerieBinding;

public class GalerieFragment extends Fragment {

    private FragmentGalerieBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalerieViewModel galerieViewModel =
                new ViewModelProvider(this).get(GalerieViewModel.class);

        binding = FragmentGalerieBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGalerie;
        galerieViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}