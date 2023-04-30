package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ExpandableListView
import android.widget.Toast
import com.example.practice.databinding.ActivitySecond2Binding


class SecondActivity2 : AppCompatActivity() {

    private lateinit var listViewAdapter: ExpandableListAdapter
    private lateinit var chapterList: List<String>
    private lateinit var topicList: HashMap<String, List<String>>
    private lateinit var binding: ActivitySecond2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecond2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        showList()

        listViewAdapter = ExpandableListAdapter(binding.root.context, chapterList, topicList)
        binding.listView.setAdapter(listViewAdapter)


    }

    private fun showList() {
        chapterList = ArrayList()
        topicList = HashMap()

        (chapterList as ArrayList<String>).add("    Понеділок")
        (chapterList as ArrayList<String>).add("    Вівторок")
        (chapterList as ArrayList<String>).add("    Середа")
        (chapterList as ArrayList<String>).add("    Четвер")
        (chapterList as ArrayList<String>).add("    П'ятниця")
        (chapterList as ArrayList<String>).add("    Субота")

        val topic1 : MutableList<String> = ArrayList()
        topic1.add("Конференція з виробничої практики\n\n11:30-12:50\n\n1412")
        topic1.add("Конференція з виробничої практики\n\n13:00-14:20\n\n1412")


        val topic2 : MutableList<String> = ArrayList()
        topic2.add("Захист виробничої практики\n\n10:00-11:20\n\n1402")
        topic2.add("Захист виробничої практики\n\n11:30-12:50\n\n1402")
        topic2.add(" ")
        topic2.add("Бази даних\n\n14:30-15:50\n\n1409")
        topic2.add("Командна розробка програмних проектів\n\n16:00-17:20\n\n1412")

        val topic3 : MutableList<String> = ArrayList()
        topic3.add("Бази даних\n\n13:00-14:20\n\n1406")
        topic3.add("Англійська мова\n\n14:30-15:50\n\nОнлайн")


        val topic4 : MutableList<String> = ArrayList()
        topic4.add("Програмування на Python\n\n13:00-14:20\n\n1406")
        topic4.add("Командна розробка програмних проектів\n\n14:30-15:50\n\n1412")


        val topic5 : MutableList<String> = ArrayList()
        topic5.add("Архітектура та проектування ПЗ\n\n8:30-9:50\n\n1412")
        topic5.add("Архітектура та проектування ПЗ\n\n10:00-11:20\n\n1412")
        topic5.add("3D-моделювання\n\n11:30-12:50\n\n1409")
        topic5.add("3D-моделювання\n\n13:00-14:20\n\n1409")

        val topic6 : MutableList<String> = ArrayList()
        topic6.add("Вихідний")

        topicList[chapterList[0]] = topic1
        topicList[chapterList[1]] = topic2
        topicList[chapterList[2]] = topic3
        topicList[chapterList[3]] = topic4
        topicList[chapterList[4]] = topic5
        topicList[chapterList[5]] = topic6

    }

}