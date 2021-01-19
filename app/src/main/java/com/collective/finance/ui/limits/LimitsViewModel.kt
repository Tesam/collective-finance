package com.collective.finance.ui.limits

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LimitsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is limits Fragment"
    }
    val text: LiveData<String> = _text
}