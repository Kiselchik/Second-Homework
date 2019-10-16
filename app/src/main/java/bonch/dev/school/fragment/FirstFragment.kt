package bonch.dev.school.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import bonch.dev.school.FragmentActivity
import bonch.dev.school.R

class FirstFragment : androidx.fragment.app.Fragment() {

    private lateinit var nextActivityButton: Button


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_first, container, false)
        nextActivityButton = view.findViewById(R.id.next_activity_button)
        nextActivityButton.setOnClickListener {
            (context as FragmentActivity).replaceFragment()
        }
        return view

    }


}
