package com.example.ygodb.ui.singleCard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ygodb.databinding.FragmentSinglecardBinding;

public class SummaryCardFragment extends Fragment {

    private FragmentSinglecardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SingleCardViewModel singleCardViewModel =
                new ViewModelProvider(this).get(SingleCardViewModel.class);

        binding = FragmentSinglecardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.cardTitle;
        singleCardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}