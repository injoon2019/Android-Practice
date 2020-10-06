package com.example.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User(R.drawable.android, "인준", "27", "안녕하세요"),
        User(R.drawable.android, "인준1", "27", "안녕하세요"),
        User(R.drawable.android, "인준2", "27", "안녕하세요"),
        User(R.drawable.android, "인준3", "27", "안녕하세요"),
        User(R.drawable.android, "인준4", "27", "안녕하세요"),
        User(R.drawable.android, "인준5", "27", "안녕하세요"),
        User(R.drawable.android, "인준6", "27", "안녕하세요"),
        User(R.drawable.android, "인준7", "27", "안녕하세요"),
        User(R.drawable.android, "인준8", "27", "안녕하세요"),
        User(R.drawable.android, "인준9", "27", "안녕하세요"),
        User(R.drawable.android, "인준10", "27", "안녕하세요"),
        User(R.drawable.android, "인준11", "27", "안녕하세요")

    )

    override fun onCreate(savedInstanceState: Bundle?) { //액티비티의 실행 시작 지점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val item = arrayOf("사과", "배", "딸기", "키위", "인준")
//        //listView는 항상 Adapter에 연결이 되어있어야한다
//        //context란 한 액티비티의 모든 정보를 의미한다
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

        val Adapter = UserAdapter(this, UserList)
        listView.adapter = Adapter

        //클릭했을 때, 어떤 일을 만들기 위해서
        listView.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()
        }
    }
}