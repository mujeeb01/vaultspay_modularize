package com.vaultspay.vaultspay_modularize.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.vaultspay.core.local.datastore.DataStoreProvider
import com.vaultspay.vaultspay_modularize.R
import com.vaultspay.vaultspay_modularize.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    private lateinit var layoutBinding: FragmentSplashBinding
    lateinit var dataStoreProvider: DataStoreProvider


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        layoutBinding = FragmentSplashBinding.inflate(inflater, container, false)

        layoutBinding.btnUserSide.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_auth_nav_graph)
        }

        layoutBinding.btnMerchantSide.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_dashboard_nav_graph)
        }


        return layoutBinding.root
    }

}