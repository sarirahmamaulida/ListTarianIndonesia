package id.ac.poliban.mi.sari.listtarianindonesia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class DanceAdapter extends BaseAdapter {
    private List<Dance> data = new ArrayList<>();
    public DanceAdapter(List<Dance> data) {
        this.data = data;
    }


    @Override
    public int getCount() {

        return data.size();
    }

    @Override
    public Object getItem(int position) {

        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView img_flag;
        TextView tvDanceName;
        TextView tvDanceDesc;

        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_dance, parent, false);

        img_flag = convertView.findViewById(R.id.img_flag);
        tvDanceName = convertView.findViewById(R.id.tv_dance_name);
        tvDanceDesc = convertView.findViewById(R.id.tv_dance_detail);

        Glide.with(parent.getContext())
                .load(data.get(position).getFlag())
                .apply(new RequestOptions().override(60, 60))
                .into(img_flag);
        tvDanceName.setText(data.get(position).getDanceName());
        tvDanceDesc.setText(data.get(position).getDanceDesc());
        return convertView;
    }
}
