package com.example.buttonnavigate.ui.galerie;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalerieViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GalerieViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}