package group.project.btech.home_automation;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private static final int REQUEST_CONNECT_DEVICE_SECURE = 1;
    public EditText et3;
     Button b2, b30,b32;
    String mConnectedDeviceName ;
    Context context;
    TextView tv1;
    String readMessage = "";
    final Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            switch (msg.what) {
                case Constants.MESSAGE_STATE_CHANGE:
                    switch (msg.arg1) {
                        case BluetoothChatService.STATE_CONNECTED:
                            setStatus(getString(R.string.title_connected_to, mConnectedDeviceName));

                            break;

                    }
                    break;
                case Constants.MESSAGE_WRITE:
                    byte[] writeBuf = (byte[]) msg.obj;
                    // construct a string from the buffer
                    String writeMessage = new String(writeBuf);

                    break;
                case Constants.MESSAGE_READ:
                    byte[] readBuf = (byte[]) msg.obj;
                    // construct a string from the valid bytes in the buffer
                    readMessage = readMessage + new String(readBuf, 0, msg.arg1);
                    //Toast.makeText(context, readMessage, Toast.LENGTH_SHORT).show();
                    update_ui(readMessage);

                    break;
                case Constants.MESSAGE_DEVICE_NAME:
                    // save the connected device's name
                    mConnectedDeviceName = msg.getData().getString(Constants.DEVICE_NAME);

                    Toast.makeText(context,mConnectedDeviceName,Toast.LENGTH_SHORT).show();

                    break;
                case Constants.MESSAGE_TOAST:

                    Toast.makeText(context, msg.getData().getString(Constants.TOAST),Toast.LENGTH_SHORT).show();

                    break;
            }
        }
    };
     BluetoothChatService mChatService = new BluetoothChatService(this,mHandler);
   final Handler handler = new Handler(){



       @Override
       public void handleMessage(Message msg) {
           super.handleMessage(msg);
           String message = (String) msg.obj;
           mChatService.write(message.getBytes());

       }
   };
    BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    /*
    this part of code is for identifying Bluetooth devices and connecting to the device which we want to connect.
    use this code as connect button

     */
    View.OnClickListener m = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (!mBluetoothAdapter.isEnabled()) {
                ensureDiscoverable();
            }
            Intent serverIntent = new Intent(context, DeviceListActivity.class);
            startActivityForResult(serverIntent, REQUEST_CONNECT_DEVICE_SECURE);

        }

    };

    private void update_ui(String readMessage) {
        tv1.setText(readMessage);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp1);
        context = this;
        b2 = (Button)findViewById(R.id.button31);
        b2.setOnClickListener(m);
        tv1 = (TextView)findViewById(R.id.textView);
        b30 = (Button)findViewById(R.id.button30);
        b30.setOnClickListener(n);
        et3 = (EditText)findViewById(R.id.editText3);
        b32 = (Button)findViewById(R.id.button32);
        b32.setOnClickListener(l);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setStatus(String string) {

        this.setTitle(string);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case REQUEST_CONNECT_DEVICE_SECURE:
                // When DeviceListActivity returns with a device to connect
                if (resultCode == Activity.RESULT_OK) {
                    connectDevice(data, true);
                }
                break;

        }
    }

    private void ensureDiscoverable() {
        if (mBluetoothAdapter.getScanMode() !=
                BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE) {
            Intent discoverableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
            discoverableIntent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300);
            startActivity(discoverableIntent);
        }
    }

    private void connectDevice(Intent data, boolean secure) {
        // Get the device MAC address
        String address = data.getExtras()
                .getString(DeviceListActivity.EXTRA_DEVICE_ADDRESS);
        // Get the BluetoothDevice object
        BluetoothDevice device = mBluetoothAdapter.getRemoteDevice(address);
        // Attempt to connect to the device
        mChatService.connect(device, secure);
    }
    View.OnClickListener l = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            tv1.setText("");

        }

    };



   View.OnClickListener n = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            //byte[] send = ("*12|0|0|"+et3.getText().toString()+"|#").getBytes();
            byte[] send = (et3.getText().toString()).getBytes();
            mChatService.write(send);
            et3.getText().clear();
        }

    };


}




