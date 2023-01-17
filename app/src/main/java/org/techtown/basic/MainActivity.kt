package org.techtown.basic

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //버튼을 눌렀을 때 동작(텍스트 출력)
        button.setOnClickListener {
            Toast.makeText(applicationContext,"버튼이 눌렸어요",Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            //사용자가 입력한 글자가 있다면 그 글자를 가져와라.
            val input1 = input1.text.toString()
            output1.text = "결과 : $input1"
        }


    }
}