package com.example.afwappsamplemdmclient;

import android.afw.app.admin.AfwAppManagerException;
import android.afw.app.admin.AfwAppPolicyManager;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.afw.app.admin.AfwAppEnterpriseAppInfo;

public class AfwAppAdminService extends IntentService {

    public static final String CONNECT_AFWAPP = "connect";
    public static final String PROVISION_AFWAPP = "provision";
    public static final String FINISH_AFWAPP = "finish";
    private static final String USERNAME = "nkhan@okta1.com";
    private static final String PASSWORD = "Okta123$";

    private AfwAppPolicyManager mAfwAppPolicyManager;

    @Override
    public void onCreate() {
        super.onCreate();
        mAfwAppPolicyManager = 
                AfwAppPolicyManager.getInstance(getApplicationContext());
    }

    public AfwAppAdminService() {
        super("AfwAppAdminService");
    }

    /* (non-Javadoc)
     * @see android.app.IntentService#onHandleIntent(android.content.Intent)
     */
    @Override
    protected void onHandleIntent(Intent intent) {
        final String action = intent.getAction();
        if (action.equals(CONNECT_AFWAPP)) {
            mAfwAppPolicyManager.bindMdmClient();
        }
        if (action.equals(PROVISION_AFWAPP)) {
            Bundle options = new Bundle();
            options.putString("username", USERNAME);
            options.putString("password", PASSWORD);
            try {
                mAfwAppPolicyManager.startProvisioning(
                        getBaseContext().getPackageName(), 
                        AfwAppPolicyManager.PASSWORD_QUALITY_UNSPECIFIED, 
                        4, options);
            } catch (AfwAppManagerException e) {
                e.printStackTrace();
            }
        }
        if (action.equals(FINISH_AFWAPP)) {
            try {
                mAfwAppPolicyManager.finishProvisioning(
                        new AfwAppEnterpriseAppInfo[] {});
            } catch (AfwAppManagerException e) {
                e.printStackTrace();
            }
        }
    }



}
