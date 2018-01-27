package com.suda.openpayshortcut.activity.pay;

import com.suda.openpayshortcut.util.RootShell;

/**
 * Created by dlhxr on 2018/01/27.
 */

public class OfoScanActivity extends BasePayActivity {

    @Override
    public void openPay() {
        RootShell rootShell = RootShell.open();
        rootShell.execute("am start -n so.ofo.labofo/so.ofo.labofo.activities.journey.ScanQrActivity");
        rootShell.close();
    }
}
