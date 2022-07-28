package com.ocean.navigationdrawerdemo.ui.demofrag1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DemoFrag1ViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DemoFrag1ViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is Demo Fragment One....");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
