package com.example.myapplication2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication2.databinding.FragmentMainBinding
import com.example.myapplication2.databinding.FragmentMainBinding.*
import com.example.myapplication2.databinding.FragmentProfileBinding

class ProfileFragment: Fragment (R.layout.fragment_profile) {



    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentProfileBinding.bind(view)

        with(binding) {
            btnFavourite2.setOnClickListener {
                findNavController().navigate(
                    R.id.action_profileFragment_to_favouriteFragment,
                    FavouriteFragment.createBundle(
                        ("Profile Fragment").toString()
                    )
                )
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}