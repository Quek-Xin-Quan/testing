package sg.edu.np.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<TimeSlot> timeSlots = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createTimeSlots();

        MyTimeSlotAdapter myTimeSlotAdapter = new MyTimeSlotAdapter(timeSlots);
        RecyclerView recyclerView =findViewById(R.id.RecyclerView);
        MyTimeSlotAdapter adapter = new MyTimeSlotAdapter(timeSlots);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myTimeSlotAdapter);
    }


    private void createTimeSlots()
    {
        for (int i = 1; i<9;i++)
        {
            TimeSlot timeSlot = new TimeSlot(i);
            timeSlots.add(timeSlot);
        }

    }
}