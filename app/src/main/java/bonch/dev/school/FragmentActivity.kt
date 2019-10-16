package bonch.dev.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bonch.dev.school.fragment.FirstFragment
import bonch.dev.school.fragment.SecondFragment

class FragmentActivity : AppCompatActivity() {


    val fm = supportFragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val firstFragment = FirstFragment()
        fm.beginTransaction()
            .add(R.id.my_fragment, firstFragment)
            .commit()


    }

    fun replaceFragment() {
        val fragment = SecondFragment()
        fm.beginTransaction()
            .replace(R.id.my_fragment, fragment)
            .addToBackStack("second_fragment")
            .commit()
    }


}
