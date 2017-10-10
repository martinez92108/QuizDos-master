package com.jonmid.quizdos.Parser;

import com.jonmid.quizdos.Model.UserModelMrtinezJonatan;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martinez on 10/10/17.
 */

public class UserJsonMartinezJonatan {

    public static List<UserModelMrtinezJonatan> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<UserModelMrtinezJonatan> urlDetailsList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);

            JSONObject address = item.getJSONObject("address");
            JSONObject namec = item.getJSONObject("company");






            UserModelMrtinezJonatan urlDetails = new UserModelMrtinezJonatan();
            urlDetails.setName(item.getString("name"));
            urlDetails.setUsername(item.getString("username"));
            urlDetails.setEmail(item.getString("email"));
            urlDetails.setPhone(item.getString("phone"));
            urlDetails.setAddress(address.getString("street"));
            urlDetails.setCompany(namec.getString("name"));







            urlDetailsList.add(urlDetails);
        }
        return urlDetailsList;
    }




}
