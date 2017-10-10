package com.jonmid.quizdos.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonmid.quizdos.IndexActivity;
import com.jonmid.quizdos.Model.UserModelMrtinezJonatan;
import com.jonmid.quizdos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martinez on 10/10/17.
 */

public class UserAdapterMartinezJonatan {
    List<UserModelMrtinezJonatan> countryList = new ArrayList<>();
    Context context;

    public UserAdapterMartinezJonatan(List<UserModelMrtinezJonatan> countryList, Context context) {
        this.countryList = countryList;
        this.context = context;
    }
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Configuracion del ViewAdapter

        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Encargado de trabajar con el item.xml y sus componentes
        //String a;
        holder.name.setText(countryList.get(position).getName());
        holder.username.setText(countryList.get(position).getUsername());
        holder.email.setText(countryList.get(position).getEmail());
        holder.phone.setText(countryList.get(position).getPhone());
        holder.direccion.setText(countryList.get(position).getAddress());
        holder.ncompany.setText(countryList.get(position).getCompany());



        String [] a;
        a=new String[10];
        a[0]="https://developer.android.com/_static/images/android/touchicon-180.png";
        a[1]="https://boygeniusreport.files.wordpress.com/2012/11/android-icon.jpg?quality=98&strip=all";
        a[2]="http://cdn02.androidauthority.net/wp-content/uploads/2016/06/android-win-2-300x162.png";
        a[3]="http://www.mariodelafuente.org/putolinux/wp-content/uploads/2017/03/antivirus-para-android.png";
        a[4]="https://i.blogs.es/b6f611/android-o-logo-1/original.jpg";
        a[5]="https://androidzone.org/wp-content/uploads/2013/02/android-musical2.jpg";
        a[6]="https://cdn4.cnet.com/img/ZoiMc37DQlcPHBc6ga0m-nbC1yo=/1600x900/2017/08/21/357e40f7-28bd-474c-a0c0-e09d048f4b04/android-oreo-actualizacion.png";
        a[7]="http://farm5.staticflickr.com/4078/4775107201_4bdefccce9_z.jpg";
        a[8]="https://images.idgesg.net/images/article/2017/05/linux-distros-100724403-large.jpg";
        a[9]="https://regmedia.co.uk/2015/12/11/linux_and_windows.jpg?x=1200&y=794";
        int x = (int)(Math.random()*9);

        Picasso.with(context).load(a[x]).into(holder.imageViewcard);


    }

    public int getItemCount() {        return UserModelMrtinezJonatan.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView name;
        TextView username;
        TextView email;
        TextView phone;
        TextView ncompany;
        TextView direccion;
        ImageView imageViewcard;

        public ViewHolder(View item) {
            super(item);
            item.setOnClickListener(this);

            name = (TextView)item.findViewById(R.id.id_tv_userinput_name) ;
            username = (TextView)item.findViewById(R.id.id_tv_userinput_username) ;
            email= (TextView)item.findViewById(R.id.id_tv_userinput_email) ;
            phone= (TextView)item.findViewById(R.id.id_tv_userinput_phone) ;
            name = (TextView)item.findViewById(R.id.id_tv_userinput_name) ;
            ncompany = (TextView)item.findViewById(R.id.id_tv_userinput_namecompany) ;
            direccion = (TextView)item.findViewById(R.id.id_tv_userinput_address) ;




        }

        @Override
        public void onClick(View view) {
            Context contextitem = view.getContext();
            Intent inten = new Intent(contextitem, IndexActivity.class);
            contextitem.startActivity(inten);

            //Toast.makeText(context,"click en el item",Toast.LENGTH_SHORT).show();
        }
    }



}
