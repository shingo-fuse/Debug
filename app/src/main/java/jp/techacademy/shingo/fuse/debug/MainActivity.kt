package jp.techacademy.shingo.fuse.debug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import jp.techacademy.shingo.fuse.debug.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val list = ArrayList<String>()
        list.add("おはようございます")
        list.add("こんにちは！")


        binding.textView.text = list[2]
    }
}