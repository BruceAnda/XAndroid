package cn.zhaoliang5156.xandroid.ui.fragment


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import cn.zhaoliang5156.xandroid.R
import cn.zhaoliang5156.xandroid.adapter.ListAdapter
import cn.zhaoliang5156.xandroid.base.BaseActivity
import cn.zhaoliang5156.xandroid.base.BaseFragment
import cn.zhaoliang5156.xandroid.ui.activity.basic.BasicActivity
import kotlinx.android.synthetic.main.fragment_basic.*


/**
 * A simple [Fragment] subclass.
 */
class BasicFragment : BaseFragment() {

    private val mTargets = arrayOf(BasicActivity::class.java)

    // 点击事件对象
    private val mOnListItemClickListener = object : ListAdapter.OnListItemClickListener {
        override fun onItemClick(view: View, postion: Int) {
            startActivity(Intent(context, mTargets[postion]))
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_basic, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 设置布局管理器
        basicList.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        // 初始化适配器
        val listAdapter = ListAdapter(context, resources.getStringArray(R.array.Basic))
        // 设置点击事件
        listAdapter.mOnListItemClickListener = mOnListItemClickListener
        // 设置适配器
        basicList.adapter = listAdapter
    }
}// Required empty public constructor
