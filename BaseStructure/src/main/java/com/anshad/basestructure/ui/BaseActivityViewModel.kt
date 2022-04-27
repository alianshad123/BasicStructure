package com.anshad.basestructure.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.anshad.basestructure.model.Action
import com.anshad.basestructure.model.Event

class BaseActivityViewModel : BaseViewModel() {
    private val actionPerformedLiveData = MutableLiveData<Event<Action>>()
    val actionPerformed: LiveData<Event<Action>> = actionPerformedLiveData

    fun actionPerformed(actions: Action) {
        actionPerformedLiveData.value = Event(actions)
    }
}