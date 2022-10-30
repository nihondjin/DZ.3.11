package com.example.dz31;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;


public class FirstFragment extends Fragment {
    private EditText editText;
    private MaterialButton mButton;
    private final String isPassword = "admin";
    private RecyclerFragment recyclerFragment;
    public static final String TXT_BUNDLE_KEY = "text";
    public static final String IMAGE_BUNDLE_KEY = "image";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initialize(view);
        onClick();
        setupListener();
    }

    private void setupListener() {
    }

    private void initialize(View view) {

        editText = view.findViewById(R.id.txtView);
        mButton = view.findViewById(R.id.btn);

    }

    public void onClick() {
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = editText.getText().toString().trim();
                if (!password.equals(isPassword)){
                    editText.setError("Не правильный пароль");
                }else {
                    requireActivity().getSupportFragmentManager().beginTransaction().
                            replace(R.id.fragment_container , new RecyclerFragment()).commit();
                }
            }
        });
    }
}