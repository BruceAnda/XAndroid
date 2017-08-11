package cn.zhaoliang5156.xandroid.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cn.zhaoliang5156.xandroid.R
import kotlinx.android.synthetic.main.list_item.view.*

/**
 * 列表适配器
 * Created by zhaoliang on 2017/8/8.
 */
class ListAdapter(var context: Context, var titles: Array<String>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        // 返回Holder对象
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // 绑定数据
        holder.bind(titles[position])
        // 设置点击事件
        if (mOnListItemClickListener != null) {
            holder.itemView.setOnClickListener {
                mOnListItemClickListener.onItemClick(holder.itemView, position)
            }
        }
    }

    override fun getItemCount(): Int {
        // 返回列表项数量
        return titles.size
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(title: String) {
            itemView.tvTitle.text = title
        }
    }

    lateinit var mOnListItemClickListener: OnListItemClickListener

    // 点击回调接口
    interface OnListItemClickListener {
        fun onItemClick(view: View, postion: Int)
    }
}