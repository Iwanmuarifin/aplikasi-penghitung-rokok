package org.d3if0100.penghitungrokok

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
//        Handler().postDelayed({
//            findNavController().navigate(R.id.action_homeFragment_to_hitungRokokFragment)
//        }, 3000)

        object : Thread() {
            override fun run() {
                sleep(3000)
                runCatching {
                    findNavController().navigate(R.id.action_homeFragment_to_hitungRokokFragment)
                }
            }
        }.start()
    }
}