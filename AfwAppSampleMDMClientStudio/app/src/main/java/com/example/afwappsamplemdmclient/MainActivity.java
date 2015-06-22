package com.example.afwappsamplemdmclient;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Context mContext = getApplicationContext();
        
        Button mConnect = (Button) findViewById(R.id.connect);
        mConnect.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                final Intent mdmConnected = new Intent(mContext, AfwAppAdminService.class);
                mdmConnected.setAction(AfwAppAdminService.CONNECT_AFWAPP);
                mContext.startService(mdmConnected);
            }
        });
        
        Button mProvision = (Button) findViewById(R.id.provision);
        mProvision.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                final Intent mdmConnected = new Intent(mContext, AfwAppAdminService.class);
                mdmConnected.setAction(AfwAppAdminService.PROVISION_AFWAPP);
                mContext.startService(mdmConnected);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
