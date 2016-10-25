package com.julianengel.smsexploratoryprototype;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;

/**
 * Created by jse13 on 10/25/2016.
 * Dunno if we are going to use SMS or chat at this point
 */

public class SmsListener extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Telephony.Sms.Intents.SMS_RECEIVED_ACTION.equals(intent.getAction())) {
            String messageBody;
            for (SmsMessage smsMessage : Telephony.Sms.Intents.getMessagesFromIntent(intent))
                messageBody = smsMessage.getMessageBody();
        }
    }
}
