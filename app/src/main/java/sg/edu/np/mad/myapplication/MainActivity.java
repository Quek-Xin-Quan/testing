package sg.edu.np.mad.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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