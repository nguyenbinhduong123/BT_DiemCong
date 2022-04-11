package NguyenBinhDuong.BaiKT4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    private Object AnimalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        ArrayList<Animal> arrayList = new ArrayList<>();

        arrayList.add(new Animal(R.drawable.item1,"Octopus","8 tentacled monster"));
        arrayList.add(new Animal(R.drawable.item2,"Pig","Delicious in rolls"));
        arrayList.add(new Animal(R.drawable.item3,"Sheep","Great for jumpers"));
        arrayList.add(new Animal(R.drawable.item4,"Rabbit","Nice in a stew"));
        arrayList.add(new Animal(R.drawable.item5,"Snake.png","Great for shoes"));

        AnimalAdapter animalAdapter = new AnimalAdapter(this,R.layout.list_row,arrayList);

        listView.setAdapter((ListAdapter) AnimalAdapter);
    }
}