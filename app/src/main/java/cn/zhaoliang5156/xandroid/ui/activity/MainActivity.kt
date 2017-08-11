package cn.zhaoliang5156.xandroid.ui.activity

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import cn.zhaoliang5156.xandroid.R
import cn.zhaoliang5156.xandroid.adapter.MainPagerAdapter
import cn.zhaoliang5156.xandroid.base.BaseActivity
import cn.zhaoliang5156.xandroid.base.BaseFragment
import cn.zhaoliang5156.xandroid.ui.fragment.BasicFragment
import cn.zhaoliang5156.xandroid.ui.fragment.OtherFragment
import cn.zhaoliang5156.xandroid.ui.fragment.ProjFragment
import cn.zhaoliang5156.xandroid.ui.fragment.ThirdFragment
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 项目主界面
 * 功能：
 *      1. 底部导航
 *      2. 页面切换
 * 实现
 *      1. 布局实现
 *          a）跟布局采用纵向的LinearLayout
 *          b）第一个子View是一个ViewPager来装载多个界面
 *          c）底部是一个BottomNavigationView
 *      2. 代码实现
 *          把ViewPager和BottomNavigationView联动起来
 */
class MainActivity : BaseActivity() {

    private val mNavigationIds = arrayOf(R.id.navigation_basic, R.id.navigation_third, R.id.navigation_proj, R.id.navigation_other)
    private val mTitles = arrayOf("基础", "三方", "项目", "其他")

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            mNavigationIds[0] -> {
                vpPagers.currentItem = 0
                setTitle(mTitles[0])
                return@OnNavigationItemSelectedListener true
            }
            mNavigationIds[1] -> {
                vpPagers.currentItem = 1
                setTitle(mTitles[1])
                return@OnNavigationItemSelectedListener true
            }
            mNavigationIds[2] -> {
                vpPagers.currentItem = 2
                setTitle(mTitles[2])
                return@OnNavigationItemSelectedListener true
            }
            mNavigationIds[3] -> {
                vpPagers.currentItem = 3
                setTitle(mTitles[3])
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }

    private val mOnPagerChangeListener = object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(state: Int) {
            //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onPageSelected(position: Int) {
            navigation.selectedItemId = mNavigationIds[position]
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle(mTitles[0])

        // 初始化页面
        val pagers = ArrayList<BaseFragment>()
        pagers.add(BasicFragment())
        pagers.add(ThirdFragment())
        pagers.add(ProjFragment())
        pagers.add(OtherFragment())
        vpPagers.adapter = MainPagerAdapter(supportFragmentManager, pagers)

        // 添加页面改变监听
        vpPagers.addOnPageChangeListener(mOnPagerChangeListener)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
