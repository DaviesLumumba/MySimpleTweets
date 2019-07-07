package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class User {

    public String getName() {
        return name;
    }

    public String name;
    public long uid;
    public String screenName;
    public String profileImageUrl;
    //public String profileBackgroundUrl;

    // Deserialize the Json
    public static User fromJSON(JSONObject json) throws JSONException {
        User user = new User();

        // extract and fill values
        user.name = json.getString("name");
        user.uid = json.getLong("id");
        user.screenName = json.getString("screen_name");
        user.profileImageUrl = json.getString("profile_image_url_https")
                .replace("_normal", "");// better resolution
        //user.profileBackgroundUrl = json.getString("profile_image_url_https");

        return user;
    }
}
