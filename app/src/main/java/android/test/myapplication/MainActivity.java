package android.test.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initHumans();

        listView = findViewById(R.id.listView);
        PersonAdapter adapter = new PersonAdapter(getApplicationContext(), persons);
        listView.setAdapter(adapter);

    }

    private void initHumans() {

        persons = new ArrayList<>();
        persons.add(new Person("Paul", "Crowe", 28, "male", 1));
        persons.add(new Person("Rob", "Fitz", 23, "male", 2));
        persons.add(new Person("Ben", "O'Carolan", 0, "male", 3));
        persons.add(new Person("Victor", "", 28, "male", 4));
        persons.add(new Person("Peter", "", 29, "male", 5));
        persons.add(new Person("John", "Mac", 18, "male", 6));
        persons.add(new Person("Sarah", "Barry", 30, "female",7));
        persons.add(new Person("Susan", "Lane", 28, "female",8));
        persons.add(new Person("Jack", "Downe", 28, "male", 9));
        persons.add(new Person("Amy", "Stam", 24, "female",10));
        persons.add(new Person("Sandra", "Lane", 28, "female", 11));
        persons.add(new Person("Laura", "Phelan", 33, "female", 12));
        persons.add(new Person("Lisa", "Murphy", 28, "female", 13));
        persons.add(new Person("Mark", "Daly", 28, "male", 14));
        persons.add(new Person("Seamus", "Johson", 24, "male", 15));
        persons.add(new Person("Daren", "Crowe", 28, "male", 16));
        persons.add(new Person("Dara", "Zoltan", 48, "male", 17));
        persons.add(new Person("Marie", "D", 28, "female", 18));
        persons.add(new Person("Catriona", "Long", 28, "female", 19));
        persons.add(new Person("Katy", "Couch", 28, "female", 20));
    }
}
