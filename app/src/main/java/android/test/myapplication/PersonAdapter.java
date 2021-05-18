package android.test.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Person> list;

    public PersonAdapter(Context context, ArrayList<Person> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {

        if (list==null){
            return 0;
        }

        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        HolderClass holder;

        if (row==null){
            LayoutInflater inflater = LayoutInflater.from(context);
            row = inflater.inflate(R.layout.list_item_person, parent, false);

            holder = new HolderClass();
            holder.txtName = row.findViewById(R.id.textViewName);
            holder.txtSurname = row.findViewById(R.id.textViewSurname);
            holder.txtAge = row.findViewById(R.id.textViewAge);
            holder.txtGender = row.findViewById(R.id.textViewGender);
            holder.txtId = row.findViewById(R.id.textViewId);

            row.setTag(holder);
        }
        else {
            holder = (HolderClass) row.getTag();
        }

        holder.txtName.setText(list.get(position).name);
        holder.txtSurname.setText(list.get(position).surname);
        holder.txtAge.setText(""+list.get(position).age);
        holder.txtGender.setText(list.get(position).gender);
        holder.txtId.setText(""+list.get(position).id);

        return row;
    }

    private class HolderClass{

        private TextView txtName;
        private TextView txtSurname;
        private TextView txtAge;
        private TextView txtGender;
        private TextView txtId;
    }
}
