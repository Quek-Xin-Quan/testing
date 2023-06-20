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

public class MyTimeSlotAdapter extends RecyclerView.Adapter<MyTimeSlotAdapter.MyViewHolder> {
    Context context;

    ArrayList<TimeSlot>timeSlotList= new ArrayList<TimeSlot>();

    public MyTimeSlotAdapter(Context context, ArrayList<TimeSlot> timeSlotList) {
        this.context = context;
        this.timeSlotList = timeSlotList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.bookingslots, parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txt_time_slot.setText(new StringBuilder(Variables.convertTimeSlot(position)).toString());
        if(timeSlotList.size()==0){
            holder.txt_time_slot.

        } //if all slots is available,show
        else {

        }//if some are booked
    }


    @Override
    public int getItemCount() {
        return timeSlotList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txt_time_slot,txt_time_slot_description;
        CardView card_time_slot;
        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            card_time_slot=(CardView) itemView.findViewById(R.id.card_time_slot);
            TextView txt_time_slot =
        }
    }
}
