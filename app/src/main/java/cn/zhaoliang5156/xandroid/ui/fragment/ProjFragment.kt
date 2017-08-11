package cn.zhaoliang5156.xandroid.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import cn.zhaoliang5156.xandroid.R
import cn.zhaoliang5156.xandroid.base.BaseFragment


/**
 * A simple [Fragment] subclass.
 */
class ProjFragment : BaseFragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_porj, container, false)
    }

}// Required empty public constructor
