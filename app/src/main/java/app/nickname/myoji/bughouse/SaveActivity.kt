package app.nickname.myoji.bughouse

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_save.*

class SaveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)

        saveButton.setOnClickListener {
            val text = input.text
            editor.putString("SAVE", text.toString())
        }
    }

    val sharedPreferences = getSharedPreferences("Second", Context.MODE_PRIVATE)
    var editor = sharedPreferences.edit()
}
