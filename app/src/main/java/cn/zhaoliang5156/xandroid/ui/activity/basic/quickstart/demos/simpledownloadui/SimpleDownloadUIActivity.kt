package cn.zhaoliang5156.xandroid.ui.activity.basic.quickstart.demos.simpledownloadui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import cn.zhaoliang5156.xandroid.R
import kotlinx.android.synthetic.main.activity_simple_download_ui.*

/**
 * 简单的模拟下载界面
 * 需求：
 *      1. 界面上有一个按钮点击提示下载中，并改变按钮文字
 */
class SimpleDownloadUIActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_download_ui)

        title = getString(R.string.download)

        // 给按钮设置点击事件
        btnDownload.setOnClickListener {
            // 改变按钮的文字
            btnDownload.text = getString(R.string.downloading)
            // 界面弹出提示
            Toast.makeText(this@SimpleDownloadUIActivity, getString(R.string.downloading), Toast.LENGTH_SHORT).show()
        }
    }
}
