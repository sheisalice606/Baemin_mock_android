package org.techtown.softsquared_baemin.src.main.myPage

import android.os.Bundle
import android.view.View
import org.techtown.softsquared_baemin.R
import org.techtown.softsquared_baemin.config.BaseFragment
import org.techtown.softsquared_baemin.databinding.FragmentHistoryBinding

class HistoryFragment :
    BaseFragment<FragmentHistoryBinding>(FragmentHistoryBinding::bind, R.layout.fragment_history){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}