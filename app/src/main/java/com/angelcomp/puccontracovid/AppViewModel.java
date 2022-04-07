package com.angelcomp.puccontracovid;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AppViewModel extends ViewModel {
    private Integer positiveClicks = 0;
    private final MutableLiveData<Boolean> completedQuestions = new MutableLiveData<Boolean>(false);

    public void incrementPositiveClick() {
        positiveClicks++;
    }

    public void setCompletedQuestionsValue(Boolean value) {
        completedQuestions.setValue(value);
    }

    public Integer getPositiveClicksValue() {
        return positiveClicks;
    }

    public LiveData<Boolean> getCompletedQuestionsValue() {
        return completedQuestions;
    }
}
