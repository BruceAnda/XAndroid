package cn.zhaoliang5156.xandroid.ui.activity.basic.quickstart.demos.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import cn.zhaoliang5156.xandroid.R

/**
 * HelloWorld
 * 需求：
 *      1. 在界面上显示HelloWorld的字样
 */
class HelloWorldActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)

        title = getString(R.string.hello_world)
    }
}
