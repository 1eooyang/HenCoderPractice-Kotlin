package com.github.sfyc23.hencoderpractice.main

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hencoder.hencoderpracticedraw1.kt.practice1View
import org.jetbrains.anko.support.v4.UI

class NewPageFragment : Fragment() {

    lateinit var viewTag: String

    companion object Factory {
        val BUNDLE_KEY_TAG = "bundle_key_tag"
        fun newInstance(practiceViewTag: String) = NewPageFragment().apply {
            arguments = Bundle().apply {
                putString(BUNDLE_KEY_TAG, practiceViewTag)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        savedInstanceState?.let {
            viewTag = arguments.getString(BUNDLE_KEY_TAG)
        }
        super.onCreate(savedInstanceState)

    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = UI {
            practice1View(viewTag).apply {

            }
        }.view
        return view
    }


}


