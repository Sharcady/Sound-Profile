package com.example.hystou.sndprfl;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Choose_Existing_Activity extends AppCompatActivity {

    List<Button> Profiles =  new List<Button>() {
        @Override
        public int size() {
            return 2;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<Button> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] ts) {
            return null;
        }

        @Override
        public boolean add(Button button) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends Button> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, @NonNull Collection<? extends Button> collection) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Button get(int i) {
            return null;
        }

        @Override
        public Button set(int i, Button button) {
            return null;
        }

        @Override
        public void add(int i, Button button) {

        }

        @Override
        public Button remove(int i) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Button> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<Button> listIterator(int i) {
            return null;
        }

        @NonNull
        @Override
        public List<Button> subList(int i, int i1) {
            return null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose__existing_);


        ViewGroup.LayoutParams lpView =
                new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams forthQuatPos =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        forthQuatPos.gravity = Gravity.RIGHT|Gravity.BOTTOM;
        //forthQuatPos.gravity = Gravity.BOTTOM;


        Button backButton = new Button(this);
        backButton.setText("Back");
        linearLayout.addView(backButton,forthQuatPos);



        Set_settings forBut = new Set_settings();


        if (forBut.ButPressed == true)
        {

        }
    }

}
