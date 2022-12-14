package com.example.testmap

import android.content.Context
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.testmap.databinding.FragmentRestaurantListBinding
import com.example.testmap.overview.OverviewViewModel


class restaurant_list : Fragment() {

    lateinit var MapsActivity: MapsActivity
    private val viewModel: OverviewViewModel by viewModels()

    override fun onAttach(context: Context) {
        super.onAttach(context)

        MapsActivity = context as MapsActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val binding = FragmentRestaurantListBinding.inflate(inflater)

        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        val textView = binding.root.findViewById<TextView>(R.id.mars_json)
        textView.movementMethod = ScrollingMovementMethod.getInstance()


        return binding.root
    }
}