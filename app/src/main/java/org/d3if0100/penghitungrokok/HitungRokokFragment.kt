package org.d3if0100.penghitungrokok

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import org.d3if0100.penghitungrokok.databinding.FragmentHitungRokokBinding
import org.d3if0100.penghitungrokok.model.MerkRokok
import org.d3if0100.penghitungrokok.model.RokokViewModel

class HitungRokokFragment : Fragment() {

    private lateinit var binding: FragmentHitungRokokBinding
    private lateinit var rokokViewModel: RokokViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHitungRokokBinding.inflate(inflater, container, false)
        rokokViewModel = RokokViewModel()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
         // Tombol Cek
        binding.cek.setOnClickListener {
            penentuanHarga()
        }

        // Tombol Reset
        binding.resetButton.setOnClickListener {
            resetPage()
        }
    }

    // Cek
    private fun penentuanHarga() {
        var jenisInput = binding.spinerJenisRokok.selectedItem.toString()
        Log.d("tes", jenisInput)
         val jenisId = binding.radioGroup.checkedRadioButtonId
            val jenisString = resources.getResourceEntryName(jenisId)
        // Sampoerna
        val text = rokokViewModel.cekRokok(jenisInput,jenisString)
        binding.textView4.text = text
    }


    // Reset
    private fun resetPage() {
        binding.spinerJenisRokok.setSelection(0)
        binding.radioGroup.clearCheck()
        binding.textView4.text = "Harga : -"
    }


}