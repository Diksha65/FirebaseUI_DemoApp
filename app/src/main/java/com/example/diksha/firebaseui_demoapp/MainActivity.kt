package com.example.diksha.firebaseui_demoapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //upload images to firebase storage
        val storagereference = FirebaseStorage.getInstance().getReference("Event_Photos")
        val databasereference = FirebaseDatabase.getInstance().getReference("Event_Photos")

        upload.setOnClickListener {
            val filereference = storagereference.child("Event_Photos/" +
                    System.currentTimeMillis() + "." + R.drawable.poolparty)
        }
    }
}
