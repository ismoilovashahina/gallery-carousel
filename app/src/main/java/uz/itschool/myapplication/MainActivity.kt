package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var imgArray:MutableList<Int> = mutableListOf()
    var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgArray.add(R.drawable.pic1)
        imgArray.add(R.drawable.pic2)
        imgArray.add(R.drawable.pic3)
        imgArray.add(R.drawable.pic4)
        imgArray.add(R.drawable.pic5)

        pic1.setOnClickListener {
            if (index<imgArray.size){
                pic1.setImageResource(imgArray[index++])
            }
            else{
                index=0
                pic1.setImageResource(imgArray[index++])
            }
        }


    }
}