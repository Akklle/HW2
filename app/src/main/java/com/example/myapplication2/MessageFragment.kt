package com.example.myapplication2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication2.databinding.FragmentMainBinding
import com.example.myapplication2.databinding.FragmentMessageBinding

class MessageFragment: Fragment(R.layout.fragment_message) {


    private var _binding: FragmentMessageBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMessageBinding.bind(view)

        with(binding) {
            btnFavourite5.setOnClickListener {
                findNavController().navigate(
                    R.id.action_messageFragment2_to_favouriteFragment,
                    FavouriteFragment.createBundle(
                        ("Message Fragment").toString()
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