package bonch.dev.school

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity: AppCompatActivity() {

    private lateinit var finishButtonTwo: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        setListener()
    }

    private fun setListener(){
        finishButtonTwo=findViewById(R.id.finish_button_two)
        finishButtonTwo.setOnClickListener{
            val data = Intent(this@ThirdActivity, FirstActivity::class.java)
            setResult(Activity.RESULT_OK, data )
            finish()

        }}

}