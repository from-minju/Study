package org.techtown.mysololife.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import org.techtown.mysololife.contentsList.ContentListActivity
import org.techtown.mysololife.R
import org.techtown.mysololife.databinding.FragmentTipBinding

class TipFragment : Fragment() {

    private lateinit var binding : FragmentTipBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tip, container, false)

        binding.category1.setOnClickListener {

            val intent = Intent(context, ContentListActivity::class.java)
            intent.putExtra("category", "category1") //category1이나 2가 ContentListActivity.kt의 category변수에 들어감
            startActivity(intent)

        }

        binding.category2.setOnClickListener {
            val intent = Intent(context, ContentListActivity::class.java)
            intent.putExtra("category", "category2")
            startActivity(intent)

        }


        binding.homeTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_tipFragment_to_homeFragment)
        }

        binding.talkTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_tipFragment_to_talkFragment)
        }

        binding.bookmarkTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_tipFragment_to_bookmarkFragment)
        }

        binding.storeTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_tipFragment_to_storeFragment)
        }

        return binding.root
    }


}