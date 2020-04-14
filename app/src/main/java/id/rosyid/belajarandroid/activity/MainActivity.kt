package id.rosyid.belajarandroid.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.rosyid.belajarandroid.R
import id.rosyid.belajarandroid.adapter.GridAdapter
import id.rosyid.belajarandroid.model.Gambar
import id.rosyid.belajarandroid.model.GambarData

class MainActivity : AppCompatActivity() {
    private lateinit var rvGambar: RecyclerView
    private var list: ArrayList<Gambar> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvGambar = findViewById(R.id.recyclerView)
        rvGambar.setHasFixedSize(true)

        list.addAll(GambarData.listData)
        tampilRecyclerList()
    }

    private fun tampilRecyclerList() {
        rvGambar.layoutManager = GridLayoutManager(this, 2)
        val gridAdapter = GridAdapter(list)
        rvGambar.adapter = gridAdapter
    }
}

