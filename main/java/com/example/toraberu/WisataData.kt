package com.example.toraberu

object WisataData {
    private val wisataNames = arrayOf(
        "Nusa Penida",
        "Raja Ampat",
        "Taman Nasional Komodo",
        "Candi Borobudur",
        "Gunung Bromo",
        "Kepulauan Derawan",
        "Wakatobi",
        "Danau Toba",
        "Pulau Weh",
        "Bunaken"
    )

    private val wisataDetails = arrayOf(
        "Salah satu tempat wisata terbaik di Indonesia dai Pulau Bali adalah Nusa Penida. Nusa Penida sekarang tentunya sangat banyak diminati wisatawan. Apalagi dengan keindahan yang ditawarkan oleh Nusa Penida dengan berbagai pantai uniknya. Tidak salah bila Nusa Penida menjadi salah satu destinasi yang paling ramai dikunjungi wisatawan",
        "Raja Ampat mulai dikenal sebagai surga tersembunyi di Timur Indonesia. Raja Ampat merupakan kepulauan yang terdiri dari lebih dari 1.500 pulau kecil, gundukan pasir, dan beting yang mengelilingi empat pulau utama yaitu Waigeo, Batanta, Salawati, dan Misool.",
        "Terletak di antara pulau Sumbawa dan Flores di provinsi Nusa Tenggara Timur, Pulau Komodo menjadi Taman Nasional Komodo, kadal terbesar di dunia yang hanya dapat ditemui di wilayah ini. Pada tahun 1986, Taman Nasional Komodo ditetapkan sebagai Situs Warisan Dunia dan Cagar Manusia serta Biosfer oleh UNESCO.",
        "Candi Borobudur telah lama menjadi kebanggaan Indonesia. Candi Borobudur merupakan monumen Budha terbesar di dunia, sebuah situs kuno yang secara luas dianggap sebagai salah satu dari tujuh keajaiban dunia. Borobudur dibangun ada abad ke-9 pada masa pemerintahan dinasti Syailendra",
        "Wisata Gunung Bromo tentunya tidak boleh dilupakan sebagai tempat wisata terbaik di Indonesia. Gunung Bromo masih berada dalam satu kawasan Taman Nasional Bromo Tengger Semeru. Tak berbeda jauh dengan pemandangan Gunung Semeru yang indah, Bromo menyajikan pemandangan sunrise dan padang pasirnya yang sangat luas",
        "Kepulauan Derawan yang terletak di Kabupaten Berau, Kalimantan Timur merupakan gugusan pulau yang keindahannya sudah memikat dunia internasional. Salah satu objek wisata yang paling terkenal di kepulauan Derawan adalah spesies ubur-ubur yang tidak berbahaya",
        "Wakatobi menjadi pusat penyelaman yang menawarkan pengalaman tak terlupakan. Ada lebih dari 50 situs menyelam spektakuler yang mudah diakses dari pulau-pulau utama. Wakatobi sendiri dikatakan memiliki 942 spesies ikan dan 750 spesies terumbu karang dari total 850 koleksi dunia",
        "Danau Toba merupakan danau terbesar di Asia Tenggara dan salah satu danau terdalam di dunia. Danau kawah besar ini memiliki sebuah pulau hampir seukuran Singapura di tengahnya yaitu pulau Samosir",
        "Pantai ini terkenal dengan panoramanya yang sangat indah. Air laut yang membentang tampak biru jernih. Pasir di sepanjang pesisir pantai pun terlihat putih dan lembut. Selain Pantai Iboih, ada pula beberapa pantai lain, seperti Pantai Kasih, Pantai Tapak Gajah, Pantai Sumur Tiga, dan Pantai Anoi Itam, yang tak kalah memsona",
        "Aktivitas favorit selama berada di Taman Laut Bunaken adalah diving dan snorkeling. Bahkan, Bunaken disebut-sebut sebagai destinasi wisata menyelam terbaik di Indonesia. Spot yang paling disukai adalah Bunaken Timur Mandolin"
    )

    private val wisataImages = intArrayOf(
        R.drawable.a,
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e,
        R.drawable.f,
        R.drawable.g,
        R.drawable.h,
        R.drawable.i,
        R.drawable.j
    )

    val listData: ArrayList<Wisata>
        get() {
            val list = arrayListOf<Wisata>()
            for (position in wisataNames.indices) {
                val wisata = Wisata()
                wisata.name = wisataNames[position]
                wisata.detail = wisataDetails[position]
                wisata.photo = wisataImages[position]
                list.add(wisata)
            }
            return list
        }
}