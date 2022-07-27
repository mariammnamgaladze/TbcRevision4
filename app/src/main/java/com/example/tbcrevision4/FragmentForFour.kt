package com.example.tbcrevision4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.tbcrevision4.databinding.FragmentForFourBinding


class FragmentForFour : Fragment(),View.OnClickListener {

    var counter = 0

    private var player = 1

    private var player1 = mutableListOf<Int>()
    private var player2 =mutableListOf<Int>()


    private var _binding: FragmentForFourBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentForFourBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        binding.apply {
            button1.setOnClickListener(this@FragmentForFour)
            button2.setOnClickListener(this@FragmentForFour)
            button3.setOnClickListener(this@FragmentForFour)
            button4.setOnClickListener(this@FragmentForFour)
            button5.setOnClickListener(this@FragmentForFour)
            button6.setOnClickListener(this@FragmentForFour)
            button7.setOnClickListener(this@FragmentForFour)
            button8.setOnClickListener(this@FragmentForFour)
            button9.setOnClickListener(this@FragmentForFour)
            button10.setOnClickListener(this@FragmentForFour)
            button11.setOnClickListener(this@FragmentForFour)
            button12.setOnClickListener(this@FragmentForFour)
            button13.setOnClickListener(this@FragmentForFour)
            button14.setOnClickListener(this@FragmentForFour)
            button15.setOnClickListener(this@FragmentForFour)
            button16.setOnClickListener(this@FragmentForFour)

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
                R.id.button10 -> buttonNumber = 10
                R.id.button11 -> buttonNumber = 11
                R.id.button12 -> buttonNumber = 12
                R.id.button13 -> buttonNumber = 13
                R.id.button14 -> buttonNumber = 14
                R.id.button15 -> buttonNumber = 15
                R.id.button16 -> buttonNumber = 16

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
            player1.contains(1) && player1.contains(2) && player1.contains(3) && player1.contains(4) -> winnerPlayer = 1
            player2.contains(1) && player2.contains(2) && player2.contains(3)&& player2.contains(4) -> winnerPlayer = 2

            player1.contains(5) && player1.contains(6) && player1.contains(7) && player1.contains(8) -> winnerPlayer = 1
            player2.contains(5) && player2.contains(6) && player2.contains(7)&& player2.contains(8) -> winnerPlayer = 2

            player1.contains(9) && player1.contains(10) && player1.contains(11) && player1.contains(12) -> winnerPlayer = 1
            player2.contains(9) && player2.contains(10) && player2.contains(11)&& player2.contains(12) -> winnerPlayer = 2

            player1.contains(13) && player1.contains(14) && player1.contains(15) && player1.contains(16) -> winnerPlayer = 1
            player2.contains(13) && player2.contains(14) && player2.contains(15)&& player2.contains(16) -> winnerPlayer = 2

            player1.contains(1) && player1.contains(5) && player1.contains(9) && player1.contains(13) -> winnerPlayer = 1
            player2.contains(1) && player2.contains(5) && player2.contains(9)&& player2.contains(13) -> winnerPlayer = 2

            player1.contains(2) && player1.contains(6) && player1.contains(10) && player1.contains(14) -> winnerPlayer = 1
            player2.contains(2) && player2.contains(6) && player2.contains(10)&& player2.contains(14) -> winnerPlayer = 2

            player1.contains(3) && player1.contains(7) && player1.contains(11) && player1.contains(15) -> winnerPlayer = 1
            player2.contains(3) && player2.contains(7) && player2.contains(11)&& player2.contains(15) -> winnerPlayer = 2

            player1.contains(4) && player1.contains(8) && player1.contains(12) && player1.contains(16) -> winnerPlayer = 1
            player2.contains(4) && player2.contains(8) && player2.contains(12)&& player2.contains(16) -> winnerPlayer = 2



            player1.contains(1) && player1.contains(6) && player1.contains(11) && player1.contains(16) -> winnerPlayer = 1
            player2.contains(1) && player2.contains(6) && player2.contains(11)&& player2.contains(16) -> winnerPlayer = 2

            player1.contains(4) && player1.contains(7) && player1.contains(10) && player1.contains(13) -> winnerPlayer = 1
            player2.contains(4) && player2.contains(7) && player2.contains(10)&& player2.contains(13) -> winnerPlayer = 2
        }


        if (winnerPlayer != 0) {
            if (winnerPlayer == 1) {
                Toast.makeText(requireContext(), "X Wins !!!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(requireContext(), "O Wins !!!", Toast.LENGTH_LONG).show()
            }

            disableButtons()
        }
        if (winnerPlayer == 0 && counter == 16) {
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
        binding.button10.isEnabled = false
        binding.button11.isEnabled = false
        binding.button12.isEnabled = false
        binding.button13.isEnabled = false
        binding.button14.isEnabled = false
        binding.button15.isEnabled = false
        binding.button16.isEnabled = false

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}