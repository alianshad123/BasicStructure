package com.anshad.basestructure.ktx

import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.anshad.basestructure.utils.FragmentViewBindingDelegate

object FragmentKtx {

    //Fragment Binging
    fun <T : ViewBinding> Fragment.viewBinding(viewBindingFactory: (View) -> T) = FragmentViewBindingDelegate(this, viewBindingFactory)
}