package com.anshad.basestructure.ui

import androidx.annotation.StringRes
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.anshad.basestructure.R
import com.anshad.basestructure.model.Action
import com.anshad.basestructure.model.Event
import com.anshad.basestructure.model.LoadingMessageData
import com.anshad.basestructure.model.MessageData


abstract class BaseViewModel : ViewModel() {
    private val infoMessageLiveData = MutableLiveData<Event<MessageData>>()
    val infoMessage: LiveData<Event<MessageData>> = infoMessageLiveData


    private val actionLiveData = MutableLiveData<Event<Action>>()
    val action: LiveData<Event<Action>> = actionLiveData

    private val loadingLiveData = MutableLiveData<Event<LoadingMessageData>>()
    val loading: LiveData<Event<LoadingMessageData>> = loadingLiveData


    fun showInfoMessage(message: MessageData) {
        infoMessageLiveData.value = Event(message)
    }

    open fun showLoading(message: LoadingMessageData) {
        loadingLiveData.value = Event(message)
    }

    fun performAction(action: Action) {
        actionLiveData.value = Event(action)
    }

    fun showLoading(@StringRes message: Int = R.string.loading) {
        val messageData = LoadingMessageData()
        messageData.isLoading = true
        messageData.messageRes = message
        showLoading(messageData)
    }

    fun hideLoading() {
        val messageData = LoadingMessageData()
        messageData.isLoading = false
        showLoading(messageData)
    }

}