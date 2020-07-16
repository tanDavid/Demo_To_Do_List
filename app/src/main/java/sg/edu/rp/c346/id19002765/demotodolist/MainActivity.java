package sg.edu.rp.c346.id19002765.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvTODO;
    ArrayList<ToDoItem> TODOList;
    ArrayAdapter<ToDoItem> aaTODO;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTODO = findViewById(R.id.listViewTodo);
        TODOList = new ArrayList<>();

        TODOList.add(new ToDoItem("Go for movie", Calendar.getInstance()));
        TODOList.add(new ToDoItem("Go for a walk", Calendar.getInstance()));
        TODOList.add(new ToDoItem("Go workout", Calendar.getInstance()));
        TODOList.add(new ToDoItem("Pickup groceries", Calendar.getInstance()));
        TODOList.add(new ToDoItem("Buy more shampoo", Calendar.getInstance()));


        aaTODO = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, TODOList);
        lvTODO.setAdapter(aaTODO);

        adapter = new CustomAdapter(this, R.layout.row, TODOList);

        lvTODO.setAdapter(adapter);
    }
}
