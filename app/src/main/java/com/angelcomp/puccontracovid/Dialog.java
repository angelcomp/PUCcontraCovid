package com.angelcomp.puccontracovid;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.DialogFragment;

import com.angelcomp.puccontracovid.databinding.DialogBinding;

public class Dialog extends DialogFragment {

    private DialogBinding binding;
    private boolean covidAlert;

    public Dialog(boolean response) {
        this.covidAlert = response;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = DialogBinding.inflate(inflater, container, false);

        if (covidAlert) {
            @SuppressLint("UseCompatLoadingForDrawables") Drawable image = getResources().getDrawable(R.drawable.alert_covid);
            binding.dialogIcon.setImageDrawable(image);
            binding.dialogTitle.setText(R.string.attention);
            binding.dialogTitle.setBackgroundResource(R.color.salmon);
            binding.dialogText.setText(R.string.orientation);

        }

        binding.btnUnderstood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().finishAffinity();
            }
        });

        return binding.getRoot();
    }
}
