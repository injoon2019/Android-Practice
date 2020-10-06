package com.example.textviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {    //액티비티가 실행되면 이곳을 수행한다
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_getText.setOnClickListener{//edit 텍스트에 입력되어있는 값을 가지고와서 텍스트 뷰에 뿌려준다
            var resultText = et_id.text.toString()  //edit text에 입력되어있는 값
            tv_result.setText(resultText)

        }
    }
}