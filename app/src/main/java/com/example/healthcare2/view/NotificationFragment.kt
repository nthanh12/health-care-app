package com.example.healthcare2.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.healthcare2.databinding.FragmentNotificationBinding

class NotificationFragment : Fragment() {
    private lateinit var binding: FragmentNotificationBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotificationBinding.inflate(layoutInflater)
        return binding.root
    }
}