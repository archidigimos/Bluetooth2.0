package group.project.btech.home_automation;

import android.content.Context;
import android.graphics.LightingColorFilter;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;



class Button_Activity implements View.OnClickListener, SeekBar.OnSeekBarChangeListener  {




    int progress_value;
    Context context;
    Button b1;
    View button_view;
    String button_text;
    Handler final_handler;
    boolean flag = true, flag2=true, flag3=true, flag4=true, flag5=true, flag6=true, flag7=true,
            flag8=true,flag9 = true, flag10=true,flag11 = true, flag12=true, flag13=true, flag14=true, flag15=true, flag16=true, flag17=true, flag18=true,
            flag28=true,flag29 = true;

    int color_on = 0xFF0000, color_off = 0x66FF33;


    public Button_Activity( Handler handler,Context c,View v) {
        final_handler=handler;
        button_view =v;
        context=c;
       if(button_view instanceof Button){
           b1= (Button)button_view;
           button_text = b1.getText().toString();
       }


    }
    public Button_Activity( Handler handler) {
        final_handler=handler;




    }


    @Override
    public void onClick(View v) {

       switch (v.getId()) {
           case R.id.button: {
               if (flag) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|A0|"+flagtoint(flag)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|A0|"+flagtoint(flag)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag = true;
               }

               break;

           }
          /* case R.id.button2: {
               if (flag2) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|2|"+flagtoint(flag)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = String.valueOf(progress_value+1) ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag = true;
               }

               break;

           }*/
           case R.id.button3: {
               if (flag3) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|2|"+flagtoint(flag3)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag3 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|2|"+flagtoint(flag3)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag3 = true;
               }

               break;

           }
           case R.id.button4: {
               if (flag4) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|A1|"+flagtoint(flag4)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag4 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|A1|"+flagtoint(flag4)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag4 = true;
               }

