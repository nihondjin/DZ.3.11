package com.example.dz31;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class RecyclerFragment extends Fragment {


    private TaskAdapter adapter = new TaskAdapter();
    private final List<String> nameOfBooks = new ArrayList<>();
    private RecyclerView resView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recycler, container, false);}


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        resView =view.findViewById(R.id.recyclerView);
        nameOfBooks.add("Pfisic");
        init();
        adapter.setData(nameOfBooks);
    }

    private void init() {
        resView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        resView.setAdapter(adapter);

    }
}