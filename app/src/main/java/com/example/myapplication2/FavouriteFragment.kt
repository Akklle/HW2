package com.example.myapplication2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication2.databinding.FragmentFavouriteBinding
import com.example.myapplication2.databinding.FragmentMainBinding
import com.google.android.material.snackbar.Snackbar

class FavouriteFragment: Fragment(R.layout.fragment_favourite) {
    private var _binding: FragmentFavouriteBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFavouriteBinding.bind(view)


        val text = arguments?.getString(ARG_TEXT).orEmpty()

        if (text.isNotEmpty()) {
            Snackbar.make(view, text, Snackbar.LENGTH_LONG).show()
        }

        with(binding){
            btnBack.setOnClickListener(){
                findNavController().popBackStack(
                )
            }
        }

    }


    companion object {

        private const val ARG_TEXT = "amazing"

        fun createBundle(text: String): Bundle {
            val bundle = Bundle()
            bundle.putString(
                ARG_TEXT,
                text
            )
            return bundle
        }
    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}