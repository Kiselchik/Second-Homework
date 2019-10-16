package bonch.dev.school

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FirstActivity : AppCompatActivity() {


    private lateinit var counterButton: Button
    private lateinit var  counter: Counter
    private lateinit var textField: TextView
    private lateinit var indicatorButton: Button
    private lateinit var nextActivityButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        counter = Counter()


        counter=  if(savedInstanceState == null){
            Counter()
        }
        else{
            Counter(savedInstanceState.getInt("TAP_AMOUNTS"))
        }
        initializeView()
        textField.text = "Button was tapped ${counter.currentCount} times"
        setListener()
    }

    private fun initializeView(){
        counterButton=findViewById(R.id.counter_button)
        textField=findViewById(R.id.text_field)
        indicatorButton=findViewById(R.id.indicator_button)
        nextActivityButton = findViewById(R.id.next_activity_button)

    }

    private fun setListener(){
        counterButton.setOnClickListener {
            counter.increment()
            textField.text = "Button was tapped ${counter.currentCount}"

        }

        nextActivityButton.setOnClickListener {
            val intent = Intent(this@FirstActivity,SecondActivity::class.java)
            intent.putExtra("TAP_KEY", counter.currentCount)
            intent.putExtra("TAP_INDICATOR",indicatorButton.isEnabled )
            startActivity(intent)


        }

        indicatorButton.setOnClickListener{
         indicatorButton.isEnabled= false

        }

        }

       override  fun onSaveInstanceState(outState: Bundle) {
            super.onSaveInstanceState(outState)
            outState.putInt("TAP_AMOUNTS", counter.currentCount)
        }

     


    }

