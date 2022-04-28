package com.anshad.basicstructure.ui.main.splash

import android.content.Context
import androidx.fragment.app.activityViewModels
import com.anshad.basestructure.ui.BaseFragment
import com.anshad.basicstructure.R


class SplashFragment : BaseFragment<SplashViewmodel>(R.layout.fragment_splash) {

    override val viewModel: SplashViewmodel by activityViewModels()

    override fun onAttach(context: Context) {
        super.onAttach(context)

    }



}