package com.anshad.basestructure.ui

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.anshad.basestructure.model.Action
import com.anshad.basestructure.model.LoadingMessageData
import com.anshad.basestructure.model.MessageData
import com.anshad.basestructure.utils.EventObserver

abstract class BaseFragment<VM : BaseViewModel>(@LayoutRes layout: Int) : Fragment(layout) {

    protected abstract val viewModel: VM

    private val activityViewModel: BaseActivityViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val loadingMessageData = LoadingMessageData()
        loadingMessageData.isLoading = false
        onLoadingMessage(loadingMessageData)

        viewModel.loading.observe(viewLifecycleOwner, EventObserver {
            onLoadingMessage(it)
        })

        viewModel.action.observe(viewLifecycleOwner, EventObserver {
            onPerformAction(it)
        })

        viewModel.infoMessage.observe(viewLifecycleOwner, EventObserver {
            onInfoMessage(it)
        })
        activityViewModel.actionPerformed.observe(viewLifecycleOwner, EventObserver {
            onActionPerformed(it)
        })

    }

    open fun onLoadingMessage(messageData: LoadingMessageData) {
        activityViewModel.showLoading(messageData)
    }

    open fun onInfoMessage(messageData: MessageData) {
        activityViewModel.showInfoMessage(messageData)
    }

    open fun onPerformAction(action: Action) {
        activityViewModel.performAction(action)
    }

    open fun onActionPerformed(action: Action) {
    }
}