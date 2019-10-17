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
    private lateinit var thirdActivityButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        setListener()

    }

  

   private fun setListener() {
       secondActivityButton=findViewById(R.id.second_activity_button)
       thirdActivityButton=findViewById(R.id.third_activity_button)

       secondActivityButton.setOnClickListener {
           val intentSecond = Intent(this@FirstActivity, SecondActivity::class.java)
           startActivityForResult(intentSecond,1)
       }

       thirdActivityButton.setOnClickListener{
           val intentThird = Intent(this@FirstActivity, ThirdActivity::class.java)
           startActivityForResult(intentThird,2)
       }
   }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if(requestCode==1){
            if(resultCode== Activity.RESULT_OK){
                val toast =  Toast.makeText(this,"Кнопка была нажата в SecondActivity", Toast.LENGTH_SHORT)
                toast.show()

            }else{
                val toast =  Toast.makeText(this,"На кнопку в SecondActivity никто не нажимал", Toast.LENGTH_SHORT)
                toast.show()

            }
        }
        else if (requestCode==2) {
            if(resultCode== Activity.RESULT_OK){
            val toast =  Toast.makeText(this,"Кнопка была нажата в ThirdActivity", Toast.LENGTH_SHORT)
            toast.show()

        }else{
            val toast =  Toast.makeText(this,"На кнопку в ThirdActivity никто не нажимал", Toast.LENGTH_SHORT)
            toast.show()

        }}
        super.onActivityResult(requestCode, resultCode, data)
    }





   }








