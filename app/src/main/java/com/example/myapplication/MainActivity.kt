package com.example.myapplication

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.localbroadcastmanager.content.LocalBroadcastManager

private val INTENT_NAME = "Test12345"

class MainActivity : AppCompatActivity() {
    private lateinit var broadcastReciver: MyBroadcastReciver
    private lateinit var localBroadcastReciver: LocalBroadcastManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        localBroadcastReciver = LocalBroadcastManager.getInstance(applicationContext)
        broadcastReciver = MyBroadcastReciver()

        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn1)

        // ブロードキャストレシーバーの送信
        btn.setOnClickListener {
            val intent = Intent(INTENT_NAME)
            intent.putExtra("data", "ボタンが押されたよ！")
            // ローカルブロンドキャストの送信
            localBroadcastReciver.sendBroadcast(intent)

            // ノーマルブロードキャストの場合
//            sendBroadcast(intent)
        }

        // ローカルブロンドキャストの登録
        localBroadcastReciver.registerReceiver(
                broadcastReciver,
                IntentFilter(INTENT_NAME)
        )

        // ノーマルブロードキャストの場合
//        registerReceiver(
//                broadcastReciver,
//                IntentFilter(INTENT_NAME)
//        )
    }

    override fun onDestroy() {
        super.onDestroy()
        // ローカルブロンドキャストの解除
        localBroadcastReciver.unregisterReceiver(broadcastReciver)

        // ノーマルブロードキャストの解除
//        unregisterReceiver(broadcastReciver)
    }
}