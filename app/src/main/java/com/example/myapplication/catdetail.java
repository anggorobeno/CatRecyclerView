package com.example.myapplication;

import java.util.ArrayList;

public class catdetail {
    private static String[] rasNames ={
        "America Shorthair",
        "British Shorthair",
        "Burmese",
        "Maine Coon",
        "Ocicat",
        "Persian",
        "Ragdoll",
        "Scottish Fold",
        "Somali",
        "Sphinx",
    };
    private static String[] rasLifespan ={
            "15-17 Years",
            "12-17 Years",
            "15-16 Years",
            "12-15 Years",
            "15-17 Years",
            "14-15 Years",
            "12-17 Years",
            "11-14 Years",
            "12-16 Years",
            "12-14 Years",
    };
    private static String[] rasOrigin ={
            "United States",
            "British",
            "Burma",
            "United States",
            "United States",
            "Iran",
            "United States",
            "United Kingdom",
            "Somali",
            "Canada",
    };
    private static String[] rasDetail={
            "American Shorthair adalah salah satu ras kucing yang paling disukai karena terkenal dengan bulu berwarna perak yang khas dan corak seperti marmer. Saat ini, terdapat lebih dari 60 jenis warna bulu. Ras Kucing American Shorthair adalah kucing berukuran sedang yang kuat.",
            "British Shorthair adalah kucing berukuran sedang dengan bulu khas yang halus. Mereka kucing yang santai dan mudah untuk dirawat, dan juga mereka adalah salah satu ras kucing yang sangat mandiri. Orang-orang akan sangat menyukainya karena tampilan mereka sangat menggemaskan, namun British Shorthairs sebenarnya memiliki tubuh yang gagah dan kuat",
            "Kucing Burmese, dengan penampilannya yang memukau dan sifatnya yang sangat penyayang, dia adalah kucing dengan kepribadian yang baik! Sifatnya yang selalu senang dan penuh kasih sayang adalah nalurinya, kucing Burmese senang bermain dan rasa penasarannya yang tinggi membuat mereka cocok sebagai teman main untuk anak-anak.",
            "Maine Coons adalah kucing terbesar dari semua ras kucing domestik. Sebagian besar Maine Coon dapat memiliki berat hingga 15 kilogram. Mereka sangat kuat, perkasa, dan dapat bertahan dalam iklim yang berat. Bulu Maine Coon sangat tebal tetapi halus. Bulu pada spesies pria umumnya lebih tebal dari wanita",
            "Kucing American Shorthair hanya satu-satunya keturunan lokal yang dibesarkan untuk menirukan kucing di alam bebas. Ocicat adalah hewan yang besar dan aktif dengan tubuh yang berotot dan berbulu satin pendek dan langka yang menunjukan bintik-bintiknya.",
            "Kucing Persia adalah kucing ras asing pertama yang diimpor ke Thailand. Kucing Persia telah menjadi salah satu ras kucing paling populer baik lokal maupun internasional. Mereka memiliki kepala bulat yang khas, dengan telinga kecil yang membulat di ujungnya. ",
            "Jika kamu ingin memiliki seekor kucing yang santai dan sangat penyayang, Ragdoll adalah jenis kucing yang cocok untukmu! Kucing yang tenang, lembut dan mudah bergaul ini berasal dari Amerika Serikat, sebagaimana nama mereka diusulkan, mereka sangat santai dan suka bergantungan di tanganmu seperti rag doll.",
            "Scottish Fold adalah kucing berukuran sedang dengan bentuk badan yang bulat. Scottish Fold disebut juga “Lop -eared” atau “Lops” karena telinganya mulai terlipat saat bulan pertama nya. Scottish Fold juga sangat penuh kasih sayang dan kucing dengan kualitas yang tinggi",
            "Somali adalah seekor kucing yang anggun, atletis dan berotot berukuran sedang dengan bulunya yang indah dan berbulu lebat di bagian ekor seperti rubah. Somali membutuhkan perawatan rutin untuk tetap terlihat cantik, tapi tekstur bulunya yang selembut sutra tidak akan serontok bulu kucing Persia.",
            "Sphynx adalah satu-satunya jenis kucing yang dikenal tidak berbulu di Australia. Kucing-kucing botak telah dikenal di Mexico,Perancis dan Kanada. Dulu, Sphynx dikembangbiakan dari seekor kucing yang tidak berbulu yang muncul dari mutasi di Ontario, Kanada, pada 1966. ",

    };

    private static int[] rasImage ={
        R.drawable.america_shorthair,
        R.drawable.british_shorthair,
        R.drawable.burmese,
        R.drawable.maine_coon,
        R.drawable.ocicat,
        R.drawable.persian,
        R.drawable.ragdoll,
        R.drawable.scottish_fold,
        R.drawable.somali,
        R.drawable.sphinx,
    };
    static ArrayList<cat> catdata() {
        ArrayList<cat> list = new ArrayList<>();
        for (int position = 0 ; position < rasNames.length;position++)
        {
            cat Cat = new cat();
            Cat.setRas(rasNames[position]);
            Cat.setLifespan(rasLifespan[position]);
            Cat.setImage(rasImage[position]);
            Cat.setOrigin(rasOrigin[position]);
            Cat.setDetail(rasDetail[position]);
            list.add(Cat);
        }
        return list;

    }

}
