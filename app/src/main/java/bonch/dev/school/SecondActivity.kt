package bonch.dev.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView=findViewById(R.id.text_view)

        val counterValue = intent.getIntExtra("TAP_KEY", 0)
        val currentIndicator = intent.getBooleanExtra("TAP_INDICATOR", true)
        val  currentEdit= intent.getStringExtra("EDIT_TEXT")

        textView.text = "tap - $counterValue  indicator -  $currentIndicator   $currentEdit"

    }
}
