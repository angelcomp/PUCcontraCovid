package com.angelcomp.puccontracovid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.angelcomp.puccontracovid.databinding.FragmentQuestionTwoBinding;

public class QuestionTwoFragment extends Fragment {

    private FragmentQuestionTwoBinding binding;
    private TextView question;
    private Button yes;
    private Button no;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuestionTwoBinding.inflate(inflater, container, false);

        initProperties();

        return binding.getRoot();
    }

    private void initProperties() {
        question = binding.question;
        yes = binding.yes;
        no = binding.no;
    }
}