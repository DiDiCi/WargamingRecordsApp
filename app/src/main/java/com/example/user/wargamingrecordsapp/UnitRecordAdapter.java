package com.example.user.wargamingrecordsapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by User on 22/03/2018.
 */

public class UnitRecordAdapter extends RecyclerView.Adapter<UnitRecordAdapter.RecordViewHolder> {

    private Context mContext;
    private CustomItemClickListener listener;
    private List<Unit> unitList;

    public UnitRecordAdapter(Context mContext, List<Unit> unitList, CustomItemClickListener listener) {
        this.mContext = mContext;
        this.listener = listener;
        this.unitList = unitList;
    }

    @Override
    public RecordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_layout, null);
        final RecordViewHolder holder = new RecordViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(v, holder.getAdapterPosition());
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(RecordViewHolder holder, int position) {
        Unit unit = unitList.get(position);

        holder.unitName.setText(unit.getUnitName());
    }

    @Override
    public int getItemCount() {
        return unitList.size();
    }

    class RecordViewHolder extends RecyclerView.ViewHolder {

        TextView unitName;
        public RecordViewHolder(View itemView) {
            super(itemView);

            unitName = itemView.findViewById(R.id.unitName);
        }
    }

}
