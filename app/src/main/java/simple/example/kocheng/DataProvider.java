package simple.example.kocheng;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.kocheng.model.Anjing;
import simple.example.kocheng.model.Kucing;
import simple.example.kocheng.model.Beruang;

public class DataProvider {
    private static List<Kucing> kucings = new ArrayList<>();
    private static List<Anjing> anjings = new ArrayList<>();
    private static List<Beruang> beruangs = new ArrayList<>();

    static void initDataKucing(Context ctx) {
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
    }

    static void initDataAnjing(Context ctx) {
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
    }

    static void initDataBeruang(Context ctx) {
        beruangs.add(new Beruang("aligator amerika", "Eurasia dan Amerika Utara.",
                "Alligator merupakan kerabat dekat dari buaya, yang artinya kadal rawa. Hewan yang masuk famili Alligatoridae ini memiliki bibir yang lebih rapi menutup giginya. Mulutnya lebih lebar.", R.drawable.aligator_amerika));
        beruangs.add(new Beruang("black caiman", "Korea",
                " gigi caiman dinilai lebih runcing dari alligator. Selain itu, keduanya juga sama-sama tidak memiliki kelenjar garam. Tak heran kalau alligator dan caiman tak bisa tahan lama di air payau atau laut. ", R.drawable.black_caiman));
        beruangs.add(new Beruang("caiman crocodile", "Kutub Utara",
                "Karena satu famili dengan alligator, caiman juga memiliki mulut lebar yang menyerupai huruf “U”. Rahang atas mereka sama-sama lebih besar dari rahang bawahnya. ", R.drawable.caiman_crocodilus));
        beruangs.add(new Beruang("snouted caiman", "Asia Tenggara",
                 " Selain itu, keduanya juga sama-sama tidak memiliki kelenjar garam. Tak heran kalau alligator dan caiman tak bisa tahan lama di air payau atau laut.", R.drawable.snouted_caiman));
        beruangs.add(new Beruang("spectacled caiman", "Kasawan Thailand",
                "Karena satu famili dengan alligator, caiman juga memiliki mulut lebar yang menyerupai huruf “U”. Rahang atas mereka sama-sama lebih besar dari rahang bawahnya. Namun gigi caiman dinilai lebih runcing dari alligator. ", R.drawable.spectacled_caiman));
        beruangs.add(new Beruang("yacare", "Anak Benua India",
                " Selain itu, keduanya juga sama-sama tidak memiliki kelenjar garam. Tak heran kalau alligator dan caiman tak bisa tahan lama di air payau atau laut.", R.drawable.yacare_caiman
        ));
    }

    public static List<Kucing> getAllKucings(Context ctx) {
        if (kucings.size() == 0) {
            initDataKucing(ctx);
        }
        return kucings;
    }

    public static List<Anjing> getAllAnjings(Context ctx) {
        if (anjings.size() == 0) {
            initDataAnjing(ctx);
        }
        return anjings;
    }

    public static List<Beruang> getAllBeruangs(Context ctx) {
        if (beruangs.size() == 0) {
            initDataBeruang(ctx);
        }
        return beruangs;
    }
}
