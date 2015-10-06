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
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private static final int REQUEST_CONNECT_DEVICE_SECURE = 1;
    public EditText et3;
     Button b1, b2, b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b28,b29,b30,b32;
    SeekBar seekBar3,seekBar6,seekBar7,seekBar8,seekBar9,seekBar10,seekBar11;
    String mConnectedDeviceName ;
    Context context;
    TextView tv1;
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
                    String readMessage = new String(readBuf, 0, msg.arg1);

                    /*
                    update_ui is the method which gets the recieved message. so i am sending the recieved message to this method to set
                    title, thats my choice if you want to do something else do it, all that matters is what you do with the recieved
                    message
                     */
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
        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new Button_Activity(handler));
        b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new Button_Activity(handler));
        b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(new Button_Activity(handler));
        b4 = (Button)findViewById(R.id.button4);
        b4.setOnClickListener(new Button_Activity(handler));
        b5 = (Button)findViewById(R.id.button5);
        b5.setOnClickListener(new Button_Activity(handler));
        b6 = (Button)findViewById(R.id.button6);
        b6.setOnClickListener(new Button_Activity(handler));
        b7 = (Button)findViewById(R.id.button7);
        b7.setOnClickListener(new Button_Activity(handler));
        b8 = (Button)findViewById(R.id.button8);
        b8.setOnClickListener(new Button_Activity(handler));
        b9 = (Button)findViewById(R.id.button9);
        b9.setOnClickListener(new Button_Activity(handler));
        b10 = (Button)findViewById(R.id.button10);
        b10.setOnClickListener(new Button_Activity(handler));
        b11 = (Button)findViewById(R.id.button11);
        b11.setOnClickListener(new Button_Activity(handler));
        b12 = (Button)findViewById(R.id.button12);
        b12.setOnClickListener(new Button_Activity(handler));
        b13 = (Button)findViewById(R.id.button13);
        b13.setOnClickListener(new Button_Activity(handler));
        b14 = (Button)findViewById(R.id.button14);
        b14.setOnClickListener(new Button_Activity(handler));
        b15 = (Button)findViewById(R.id.button15);
        b15.setOnClickListener(new Button_Activity(handler));
        b16 = (Button)findViewById(R.id.button16);
        b16.setOnClickListener(new Button_Activity(handler));
        b17 = (Button)findViewById(R.id.button17);
        b17.setOnClickListener(new Button_Activity(handler));
        b18 = (Button)findViewById(R.id.button18);
        b18.setOnClickListener(new Button_Activity(handler));
        b28 = (Button)findViewById(R.id.button28);
        b28.setOnClickListener(new Button_Activity(handler));
        b29 = (Button)findViewById(R.id.button29);
        b29.setOnClickListener(new Button_Activity(handler));
        seekBar3 = (SeekBar)findViewById(R.id.seekBar3);
        seekBar3.setOnSeekBarChangeListener(new Button_Activity(handler, this, (Button) findViewById(R.id.button21)));
        seekBar6 = (SeekBar)findViewById(R.id.seekBar6);
        seekBar6.setOnSeekBarChangeListener(new Button_Activity(handler,this, (Button) findViewById(R.id.button22)));
        seekBar7 = (SeekBar)findViewById(R.id.seekBar7);
        seekBar7.setOnSeekBarChangeListener(new Button_Activity(handler,this, (Button) findViewById(R.id.button23)));
        seekBar8 = (SeekBar)findViewById(R.id.seekBar8);
        seekBar8.setOnSeekBarChangeListener(new Button_Activity(handler,this, (Button) findViewById(R.id.button24)));
        seekBar9 = (SeekBar)findViewById(R.id.seekBar9);
        seekBar9.setOnSeekBarChangeListener(new Button_Activity(handler,this, (Button) findViewById(R.id.button25)));
        seekBar10 = (SeekBar)findViewById(R.id.seekBar10);
        seekBar10.setOnSeekBarChangeListener(new Button_Activity(handler,this, (Button) findViewById(R.id.button26)));
        seekBar11 = (SeekBar)findViewById(R.id.seekBar11);
        seekBar11.setOnSeekBarChangeListener(new Button_Activity(handler,this, (Button) findViewById(R.id.button27)));
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




