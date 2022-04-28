package com.anshad.basicstructure.ui.main.home

import androidx.fragment.app.viewModels
import com.anshad.basestructure.ui.BaseFragment
import com.anshad.basicstructure.R

class DashboardFragment : BaseFragment<DashboardViewmodel>(R.layout.fragment_dashboard) {
    override val viewModel: DashboardViewmodel by viewModels()


}