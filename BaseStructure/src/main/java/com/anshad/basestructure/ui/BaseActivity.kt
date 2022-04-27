package com.anshad.basestructure.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.anshad.basestructure.constants.Actions
import com.anshad.basestructure.ktx.AppCompatActivityKtx.enterFullScreen
import com.anshad.basestructure.ktx.AppCompatActivityKtx.exitFullScreen
import com.anshad.basestructure.model.Action
import com.anshad.basestructure.model.LoadingMessageData
import com.anshad.basestructure.model.MessageData
import com.anshad.basestructure.utils.EventObserver

abstract class BaseActivity: AppCompatActivity() {

    private val viewModel: BaseActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        viewModel.action.observe(this, EventObserver {
            onPerformAction(it)
        })
        viewModel.infoMessage.observe(this, EventObserver {
            onInfoMessage(it)
        })
        viewModel.loading.observe(this, EventObserver {
            onLoadingMessage(it)
        })
    }

    fun actionPerformed(action: Action) {
        viewModel.actionPerformed(action)
    }

    open fun onPerformAction(action: Action) {
        when (action.task.action) {
            Actions.ENTER_FULLSCREEN -> {
               enterFullScreen(true)
            }
            Actions.EXIT_FULLSCREEN -> {
                exitFullScreen()
            }
            Actions.ACTION_LOGOUT -> {
                onLogout()
            }
        }
    }

    abstract fun onLoadingMessage(messageData: LoadingMessageData)
    abstract fun onInfoMessage(messageData: MessageData)
    abstract fun onLogout()
}