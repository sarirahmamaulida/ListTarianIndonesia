package id.ac.poliban.mi.sari.listtarianindonesia;

import java.util.ArrayList;
import java.util.List;

public class DanceData {
    static List<Dance> getAllDances() {
        List<Dance> data = new ArrayList<>();
        {
            data.add(new Dance("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Tari_Baksa_Kembang.jpg/220px-Tari_Baksa_Kembang.jpg", "Tari Baksa Kembang", "Tari Baksa Kembang adalah tari klasik dari Keraton Banjar dari Kalimantan Selatan. Tari ini saat itu merupakan kegiatan penyambutan tamu yang dilakukan oleh putri-putri keraton Banjar. Sekarang Tari Baksa Kembang digunakan masyarakat Kalimantan Selatan untuk ditampilkan dalam kegiatan uparara pernikahan."));
        }
        return data;
        }
    }


