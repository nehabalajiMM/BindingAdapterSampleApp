package com.example.bindingadaptersampleapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    var myData: MutableLiveData<DataModel> = MutableLiveData()
    private var sampleData: DataModel = DataModel(
        "Test Title",
        "Test description",
        "https://picsum.photos/id/237/400",
        12
    )

    init {
        myData.value = sampleData
    }

    fun updateData() {
        sampleData.title = "Sample Text"
        myData.postValue(sampleData)
    }
}
