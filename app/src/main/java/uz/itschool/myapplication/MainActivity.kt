package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

        prev.setOnClickListener {
            if (index > 0){
                index--
            }
            else{
                index = imgArray.size-1
            }
            pic1.setImageResource(imgArray[index])
        }

        next.setOnClickListener {
            if (index < imgArray.size-1){
                index++
            }
            else{
                index = 0
            }
            pic1.setImageResource(imgArray[index])
        }

        button.setOnClickListener{
            pic1.visibility = View.VISIBLE
        }
        button2.setOnClickListener {
            pic1.visibility = View.GONE
        }
        button3.setOnClickListener {
            pic1.visibility = View.INVISIBLE
        }
    }
}