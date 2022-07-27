package com.example.tbcrevision4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.tbcrevision4.databinding.FragmentForFiveBinding

class FragmentForFive : Fragment(), View.OnClickListener {

    var counter = 0

    private var Player = 1

    private var player1 = mutableListOf<Int>()
    private var player2 = mutableListOf<Int>()


    private var _binding: FragmentForFiveBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentForFiveBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {

        binding.apply {


            button1.setOnClickListener(this@FragmentForFive)
            button2.setOnClickListener(this@FragmentForFive)
            button3.setOnClickListener(this@FragmentForFive)
            button4.setOnClickListener(this@FragmentForFive)
            button5.setOnClickListener(this@FragmentForFive)
            button6.setOnClickListener(this@FragmentForFive)
            button7.setOnClickListener(this@FragmentForFive)
            button8.setOnClickListener(this@FragmentForFive)
            button9.setOnClickListener(this@FragmentForFive)
            button10.setOnClickListener(this@FragmentForFive)
            button11.setOnClickListener(this@FragmentForFive)
            button12.setOnClickListener(this@FragmentForFive)
            button13.setOnClickListener(this@FragmentForFive)
            button14.setOnClickListener(this@FragmentForFive)
            button15.setOnClickListener(this@FragmentForFive)
            button16.setOnClickListener(this@FragmentForFive)
            button17.setOnClickListener(this@FragmentForFive)
            button18.setOnClickListener(this@FragmentForFive)
            button19.setOnClickListener(this@FragmentForFive)
            button20.setOnClickListener(this@FragmentForFive)
            button21.setOnClickListener(this@FragmentForFive)
            button22.setOnClickListener(this@FragmentForFive)
            button23.setOnClickListener(this@FragmentForFive)
            button24.setOnClickListener(this@FragmentForFive)
            button25.setOnClickListener(this@FragmentForFive)
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
                R.id.button17 -> buttonNumber = 16
                R.id.button18 -> buttonNumber = 16
                R.id.button19 -> buttonNumber = 16
                R.id.button20 -> buttonNumber = 16
                R.id.button21 -> buttonNumber = 16
                R.id.button22 -> buttonNumber = 16
                R.id.button23 -> buttonNumber = 16
                R.id.button24 -> buttonNumber = 16
                R.id.button25 -> buttonNumber = 16

            }

            if (buttonNumber != 0) {
                game(clickedView, buttonNumber)
            }
        }
    }

    private fun game(clickedView: Button, buttonNumber: Int) {
        if (Player == 1) {
            clickedView.text = "X"
            player1.add(buttonNumber)
            counter += 1
            Player = 2
        } else {
            clickedView.text = "O"
            player2.add(buttonNumber)
            counter += 1
            Player = 1
        }
        clickedView.isEnabled = false
        check()
    }

    private fun check() {

        var winnerPlayer = 0

        when {
            player1.contains(1) && player1.contains(2) && player1.contains(3) && player1.contains(4) && player1.contains(
                5
            ) -> winnerPlayer = 1
            player2.contains(1) && player2.contains(2) && player2.contains(3) && player1.contains(4) && player2.contains(
                5
            ) -> winnerPlayer = 2

            player1.contains(6) && player1.contains(7) && player1.contains(8) && player1.contains(9) && player1.contains(
                10
            ) -> winnerPlayer = 1
            player2.contains(6) && player2.contains(7) && player2.contains(8) && player1.contains(9) -> winnerPlayer =
                2

            player1.contains(11) && player1.contains(12) && player1.contains(13) && player1.contains(
                14
            ) && player1.contains(15) -> winnerPlayer = 1
            player2.contains(11) && player2.contains(12) && player2.contains(13) && player2.contains(
                14
            ) && player2.contains(15) -> winnerPlayer = 2

            player1.contains(16) && player1.contains(17) && player1.contains(18) && player1.contains(
                19
            ) && player1.contains(20) -> winnerPlayer = 1
            player2.contains(16) && player2.contains(17) && player2.contains(18) && player2.contains(
                19
            ) && player2.contains(20) -> winnerPlayer = 2

            player1.contains(21) && player1.contains(22) && player1.contains(23) && player1.contains(
                24
            ) && player1.contains(25) -> winnerPlayer = 1
            player2.contains(21) && player2.contains(22) && player2.contains(23) && player2.contains(
                24
            ) && player2.contains(25) -> winnerPlayer = 2


            player1.contains(1) && player1.contains(6) && player1.contains(11) && player1.contains(
                16
            ) && player1.contains(21) -> winnerPlayer = 1
            player2.contains(1) && player2.contains(6) && player2.contains(11) && player2.contains(
                16
            ) && player2.contains(21) -> winnerPlayer = 2

            player1.contains(2) && player1.contains(7) && player1.contains(12) && player1.contains(
                17
            ) && player1.contains(22) -> winnerPlayer = 1
            player2.contains(2) && player2.contains(7) && player2.contains(12) && player2.contains(
                17
            ) && player2.contains(22) -> winnerPlayer = 2

            player1.contains(3) && player1.contains(8) && player1.contains(13) && player1.contains(
                18
            ) && player1.contains(23) -> winnerPlayer = 1
            player2.contains(3) && player2.contains(8) && player2.contains(13) && player2.contains(
                18
            ) && player2.contains(23) -> winnerPlayer = 2

            player1.contains(4) && player1.contains(9) && player1.contains(14) && player1.contains(
                19
            ) && player1.contains(24) -> winnerPlayer = 1
            player2.contains(4) && player2.contains(9) && player2.contains(14) && player2.contains(
                19
            ) && player2.contains(24) -> winnerPlayer = 2

            player1.contains(5) && player1.contains(10) && player1.contains(15) && player1.contains(
                20
            ) && player1.contains(25) -> winnerPlayer = 1
            player2.contains(5) && player2.contains(10) && player2.contains(15) && player2.contains(
                20
            ) && player2.contains(25) -> winnerPlayer = 2

        }


        if (winnerPlayer != 0) {
            if (winnerPlayer == 1) {
                Toast.makeText(requireContext(), "X Wins !!!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(requireContext(), "O Wins !!!", Toast.LENGTH_LONG).show()
            }

            disableButtons()
        }
        if (winnerPlayer == 0 && counter == 25) {
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
        binding.button17.isEnabled = false
        binding.button18.isEnabled = false
        binding.button19.isEnabled = false
        binding.button20.isEnabled = false
        binding.button21.isEnabled = false
        binding.button22.isEnabled = false
        binding.button23.isEnabled = false
        binding.button24.isEnabled = false
        binding.button25.isEnabled = false

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}
