package com.anshad.basicstructure

import android.os.Bundle
import com.anshad.basestructure.model.LoadingMessageData
import com.anshad.basestructure.model.MessageData
import com.anshad.basestructure.ui.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onInfoMessage(messageData: MessageData) {
        TODO("Not yet implemented")
    }

    override fun onLoadingMessage(messageData: LoadingMessageData) {
        TODO("Not yet implemented")
    }

    override fun onLogout() {
        TODO("Not yet implemented")
    }
}