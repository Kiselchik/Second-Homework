package bonch.dev.school

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import bonch.dev.school.fragment.MyFragment

class FragmentActivity : AppCompatActivity() {

    val fm = supportFragmentManager

    private lateinit var counterButton: Button
    private lateinit var counter: Counter
    private lateinit var textField: TextView
    private lateinit var indicatorButton: Button
    private lateinit var attachFragmentButton: Button
    private lateinit var editText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        counter = Counter()


        counter = if (savedInstanceState == null) {
            Counter()
        } else {
            Counter(savedInstanceState.getInt("TAP_AMOUNTS"))
        }
        initializeView()
        textField.text = "Button was tapped ${counter.currentCount} times"
        setListener()


    }

    private fun initializeView() {
        counterButton = findViewById(R.id.counter_button)
        textField = findViewById(R.id.text_field)
        indicatorButton = findViewById(R.id.indicator_button)
        attachFragmentButton = findViewById(R.id.attach_fragment_button)
        editText = findViewById(R.id.edit_text)

    }


    private fun setListener() {
        counterButton.setOnClickListener {
            counter.increment()
            textField.text = "Button was tapped ${counter.currentCount}"

        }


        val bundle = Bundle()

        attachFragmentButton.setOnClickListener {
            val firstFragment = MyFragment()

            bundle.putInt("TAP_CURRENT", counter.currentCount)
            bundle.putString("EDIT_TEXT", editText.getText().toString())

            firstFragment.setArguments(bundle)
            fm.beginTransaction()
                .add(R.id.fragment_container, firstFragment)
                .commit()
        }

        var indic = true
        indicatorButton.setOnClickListener {

            indicatorButton.isEnabled = false
            indic == false

            bundle.putBoolean("INDIC", indic)
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("TAP_AMOUNTS", counter.currentCount)
    }


}
