package bonch.dev.school.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import bonch.dev.school.FragmentActivity
import bonch.dev.school.R

class MyFragment : androidx.fragment.app.Fragment() {


    private lateinit var textView: TextView

/*companion object {
    fun newInstance(someInt: Int): MyFragment {
        val myFragment = MyFragment()
        val args = Bundle()
        args.putInt("someInt", someInt)
        myFragment.setArguments(args)

        return myFragment
    }
}*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_my, container, false)
        textView = view!!.findViewById(R.id.text_view)
        val mycurrent: Int
        val myedit: String
        val myIndic: Boolean
        val myIndicString: String

        mycurrent= this.getArguments()!!.getInt("TAP_CURRENT")
        myedit= this.getArguments()!!.getString("EDIT_TEXT").toString()
        myIndic= this.getArguments()!!.getBoolean("INDIC")
        myIndicString = if(!myIndic){
            "Нажми на индикатор"
        } else {
            "Ну и зачем нажал на индикатор?"
        }


        textView.text = "$mycurrent $myedit $myIndic $myIndicString"
        // (context as FragmentActivity).textView.setText("dfgdfg")


        return view
    }


    /* fun put(){
         val puts = MyFragment()
         puts.textView= puts.view!!.findViewById(R.id.text_view)

         puts.textView.setText(" $puts.arguments ")
     }*/


}






