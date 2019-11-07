package jp.techacademy.kinugawa.mikako.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        val sum = editText1.text
        val sum2 = editText2.text
        var answer: Double = 1.0

        if (v!!.id == R.id.button1) {
            answer = sum + sum2

        } else if (v!!.id == R.id.button2) {
            answer = sum - sum2

        } else if (v!!.id == R.id.button3) {
            answer = sum * sum2

        } else if (v!!.id == R.id.button4) {
            answer = sum / sum2

        }

        val intent = Intent(this, SecondActivity::class.java)

        intent.putExtra("VALUE1", answer)

        startActivity(intent)
    }

}
