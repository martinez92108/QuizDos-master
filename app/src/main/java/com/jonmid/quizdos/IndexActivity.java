package com.jonmid.quizdos;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.jonmid.quizdos.Adapter.UserAdapterMartinezJonatan;
import com.jonmid.quizdos.Fragments.CommentFragment;
import com.jonmid.quizdos.Fragments.UserFragment;
import com.jonmid.quizdos.Model.UserModelMrtinezJonatan;

import java.util.List;

public class IndexActivity extends AppCompatActivity {

    ProgressBar progressBar;
    Button button;
    RecyclerView recyclerView;
    List<UserModelMrtinezJonatan> urlDetailsList;
    UserAdapterMartinezJonatan adapterUrl;



    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);




    }













        bottomNavigationView = (BottomNavigationView) findViewById(R.id.id_bn_bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.id_menu_bn_user:
                        UserFragment userFragment = new UserFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_fl_views, userFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(IndexActivity.this, "Listar usuarios", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.id_menu_bn_comment:
                        CommentFragment commentFragment = new CommentFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_fl_views, commentFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(IndexActivity.this, "Listar comentarios", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
    }




































}
