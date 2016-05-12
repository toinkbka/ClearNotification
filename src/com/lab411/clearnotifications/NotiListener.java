package com.lab411.clearnotifications;

import android.annotation.TargetApi;
import android.os.Build;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
public class NotiListener extends NotificationListenerService {
	NotiListener noti;

	@SuppressWarnings({ "unused", "deprecation" })
	public void clearNotificationExample(StatusBarNotification sbn) {
	    noti.cancelNotification(sbn.getPackageName(), sbn.getTag(), sbn.getId());
	}
}
