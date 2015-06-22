package com.example.afwappsamplemdmclient;

import android.afw.app.admin.AfwAppAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AfwAdminReceiver extends AfwAppAdminReceiver {

    /* (non-Javadoc)
     * @see android.afw.app.admin.AfwAppAdminReceiver#onMdmConnected(android.content.Context, android.content.Intent)
     */
    @Override
    public void onMdmConnected(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Log.d("AfwAdminReceiver", "onMdmConnected");
        
    }

    /* (non-Javadoc)
     * @see android.afw.app.admin.AfwAppAdminReceiver#onMdmDisconnected(android.content.Context, android.content.Intent)
     */
    @Override
    public void onMdmDisconnected(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Log.d("AfwAdminReceiver", "onMdmDisconnected");
    }

    /* (non-Javadoc)
     * @see android.afw.app.admin.AfwAppAdminReceiver#onMdmConnectError(android.content.Context, android.content.Intent)
     */
    @Override
    public void onMdmConnectError(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Log.d("AfwAdminReceiver", "onMdmConnectError");
        
    }

    /* (non-Javadoc)
     * @see android.afw.app.admin.AfwAppAdminReceiver#onProfileProvisioningComplete(android.content.Context, android.content.Intent)
     */
    @Override
    public void onProfileProvisioningComplete(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Log.d("AfwAdminReceiver", "onProfileProvisioningComplete");
        
    }

    /* (non-Javadoc)
     * @see android.afw.app.admin.AfwAppAdminReceiver#onProfileProvisioningFailed(android.content.Context, android.content.Intent)
     */
    @Override
    public void onProfileProvisioningFailed(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Log.d("AfwAdminReceiver", "Provisioning Failed");
    }

    /* (non-Javadoc)
     * @see android.afw.app.admin.AfwAppAdminReceiver#onAfwAppLock(android.content.Context, android.content.Intent)
     */
    @Override
    public void onAfwAppLock(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Log.d("AfwAdminReceiver", "onAfwAppLock");
    }

    /* (non-Javadoc)
     * @see android.afw.app.admin.AfwAppAdminReceiver#onAfwAppUnlocked(android.content.Context, android.content.Intent)
     */
    @Override
    public void onAfwAppUnlocked(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Log.d("AfwAdminReceiver", "onAfwAppUnlocked");
        
    }

    /* (non-Javadoc)
     * @see android.afw.app.admin.AfwAppAdminReceiver#onAfwAppWiped(android.content.Context, android.content.Intent)
     */
    @Override
    public void onAfwAppWiped(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Log.d("AfwAdminReceiver", "onAfwAppWiped");
        
    }

    /* (non-Javadoc)
     * @see android.afw.app.admin.AfwAppAdminReceiver#onAfwAppMdmIncompatible(android.content.Context, android.content.Intent)
     */
    @Override
    public void onAfwAppMdmIncompatible(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Log.d("AfwAdminReceiver", "onAfwAppMdmIncompatible");
        
    }

    /* (non-Javadoc)
     * @see android.afw.app.admin.AfwAppAdminReceiver#onAfwAppExtensionConfigInsufficient(android.content.Context, android.content.Intent)
     */
    @Override
    public void onAfwAppExtensionConfigInsufficient(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Log.d("AfwAdminReceiver", "onAfwAppExtensionConfigInsufficient");
        
    }

    /* (non-Javadoc)
     * @see android.afw.app.admin.AfwAppAdminReceiver#onWorkAccountReady(android.content.Context, android.content.Intent)
     */
    @Override
    public void onWorkAccountReady(Context context, Intent intent) {
        Log.d("AfwAdminReceiver", "onWorkAccountReady");
        final Intent mdmConnected = new Intent(context, AfwAppAdminService.class);
        mdmConnected.setAction(AfwAppAdminService.FINISH_AFWAPP);
        context.startService(mdmConnected);
    }

    /* (non-Javadoc)
     * @see android.afw.app.admin.AfwAppAdminReceiver#onExtensionsConfigurationReady(android.content.Context, android.content.Intent)
     */
    @Override
    public void onExtensionsConfigurationReady(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Log.d("AfwAdminReceiver", "onExtensionsConfigurationReady");
        
    }

    /* (non-Javadoc)
     * @see android.afw.app.admin.AfwAppAdminReceiver#onChoosePrivateKeyAlias(android.content.Context, android.content.Intent, long, java.lang.String, int, java.lang.String, java.lang.String)
     */
    @Override
    public String onChoosePrivateKeyAlias(Context context,
            Intent intent,
            long uid,
            String host,
            int port,
            String url,
            String alias) {
        // TODO Auto-generated method stub
        Log.d("AfwAdminReceiver", "onChoosePrivateKeyAlias");
        return null;
    }

}
