package id.ac.polbeng.noviraasnani.viewdata

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.ac.polbeng.noviraasnani.viewdata.databinding.ListItemBinding

class BuahAdapter(
    private val context: Context,
    private val dataBuah: Array<String>,
    private val dataGambar: Array<Int>
) : RecyclerView.Adapter<BuahAdapter.BuahHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BuahHolder(binding)
    }

    // Set data ke RecyclerView
    override fun onBindViewHolder(holder: BuahHolder, position: Int) {
        holder.bind(dataBuah[position], dataGambar[position])
    }

    // Tampilkan jumlah data
    override fun getItemCount(): Int = dataBuah.size

    // Deklarasi id pada custom adapter, id yang ada pada list_item
    inner class BuahHolder(val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(namaBuah: String, gambarBuah: Int) {
            // Set data pada tampilan
            binding.tvNamaBuah.text = namaBuah
            binding.imgBuah.setImageResource(gambarBuah)

            // Set listener untuk item
            itemView.setOnClickListener {
                val intent = Intent(context, DetailBuahActivity::class.java).apply {
                    putExtra("nama", namaBuah)
                    putExtra("gambar", gambarBuah)
                }
                context.startActivity(intent)
            }
        }
    }
}
