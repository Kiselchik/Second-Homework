package bonch.dev.school

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    private lateinit var finishButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setListener()

    }

    private fun setListener(){
        finishButton=findViewById(R.id.finish_button)
        finishButton.setOnClickListener{
            val data = Intent(this@SecondActivity, FirstActivity::class.java)
            setResult(Activity.RESULT_OK, data )
            finish()

        }

    }
}
