package my.edu.tarc.hellochris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView = load ui to memory
        //R=resorces
        setContentView(R.layout.activity_main)


        //linking UI to program code
        //declare a varaiable
        //val = value, var=Variable
        val imageViewQR: ImageView=findViewById(R.id.id_QR)
        val textView: TextView =findViewById(R.id.id_Name)
        val buttonShow:Button=findViewById(R.id.button_Show)
        val buttonHide:Button=findViewById(R.id.button_Hide)



        buttonShow.setOnClickListener   {
            imageViewQR.visibility= View.VISIBLE
            textView.visibility=View.VISIBLE
        }


        buttonHide.setOnClickListener   {
            imageViewQR.visibility= View.INVISIBLE
            textView.visibility=View.INVISIBLE
        }
    }
}