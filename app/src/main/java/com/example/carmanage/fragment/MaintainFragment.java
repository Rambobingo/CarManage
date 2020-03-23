package com.example.carmanage.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carmanage.CarMaintenanceActivity;
import com.example.carmanage.FaultCauseActivity;
import com.example.carmanage.R;
import com.example.carmanage.SolutionActivity;

public class MaintainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_maintain, null);
        v.findViewById(R.id.btn_reason).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), FaultCauseActivity.class));
            }
        });
        v.findViewById(R.id.btn_method).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SolutionActivity.class));
            }
        });
        v.findViewById(R.id.btn_maintain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), CarMaintenanceActivity.class));
            }
        });
        return v;
    }
}
