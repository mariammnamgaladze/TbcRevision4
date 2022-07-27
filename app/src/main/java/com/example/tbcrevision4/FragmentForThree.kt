package com.example.tbcrevision4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.tbcrevision4.databinding.FragmentForThreeBinding

class FragmentForThree : Fragment(),View.OnClickListener {


    var counter = 0

    private var player = 1

    private var player1 = mutableListOf<Int>()
    private var player2 =  mutableListOf<Int>()

    private var _binding: FragmentForThreeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentForThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        binding.apply {
            button1.setOnClickListener(this@FragmentForThree)
            button2.setOnClickListener(this@FragmentForThree)
            button3.setOnClickListener(this@FragmentForThree)
            button4.setOnClickListener(this@FragmentForThree)
            button5.setOnClickListener(this@FragmentForThree)
            button6.setOnClickListener(this@FragmentForThree)
            button7.setOnClickListener(this@FragmentForThree)
            button8.setOnClickListener(this@FragmentForThree)
            button9.setOnClickListener(this@FragmentForThree)
        }
    }
    override fun onClick(clickedView: View?) {

        if (clickedView is Button) {

            var buttonNumber = 0

            when (clickedView.id) {

                R.id.button1 -> buttonNumber = 1
                R.id.button2 -> buttonNumber = 2
                R.id.button3 -> buttonNumber = 3
                R.id.button4 -> buttonNumber = 4
                R.id.button5 -> buttonNumber = 5
                R.id.button6 -> buttonNumber = 6
                R.id.button7 -> buttonNumber = 7
                R.id.button8 -> buttonNumber = 8
                R.id.button9 -> buttonNumber = 9

            }

            if (buttonNumber != 0) {

                game(clickedView, buttonNumber)

            }

        }
    }

    private fun game(clickedView: Button, buttonNumber: Int) {
        if (player == 1) {
            clickedView.text = "X"
            player1.add(buttonNumber)
            counter += 1
            player = 2
        } else {
            clickedView.text = "O"
            player2.add(buttonNumber)
            counter += 1
            player = 1
        }
        clickedView.isEnabled = false
        check()
    }
    private fun check() {


        var winnerPlayer = 0

        when{
            player1.contains(1) && player1.contains(2) && player1.contains(3) -> winnerPlayer = 1
            player2.contains(1) && player2.contains(2) && player2.contains(3) -> winnerPlayer = 2

            player1.contains(4) && player1.contains(5) && player1.contains(6) -> winnerPlayer = 1
            player2.contains(4) && player2.contains(5) && player2.contains(6) -> winnerPlayer = 2

            player1.contains(7) && player1.contains(8) && player1.contains(9) -> winnerPlayer = 1
            player2.contains(7) && player2.contains(8) && player2.contains(9) -> winnerPlayer = 2

            player1.contains(1) && player1.contains(4) && player1.contains(7) -> winnerPlayer = 1
            player2.contains(1) && player2.contains(4) && player2.contains(7) -> winnerPlayer = 2

            player1.contains(2) && player1.contains(5) && player1.contains(8) -> winnerPlayer = 1
            player2.contains(2) && player2.contains(5) && player2.contains(8) -> winnerPlayer = 2

            player1.contains(3) && player1.contains(6) && player1.contains(9) -> winnerPlayer = 1
            player2.contains(3) && player2.contains(6) && player2.contains(9) -> winnerPlayer = 2

            player1.contains(1) && player1.contains(5) && player1.contains(9) -> winnerPlayer = 1
            player2.contains(1) && player2.contains(5) && player2.contains(9) -> winnerPlayer = 2

            player1.contains(3) && player1.contains(5) && player1.contains(7) -> winnerPlayer = 1
            player2.contains(3) && player2.contains(5) && player2.contains(7) -> winnerPlayer = 2
        }


        if (winnerPlayer != 0) {
            if (winnerPlayer == 1) {
                Toast.makeText(requireContext(), "X Wins !!!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(requireContext(), "O Wins !!!", Toast.LENGTH_LONG).show()
            }

            disableButtons()
        }
        if (winnerPlayer == 0 && counter == 9) {
            Toast.makeText(requireContext(), "DRAW!", Toast.LENGTH_LONG).show()
        }

    }

    private fun disableButtons() {

        binding.button1.isEnabled = false
        binding.button2.isEnabled = false
        binding.button3.isEnabled = false
        binding.button4.isEnabled = false
        binding.button5.isEnabled = false
        binding.button6.isEnabled = false
        binding.button7.isEnabled = false
        binding.button8.isEnabled = false
        binding.button9.isEnabled = false

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    }
