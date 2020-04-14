package id.rosyid.belajarandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import id.rosyid.belajarandroid.R
import id.rosyid.belajarandroid.model.Gambar

class GridAdapter(
    private val listGambar: ArrayList<Gambar>
) : RecyclerView.Adapter<GridAdapter.GridViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view: View =
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.list_items_image, parent, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listGambar.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Picasso.with(holder.itemView.context)
            .load(listGambar[position].images)
            .fit()
            .into(holder.imageView)
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById(R.id.imageView)
    }
}

