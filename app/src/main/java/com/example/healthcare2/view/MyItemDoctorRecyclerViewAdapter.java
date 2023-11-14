package com.example.healthcare2.view;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.healthcare2.placeholder.PlaceholderContent.PlaceholderItem;
import com.example.healthcare2.databinding.FragmentItemDoctorBinding;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyItemDoctorRecyclerViewAdapter extends RecyclerView.Adapter<MyItemDoctorRecyclerViewAdapter.ViewHolder> {

    private final List<PlaceholderItem> mValues;

    public MyItemDoctorRecyclerViewAdapter(List<PlaceholderItem> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(FragmentItemDoctorBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.txtNameDoctor.setText(mValues.get(position).content);
        holder.txtNumberPost.setText(mValues.get(position).details);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView txtNameDoctor;
        public final TextView txtNumberPost;
        public final TextView txtStatusDoctor;

        public PlaceholderItem mItem;

        public ViewHolder(FragmentItemDoctorBinding binding) {
            super(binding.getRoot());
            txtNumberPost = binding.txtNumberPost;
            txtNameDoctor = binding.txtNameDoctor;
            txtStatusDoctor = binding.txtStatusDoctor;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + txtNameDoctor.getText() + "'";
        }
    }
}
