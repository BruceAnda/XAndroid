package cn.zhaoliang5156.xandroid.ui.activity.basic

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import cn.zhaoliang5156.xandroid.R
import cn.zhaoliang5156.xandroid.adapter.ListAdapter
import cn.zhaoliang5156.xandroid.base.BaseActivity
import cn.zhaoliang5156.xandroid.ui.activity.basic.quickstart.QuickStartActivity
import kotlinx.android.synthetic.main.activity_basic.*

/**
 * 核心基础
 */
class BasicActivity : BaseActivity() {

    // 跳转的目的地
    private val mTargets = arrayOf(QuickStartActivity::class.java)

    // 点击事件
    private val mOnListItemClickListener = object : ListAdapter.OnListItemClickListener {
        override fun onItemClick(view: View, postion: Int) {
            startActivity(Intent(this@BasicActivity, mTargets[postion]))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic)

        // 设置标题
        setTitle("核心基础")

        // 设置布局管理器
        basicList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // 初始化适配器
        val listAdapter = ListAdapter(this, resources.getStringArray(R.array.CoreBasic))
        // 设置点击事件
        listAdapter.mOnListItemClickListener = mOnListItemClickListener
        // 设置适配器
        basicList.adapter = listAdapter
    }
}
