package com.owais.livedatapractice;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int count=0;
    private MutableLiveData<Integer> mutableLiveData=new MutableLiveData<>();

    public MutableLiveData<Integer> getInitialCount(){
        mutableLiveData.setValue(count);
        return mutableLiveData;
    }

    public void countIncrease(){
        count++;
        mutableLiveData.setValue(count);
    }
}
