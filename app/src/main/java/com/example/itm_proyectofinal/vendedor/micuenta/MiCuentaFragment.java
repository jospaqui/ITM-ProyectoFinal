package com.example.itm_proyectofinal.vendedor.micuenta;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.itm_proyectofinal.R;

public class MiCuentaFragment extends Fragment {

    private MiCuentaViewModel micuentaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        micuentaViewModel =
                new ViewModelProvider(this).get(MiCuentaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_micuenta_vendedor, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        micuentaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}