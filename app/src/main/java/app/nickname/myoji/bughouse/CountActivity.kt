package app.nickname.myoji.bughouse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_count.*

class CountActivity : AppCompatActivity() {
    var number: Int = 0
<<<<<<< HEAD
//    コミットできない
=======

>>>>>>> hotfix
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

<<<<<<< HEAD
        botton.setOnClickListener {
=======
        button.setOnClickListener {
>>>>>>> hotfix
            number += 1
            textView.text = number.toString()
        }
    }
}

    }
}