package id.ac.poliban.mi.sari.listtarianindonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Dance> dances = new ArrayList<>();
    private BaseAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            listView = findViewById(R.id.listview);

            dances.addAll(DanceData.getAllDances());

            adapter = new DanceAdapter(dances);

            listView.setAdapter(adapter);


            listView.setOnItemClickListener(((parent, view, position, id) -> {
                    new AlertDialog.Builder(this)
                    .setTitle("Tari yang Anda Pilih")
                    .setMessage("Anda Memilih : "
                        + dances.get(position).getDanceName())
                    .setPositiveButton("OK", null).show();
    }));
        }
}

