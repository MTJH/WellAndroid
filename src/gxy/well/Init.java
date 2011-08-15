package gxy.well;


import android.app.Activity;
import android.content.Intent;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.graphics.Canvas;
//import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Window;
import android.view.WindowManager;




public class Init extends Activity{
 //private Bitmap mWood;
// Canvas canvas;
 public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  requestWindowFeature(Window.FEATURE_NO_TITLE);
  getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); 
  //Options opts = new Options();
 // opts.inDither = true;
 // opts.inPreferredConfig = Bitmap.Config.RGB_565;
 // mWood = BitmapFactory.decodeResource(getResources(), R.drawable.init, opts);
 // canvas.drawBitmap(mWood, 0, 0, null);
  setContentView(R.layout.initscreen);
  new CountDownTimer(3000,100) {
   @Override
   public void onTick(long millisUntilFinished) {
    // TODO Auto-generated method stub
    
   }
         @Override
         public void onFinish() {    //倒计时结束后在这里实现activity跳转
          Intent intent = new Intent();                   
          intent.setClass(Init.this, WellAndroid.class);
          startActivity(intent); 
          finish();                  //跳转后销毁自身的activity  否则按返回 还会跳回到图片
         }
              }.start();
 }
}