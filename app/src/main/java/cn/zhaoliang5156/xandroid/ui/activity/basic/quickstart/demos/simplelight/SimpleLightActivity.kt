package cn.zhaoliang5156.xandroid.ui.activity.basic.quickstart.demos.simplelight

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import cn.zhaoliang5156.xandroid.R
import kotlinx.android.synthetic.main.activity_simple_light.*

/**
 * 简易手电筒
 * 需求：
 *      1. 界面上有三个按钮红、绿、蓝点击改变window背景颜色
 */
class SimpleLightActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_light)

        // 设置标题
        title = getString(R.string.simple_light)

        // 给按钮设置点击事件
        btnRed.setOnClickListener {
            setWindowBackground(Color.RED)
        }
        btnGreen.setOnClickListener {
            setWindowBackground(Color.GREEN)
        }
        btnBlue.setOnClickListener {
            setWindowBackground(Color.BLUE)
        }
    }

    /**
     * 设置窗口背景颜色
     */
    private fun setWindowBackground(color: Int) {
        window.setBackgroundDrawable(ColorDrawable(color))
    }
}
