package com.example.fragmentapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class SecondFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.fragment_second,
                container,
                false
        );
        Button button = view.findViewById(R.id.btn_frag2);
        TextView textView = view.findViewById(R.id.txtView2);

        button.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Good Bye Second Fragment", Toast.LENGTH_SHORT).show();
        });

        return view;

    }
}