package com.example.practice

import android.widget.BaseExpandableListAdapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ExpandableListAdapter internal constructor(private  val context: Context, private val chapterList: List<String>, private val topicsList: HashMap<String, List<String>>): BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return chapterList.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return this.topicsList[this.chapterList[groupPosition]]!!.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return chapterList[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return this.topicsList[this.chapterList[groupPosition]]!![childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        var chapterTitle = getGroup(groupPosition) as String

        if(convertView == null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.chapter_list, null)
        }

        val chapterTv = convertView!!.findViewById<TextView>(R.id.chapter_tv)
        chapterTv.setText(chapterTitle)

        return convertView
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        var topicTitle = getChild(groupPosition, childPosition) as String

        if(convertView == null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.topics_list, null)
        }

        val topicTv = convertView!!.findViewById<TextView>(R.id.topics_tv)
         topicTv.setText(topicTitle)


        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }
}