               break;

           }

          /* case R.id.button5: {
               if (flag5) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag = true;
               }

               break;

           }*/
           case R.id.button6: {
               if (flag6) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|3|"+flagtoint(flag6)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag6 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|3|"+flagtoint(flag6)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag6 = true;
               }

               break;

           }
           case R.id.button7: {
               if (flag7) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|A2|"+flagtoint(flag7)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag7 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|A2|"+flagtoint(flag7)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag7 = true;
               }

               break;

           }
           case R.id.button8: {
               if (flag8) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|A3|"+flagtoint(flag8)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag8 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|A3|"+flagtoint(flag8)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag8 = true;
               }

               break;

           }
           case R.id.button9: {
               if (flag9) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|5|"+flagtoint(flag9)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag9 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|5|"+flagtoint(flag9)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag9 = true;
               }

               break;

           }
           case R.id.button10: {
               if (flag10) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|6|"+flagtoint(flag10)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag10 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|6|"+flagtoint(flag10)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag10 = true;
               }

               break;

           }
           case R.id.button11: {
               if (flag11) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|7|"+flagtoint(flag11)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag11 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|7|"+flagtoint(flag11)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag11 = true;
               }

               break;

           }
           case R.id.button12: {
               if (flag12) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|8|"+flagtoint(flag12)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag12 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|8|"+flagtoint(flag12)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag12 = true;
               }

               break;

           }
           case R.id.button13: {
               if (flag13) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|A4|"+flagtoint(flag13)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag13 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|A4|"+flagtoint(flag13)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag13 = true;
               }

               break;

           }
           case R.id.button14: {
               if (flag14) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj ="*10|A5|"+flagtoint(flag14)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag14 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj ="*10|A5|"+flagtoint(flag14)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag14 = true;
               }

               break;

           }
           case R.id.button15: {
               if (flag15) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|10|"+flagtoint(flag15)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag15 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|10|"+flagtoint(flag15)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag15 = true;
               }

               break;

           }
           case R.id.button16: {
               if (flag16) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj ="*10|11|"+flagtoint(flag16)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag16 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj ="*10|11|"+flagtoint(flag16)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag16 = true;
               }

               break;

           }
           case R.id.button17: {
               if (flag17) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|12|"+flagtoint(flag17)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag17 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|12|"+flagtoint(flag17)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag17 = true;
               }

               break;

           }
           case R.id.button18: {
               if (flag18) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|13|"+flagtoint(flag18)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag18 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|13|"+flagtoint(flag18)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag18 = true;
               }

               break;

           }
           case R.id.button28: {
               if (flag28) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|4|"+flagtoint(flag28)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag28 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|4|"+flagtoint(flag28)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag28 = true;
               }

               break;

           }
           case R.id.button29: {
               if (flag29) {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_on, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|9|"+flagtoint(flag29)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag29 = false;
               } else {
                   v.getBackground().setColorFilter(new LightingColorFilter(color_off, 0x00000000));
                   Message msg = Message.obtain();
                   msg.obj = "*10|9|"+flagtoint(flag29)+"|#" ;
                   msg.setTarget(final_handler);
                   msg.sendToTarget();
                   flag29 = true;
               }

               break;

           }






       }



    }

    public String flagtoint(Boolean b){
        if(b){
            return "3";
        } else {
            return "2";
        }
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        progress_value=progress;
        b1.setText(button_text+"-"+String.valueOf(progress_value+1));
        switch(seekBar.getId()){
            case R.id.seekBar3:
                Message msg3 = Message.obtain();
                msg3.obj = "*|11|"+button_text+"|"+String.valueOf(progress_value+1)+"#" ;
                msg3.setTarget(final_handler);
                msg3.sendToTarget();
                break;
            case R.id.seekBar6:
                Message msg6 = Message.obtain();
                msg6.obj = "*|11|"+button_text+"|"+String.valueOf(progress_value+1)+"#" ;
                msg6.setTarget(final_handler);
                msg6.sendToTarget();
                break;
            case R.id.seekBar7:
                Message msg = Message.obtain();
                msg.obj = "*|11|"+button_text+"|"+String.valueOf(progress_value+1)+"#" ;
                msg.setTarget(final_handler);
                msg.sendToTarget();
                break;

            case R.id.seekBar8:
                Message msg8 = Message.obtain();
                msg8.obj = "*|11|"+button_text+"|"+String.valueOf(progress_value+1)+"#" ;
                msg8.setTarget(final_handler);
                msg8.sendToTarget();
                break;
            case R.id.seekBar9:
                Message msg9 = Message.obtain();
                msg9.obj = "*|11|"+button_text+"|"+String.valueOf(progress_value+1)+"#" ;
                msg9.setTarget(final_handler);
                msg9.sendToTarget();
                break;
            case R.id.seekBar10:
                Message msg10 = Message.obtain();
                msg10.obj = "*|11|"+button_text+"|"+String.valueOf(progress_value+1)+"#" ;
                msg10.setTarget(final_handler);
                msg10.sendToTarget();
                break;
            case R.id.seekBar11:
                Message msg11 = Message.obtain();
                msg11.obj = "*|11|"+button_text+"|"+String.valueOf(progress_value+1)+"#" ;
                msg11.setTarget(final_handler);
                msg11.sendToTarget();
                break;

        }
    }

    /**
     * Notification that the user has started a touch gesture. Clients may want to use this
     * to disable advancing the seekbar.
     *
     * @param seekBar The SeekBar in which the touch gesture began
     */
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    /**
     * Notification that the user has finished a touch gesture. Clients may want to use this
     * to re-enable advancing the seekbar.
     *
     * @param seekBar The SeekBar in which the touch gesture began
     */
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

      b1.setText(String.valueOf(button_text+"-"+String.valueOf(progress_value+1)));


        switch(seekBar.getId()){
            case R.id.seekBar3:
                Message msg3 = Message.obtain();
                msg3.obj = "*|11|"+button_text+"|"+String.valueOf(progress_value+1)+"#" ;
                msg3.setTarget(final_handler);
                msg3.sendToTarget();
                break;
            case R.id.seekBar6:
                Message msg6 = Message.obtain();
                msg6.obj = "*|11|"+button_text+"|"+String.valueOf(progress_value+1)+"#" ;
                msg6.setTarget(final_handler);
                msg6.sendToTarget();
                break;
            case R.id.seekBar7:
                Message msg = Message.obtain();
                msg.obj = "*|11|"+button_text+"|"+String.valueOf(progress_value+1)+"#" ;
                msg.setTarget(final_handler);
                msg.sendToTarget();
                break;

            case R.id.seekBar8:
                Message msg8 = Message.obtain();
                msg8.obj = "*|11|"+button_text+"|"+String.valueOf(progress_value+1)+"#" ;
                msg8.setTarget(final_handler);
                msg8.sendToTarget();
                break;
            case R.id.seekBar9:
                Message msg9 = Message.obtain();
                msg9.obj = "*|11|"+button_text+"|"+String.valueOf(progress_value+1)+"#" ;
                msg9.setTarget(final_handler);
                msg9.sendToTarget();
                break;
            case R.id.seekBar10:
                Message msg10 = Message.obtain();
                msg10.obj = "*|11|"+button_text+"|"+String.valueOf(progress_value+1)+"#" ;
                msg10.setTarget(final_handler);
                msg10.sendToTarget();
                break;
            case R.id.seekBar11:
                Message msg11 = Message.obtain();
                msg11.obj = "*|11|"+button_text+"|"+String.valueOf(progress_value+1)+"#" ;
                msg11.setTarget(final_handler);
                msg11.sendToTarget();
                break;

        }





    }


}
