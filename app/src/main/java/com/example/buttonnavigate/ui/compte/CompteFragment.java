package com.example.buttonnavigate.ui.compte;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.buttonnavigate.databinding.FragmentCompteBinding;

public class CompteFragment extends Fragment {

    private FragmentCompteBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CompteViewModel dashboardViewModel =
                new ViewModelProvider(this).get(CompteViewModel.class);

        binding = FragmentCompteBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCompte;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}