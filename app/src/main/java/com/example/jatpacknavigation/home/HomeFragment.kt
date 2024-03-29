package com.example.jatpacknavigation.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.jatpacknavigation.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //transactions.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_transactionsFragment))
        send.setOnClickListener { findNavController().navigate(R.id.action_homeFragment_to_send_transaction_nav_graph) }
    }


}
