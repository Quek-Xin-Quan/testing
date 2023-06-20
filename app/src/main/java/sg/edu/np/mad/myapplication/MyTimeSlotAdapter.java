package sg.edu.np.mad.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyTimeSlotAdapter extends RecyclerView.Adapter<MyTimeSlotViewHolder> {


    ArrayList<TimeSlot> timeSlotList;

    public MyTimeSlotAdapter(ArrayList<TimeSlot> timeSlotList) {

        this.timeSlotList = timeSlotList;
    }

    @NonNull
    @Override
    public MyTimeSlotViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bookingslots, parent, false);
        return new MyTimeSlotViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyTimeSlotViewHolder holder, int position) {
        holder.txt_time_slot.setText("as");
        if (timeSlotList.size() == 0) {
            holder.txt_time_slot_description.setText("Available");

        } //if all slots is available,show
        else{
            holder.txt_time_slot_description.setText("Booked");

        }//if some are booked
    }


    @Override
    public int getItemCount() {
        return 9;
    }
}


