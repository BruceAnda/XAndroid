package cn.zhaoliang5156.xandroid.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import cn.zhaoliang5156.xandroid.base.BaseFragment

/**
 * 主界面适配器
 * Created by zhaoliang on 2017/8/8.
 */
class MainPagerAdapter(fm: FragmentManager, var pagers: ArrayList<BaseFragment>) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return pagers[position]
    }

    override fun getCount(): Int {
        return pagers.size
    }
}