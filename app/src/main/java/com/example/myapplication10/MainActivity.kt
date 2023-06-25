package com.example.myapplication10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
import com.example.myapplication10.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.ivImage?.setOnClickListener{





            this.registerForContextMenu(it)
        openContextMenu(it)
         unregisterForContextMenu(it)





     }

 }



 override fun onCreateContextMenu(
     menu: ContextMenu?,
     v: View?,
     menuInfo: ContextMenu.ContextMenuInfo?
 ) {
     super.onCreateContextMenu(menu, v, menuInfo)
     menuInflater.inflate(R.menu.menuitem,menu)
 }




 override fun onContextItemSelected(item: MenuItem): Boolean {

     when(item.itemId){

         R.id.test1 -> Toast.makeText(this,"test1",Toast.LENGTH_SHORT).show()
         R.id.test2 -> Toast.makeText(this,"test2",Toast.LENGTH_SHORT).show()



     }



     return super.onContextItemSelected(item)
 }

}


