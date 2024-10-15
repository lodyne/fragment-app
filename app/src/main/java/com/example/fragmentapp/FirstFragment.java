package com.example.fragmentapp;



import android.content.Context;
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




public class FirstFragment extends Fragment implements View.OnClickListener {
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Toast.makeText(context, "OnAttach() is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(), "OnCreate() is called", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(), "OnResume() is called", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity(), "OnStart() is called", Toast.LENGTH_SHORT).show();

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.fragment_first,
                container,
                false
        );

        Button button = view.findViewById(R.id.btn_frag1);
        TextView text = view.findViewById(R.id.txtView);

        button.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(
                getContext(),
                "Welcome to the First Fragment ",
                Toast.LENGTH_SHORT).show();

    }
}