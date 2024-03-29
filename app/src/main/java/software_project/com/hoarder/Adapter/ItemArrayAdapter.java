package software_project.com.hoarder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import software_project.com.hoarder.Object.Item;
import software_project.com.hoarder.R;

/**
 * Created by Niall on 22/11/2016.
 */

public class ItemArrayAdapter extends ArrayAdapter<Item> {


    public ItemArrayAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Item item = getItem(position);

        // Inflate the view only if an existing view is not being reused
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);
        }

        // Find views
        TextView nameTxt = (TextView) convertView.findViewById(R.id.nameTxt);
        TextView priceTxt = (TextView) convertView.findViewById(R.id.priceTxt);
        TextView categoryTxt = (TextView) convertView.findViewById(R.id.descriptionTxt);

        // Populate the corresponding fields for each student
        nameTxt.setText(String.valueOf(item.getName()));
        priceTxt.setText("€"+String.valueOf(item.getPrice()));
        categoryTxt.setText(String.valueOf(item.getCat()));

        return convertView;
    }
}
