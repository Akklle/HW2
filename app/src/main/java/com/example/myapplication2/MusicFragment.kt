package com.example.myapplication2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication2.databinding.FragmentMainBinding
import com.example.myapplication2.databinding.FragmentMusicBinding
import com.google.android.material.snackbar.Snackbar

class MusicFragment : Fragment(R.layout.fragment_music) {



    private var _binding: FragmentMusicBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMusicBinding.bind(view)

        with(binding) {
            btnFavourite4.setOnClickListener {
                findNavController().navigate(
                    R.id.action_musicFragment_to_favouriteFragment,
                    FavouriteFragment.createBundle(
                        ("Music Fragment").toString()
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