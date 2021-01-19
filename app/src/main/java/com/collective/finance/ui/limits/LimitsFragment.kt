package com.collective.finance.ui.limits

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.collective.finance.R

class LimitsFragment : Fragment() {

    private lateinit var limitsViewModel: LimitsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        limitsViewModel =
                ViewModelProvider(this).get(LimitsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_limits, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        limitsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}