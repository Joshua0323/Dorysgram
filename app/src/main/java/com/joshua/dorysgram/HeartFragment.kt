package com.joshua.dorysgram

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.joshua.dorysgram.databinding.FragmentHeartBinding
import com.joshua.dorysgram.databinding.FragmentMainBinding

class HeartFragment : Fragment() {
    private var _binding: FragmentHeartBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHeartBinding.inflate(inflater, container, false)
        return binding.root
    }
}

