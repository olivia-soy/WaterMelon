package net.soy.watermelon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class MainViewPageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_main_test, container, false)

        view.findViewById<Button>(R.id.all_list).setOnClickListener {
            view.findNavController().navigate(R.id.action_all_list)
        }
        view.findViewById<Button>(R.id.my_list).setOnClickListener {
            view.findNavController().navigate(R.id.action_my_list)
        }

        return view

    }

}