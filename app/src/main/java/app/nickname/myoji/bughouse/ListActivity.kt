package app.nickname.myoji.bughouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    private val taskList: MutableList<Task> = mutableListOf(
        Task("Task 1"),
        Task("Task 2"),
        Task("Task 3")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val adapter = TaskAdapter(this, object: TaskAdapter.ItemClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent(this@ListActivity, DetailActivity::class.java)
                intent.putExtra("TASK_NAME", taskList[position].name)
                startActivity(intent)
            }
        })

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        adapter.addAll(taskList)

        addButton.setOnClickListener {
            val name:String = editText.text.toString()
            val addTask = Task(name)
            taskList.add(addTask)
            adapter.addAll(taskList)
        }
    }

}