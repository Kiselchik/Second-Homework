package bonch.dev.school

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class FirstActivity : AppCompatActivity() {


    private lateinit var secondActivityButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        setListener()

    }



   private fun setListener() {
       secondActivityButton=findViewById(R.id.second_activity_button)
       secondActivityButton.setOnClickListener {
           val intent = Intent(this@FirstActivity, SecondActivity::class.java)
           startActivityForResult(intent,1)
       }
   }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if(requestCode==1){
            if(resultCode== Activity.RESULT_OK){
                val toast =  Toast.makeText(this,"Кнопка была нажата", Toast.LENGTH_SHORT)
                toast.show()

            }else{
                val toast =  Toast.makeText(this,"На кнопку никто не нажимал", Toast.LENGTH_SHORT)
                toast.show()

            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
    

   }








