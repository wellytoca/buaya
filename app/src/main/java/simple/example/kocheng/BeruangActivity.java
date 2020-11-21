package simple.example.kocheng;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import simple.example.kocheng.model.Beruang;
import simple.example.kocheng.model.Kucing;

public class BeruangActivity extends AppCompatActivity {

    List<Beruang> beruangs;
    int indeksTampil = 0;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txAsal,txDeskripsi,txJudul;
    ImageView ivFotoBeruang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ras);
        beruangs = DataProvider.getAllBeruangs(this);
        inisialisasiView();
        tampilkanProfilBeruang();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> beruangPertama());
        btnTerakhir.setOnClickListener(view -> beruangTerakhir());
        btnSebelumnya.setOnClickListener(view -> beruangSebelumnya());
        btnBerikutnya.setOnClickListener(view -> beruanngBerikutnya());


        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoBeruang = findViewById(R.id.gambarHewan);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Ras Buaya");
    }


    private void tampilkanProfilBeruang() {
        Beruang k = beruangs.get(indeksTampil);
        Log.d("BERUANG","Menampilkan beruang "+k.getJenis());
        txAsal.setText(k.getAsal());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoBeruang.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void beruangPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi kucing pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfilBeruang();
        }
    }

    private void beruangTerakhir() {
        int posAkhir = beruangs.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi kucing terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfilBeruang();
        }
    }

    private void beruanngBerikutnya() {
        if (indeksTampil == beruangs.size() - 1) {
            Toast.makeText(this,"Sudah di posisi kucing terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfilBeruang();
        }
    }

    private void beruangSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi kucing pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfilBeruang();
        }
    }
}