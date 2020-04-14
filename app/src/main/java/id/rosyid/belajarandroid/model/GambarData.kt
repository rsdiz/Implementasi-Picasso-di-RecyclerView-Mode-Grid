package id.rosyid.belajarandroid.model

import id.rosyid.belajarandroid.R

object GambarData {

    private val images = intArrayOf(
        R.drawable.sample_image1,
        R.drawable.sample_image2,
        R.drawable.sample_image3,
        R.drawable.sample_image4,
        R.drawable.sample_image5,
        R.drawable.sample_image6,
        R.drawable.sample_image7,
        R.drawable.sample_image8,
        R.drawable.sample_image9,
        R.drawable.sample_image10
    )

    val listData: ArrayList<Gambar>
    get() {
        val list = arrayListOf<Gambar>()
        for (position in images.indices) {
            val gambar = Gambar()
            gambar.images = images[position]
            list.add(gambar)
        }
        return list
    }
}

