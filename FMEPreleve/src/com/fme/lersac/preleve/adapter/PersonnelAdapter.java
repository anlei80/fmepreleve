package com.fme.lersac.preleve.adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fme.lersac.preleve.model.PersonnelView;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;

public class PersonnelAdapter extends ArrayAdapter<PersonnelView>{

	private ArrayList<PersonnelView> itemsAll;
	
	private ArrayList<PersonnelView> items;
	
	private int viewResourceId;
	
	private List<PersonnelView> suggestions;
	
	public PersonnelAdapter(Context context, int resource,
			List<PersonnelView> items) {
		super(context, resource, items);
		this.itemsAll = new ArrayList<PersonnelView>(items);
		this.items = new ArrayList<PersonnelView>(items);
		this.viewResourceId = resource;
		this.suggestions = new ArrayList<PersonnelView>();
	}

	@Override
	public Filter getFilter() {
		return personnelFilter;
	}
	
	/*
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(viewResourceId, null);
        }
        Log.i("position ", position + "");
        PersonnelView personnel = items.get(position);
        if (personnel != null) {
            TextView customerNameLabel = (TextView) v.findViewById(R.id.personnelNomLabel);
            if (customerNameLabel != null) {
                customerNameLabel.setText(String.valueOf(personnel.getPrenomNom()));
            }
        }
        return v;
    }*/
	
	Filter personnelFilter = new Filter() {

		@Override
		public String convertResultToString(Object resultValue) {
			return ((PersonnelView)resultValue).getPrenomNom();
		}
		
		@Override
		protected FilterResults performFiltering(CharSequence constraint) {
			if (constraint != null) {
				suggestions.clear();
                for (PersonnelView  p : itemsAll) {
                    if(p.getPrenomNom().toLowerCase().startsWith(constraint.toString().toLowerCase())){
                        suggestions.add(p);
                    }
                }
                
                Log.i("constraint ", constraint.toString());
                for (PersonnelView pv : suggestions) {
                	Log.i("p ", pv.getPrenomNom());
                }
                
				FilterResults filterResults = new FilterResults();
				filterResults.values = suggestions;
				filterResults.count = suggestions.size();
				
				return filterResults;
			} else {
				return new FilterResults();
			}
		}

		@SuppressWarnings("unchecked")
		@Override
		protected void publishResults(CharSequence constraint, FilterResults results) {
            ArrayList<PersonnelView> filteredList = (ArrayList<PersonnelView>) results.values;
            if(results != null && results.count > 0) {
                clear();
                for (PersonnelView c : filteredList) {
                    add(c);
                }
                notifyDataSetChanged();
            }
			
		}
		
	};
}
