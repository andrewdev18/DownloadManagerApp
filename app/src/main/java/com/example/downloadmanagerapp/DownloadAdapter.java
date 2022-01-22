package com.example.downloadmanagerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DownloadAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<DownloadFile> fileList = new ArrayList<>();

    final DownloadAdapter.OnItemClickListener listener;
    public interface OnItemClickListener{
        void onItemClick(DownloadFile downloadFile);
    }

    public DownloadAdapter(Context context, List<DownloadFile> fileList, OnItemClickListener listener) {
        this.context = context;
        this.fileList = fileList;
        this.listener = listener;
    }

    public class DownloadHolder extends RecyclerView.ViewHolder{

        TextView lblTitle;
        TextView lblFileSize;
        Button btnDownload;

        public DownloadHolder(@NonNull View itemView) {
            super(itemView);
            lblTitle = itemView.findViewById(R.id.lblTitle);
            lblFileSize = itemView.findViewById(R.id.lblFileSize);
            btnDownload = itemView.findViewById(R.id.btnDownload);
        }
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.download_item, parent, false);
        RecyclerView.ViewHolder viewHolder = new DownloadHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        DownloadFile file = fileList.get(position);
        DownloadHolder downloadHolder = (DownloadHolder) holder;

        downloadHolder.lblTitle.setText(file.getFileName());
        downloadHolder.lblFileSize.setText("Tamaño: " + file.getSize() + " MB");

        downloadHolder.btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void startDownloadFile(DownloadFile file){

    }

    @Override
    public int getItemCount() {
        return fileList.size();
    }
}
