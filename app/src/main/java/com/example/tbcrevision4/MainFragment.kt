package com.example.tbcrevision4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tbcrevision4.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }


    private fun init() {
        binding.btn3x3.setOnClickListener { findNavController().navigate(R.id.action_mainFragment_to_fragmentForThree) }
        binding.btn4x4.setOnClickListener { findNavController().navigate(R.id.action_mainFragment_to_fragmentForFour) }
        binding.btn5x5.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_fragmentForFive)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
