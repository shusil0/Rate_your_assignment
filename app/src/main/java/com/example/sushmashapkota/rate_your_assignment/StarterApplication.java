/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package summative.summative.summative;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;


public class StarterApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        Parse.enableLocalDatastore(this);


        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
         //Enter your application ID
                .applicationId("pistagramrfdvhygfyyuhurfudhhr")
                .clientKey(null)
         // Enter the server URL
                .server("http://pistagram123.herokuapp.com/parse/")
                .build()
        );

        ParseACL defaultACL = new ParseACL();

        ParseACL.setDefaultACL(defaultACL, true);
    }
}