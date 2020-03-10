package com.example.carmanage.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carmanage.ControlLockActivity;
import com.example.carmanage.ExternalLightActivity;
import com.example.carmanage.InteriorLightActivity;
import com.example.carmanage.R;
import com.example.carmanage.SecurityReminderActivity;
import com.example.carmanage.WindowControlActivity;
import com.example.carmanage.WiperWashActivity;

public class BCMFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bcm, null);
        view.findViewById(R.id.tv1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ExternalLightActivity.class));
            }
        });
        view.findViewById(R.id.tv2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), InteriorLightActivity.class));
            }
        });
        view.findViewById(R.id.tv3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ControlLockActivity.class));
            }
        });
        view.findViewById(R.id.tv4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), WindowControlActivity.class));
            }
        });
        view.findViewById(R.id.tv5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), WiperWashActivity.class));
            }
        });
        view.findViewById(R.id.tv6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), SecurityReminderActivity.class));
            }
        });
        return view;
    }

}
