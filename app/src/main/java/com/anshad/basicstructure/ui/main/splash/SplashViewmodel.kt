package com.anshad.basicstructure.ui.main.splash

import android.os.Handler
import com.anshad.basestructure.ui.BaseViewModel
import com.anshad.basicstructure.R


class SplashViewmodel:BaseViewModel() {

    init {
        navigateToMainScreen()
    }

    private fun navigateToMainScreen() {
        Handler().postDelayed(
            {

        }, 3000)

    }
}