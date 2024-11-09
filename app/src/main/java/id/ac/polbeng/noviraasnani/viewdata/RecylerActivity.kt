package id.ac.polbeng.noviraasnani.viewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import id.ac.polbeng.noviraasnani.viewdata.databinding.ActivityRecylerBinding

class RecylerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecylerBinding

    //deklarasi
    var dataBuah = arrayOf("Alpukat","Durian","Jambu Air","Manggis","Strawberry")

        var dataGambar= arrayOf(
            R.drawable.alpukat,
    R.drawable.durian,
    R.drawable.jambuair,
    R.drawable.manggis,
    R.drawable.strawberry)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecylerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //custom adapter, nnt dibuatkan constructor nnti akan di buat
        //contrut di custom adpater
        val adapter = BuahAdapter(this, dataBuah, dataGambar)
        //buat layout manaager
        val layoutManager = LinearLayoutManager(applicationContext)
        //manggil listnya
        binding.recylerView.adapter = adapter
        binding.recylerView.layoutManager = layoutManager
    }
}