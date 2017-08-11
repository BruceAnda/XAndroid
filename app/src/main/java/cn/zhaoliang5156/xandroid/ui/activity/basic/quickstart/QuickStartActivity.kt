package cn.zhaoliang5156.xandroid.ui.activity.basic.quickstart

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import cn.zhaoliang5156.xandroid.R
import cn.zhaoliang5156.xandroid.adapter.ListAdapter
import cn.zhaoliang5156.xandroid.ui.activity.basic.quickstart.demos.helloworld.HelloWorldActivity
import cn.zhaoliang5156.xandroid.ui.activity.basic.quickstart.demos.simpledownloadui.SimpleDownloadUIActivity
import cn.zhaoliang5156.xandroid.ui.activity.basic.quickstart.demos.simplelight.SimpleLightActivity
import kotlinx.android.synthetic.main.activity_quick_start.*

/**
 * 快速入门
 * 需求：
 *      1. 搭建Android开发环境
 *      2. 快速开发第一个Android程序
 *      3. 开发简单模拟下载界面，联系Android开发的基本流程和点击事件的写法
 */
class QuickStartActivity : AppCompatActivity() {

    // 意图目的地对象
    private val mTargets = arrayOf(HelloWorldActivity::class.java, SimpleDownloadUIActivity::class.java, SimpleLightActivity::class.java)

    // 点击事件对象
    private val mOnListItemClickListener = object : ListAdapter.OnListItemClickListener {
        override fun onItemClick(view: View, postion: Int) {
            // 界面跳转
            startActivity(Intent(this@QuickStartActivity, mTargets[postion]))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 设置标题
        title = getString(R.string.quick_start)

        // 设置布局界面
        setContentView(R.layout.activity_quick_start)

        // 给RecycleView设置布局管理器
        quickStartList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        // 初始化数据适配器
        val listAdapter = ListAdapter(this, resources.getStringArray(R.array.QuickStart))
        // 设置点击事件
        listAdapter.mOnListItemClickListener = mOnListItemClickListener
        // 设置适配器
        quickStartList.adapter = listAdapter
    }
}
