package jp.techacademy.kinugawa.mikako.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        val intent = Intent(this, SecondActivity::class.java)

        val sum1 = editText1.text.toString()
        val sum2 = editText2.text.toString()

        val number1 = sum1.toDouble()
        val number2 = sum2.toDouble()

        var answer: Double = 1.0

        if (v.id == R.id.button1) {
            answer = number1 + number2

        } else if (v.id == R.id.button2) {
            answer = number1 - number2

        } else if (v.id == R.id.button3) {
            answer = number1 * number2

        } else if (v.id == R.id.button4) {
            answer = number1 / number2
        }

        if (sum1 == "" || sum2 == "") {
            fab.setOnClickListener { view ->
                Snackbar.make(view, "何か数値を入力してください", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Action"){
                            Log.d("UI_PARTS", "Snackbarをタップした")
                        }.show()
            }

        }
1
        Log.d("UI_PARTS", "${answer}")
        intent.putExtra("VALUE1", answer)

        startActivity(intent)
    }

}
